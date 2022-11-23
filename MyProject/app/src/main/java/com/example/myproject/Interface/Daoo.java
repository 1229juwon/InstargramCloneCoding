package com.example.myproject.Interface;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myproject.Domain.Entitt;

import java.util.List;


@Dao
public interface Daoo {
    //@Query("SELECT * FROM Entitt")
    List<Entitt> getAll();

    @Insert
    void insert(Entitt entitt);

    @Delete
    void delete(Entitt entitt);

    @Update
    void update(Entitt entitt);
}