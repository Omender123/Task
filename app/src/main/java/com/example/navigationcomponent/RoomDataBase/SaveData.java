package com.example.navigationcomponent.RoomDataBase;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "saveData")
public class SaveData {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "dbId")
    private int id;
    private String dataId;
    private String name;
    private boolean favrate;


    public SaveData(int id, String dataId, String name, boolean favrate) {
        this.id = id;
        this.dataId = dataId;
        this.name = name;
        this.favrate = favrate;
    }

    @Ignore
    public SaveData(String dataId, String name, boolean favrate) {
        this.dataId = dataId;
        this.name = name;
        this.favrate = favrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavrate() {
        return favrate;
    }

    public void setFavrate(boolean favrate) {
        this.favrate = favrate;
    }

    @Override
    public String toString() {
        return "SaveData{" +
                "id=" + id +
                ", dataId='" + dataId + '\'' +
                ", name='" + name + '\'' +
                ", favrate=" + favrate +
                '}';
    }
}

