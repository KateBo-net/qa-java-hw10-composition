package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager manager = new FilmManager();
    FilmItem film1 = new FilmItem(1, "Вперед", "Мультфильм", "5.03.2020");
    FilmItem film2 = new FilmItem(2, "Джентельмены", "Боевик", "13.02.2019");
    FilmItem film3 = new FilmItem(3, "Человек-невидимка", "Ужасы", "5.03.2020");
    FilmItem film4 = new FilmItem(4, "Бладшот", "Боевик", "12.03.2020");
    FilmItem film5 = new FilmItem(5, "Номер 1", "Комедия", "19.03.2020");

    @Test
    public void shouldAddFilm() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        FilmItem[] expected = {film1, film2, film3};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindDefLastFilms() {
        manager.addFilm(film4);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film2);
        manager.addFilm(film5);

        FilmItem[] expected = {film5, film2, film3, film2, film1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindCustomCountLastFilms() {

        FilmManager customCountManager = new FilmManager(3);
        customCountManager.addFilm(film2);
        customCountManager.addFilm(film3);
        customCountManager.addFilm(film2);
        customCountManager.addFilm(film5);

        FilmItem[] expected = {film5, film2, film3};
        FilmItem[] actual = customCountManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsCountOverLength() {

        FilmManager customCountManager = new FilmManager();
        customCountManager.addFilm(film2);
        customCountManager.addFilm(film3);
        customCountManager.addFilm(film2);
        customCountManager.addFilm(film5);

        FilmItem[] expected = {film5, film2, film3, film2};
        FilmItem[] actual = customCountManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
