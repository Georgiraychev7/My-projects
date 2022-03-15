package tests;

import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void checkForSmallestNumber() {
        Utils.printSmallestNumber(11, 11, 11);
    }

    @Test
    public void printElementsFromArray() {
        Utils.printSecondFourthAndSixthCharacters("I love writing methods so much");
    }

    @Test
    public void returnSizeOfArrayList() {
        System.out.println(Utils.getSize(Utils.makeListFromString("Did i tell you how much i love writing methods")));
    }

    @Test
    public  void checkForLeapYear() {
        Utils.leapYear(2014);
    }

    @Test
    public void checkForValidPassword() {
        Utils.PasswordChecker("Newpassword!11");
    }

    @Test
    public void printNameOfMonth() {
        Utils.monthNumber(22);
    }

    @Test
    public void returnOfInvestment() {
        Utils.returnOfInvestment(10000,0.05,10);
    }
}
