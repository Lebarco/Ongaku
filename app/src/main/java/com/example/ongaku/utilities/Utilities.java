package com.example.ongaku.utilities;

public class Utilities {
    public static final String LIST_TABLE = "list";
    public static final String SONG_TABLE = "song";
    //LIST COLUMN NAME
    public static final String LIST_ID = "id";
    public static final String LIST_NAME = "name";
    public static final String LIST_DATE = "date";
    //LIST COLUMN NAME
    public static final String SONG_ID = "id";
    public static final String SONG_NAME = "name";
    public static final String SONG_ARTIST = "artist";
    public static final String SONG_GENRE = "genre";
    public static final String SONG_DATE = "date";
    //CREATE TABLES
    public static final String CREATE_LIST_TABLE = "CREATE TABLE list ( id INTEGER PRIMARY KEY, name TEXT, date TEXT)";
    public static final String CREATE_SONG_TABLE = "CREATE TABLE song ( id INTEGER PRIMARY KEY, name TEXT, artist TEXT, genre TEXT, date TEXT)";
}
