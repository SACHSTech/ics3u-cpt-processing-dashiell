/*  Dashiell Pinter  -  Hangman - 
      Hangman In Java. Play in either singleplayer or mulitiplayer, where
    a friend can create a secret phrase for you to guess!
*/
import processing.core.PApplet;
import java.util.Scanner;


public class Sketch extends PApplet {

  public class Draw{ void main(String[] args) {
    
    try (//Welcomes players to game and asks for multiplayer/singleplayer
    Scanner numOfPlayers = new Scanner(System.in)) {
      Lives.hangmanPrint(1);
      System.out.print("Welcome to Mikey and Gabe's Hangman! :)\nYou lose when your head is an 'x'.\nPlease input your gamemode below.\n\nType: \n'M' for multiplayer hangman\n\tor \n'S' for singleplayer hangman\n\nNOTE: If multiplayer hangman is chosen, you will get to input your own secret phrase.\n");
      String playerNumber = numOfPlayers.nextLine();
      playerNumber = playerNumber.toLowerCase();
      
      //Checks if valid selection of multiplayer or singleplayer was selected
      while (!(playerNumber.equals("m")||playerNumber.equals("s"))){
        System.out.print("\n\nInvlaid selection. Please type in 'M' for multiplayer hangman or type 'S' for singleplayer hangman.\n");
        playerNumber = numOfPlayers.nextLine();
        playerNumber = playerNumber.toLowerCase();
      }
      
      
      //Checks for singleplayer or multiplayer
      String answer = "";
      if (playerNumber.equals("m")){
        for (int i=1;i<=54;i++){
        System.out.print("\n");
        }
        System.out.print ("\n\n\nWARNING:\n\tThe secret phrase may be visible if you scroll up. Make sure the second player does not cheat.");
        
        try (Scanner userPhrase = new Scanner(System.in)) {
          boolean legalPhrase = false;
          String testPhrase = "";
          String secretPhrase = "";
          
          while(!legalPhrase){
            System.out.print("\n\nInput a secret phrase:\n");
            secretPhrase="";
            testPhrase="";
            secretPhrase = userPhrase.nextLine();
            for (int i=0; i<secretPhrase.length();i++){
              if((Character.isLetter(secretPhrase.charAt(i))||secretPhrase.substring(i,i+1).equals(" "))){
                testPhrase += secretPhrase.substring(i,i+1);
              }
            }
            if (testPhrase.equals(secretPhrase)){
              legalPhrase=true;
            }
            else {
              for (int i=1;i<=54;i++){
                System.out.print("\n");
              }
              System.out.print ("That is not a valid phrase.\n\tDo not include numbers or special characters.");
            }
          }
          answer = secretPhrase;
        }
      }
      else if (playerNumber.equals("s")) {
        answer = CreatePhrase.secretPhraseGenerate();
      }
      
      //The game begins
      
      for (int i=1;i<=54;i++){
        System.out.print("\n");
      }
      answer = answer.toLowerCase();
      
      int lives = 7;
      String guessedLetters = "";
      int len = answer.length();
      boolean correct = false;
      String revealedPhrase="";
      Lives.hangmanPrint(lives);
      
      FormatHidden.stringSecret(guessedLetters,answer);    
      
      
      try (//Checks if letter has been guessed already or for any invalid guesses
      Scanner input = new Scanner(System.in)) {
        while (lives>0&&(!correct)){
          System.out.print("\n\nWhat's your guess?\n");
          String guess = input.nextLine();
          guess = guess.toLowerCase();
          
          if (guess.equals("")||guess.equals(" ")){
            for (int i=1;i<=54;i++){
              System.out.print("\n");
            }
            System.out.print ("**You didn't guess. Please enter a guess.**\n");
          }
          else if (!(Character.isLetter(guess.charAt(0)))) {
            for (int i=1;i<=54;i++){
              System.out.print("\n");
            }
            System.out.print("**You didn't guess a letter. Please guess a letter.**\n");
          }
          else if (guessedLetters.contains(guess)){
            for (int i=1;i<=54;i++){
              System.out.print("\n");
            }
            System.out.print ("**You already guessed that letter. Guess again.**\n");
          }
          else if (guess.length()>1) { 
            for (int i=1;i<=54;i++){
              System.out.print("\n");
            }
            System.out.print ("**Your guess is too long, please print only one letter.**\n");
          }
          
          // Adds letters to the list of already guessed letters
          else {
            if (guessedLetters.equals("")){
              guessedLetters+=(guess);
            }
            else {
              guessedLetters+=(", "+ guess);
            }
            // Checks if the phrase contains the letter guessed
            if (!(Checker.correct(guess, answer, len))){
              lives--;
            }
            for (int i=1;i<=39;i++){
              System.out.print("\n");
            }
          }
          Lives.hangmanPrint(lives);
          revealedPhrase=FormatHidden.stringSecret(guessedLetters,answer);
          System.out.print ("\nLetters already guessed: "+guessedLetters);
            
          if (!(revealedPhrase.contains("_"))){
            correct = true;
          }
        }
      }
      
      //Prints out congratulatory message if you correctly guessed the secret phrase
      if (correct){
        System.out.print ("\n\nCongratulations, you escaped the hangman.");
      }
      
      //Prints out non-congratulatory if you did not correctly guess the secret phrase
      else {
        System.out.print ("\n\nSorry, you did not escape the hangman. Better luck next time.");
        System.out.print("\nThe secret phrase was "+answer);
      }
    }  
  }
}
}

	
	
  
  // define other methods down here.


