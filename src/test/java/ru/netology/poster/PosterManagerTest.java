package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.repository.PosterRepository;

import static org.mockito.Mockito.*;



public class PosterManagerTest {
    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    Film film1 = new Film("Рататуй", "мульфильм", 1);
    Film film2 = new Film("Холоп", "комедия", 2);
    Film film3 = new Film("Мстители", "фантастика", 3);
    Film film4 = new Film("Веном", "ужасы", 4);
    Film film5 = new Film("Пираты Карибсского моря", "приключения", 5);
    Film film6 = new Film("Титаник", "мелодрама",6 );
    Film film7 = new Film("Плохие парни", "боевик", 7);
    Film film8 = new Film("Дом странных детей мисс Перегрин", "фэнтези", 8);
    Film film9 = new Film("Домовой", "семейный",9);
    Film film10 = new Film("Хакер", "криминал",10);
    Film film11 = new Film("Гордость и предубеждение", "исторический",11);

    @Test
    public void shouldFindAll() {
        Film[] films = { film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        doReturn(films).when(repo).findAll();

        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    }


