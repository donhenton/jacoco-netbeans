/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.stuff;

/**
 *
 * @author dhenton
 */
public class ThingToTest {

    public enum ANIMAL_TYPE {

        cat, dog
    }

    public String doAnimalThing(ANIMAL_TYPE type) {
        String t = null;
        if (type == null) {
            return null;
        } else {
            switch (type) {
                case cat:
                    t = "meow";
                    System.out.println("meow");
                    break;

                case dog:
                    t = "bark";
                    System.out.println("bark");
                    break;

                default:
                    t = "hummph!!";

            }
        }

        return t;
    }

}
