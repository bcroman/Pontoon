package pontoon;

import java.util.Scanner;

public class Pontoon {

    //Methods
    static int getRandomNum() {
        int x; //varble
        x = (int) (Math.random() * 10) + 1; //radom between 1 and 10
        return x; //reture valur
    }

    static int calcTotal(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    static boolean getResult(int z) {
        boolean result;

        //If Statement
        if (z > 19 && z <= 21) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    static boolean busted(int z) {
        boolean busted = false;
        if (z > 21) {
            busted = true;
        }
        return busted;
    }

    //Main Code
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        //Variables
        String choice = "";
        int card1 = 0;
        int card2 = 0;
        int newCard = 0;
        int total = 0;

        //Generate Random Numbers
        card1 = getRandomNum();
        card2 = getRandomNum();

        //Add Total
        total = calcTotal(card1, card2);

        //Diaplay
        System.out.println("You have drawn " + card1 + " and " + card2);
        System.out.println("Do you wish to draw another card y/n?");

        //User Input
        choice = kboard.next();

        //Whlie Loop
        while (choice.equalsIgnoreCase("y")) {
            newCard = getRandomNum();
            System.out.println("You have drawn " + newCard);
            total = total + newCard;
            System.out.println("Do you wish to draw another card y/n?");
            choice = kboard.next();
        }

        //call getResult method
        boolean result = getResult(total);
        //call busted method
        boolean bustedOver21 = busted(total);

        //If Statement
        if (result == true && bustedOver21 == false) {
            System.out.println("You have won");
        } else {
            System.out.println("You have lost");
        }

        System.out.println("You have total of " + total);
    }
}
