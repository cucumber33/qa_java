package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestLion {
    Feline feline = new Feline();
    Lion lion = new Lion("Самка", new Feline());

    public TestLion() throws Exception {
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion objLion = new Lion("Самец", new Feline());
        try {
            assertEquals(List.of("Животные", "Птицы", "Рыба"), objLion.getFood());
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void hasManeTest() {
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, lion.getKittens());
    }
}
