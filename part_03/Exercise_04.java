package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings) {

        // generate a random number >= 0 and <= 3
        // use this as the computer's hand

        int random = (int) (Math.random() * 3);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int playerInput = input.nextInt();

        // call getHand(int hand) to determine the computers hand
        String computerHand = getHand(random);

        // call getHand(int hand) to determine the players hand
        String playerHand = getHand(playerInput);

        // call determineWinner(int computerHand, int playerHand) to determine who one
        String winnerName = determineWinner(random, playerInput);
        // determineWinner(random, playerInput);

        // print out a message to the console stating which hand the computer had, which hand
        // the play had and who won.

        System.out.println("The computer's hand was " + computerHand + " your hand was " + playerHand
                + ".");


        if (computerHand!=playerHand){

            System.out.println("The winner is " + winnerName );
        } else
            System.out.println("");

    }

    public static String getHand(int hand) {

        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper
        // return hand

        String handResult = "";

        switch (hand) {

            case 0:
                handResult = "scissor";
                break;
            case 1:
                handResult = "rock";
                break;
            case 2:
                handResult = "paper";
                break;
        }
        return handResult;
    }


    public static String determineWinner(int computer, int player) {

        String status = "";

        if (computer != player) {

            switch (player) {
                // use conditional ("?") operator

                case 0:
                    status = (computer != 1) ? "You won!" : "You lost :(";
                    break;
                case 1:
                    status = (computer != 2) ? "You won!" : "You lost :(";
                    break;
                case 2:
                    status = (computer != 1) ? "You won!" : "You lost :(";
                    break;

            }


        } else System.out.println("It's a tie!");

        return status;

    }

}
