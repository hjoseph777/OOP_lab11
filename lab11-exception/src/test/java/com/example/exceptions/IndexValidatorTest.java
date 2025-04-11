package com.example.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IndexValidatorTest {

    @Test
    public void testValidateIndex_ValidIndex() {
        assertDoesNotThrow(() -> IndexValidator.validateIndex(1, 3));
    }

    @Test
    public void testValidateIndex_InvalidIndex() {
        Exception exception = assertThrows(MyException.class, () -> IndexValidator.validateIndex(5, 3));
        assertEquals("Index out of bounds: 5", exception.getMessage());
    }
}