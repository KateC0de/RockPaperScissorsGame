import java.util.*;

public class RockPaperScissorShpak { // make sure to include your last name at the end of your class name

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        run(kb);
        System.out.println("Thanks for playing!");

    }

    public static void run (Scanner kb){
        System.out.print("How many times do you want to play the game? ");
        int count = kb.nextInt();

        /*inside the for loop choose the computer pick, ask the user's input, call the method play*/
        Random rand = new Random();
        for(int i = 1; i <= count; i++)
        {
            //your code
            int comp = rand.nextInt(3);
            System.out.print("Rock, Paper, Scissors --> ");
            String user = kb.next();
            int u = -1;
            if(user.equalsIgnoreCase("Scissors"))
                u = 0;
            else if(user.equalsIgnoreCase("Rock"))
                u = 1;
            else if(user.equalsIgnoreCase("paper"))
                u = 2;
            play(comp, u);


        }
    }

    /*This method contains bunch of if statments to determie if the computer is the winner or the
    user*/
    public static void play(int comp,int u){
        //your code
        if(comp == 0){
            if(u == 0)
                System.out.println("The Computer picked Scissors. You picked Scissors too. It's a Draw!");
            else if(u == 1)
                System.out.println("The Computer picked Scissors. You picked Rock. You Won!");
            else if(u == 2)
                System.out.println("The Computer picked Scissors. You picked Paper. You Lost!");

            System.out.println();

        }else if(comp == 1){
            if(u == 0)
                System.out.println("The Computer picked Rock. You picked Scissors. You Lost!");
            else if(u == 1)
                System.out.println("The Computer picked Rock. You picked Rock too. It's a Draw!");
            else if(u == 2)
                System.out.println("The Computer picked Rock. You picked Paper. You Won!");

            System.out.println();


        }else if(comp == 2){
            if(u == 0)
                System.out.println("The Computer picked Paper. You picked Scissors. You Won!");
            else if(u == 1)
                System.out.println("The Computer picked Paper. You picked Rock. You Lost!");
            else if(u == 2)
                System.out.println("The Computer picked Paper. You picked Paper. It's a Draw!");

            System.out.println();

        }





    }
}