package com.lingh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledInNativeImage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EnabledInNativeImage
public class ClassLevelTest {

    @Test
    void testOnClass(){
        assertEquals(1 + 2, 3);
    }
}
