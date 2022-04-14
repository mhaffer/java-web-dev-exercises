package org.launchcode.java.demos.exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(9);
        myList.add(8);
        myList.add(2);
        myList.add(6);
        myList.add(1);
        myList.add(7);
        myList.add(10);
        myList.add(0);
        myList.add(4);


        String myText = "Write a static method to print out each word in a list that has exactly 5 letters.";
        System.out.println(printWordsWithFiveLetters(myText));

    }
    public static int evenAdd (ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static ArrayList<String> printWordsWithFiveLetters(String text){
        Scanner input = new Scanner(System.in);
        System.out.println("What length of word would you like to print?");
        int number = input.nextInt();
        input.close();

        String[] splitArray = text.split(" ");
        ArrayList<String> myList = new ArrayList<>();

        for (String s : splitArray) {
            if (s.length() == number) {
                myList.add(s);
            }
        }
        return myList;
    }


}