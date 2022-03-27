package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {"'testValid', 200, 300, 3", "'test all values', 100, 9850, 90", "'test Not Valid Min', 0, 99, 0", "'test Not Valid Max', 9850, 100000, 0"
            })
    void counterSqrBoundaryValues(String nameTest, int min, int max, long expected) {
        SQRService service = new SQRService();
        long newCounter = service.counter(min, max);

        assertEquals(expected, newCounter);

    }
}