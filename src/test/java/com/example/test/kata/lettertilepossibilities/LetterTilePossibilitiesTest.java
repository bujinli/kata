package com.example.test.kata.lettertilepossibilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterTilePossibilitiesTest {


    LetterTilePossibilities ltp = new LetterTilePossibilities();


    @Test
    public void test1() {
        String tiles = "A";
        int ret = ltp.numTilePossibilities(tiles);
        assertEquals(ret, 1);
    }

    @Test
    public void test2() {
        String tiles = "AB";
        int ret = ltp.numTilePossibilities(tiles);
        assertEquals(ret, 4);
    }

}