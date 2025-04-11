package com.example.exceptions;

public class IndexValidator {
    public static void validateIndex(int index, int size) throws MyException {
        if (index < 0 || index >= size) {
            throw new MyException("Index out of bounds: " + index);
        }
    }

    public static int position(int index, int size) throws MyException {
        validateIndex(index, size);
        return index; // Return the valid index as the position
    }
}