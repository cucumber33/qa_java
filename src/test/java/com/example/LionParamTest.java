package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionParamTest {
    Feline feline = new Feline();
    Lion lion = new Lion("Самка", new Feline());
    private final String sex;
    private final boolean hasMane;

    public LionParamTest(String sex, Boolean hasMane) throws Exception {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Детёныш", false}
        };
    }

    @Test
    public void doesHaveManeTest() {
        Feline feline = Mockito.mock(Feline.class);
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Детёныш", feline);
            lion.doesHaveMane();
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
