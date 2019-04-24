package com.main.company;

public class BlackJack {
    int[] cards = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, //червы
            9, 10, 11, 12, 13, 14, 15, 16, 17, //бубны
            17, 18, 19, 20, 21, 22, 23, 24, 25, 26, //крести
            27, 28, 29, 30, 31, 32, 33, 34, 35}; //пики

    static int value(int cards) {
        int value = cards % 9;
        switch (value) {
            case 0: return 6;
            case 1: return 7;
            case 3: return 9;
            case 4: return 10;
            case 5: return 2;
            case 6: return 3;
            case 7: return 4;
            case 8:
            default: return 11;
        }
    }

    public static final String LINE_SEPARATOR = System.lineSeparator();

    static char getCharacterFromUser() throws IOException {
        byte[] input = new byte [1 + LINE_SEPARATOR.length()];
        if (System.in.read(input) != input.length)
            throw new RuntimeException("What are hell are ypu doing dude?");
        return (char) input[0];
    }

    public static void main(String... __) {

        int userMoney = 1000;
        int compMoney = 1000;
        int BET = 100;

        do {

            MathArrays.shuffle(cards);
            int userValue = 0;
            int count = 0;
            do {
                userValue = cards[count++];
            } while(
                    userValue < 11
                        || userValue < 20 && askUser(userValue));
            /* computer */

            int CompValue = 0;
            do {
                CompValue = cards[count++];
            } while(
                    CompValue < 17);
            CompValue =CompValue >21 ? 0: CompValue;

            if (CompValue == userValue) {
                System.out.println("The Friendship");
            } if (CompValue > userValue) {
                System.out.println("Computer win. You have" + userMoney + "dollars");
                compMoney +=BET;
                userMoney -=BET;
            } else {
                System.out.println("You win!");
                System.out.println("Computer win. You have" + userMoney + "dollars");
                compMoney -=BET;
                userMoney +=BET;
            }

        } while (money > 0);

     private static boolean askUser(int userValue){
            System.out.println("You have " + userValue + "balls. Do you have else?" (\"y\" - Yes, any key, No - Press Ctrl+C for exit));
            return getCharacterFromUser() == 'y';

        }
    }
}