package com.example.crudoperations;




import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.JsonToken;

import androidx.annotation.ContentView;
import androidx.annotation.Nullable;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME = "user_db";
    private static final String TABLE_NAME = "users";
    private static final String ID = "id";
    private static final String name = "name";
    private static final String email = "email";
    private static final String created_at = "created_at";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableQuery = "CREATE TABLE if not EXISTS "+TABLE_NAME+
                "("+
                ID+" INTEGER PRIMARY KEY,"+
                name+" TEXT ,"+
                email+" TEXT ,"+
                created_at+ " TEXT "+
                ")";
        db.execSQL(tableQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }

    public void AddUser(UserModel userModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(name,userModel.getName());
        contentValues.put(email,userModel.getEmail());
        contentValues.put(created_at, userModel.getCreated_at());
        db.insert(TABLE_NAME,null, contentValues);
        db.close();

    }

    public List<UserModel> getALLUsers(){
        List<UserModel> userModelList = new ArrayList<>();
        String query = "SELECT * from "+TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =  db.rawQuery(query,null);
        if(cursor.moveToFirst()){
            do{
                UserModel userModel = new UserModel(
                        cursor.getString(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3)
                );
                userModelList.add(userModel);
            }while (cursor.moveToNext());
        }
        db.close();
        return userModelList;
    }
    public int getTotalCount(){
        String query = "SELECT * from "+TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =  db.rawQuery(query,null);
        return cursor.getCount();
    }

    public UserModel getUser(int id){
        SQLiteDatabase db=this.getReadableDatabase();
        String query = "SELECT * from "+TABLE_NAME+ " WHERE id = "+id;
        Cursor cursor = db.rawQuery(query,null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        UserModel userModel = new UserModel(
                cursor.getString(0),
                cursor.getString(1),
                cursor.getString(2),
                cursor.getString(3)
        );
        db.close();
        return userModel;
    }
    public int updateUser(UserModel userModel){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(name,userModel.getName());
        contentValues.put(email,userModel.getEmail());
        return db.update(TABLE_NAME,
                contentValues,
                ID+"=?",
                new String[]{String.valueOf(userModel.getId())}
        );

    }

    public void deleteUser(String id){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(TABLE_NAME,ID+"=?",new String[]{id});
        db.close();
    }
}
