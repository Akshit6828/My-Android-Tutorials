package com.akshit.mydbsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MyDataBase extends SQLiteOpenHelper {
    //Version
    public static final int VERSION = 1;

    //Database Name
    public static final String DB_NAME = "ainwik_db";

    //Table Details
    public static final String DB_TABLE = "std_record";

    //Columns
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String COURSE = "course";

    //Creating Constructor for Creating Database
    public MyDataBase(Context context) {
        super(context, DB_NAME, null, VERSION);
    }
    //********************-----Oncreate() and onUprade() are the two methods overrided from SQLiteOpenHelper class.**********************
    //-----------ONCREATE() is used to execute a query while ONUPGRADE is used to check when a new Version Uprgades what changes to does with previous Data in DataBase ----
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + DB_TABLE + "(" + ID + " NUMBER PRIMARY KEY," + NAME + " TEXT," + COURSE + " TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
        onCreate(db);
    }

    //###############################-----INSERTING RECORD-----##############################
    public long insertRecord(StudentRec record) {
        SQLiteDatabase db = getWritableDatabase();//-----For writing the data....
        //Store data in object------------
        ContentValues values = new ContentValues();
        values.put(ID, record.getId());
        values.put(NAME, record.getName());
        values.put(COURSE, record.getCourse());
        long result = db.insert(DB_TABLE, null, values);
        return result;
    }

    //###############----Get Single Record----##############################
    public StudentRec getSingleRec(int id) {
        SQLiteDatabase db = getReadableDatabase();//-----For reading the data....
        Cursor cur = db.query(DB_TABLE, new String[]{ID, NAME, COURSE, COURSE}, ID + "=?", new String[]{String.valueOf(id)}, null, null, null);
        if (cur != null)
            cur.moveToFirst();
        return new StudentRec(cur.getInt(0), cur.getString(1), cur.getString(2));// Calls parameterised Const of StudentRec

    }

    //############################--GET ALL RECORD--#################################3
    public List<StudentRec> getAllRecord() {
        SQLiteDatabase db = getReadableDatabase();

        //Creating a container-- So we make Dynamic Array List
        List<StudentRec> list = new ArrayList<StudentRec>();
        String query = "SELECT * FROM " + DB_TABLE;
        Cursor cur = db.rawQuery(query, null);
        if (cur.moveToFirst()) {
            do {
                StudentRec record = new StudentRec();
                record.setId(cur.getInt(0));
                record.setName(cur.getString(1));
                record.setCourse(cur.getString(2));
                //ADDING DATA TO CONTAINER------------------
                list.add(record);


            }
            while (cur.moveToNext());

        }
        return list;
    }

    //############################---UPDATE RECORD--##########################
    public long updateRecord(StudentRec rec) {
        SQLiteDatabase db= getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(NAME,rec.getName());
        values.put(COURSE,rec.getCourse());
        long result=db.update(DB_TABLE,values,ID+"=?",new String[]{String.valueOf(rec.getId())});
    return  result;
    }
    //################################--DELETE RECORD--#############################
    public long deleteRecord(int id)
    {
        SQLiteDatabase db= getWritableDatabase();
       long result=db.delete(DB_TABLE,ID+"=?",new String[]{String.valueOf(id)});
       return  result;
    }

}
