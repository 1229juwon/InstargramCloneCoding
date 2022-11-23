package com.example.myproject.Helper;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myproject.Domain.Entitt;

@Database(entities = {Entitt.class}, version = 1)
public abstract class Databasee extends RoomDatabase {
    public abstract Databasee getDaoo();
}
