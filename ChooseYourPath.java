import java.util.Scanner;

public class ChooseYourPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It's 3rd down, do you want to run or pass the ball? 1 for run, 2 for pass.");
        int playChoice = sc.nextInt();

        if (playChoice == 1) {
            System.out.println("You chose to run. What kind of run play do you want? 1 for inside run, 2 for jet sweep.");
            int runType = sc.nextInt();

            if (runType == 1) {
                System.out.println("You called an inside run play. Who gets the ball? 1 for Gibbs, 2 for Monty.");
                int ballCarrier = sc.nextInt();

                if (ballCarrier == 1) {
                    System.out.println("Gibbs takes the ball and runs up the middle for a gain of 5.");
                } else {
                    System.out.println("Goff hands it off to Montgomery, who carries it for a gain of 6.");
                }
            } else if (runType == 2) {
                System.out.println("You called an jet sweep. Who gets the ball? 1 for St. Brown, 2 for Gibbs.");
                int ballCarrier = sc.nextInt();

                if (ballCarrier == 1) {
                    System.out.println("St. Brown takes the handoff and runs for a gain of 8.");
                } else {
                    System.out.println("Gibbs takes it from Goff, but is shortly stopped for a gain of about a yard.");
                }
            } 
        } else if (playChoice == 2) {
            System.out.println("You chose to pass. What kind of pass play do you want? 1 for short pass, 2 for long pass.");
            int passType = sc.nextInt();

            if (passType == 1) {
                System.out.println("You called a short pass play. Who is the receiver? 1 for St. Brown, 2 for Williams");
                int receiverChoice = sc.nextInt();

                if (receiverChoice == 1) {
                    System.out.println("St. Brown runs a slant, catches for a gain of 8.");
                } else {
                    System.out.println("Goff throws to Williams, and its caught for a gain of 8.");
                }
            } else if (passType == 2) {
                System.out.println("You called a long pass play. Who is the receiver? 1 for St. Brown, 2 for LaPorta.");
                int receiverChoice = sc.nextInt();

                if (receiverChoice == 1) {
                    System.out.println("Goff has the ball. He's looking for Amon Ra St. Brown, and finds him deep for a big gain!");
                } else {
                    System.out.println("Goff looking for the tight end LaPorta, and finds him for a big gain!");
                }
            }
        }
    }
}
