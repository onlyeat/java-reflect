package com.java.basic;

import static org.junit.Assert.assertTrue;

import com.java.basic.reflect.OfficeBetter;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testOfficeBetter(){
        String[] params = {"com.java.basic.reflect.Word"};
        OfficeBetter.main(params);

    }
}
