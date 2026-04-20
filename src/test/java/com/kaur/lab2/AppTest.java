package com.kaur.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testBasic() {
        assertTrue(true);
    }

    @Test
    void testAddition() {
        assertEquals(4, 2 + 2);
    }
}