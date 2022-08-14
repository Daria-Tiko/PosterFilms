package ru.netology.poster;

public class Film {
    private String nameFilm;
    private String filmGenre;

    public Film(String nameFilm, String filmGenre) {
        this.nameFilm = nameFilm;
        this.filmGenre = filmGenre;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
