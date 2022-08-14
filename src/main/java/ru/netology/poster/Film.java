package ru.netology.poster;

public class Film {
    private String nameFilm;
    private String filmGenre;
    private int id;

    public Film(String nameFilm, String filmGenre, int id) {
        this.nameFilm = nameFilm;
        this.filmGenre = filmGenre;
        this.id = id;

    }

    public String getNameFilm() {
        return nameFilm;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public int getId() {
        return id;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public  void setId() {
        this.id = id;
    }
}
