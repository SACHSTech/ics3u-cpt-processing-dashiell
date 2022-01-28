//Updates blanks if singleplayer game is chosen

public class FormatHidden{
    public static String stringSecret(String guessedLetters, String answer){
        String concealedWord = "";
        int len = answer.length();
        for (int i=0; i<len; i++){
          String check = answer.substring(i, i+1);
          if (guessedLetters.contains(check)){
            // add a case if it is at the end of a word so that the space is greater affter
            concealedWord += check + " ";
          }
          else if (!check.equals(" ")){
            concealedWord += "_ ";
          }
          else{
            concealedWord += "  ";
          }
        }
        System.out.print(concealedWord);
        return concealedWord;
    }
  }
