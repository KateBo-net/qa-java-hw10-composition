package ru.netology.films;

public class FilmManager {

    private int countLastFilms = 5;
    private FilmItem[] films = new FilmItem[0];

    public FilmManager() {
    }

    public FilmManager(int countLastFilms) {
        this.countLastFilms = countLastFilms;
    }

    public void addFilm(FilmItem item) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            tmp[copyToIndex] = film;
            copyToIndex++;
        }
        tmp[tmp.length - 1] = item;
        films = tmp;
    }

    public FilmItem[] findAll() {

        return films;
    }

    public FilmItem[] findLast() {

        FilmItem[] lastFilms;

        if (countLastFilms > films.length) {
            lastFilms = new FilmItem[films.length];
            for (int i = 0; i < films.length; i++) {
                lastFilms[i] = films[films.length - 1 - i];
            }
        } else {
            lastFilms = new FilmItem[countLastFilms];
            for (int i = 0; i < countLastFilms; i++) {
                lastFilms[i] = films[films.length - 1 - i];
            }
        }
        return lastFilms;
    }

}
