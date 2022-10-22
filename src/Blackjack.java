import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P1Random rand = new P1Random();

        int startGame = 1;
        System.out.println("START GAME #" + startGame);

        int tiedGames = 0;
        int totalGames = 0;
        int dealerWins = 0;
        int playerWins = 0;
        int cardValue = rand.nextInt(13) + 1;
        int handValue = 0;
        double percentWins = 0;
        int input = 1;
        int dealerVal = 0;
        boolean play = true;


        System.out.println("\nYour card is a " + cardValue + "!");
        handValue = handValue + cardValue;
        System.out.println("Your hand is: " + handValue);
        System.out.println("\n1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print statistics");
        System.out.println("4. Exit");
        System.out.print("\nChoose and option: ");
        int playerInput = scanner.nextInt();


        while (play) {
            switch (playerInput) {
                case 1:
                    int newCard = rand.nextInt(13) + 1;
                    switch (newCard) {

                        case 1:
                            System.out.println("\nYour card is a ACE!");
                            newCard = 1;
                            cardValue = 1;
                            newCard = 1;
                            break;
                        case 11:
                            System.out.println("\nYour card is a JACK!");
                            newCard = 11;
                            cardValue = 10;
                            newCard = 10;
                            break;
                        case 12:
                            System.out.println("\nYour card is a QUEEN!");
                            newCard = 12;
                            cardValue = 10;
                            newCard = 10;
                            break;
                        case 13:
                            System.out.println("\nYour card is a KING!");
                            newCard = 13;
                            cardValue = 10;
                            newCard = 10;
                            break;
                        default:
                            System.out.println("\nYour card is a " + cardValue + "!");
                            newCard = cardValue;
                            break;
                    }
                if (handValue < 21) {
                    handValue = newCard + handValue;
                    System.out.println("Your hand is: " + handValue);
                    totalGames++;
                    } else {
                        play = false;
                        System.out.println("Your card is: " + newCard);
                        handValue = newCard + handValue;
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("\nYou have exceed 21! You lose.");
                        totalGames++;
                        break;
                    }
                    System.out.println("\n1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print statistics");
                    System.out.println("4. Exit");
                    System.out.print("\nChoose and option: ");
                    playerInput = scanner.nextInt();


                case 2:

                    if (handValue > 21) {
                        System.out.println("\nDealer's hand: " + dealerVal);
                        System.out.println("Your hand is: " + handValue);
                        dealerWins++;
                        totalGames++;
                    } else if (handValue == 21) {
                        System.out.println("\nDealer's hand: " + dealerVal);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("\nBLACKJACK! You win!");
                        totalGames++;
                        playerWins++;
                    } else if (handValue > dealerVal) {
                        System.out.println("\nDealer's hand: " + dealerVal);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("\nYou win!");
                        totalGames++;
                        playerWins++;
                    } else if (dealerVal == handValue) {
                        System.out.println("\nDealer's hand: " + dealerVal);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("\nIt's a tie! No one wins!");
                        totalGames++;
                        tiedGames++;
                    } else if (dealerVal > 21) {
                        System.out.println("\nDealer's hand: " + dealerVal);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("\nYou win!");
                        totalGames++;
                        playerWins++;
                    } else if (handValue < dealerVal) {
                        System.out.println("\nDealer's hand: " + dealerVal);
                        System.out.println("Your hand is: " + handValue);
                        System.out.println("\nYou lose.");
                        totalGames++;
                        dealerWins++;
                    }
                    System.out.println("\n1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print statistics");
                    System.out.println("4. Exit");
                    System.out.print("\nChoose and option: ");
                    playerInput = scanner.nextInt();

                    playerInput = 1;
                    handValue = 0;
                    startGame++;
                    System.out.println("\nSTART GAME #" + startGame);
                    break;

                case 3:

                    System.out.println("\nNumber of Player wins: " + playerWins);
                    System.out.println("Number of Dealer wins: " + dealerWins);
                    System.out.println("Number of tie games: " + tiedGames);
                    System.out.println("Total # of games played is: " + totalGames);
                    double percent = playerWins / totalGames * 100.0;
                    System.out.println("Percentage of player wins: " + percent);


                case 4:
                    play = false;
                    break;

                default:
                    System.out.println("You have entered an Invalid number please try again.");
                    System.out.println("\n1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print statistics");
                    System.out.println("4. Exit");
                    System.out.print("\nChoose and option: ");
                    playerInput = scanner.nextInt();

            }
        }}}

        /*if (cardValue == 13) {
            System.out.println("king");
            handValue = handValue + 10;
            System.out.println("Your hand is: " + handValue);
            System.out.println("\n1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
        }
        else if (cardValue == 11) {
            System.out.println("Jack");
            handValue = handValue + 10;
            System.out.println("Your hand is: " + handValue);
            System.out.println("\n1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
        }
        else if (cardValue == 1) {
            System.out.println("Ace");
            handValue = handValue + 1;
            System.out.println("\nYour hand is: " + handValue);
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
        }
        else if (cardValue == 12) {
            System.out.println("Queen");
            handValue = handValue + 10;
            System.out.println("Your hand is: " + handValue);
            System.out.println("\n1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");



            System.out.print("\nNumber of Player wins: ");
            System.out.print("Number of Dealer wins: ");
            System.out.print("Number of tie games: ");
            System.out.print("Total # of games played is: ");
            System.out.print("Percentage of player wins: ");
            break;
            case 4:
            break;*/




