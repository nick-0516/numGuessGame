// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class numGuessGame {
    public static void main(String[] args) {
        init();
    }
    public static void init(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println();
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)\n");
        System.out.print("Enter your choice: ");
        int diffLvl = sc.nextInt();
        if(diffLvl < 1 | diffLvl > 3){
                    do{
                        System.out.print("\nMust select between 1 and 3, choose again: ");
                        diffLvl = sc.nextInt();
                    }while(diffLvl < 1 | diffLvl > 3);
                }
        switch(diffLvl){
            case 1:
                System.out.println("\nGreat! You have selected the Easy difficulty level.");
                System.out.println("Let's start the game!\n");
                game(10);
                break;
            case 2:
                System.out.println("\nGreat! You have selected the Medium difficulty level.");
                System.out.println("Let's start the game!\n");
                game(5);
                break;
            case 3:
                System.out.println("\nGreat! You have selected the Hard difficulty level.");
                System.out.println("Let's start the game!\n");
                game(3);
                break;
        }
        sc.close();
    }
    public static void decision(){
        
        do{
            boolean flag;
            Scanner sccc = new Scanner(System.in);
            System.out.print("\nWould you like to play again? - y/n : ");
            String cho = sccc.nextLine();
            switch(cho){
                case "y":
                    init();
                case "n":
                    System.exit(0);
                default:
                    System.out.println("\nincorrect selection, select 'y' or 'n'");
                    flag = true;
            }
        }while(true);
        
    }
    public static void game(int chances){
            Scanner scc = new Scanner(System.in);
            Random rand = new Random();
            int num = rand.nextInt(101);
            
            
            for(int i=1; i<=chances; i++){
                System.out.print("Enter your guess: ");
                int guess = scc.nextInt();
                System.out.println();
                if(guess <= 0 | guess > 100){
                    do{
                        System.out.print("Must guess between 1 and 100, guess again: ");
                        guess = scc.nextInt();
                    }while(guess <= 0 | guess > 100);
                }
                if(guess == num){
                    System.out.println("Congratulations! You guessed the correct number in " +i+ " attempt(s).");
                    decision();
                }
                else{
                    if(guess>num){
                        System.out.println("Incorrect! The number I'm thinking is less than " +guess+" .");
                    }
                    else{
                        System.out.println("Incorrect! The number I'm thinking is greater than " +guess+" .");
                    }
                }
            }
            System.out.println("\nOops!! I was thinking " +num+ " you couldn't guess that in "+chances+" attempts");
            
            decision();
            // do{
            //     boolean flag;
                
            //     System.out.print("\nWould you like to play again? - y/n : ");
            //     String cho = sccc.nextLine();
            //     switch(cho){
            //         case "y":
            //             init();
            //         case "n":
            //             System.exit(0);
            //         default:
            //             System.out.println("\nincorrect selection, select 'y' or 'n'");
            //             flag = true;
            //     }
            // }while(true);

        }
}