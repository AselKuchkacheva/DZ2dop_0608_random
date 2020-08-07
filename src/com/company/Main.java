package com.company;


public class Main {

    public static int generateRandomAge(){
        int a = 1;
        int b = 100;
        int random;

        return random = a + (int) (Math.random() * b);
    }


    public static void main(String[] args) {

        System.out.println("Можно ли идти гулять, если человеку" +  " " + generateRandomAge() + "?");

    }
}
