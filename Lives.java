//Prints out hangman pertaining to amount of lives left

public class Lives{
    public static void hangmanPrint(int lives){
    if (lives==7){
          //prints hanger w/ 7 lives
      System.out.print(" ----------------------- \n|Mikey and Gabe's Hangman|\n ----------------------- \n\n----------\n|\t|\n|\n|\n|\n|\n|\n|\n--------\n\n");
    }
    else if (lives==6){
      System.out.print("\n----------\n|\t|\n|\tO\n|\n|\n|\n|\n|\n--------\n\n");
    }
    else if (lives==5){
      System.out.print("\n----------\n|\t|\n|\tO\n|\t|\n|\n|\n|\n|\n--------\n\n");
    }
    else if (lives==4){
      System.out.print("\n----------\n|\t|\n|\tO\n|      /|\n|\n|\n|\n|\n--------\n\n");
    }
    else if (lives==3){
      System.out.print("\n----------\n|\t|\n|\tO\n|      /|\\\n|\n|\n|\n|\n--------\n\n");
    }
    else if (lives==2){
      System.out.print("\n----------\n|\t|\n|\tO\n|      /|\\\n|      /\n|\n|\n|\n--------\n\n");
    }
    else if (lives==1){
      System.out.print("\n----------\n|\t|\n|\tO\n|      /|\\\n|      / \\\n|\n|\n|\n--------\n\n");
    }
    else if (lives==0){
      System.out.print("\n----------\n|\t|\n|\tx\n|      /|\\\n|      / \\\n|\n|\n|\n--------\n\n"); 
    }
  }
}