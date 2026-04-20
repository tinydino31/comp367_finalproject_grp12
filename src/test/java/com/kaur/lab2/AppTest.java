package com.kaur.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testSmartPhonesPrintMessage() {
        SmartPhones sp = new SmartPhones();
        sp.printMessage();
        assertTrue(true); 
    }

    @Test
    void testPhoneCatalogPrintMessage() {
        Products product = new SmartPhones(); 
        PhoneCatalog catalog = new PhoneCatalog(product);

        catalog.printMessage(); 
        assertTrue(true);
    }
}