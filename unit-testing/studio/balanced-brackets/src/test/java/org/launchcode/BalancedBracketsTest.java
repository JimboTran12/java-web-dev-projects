package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleOpeningBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("This is a string"));
    }
    @Test
    public void singleUseOfBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This is a string]"));
    }
    @Test
    public void singleUseOfBracketErrorReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This is a string"));
    }

    @Test
    public void MultipleUseOfOverlappingBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[This] is a] string]"));
    }
    @Test
    public void MultipleUseOfOverlappingBracketErrorReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[This] is a] string]"));
    }

    @Test
    public void MultipleUseOfNonOverlappingBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This] [is] [a] [string]"));
    }
    @Test
    public void MultipleUseOfNonOverlappingBracketErrorReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This] [is] [a] string]"));
    }
    @Test
    public void MultipleUseOfOverlappingAndNonOverlappingBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[This] [[is a] [string]]]"));
    }
    @Test
    public void MultipleUseOfOverlappingAndNonOverlappingBracketErrorReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[This] [[is a]] [string]]]"));
    }

    @Test
    public void reverseBracketWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]This is a string["));
    }

    @Test
    public void reverseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void MultipleUseOfOverlappingAndNonOverlappingReverseBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[This] ][is a] [string][]"));
    }




}