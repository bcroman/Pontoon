package pontoon;

import java.util.*;

public class Pontoon {

    //Methods(Functions)
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

    static boolean getResult(int z, int houseNum) {
        boolean result;

        //If Statement
        if (z > houseNum && z <= 21) {
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

    static int houseNumber(int houseNum) {
        houseNum = getRandomNum();
        while (houseNum < 16) {
            houseNum = getRandomNum() + houseNum;
        }
        return houseNum;
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
        int houseNum = 0;
        int arrayNum = 1;

        //Arrays
        int[] UserCards = new int[10];

        //Generate Random Numbers
        card1 = getRandomNum();
        card2 = getRandomNum();

        //add to array
        UserCards[0] = card1;
        UserCards[1] = card2;

        //Add Total
        total = calcTotal(card1, card2);

        //Diaplay
        System.out.println("You have drawn " + card1 + " and " + card2);
        System.out.println("Do you wish to draw another card y/n?");

        //User Input
        choice = kboard.next();

        //Whlie Loop
        while (choice.equalsIgnoreCase("y")) {
            arrayNum = arrayNum + 1;
            newCard = getRandomNum();
            UserCards[arrayNum] = newCard;
            System.out.println("You have drawn " + newCard);
            total = total + newCard;
            System.out.println("Do you wish to draw another card y/n?");
            choice = kboard.next();
        }

        //call houseNum method
        houseNum = houseNumber(houseNum);

        //call getResult method
        boolean result = getResult(total, houseNum);
        //call busted method
        boolean bustedOver21 = busted(total);

        //Display Results
        if (bustedOver21 == true) {
            System.out.println("Busted your cards total" + total + "which is over 21");
        } else if (result == true) {
            System.out.println("You have won with a total of " + total + " house had " + houseNum);
        } else if (result == false) {
            System.out.println("You have lost with a total of " + total + " house had " + houseNum);
        }

        //Display Cards
        System.out.println("Cards Dwarn:" + Arrays.toString(UserCards));

    }
}
