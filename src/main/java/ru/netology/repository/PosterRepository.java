package ru.netology.repository;

import ru.netology.poster.Film;

public class PosterRepository {
    private Film[] films = new Film[0];

    public void save(Film movie) {
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

    public Film findById(int id) {
        for (Film movie : films) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public void removeById(int id) {
        if (findById(id) != null) {
            Film[] tmp = new Film[films.length - 1];
            int index = 0;
            for (Film movie : films) {
                if (movie.getId() != id) {
                    tmp[index] = movie;
                    index++;
                }
            }
            films = tmp;
        }
    }

    public void removeAll() {
        films = new Film[0];
    }


}
