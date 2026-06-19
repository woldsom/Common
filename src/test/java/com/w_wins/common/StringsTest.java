package com.w_wins.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void removeCharacter() {
        assertEquals("bcd",Strings.removeCharacter("abcd",0));
        assertEquals("acd",Strings.removeCharacter("abcd",1));
        assertEquals("abd",Strings.removeCharacter("abcd",2));
        assertEquals("abc",Strings.removeCharacter("abcd",3));
    }
}