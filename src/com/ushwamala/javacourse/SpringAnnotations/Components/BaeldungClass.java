package com.ushwamala.javacourse.SpringAnnotations.Components;

import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.List;


/**
 * https://www.baeldung.com/spring-inject-arrays-lists
 */

public class BaeldungClass {

    @Value("#{'${listOfBooleans}'.split(',')}")
    private List<Boolean> listOfBooleans;

    @Value("#{'${listOfIntegers}'.split(',')}")
    private List<Integer> listOfIntegers;

    @Value("#{'${listOfCharacters}'.split(',')}")
    private List<Character> listOfCharacters;

    public void main() {

        Object[] chars = listOfCharacters.toArray();
        System.out.println(Arrays.toString(chars));

        Object[] integers = listOfIntegers.toArray();
        System.out.println(Arrays.toString(integers));

        Object[] booleans = listOfBooleans.toArray();
        System.out.println(Arrays.toString(booleans));



    }

}
