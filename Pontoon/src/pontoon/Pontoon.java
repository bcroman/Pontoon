package pontoon;

import java.util.Scanner;

public class Pontoon {

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        
        //Variables
        String choice = "";
        int card1 = 0;
        int card2 = 0;
        int newCard = 0;
        int total = 0;
        
        //Generate Random Numbers
        card1 = (int)(Math.random()*10)+1;
        card2 = (int)(Math.random()*10)+1;
        
        //Add Total
        total = card1+card2;
        
        //Diaplay
        System.out.println("You have drawn "+card1+" and "+card2);
        System.out.println("Do you wish to draw another card y/n?");
        
        //User Input
        choice = kboard.next();
          
        //Whlie Loop
        while(choice.equalsIgnoreCase("y")){
            newCard = (int)(Math.random()*10)+1;
            System.out.println("You have drawn "+newCard);
            total = total+newCard;
            System.out.println("Do you wish to draw another card y/n?");
            choice = kboard.next();
        }
        
        //If Statement
        if(total > 19 && total <=21){
            System.out.println("You have won");
        }else{
            System.out.println("You have lost");
        }
        
        System.out.println("You have total of "+total);
    }
}
