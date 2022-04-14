package org.launchcode.java.demos.exercises;

import java.util.Arrays;

public class StringArray {
    public static void main(String [] args) {
        int maxWords = 50;
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String splitStr[] = str.split("\\s+");
        System.out.println(Arrays.toString(splitStr));
    }
}

