package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterManager films = new PosterManager();

    Film film1 = new Film("Рататуй", "мульфильм");
    Film film2 = new Film("Холоп", "комедия");
    Film film3 = new Film("Мстители", "фантастика");
    Film film4 = new Film("Веном", "ужасы");
    Film film5 = new Film("Пираты Карибсского моря", "приключения");
    Film film6 = new Film("Титаник", "мелодрама");
    Film film7 = new Film("Плохие парни", "боевик");
    Film film8 = new Film("Дом странных детей мисс Перегрин", "фэнтези");
    Film film9 = new Film("Домовой", "семейный");
    Film film10 = new Film("Хакер", "криминал");
    Film film11 = new Film("Гордость и предубеждение", "исторический");

    @BeforeEach
    public void setup() {

        films.addNewFilm(film1);
        films.addNewFilm(film2);
        films.addNewFilm(film3);
        films.addNewFilm(film4);
        films.addNewFilm(film5);
        films.addNewFilm(film6);
        films.addNewFilm(film7);
        films.addNewFilm(film8);
        films.addNewFilm(film9);
        films.addNewFilm(film10);
        films.addNewFilm(film11);
    }

    @Test
    public void shouldFindAll() {
        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Film[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFinLastAll() {
        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Film[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFinLastEightFilms() {

        PosterManager films = new PosterManager(8);

        films.addNewFilm(film1);
        films.addNewFilm(film2);
        films.addNewFilm(film3);
        films.addNewFilm(film4);
        films.addNewFilm(film5);
        films.addNewFilm(film6);
        films.addNewFilm(film7);
        films.addNewFilm(film8);
        films.addNewFilm(film9);
        films.addNewFilm(film10);
        films.addNewFilm(film11);


        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4};
        Film[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFinLastOneFilms() {

        PosterManager films = new PosterManager(1);

        films.addNewFilm(film1);
        films.addNewFilm(film2);
        films.addNewFilm(film3);
        films.addNewFilm(film4);
        films.addNewFilm(film5);
        films.addNewFilm(film6);
        films.addNewFilm(film7);
        films.addNewFilm(film8);
        films.addNewFilm(film9);
        films.addNewFilm(film10);
        films.addNewFilm(film11);


        Film[] expected = {film11};
        Film[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
