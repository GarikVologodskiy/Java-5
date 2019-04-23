package com.main.company;

public class Slot1 {

    public static void main (String... __) {

        final int COLBAR = {0,0,0};
        final int SIZE = 5;
        final int MAX_VALUE = 100;
        final int BET = 10;

        final int money = 100;
        int barPos1 = 0;
        int barPos2 = 0;
        int barPos3 = 0;

        while ((money -= BET) >= 0) {
            System.out.println("money = " + money);
            int value = (int) Math.round(Math.random() * MAX_VALUE);
            if (value == 0) {
                money += BET;
                continue;
            }
            COLBAR[0] = value % SIZE + (int) Math.round(Math.random() *10);
            COLBAR[1] = value * 2 % SIZE + (int) Math.round(Math.random() *10);
            COLBAR[2] = value * 4 % SIZE + (int) Math.round(Math.random() *10);

            System.out.println("Выпало " + COLBAR[0] + "" + COLBAR[1] + "" + COLBAR[2]);
            if (COLBAR[0] == COLBAR[1] && COLBAR[0] == COLBAR[3]) {
                money += 1_000;
                System.out.println("Выгрышь");
                break;
            }   else
                System.out.println("Проигрышь");

        }
        System.out.println("money = " + money);
    }
}