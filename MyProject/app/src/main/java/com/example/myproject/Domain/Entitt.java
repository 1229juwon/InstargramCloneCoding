package com.example.myproject.Domain;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Entitt")
public class Entitt {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="name")
    public String name;

    @ColumnInfo(name="phone")
    public String phone;

    @ColumnInfo(name="address")
    public long address;

}
