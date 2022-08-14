package ru.netology.poster;

import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repo;
    private int countFilm = 10;


    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public PosterManager(int countFilm, PosterRepository repo) {
        if (countFilm >= 0) {
            this.countFilm = countFilm;
        }
        this.repo = repo;
    }

    public void addNewFilm(Film movie) {
        repo.save(movie);
    }

    public Film[] findAll() {
        return repo.findAll();
    }

    public Film[] findLast() {

        int resultLength;
        Film[] films = repo.findAll();
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


