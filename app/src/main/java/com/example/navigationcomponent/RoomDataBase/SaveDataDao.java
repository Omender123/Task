package com.example.navigationcomponent.RoomDataBase;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SaveDataDao {


    @Query("SELECT * FROM saveData ORDER BY dbId")
    List<SaveData> loadAllData();

    @Insert
    void insertData(SaveData person);

    @Update
    void updateData(SaveData person);

    @Delete
    void delete(SaveData person);

    @Query("SELECT * FROM SaveData WHERE  dataId = :id")
    SaveData loadDataById(String  id);
}
