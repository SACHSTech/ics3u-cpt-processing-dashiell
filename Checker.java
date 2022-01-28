//Method for checking if guess is contained within the phrase

public class Checker{
    public static boolean correct(String guess, String answer, int len){
      for(int i = 0; i < len; i++){
        if(answer.substring(i,i+1).equals(guess)){
          return true;
        }
      }
      return false;
    }
  }
