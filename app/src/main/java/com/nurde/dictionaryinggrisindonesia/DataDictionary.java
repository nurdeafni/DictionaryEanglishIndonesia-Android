package com.nurde.dictionaryinggrisindonesia;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataDictionary extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dbkamus";
    public static final String INGGRIS= "inggris";
    public static final String INDONESIA = "indonesia";

    public DataDictionary(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, inggris TEXT, indonesia TEXT);");
    }
    public void generateData(SQLiteDatabase db){
        ContentValues cv=new ContentValues();
        cv.put(INGGRIS, "run");
        cv.put(INDONESIA, "lari");
        db.insert("kamus", INGGRIS, cv);
        cv.put(INGGRIS, "walk");
        cv.put(INDONESIA, "jalan");
        db.insert("kamus", INGGRIS, cv);
        cv.put(INGGRIS, "read");
        cv.put(INDONESIA, "membaca");
        db.insert("kamus", INGGRIS, cv);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void onCreate(SQLiteDatabase db) {
    }
}

