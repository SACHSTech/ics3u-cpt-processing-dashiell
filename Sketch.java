import processing.core.PApplet;
;

public class Sketch extends PApplet {

  float[] circleY = new float[50];
  float[] snowfall = new float[50];
  float[] mousePositionsX = new float[25];
  float[] mousePositionsY = new float[25];
  int snowSpeed = 3;
  int num = 25;
  int index = 0;
  
  //scoreboard
  int score = 0;

  boolean menuScreen;
  boolean instructionsScreen;
  boolean Level1;
  boolean winScreen;
  boolean gameOverScreen;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    menuScreen = true;
    background(3, 219, 252);
  }

  public void draw(){
    if(menuScreen){
        menuScreen();
    }
    else if(Level1){
        Level1();
    }
     else if(instructionsScreen){
        instructionsScreen();
     }
    else if(winScreen){
       winScreen();
    }
    else if(gameOverScreen){
        gameOverScreen();
    }
  }


    public void menuScreen(){
        background(0);
        fill(77);
    }

      // Start Button
      fill(255, 255, 255);
      rect(225, 100, 300 , 75);
  
      // How To Play Sign
      fill(50);
      textSize(40);
      text("Press 'e' to play", 235, 150);
  
      // How To Play Button
      fill(255, 255, 255);
      rect(225, 200, 300, 75);
  
      // Play Sign
      fill(50);
      textSize(28);
      text("Press 'i' for instructions", 230, 250);

        if(key == 'i'){
            menu screen = false;
            instructionScreen = true;
        }
    }

    public void instructionScreen(){
        background(255, 158, 158);
        // Instruction Title
        fill(0);
        textSize(50);
        text("Instructions", 260, 75);

        //Instructions
        fill(0);
        textsize(35);
        text(try to avoid the falling snowflakes!);
        text(the more snowflakes avoided the more points you gain!);
        text(if you hit a snowflake you lose!);
        text(press m to go back to menu);

        if key == 'm'){
            instructionsScreen = false;
            menuScreen = true;
        }
    }

    public void gameOverScreen(){
        background(0);
        fill(250);
        textSize(60);
        text("Game Over", 210, 200);
        textSize(35);
        text("Press 'm' to go back to menu", 220, 400);
        if(key == 'm'){

            
        }



    }



    }



    }

    }
    

  
  
    




}



 }
}
 }
