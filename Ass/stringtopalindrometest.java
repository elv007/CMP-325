package Ass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringToPalindromeTest {
    @Test
    void stringToPalindrome() {
        assertTrue(stringToPalindrome.isPalindrome("madam"));
        assertTrue(stringToPalindrome.isPalindrome("racecar"));
        assertFalse(stringToPalindrome.isPalindrome("abc"));
        assertFalse(stringToPalindrome.isPalindrome("hello"));
    }
}