import java.util.Scanner;

public class ZombieKillerArray {
    public static void main(String[] args){

        System.out.println("\nWelcome to the zombie killer program!! There are 5 waves of zombies to take down! \n");

        String backpack [] = {"Shotgun", "Assault Riffle", "Sniper"};
        String zombies [] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};

        System.out.println("\nYour Backpack inventory: ");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);

        System.out.println("\nTypes of zombies: ");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);

        //where the game starts

        //Few Variables I Need
        Scanner scan = new Scanner(System.in);
        String userChoice;
        int redo = 0;

        //Created a while loop so user must complete 5 waves of zombies.
        while (redo < 5 ) {
            System.out.println("\noh my gosh!! a zombie is on its way.. I think its a... " + zombies[0] +
                    " what can we use to kill it??? ");
            int correctChoice = 0;

            userChoice = scan.nextLine();                   //Scan line for the switch cases

            switch (userChoice.toLowerCase()) {              //I used switch cases here, and the .toLowerCase method keeps the answer from being case sensitive
                case "shotgun":                               //Different gun options
                    if (correctChoice == 0) {
                        System.out.println(backpack[0]);
                        System.out.println("Good job!! you eliminated that zombie!");
                    } else
                        System.out.println("that wasn't the right choice, game over");
                    break;

                case "Assault Riffle":
                    if (correctChoice == 1) {
                        System.out.println(backpack[1]);
                        System.out.println("Nice one! I dont know what I'd do without you.");
                    } else
                        System.out.println("that wasn't the right choice, game over");
                    break;

                case "sniper":
                    if (correctChoice == 2) {
                        System.out.println(backpack[2]);
                        System.out.println("What a shot! that zombie sure was at a distance.");
                    } else{
                        System.out.println("that wasn't the right choice, game over");
                        return ;}
                    break;

                default:                                    //if a user enters anything but those guns, it gives them another chance.
                    System.out.println("That is an invalid option, please try again! Remember, it must be " +
                            "Shotgun, Assault Riffle, or Sniper \n\n");


            }
            redo++; //counter for how many waves to process
        }
        System.out.println("you did great out there!! you won the game and saved us all <3");

    }
}