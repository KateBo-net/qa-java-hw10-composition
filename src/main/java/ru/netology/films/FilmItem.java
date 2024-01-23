package ru.netology.films;

public class FilmItem {

    private int id;
    private String filmName;
    private String filmGenre;
    private String filmDate;

    public FilmItem(int id, String filmName, String filmGenre, String filmDate) {

        this.id = id;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmDate = filmDate;
    }

}
