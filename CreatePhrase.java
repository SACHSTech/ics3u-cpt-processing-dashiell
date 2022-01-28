/* Hangman game java replit */
//Generates random phrases with two adjectives and one noun

public class CreatePhrase{
    public static String secretPhraseGenerate(){
      
      String [] phraseList = {"big green tractor","The hunger games","mr potato head"
      ,"freshly baked cookies","Gazebo Party","Croquet","haphazardly","jukebox",
      "fervent coffee","crispy green apples","grocery store","tuba","bad flutist",
      "sneaky ninjas","shiny glasses","a diamond in the rough","Animal Farm","sticky cobwebs",
      "endless cycle","rhyming haiku","poison ivy","white ivory","expensive luxuries","khaki pants",
      "juicy grapes","egyptian sphinx","wavy hair","underground subway","dark tunnels","pop quiz",
      "buffalo rider","magical nymph","the matrix","jazz","rock and roll","pneumonia","cute puppies",
      "difficult puzzle","french horns","security guard","butter knife"};
    
      String secretPhrase = phraseList[(int)(Math.random()*(phraseList.length))];
      
      return secretPhrase;
    }
  }
  
