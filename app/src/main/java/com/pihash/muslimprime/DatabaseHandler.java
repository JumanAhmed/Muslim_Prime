package com.pihash.muslimprime;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION2 = 2;

    // Database Name
    private static final String DATABASE_NAME2 = "contactsManager2";

    // Contacts table name
    private static final String TABLE_CONTACTS2 = "contacts2";

    // Contacts Table Columns names
    private static final String KEY_ID = "id2";
    private static final String KEY_NAME = "name2";
    private static final String KEY_PH_NO = "phone_number2";
    private static final String KEY_EMAIL_A = "AE";
	private static final String KEY_EMAIL_B = "BE";
	private static final String KEY_EMAIL_C = "CE";
	private static final String KEY_EMAIL_D = "DE";
	private static final String KEY_EMAIL_E = "FE";
	private static final String KEY_EMAIL_F = "GE";
	private static final String KEY_EMAIL_G = "HE";
	private static final String KEY_EMAIL_H = "IE";
	private static final String KEY_EMAIL_I = "JE";
	private static final String KEY_EMAIL_J = "KE";
	private static final String KEY_EMAIL_K = "LE";
	private static final String KEY_EMAIL_L = "ME";
    private final ArrayList<datanamaz> contact_list = new ArrayList<datanamaz>();

    public DatabaseHandler(Context context) {
	super(context, DATABASE_NAME2, null, DATABASE_VERSION2);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
	String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS2 + "("
		+ KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_PH_NO + " TEXT," + KEY_EMAIL_A + " TEXT," + KEY_EMAIL_B + " TEXT," + KEY_EMAIL_C + " TEXT," + KEY_EMAIL_D + " TEXT," + KEY_EMAIL_E + " TEXT," + KEY_EMAIL_F + " TEXT," + KEY_EMAIL_G + " TEXT," + KEY_EMAIL_H+ " TEXT," + KEY_EMAIL_I + " TEXT," + KEY_EMAIL_J + " TEXT," + KEY_EMAIL_K + " TEXT," + KEY_EMAIL_L + " TEXT" + ")";
	db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	// Drop older table if existed
	db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS2);

	// Create tables again
	onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    public void Add_Contact(datanamaz contact) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(KEY_NAME, contact.getName()); // Contact Name
	values.put(KEY_PH_NO, contact.getPhoneNumber()); // Contact Phone
		values.put(KEY_EMAIL_A, contact.getemail1());
		values.put(KEY_EMAIL_B, contact.getemail2());
		values.put(KEY_EMAIL_C, contact.getemail3());
		values.put(KEY_EMAIL_D, contact.getemail4());
		values.put(KEY_EMAIL_E, contact.getemail5());
		values.put(KEY_EMAIL_F, contact.getemail6());
		values.put(KEY_EMAIL_G, contact.getemail7());
		values.put(KEY_EMAIL_H, contact.getemail8());
		values.put(KEY_EMAIL_I, contact.getemail9());
		values.put(KEY_EMAIL_J, contact.getemail10());
		values.put(KEY_EMAIL_K, contact.getemail11());
		values.put(KEY_EMAIL_L, contact.getemail12());


	// Inserting Row
	db.insert(TABLE_CONTACTS2, null, values);
	db.close(); // Closing database connection
    }

    // Getting single contact
    datanamaz Get_Contact(int id) {
	SQLiteDatabase db = this.getReadableDatabase();
    Cursor cursor = db.query(TABLE_CONTACTS2, new String[]{KEY_ID,
						KEY_NAME, KEY_PH_NO, KEY_EMAIL_A, KEY_EMAIL_B, KEY_EMAIL_C, KEY_EMAIL_D, KEY_EMAIL_E, KEY_EMAIL_F, KEY_EMAIL_G, KEY_EMAIL_H, KEY_EMAIL_I, KEY_EMAIL_J, KEY_EMAIL_K, KEY_EMAIL_L }, KEY_ID + "=?",
				new String[] { String.valueOf(id) }, null, null, null, null);


	if (cursor != null)
	    cursor.moveToFirst();

	datanamaz contact = new datanamaz(Integer.parseInt(cursor.getString(0)),
		cursor.getString(1), cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),
			cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14));
	// return contact
	cursor.close();
	db.close();

	return contact;
    }

    // Getting All Contacts
    public ArrayList<datanamaz> Get_Contacts() {
	try {
	    contact_list.clear();

	    // Select All Query
	    String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS2;

	    SQLiteDatabase db = this.getWritableDatabase();
	    Cursor cursor = db.rawQuery(selectQuery, null);

	    // looping through all rows and adding to list
	    if (cursor.moveToFirst()) {
		do {
		    datanamaz contact = new datanamaz();
		    contact.setID(Integer.parseInt(cursor.getString(0)));
		    contact.setName(cursor.getString(1));
		    contact.setPhoneNumber(cursor.getString(2));
			contact.setemail1(cursor.getString(3));
			contact.setemail2(cursor.getString(4));
			contact.setemail3(cursor.getString(5));
			contact.setemail4(cursor.getString(6));
			contact.setemail5(cursor.getString(7));
			contact.setemail6(cursor.getString(8));
			contact.setemail7(cursor.getString(9));
			contact.setemail8(cursor.getString(10));
			contact.setemail9(cursor.getString(11));
			contact.setemail10(cursor.getString(12));
			contact.setemail11(cursor.getString(13));
			contact.setemail12(cursor.getString(14));

		    // Adding contact to list
		    contact_list.add(contact);
		} while (cursor.moveToNext());
	    }

	    // return contact list
	    cursor.close();
	    db.close();
	    return contact_list;
	} catch (Exception e) {
	    // TODO: handle exception
	    Log.e("all_contact", "" + e);
	}

	return contact_list;
    }

    // Updating single contact
    public int Update_Contact(datanamaz contact) {
	SQLiteDatabase db = this.getWritableDatabase();

	ContentValues values = new ContentValues();
	values.put(KEY_NAME, contact.getName());
	values.put(KEY_PH_NO, contact.getPhoneNumber());
		values.put(KEY_EMAIL_A, contact.getemail1());
		values.put(KEY_EMAIL_B, contact.getemail2());
		values.put(KEY_EMAIL_C, contact.getemail3());
		values.put(KEY_EMAIL_D, contact.getemail4());
		values.put(KEY_EMAIL_E, contact.getemail5());
		values.put(KEY_EMAIL_F, contact.getemail6());
		values.put(KEY_EMAIL_G, contact.getemail7());
		values.put(KEY_EMAIL_H, contact.getemail8());
		values.put(KEY_EMAIL_I, contact.getemail9());
		values.put(KEY_EMAIL_J, contact.getemail10());
		values.put(KEY_EMAIL_K, contact.getemail11());
		values.put(KEY_EMAIL_L, contact.getemail12());
	

	// updating row
	return db.update(TABLE_CONTACTS2, values, KEY_ID + " = ?",
		new String[] { String.valueOf(contact.getID()) });
    }

    // Deleting single contact
    public void Delete_Contact(int id) {
	SQLiteDatabase db = this.getWritableDatabase();
	db.delete(TABLE_CONTACTS2, KEY_ID + " = ?",
		new String[] { String.valueOf(id) });
		db.close();
    }



    // Getting contacts Count
    public int Get_Total_Contacts() {
	String countQuery = "SELECT  * FROM " + TABLE_CONTACTS2;
	SQLiteDatabase db = this.getReadableDatabase();
	Cursor cursor = db.rawQuery(countQuery, null);
	cursor.close();

	// return count
	return cursor.getCount();
    }

}
