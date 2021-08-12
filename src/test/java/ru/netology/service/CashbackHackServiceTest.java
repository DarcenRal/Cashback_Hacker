package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount800() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount1100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual,expected);
    }
}