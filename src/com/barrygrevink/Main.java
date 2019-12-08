package com.barrygrevink;

public class Main {

    public static void main(String[] args) {

        char charValue = 'G';

        switch (charValue) {
            case 'A':
                System.out.println("The chosen letter is A");
                break;
            case 'B':
                System.out.println("The chosen letter is B");
                break;
            case 'C':
                System.out.println("The chosen letter is C");
                break;
            case 'D':
                System.out.println("The chosen letter is D");
                break;
            case 'E':
                System.out.println("The chosen letter is E");
                break;
            default:
                System.out.println("The letters where not in A,B,C,D or E");

        }
        String month = "April";
        switch (month.toLowerCase()) {
            case "january" :
                System.out.println("Jan");
                break;
            case "June" :
                System.out.println("Jun");
            default :
                System.out.println("No idea wich month you have chosen!");
                break;

        }

    }
}
