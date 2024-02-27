package ru.netology.Maven_Task1;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long actual = service.calculate(amount, registered);
    }
}