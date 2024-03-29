package com.icdominguez.mynotes.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notes")
public class NoteEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String title;
    public String content;
    public boolean favorite;
    public String color;

    public NoteEntity(String title, String content, boolean favorite, String color) {
        this.title = title;
        this.content = content;
        this.favorite = favorite;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
