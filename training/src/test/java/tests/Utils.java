package tests;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void printSmallestNumber(int number1, int number2, int number3) {

        if (number1 < number2 && number1 < number3)
            System.out.println("The smallest number is: " + number1);
        else if (number2 < number1 && number2 < number3)
            System.out.println("The smallest number is: " + number2);
        else if (number3 < number1 && number3 < number2)
            System.out.println("The smallest number is: " + number3);
        else
            System.out.println("The numbers are same.");
    }



    public static List<String> printSecondFourthAndSixthCharacters(String input) {
        List<String> result = new ArrayList<>();

        String[] split = input.split("\\s+");

        for (int i = 1; i < split.length; i += 2) {
            String currentWord = split[i];
            result.add(currentWord);
            System.out.println(currentWord);
        }
        return result;
    }


    public static List<String> makeListFromString(String str) {
        List<String> result = new ArrayList<>();

        String[] split = str.split("\\s+");

        for (String s : split) {
            result.add(s);
        }
        return result;
    }

    public static int getSize(List<String> strings) {
        return strings.size();
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }


    public static void PasswordChecker(String Password) {

        int minPossibleCharacters = 8;
        int maxPossibleCharacters = 16;
        int length = 0;
        int numCount = 0;
        int capCount = 0;

        for (int i = 0; i < Password.length(); i++) {
            char c = Password.charAt(i);
            if (Character.isUpperCase(c)) {
                capCount++;
            }
            if (Character.isLowerCase(c)) {
                length++;
            }
            if (Character.isDigit(c)) {
                numCount++;

            } if(c>=33&&c<=46||c==64){
                System.out.println("Password Contains Invalid Character!");
                return;
            }

            length = (i + 1);

        }

        if (numCount < 2) {
            System.out.println("Not enough numbers in password!");
        }

        if (capCount < 1) {
            System.out.println("Not enough capital letters in password!");
        }

        if (length < minPossibleCharacters) {
            System.out.println("Password is Too Short!");
        }
        if (length > maxPossibleCharacters) {
            System.out.println("Password is too long");
        }
        if (numCount >= 2 && capCount >= 1 && length >= minPossibleCharacters && length <= maxPossibleCharacters) {
            System.out.println("Password is valid");
        }

    }

    public static void monthNumber(int monthNumber) {

        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                throw new IllegalStateException("Error");
        }
        System.out.println(monthName);
    }

    public static void returnOfInvestment(int amount, double rate, int years) {

        for (int i = 1; i <= years; i++) {
            double result = amount + amount * rate;
            amount = (int) result;
            System.out.println(amount);
        }
    }
}
