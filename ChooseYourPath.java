import java.util.Scanner;

public class ChooseYourPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It's 3rd down and 6, you're at the 30 yard line. You need to get a first down. Will you run or pass the ball? 1 for run, 2 for pass.");
        int playChoice = sc.nextInt();

        if (playChoice == 1) {
            System.out.println("You chose to run. What kind of run play do you want? 1 for inside run, 2 for jet sweep.");
            int runPlay = sc.nextInt();

            if (runPlay == 1) {
                System.out.println("You called an inside run play. Who gets the ball? 1 for Gibbs, 2 for Monty.");
                int runner = sc.nextInt();

                if (runner == 1) {
                    System.out.println("Gibbs takes the ball and runs up the middle for a gain of 5! You settle for a field goal.");
                } else {
                    System.out.println("Goff hands it off to David Montgomery, who carries it for a gain of 6! First down!");
                }
            } else if (runPlay == 2) {
                System.out.println("You called a jet sweep. Who will take ball? 1 for St. Brown, 2 for Gibbs.");
                int runner = sc.nextInt();

                if (runner == 1) {
                    System.out.println("St. Brown takes the handoff and runs for a gain of 8! First down!");
                } else {
                    System.out.println("Gibbs takes it from Goff, but is immediately stopped for a gain of about a yard. You have to settle for a field goal.");
                }
            } 
        } else if (playChoice == 2) {
            System.out.println("You chose to pass. What kind of pass play do you want? 1 for short pass, 2 for long pass.");
            int passPlay = sc.nextInt();

            if (passPlay == 1) {
                System.out.println("You called a short pass play. Who will you throw to? 1 for St. Brown, 2 for Williams");
                int reciever = sc.nextInt();

                if (reciever == 1) {
                    System.out.println("St. Brown runs a slant, catches for a gain of 8 yards. First down!");
                } else {
                    System.out.println("Goff throws to Williams, BUT IT GETS PICKED OFF!! You turn it over and head back to the bench in shame.");
                }
            } else if (passPlay == 2) {
                System.out.println("You called a long pass play. Who will you throw to? 1 for St. Brown, 2 for LaPorta.");
                int reciever = sc.nextInt();

                if (reciever == 1) {
                    System.out.println("Goff has the ball. He's looking for Amon Ra St. Brown, and finds him in the endzone for a touchdown!");
                } else {
                    System.out.println("Goff looking for the tight end LaPorta, and finds him right by the endzone for a big gain!");
                }
            }
        }
    }
}
