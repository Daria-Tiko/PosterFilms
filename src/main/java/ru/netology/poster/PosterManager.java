package ru.netology.poster;

public class PosterManager {

    private Film[] films = new Film[0];
    private int countFilm = 10;

    public PosterManager() {
    }

    public PosterManager(int countFilm) {
        if (countFilm >= 0) {
            this.countFilm = countFilm;
        }
    }

    public void addNewFilm(Film movie) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {

        int resultLength;
        if (countFilm < films.length) {
            resultLength = countFilm;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - i - 1];
        }
        return result;
    }

}


