package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        String text = "If the product of two terms is " +
//                "zero then common sense says at least one " +
//                "of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, " +
//                "you can put the quadratics into a form that can be " +
//                "factored allowing that side of the equation to equal " +
//                "zero. Once you’ve done that, it’s pretty straightforward " +
//                "from there.";
        String text = "hello";

        // Convert string into array.
        char[] charInText = text.toCharArray();
        Integer startValue = 1;

        // Declared and initialized an empty HashMap
        HashMap<Character, Integer> characters = new HashMap<>();

        // iterate each character from characterArray
        for(Character eachChar : charInText){

            //condition is true if the character is already present in the map
            if(characters.containsKey(eachChar)){
                //increment the character occurrence in the map
                //Hashmap doesn't allow duplicate keys so it increments the value alone
                characters.put(eachChar,characters.get(eachChar)+1);
            }else{
                // put the new character in the map with starting value as 1
                characters.put(eachChar,startValue);
            }

        }
        for(Character inputChar : characters.keySet()){
            //search for value using character
            Integer count = characters.get(inputChar);

            // print each character and its occurrence
            System.out.println( inputChar + ": " + count);
        }
    }
}
