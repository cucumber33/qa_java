package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class TestFeline {
    Feline feline = new Feline();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
//
    @Test
    public void getFoodTest() {
        try {
            assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFoods("Хищник"));
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void eatMeatPredatorShowsMenu() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFoods("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamilyShouldBeFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void getKittensIntegerNumberReturnCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(6);
        assertEquals(6, actual);
    }
}
