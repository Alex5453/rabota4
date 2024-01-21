package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected= 40;
        long actual = service.calculate(4_000_000, false);
        
        System.out.println(expected+ " == ? == " + actual);


    }
}