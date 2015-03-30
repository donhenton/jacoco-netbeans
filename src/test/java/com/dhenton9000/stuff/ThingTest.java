/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.stuff;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author dhenton
 */
public class ThingTest {

    @Test
    public void testCat() {
        ThingToTest thing = new ThingToTest();
        assertEquals("meow", thing.doAnimalThing(ThingToTest.ANIMAL_TYPE.cat));
    }

    @Test
    public void testDog() {
        ThingToTest thing = new ThingToTest();
        assertEquals("bark", thing.doAnimalThing(ThingToTest.ANIMAL_TYPE.dog));
    }

    @Test
    public void testNull() {
        ThingToTest thing = new ThingToTest();
        assertNull(thing.doAnimalThing(null));
    }

    @Test
    public void testUnkown() {
        ThingToTest thing = new ThingToTest();
        assertEquals("hummph!!", thing.doAnimalThing(ThingToTest.ANIMAL_TYPE.unknown));
    }

}
