import processing.core.PApplet;

public class Sketch extends PApplet {

  private static final boolean Level1 = false;
  // Screens
  boolean menuScreen;
  boolean instructionScreen;
  boolean gameoverScreen;
  boolean restartScreen;

  float[] circleY = new float[50];
  float[] snowfall = new float[50];
  float[] mousePositionsX = new float[25];
  float[] mousePositionsY = new float[25];
  int snowSpeed = 3;
  int num = 25;
  int index = 0;

   // Scoreboard
   int points = 0;
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    menuScreen = true;
    background(0, 0, 0);

    background(0);
    for (int i = 0; i < 50; i++) {
      circleY[i] = random(0, 400);
    }
    for (int i = 0; i < 50; i++) {
      snowfall[i] = 5;
    }
  }

  public void draw() {

    background(0);

    boolean endScreen;
    if(menuScreen){
      menuScreen();
    }
    else if(Level1){
      Level1();}

    else if(instructionScreen){
      instructionScreen();
    }
   
    else if (endScreen){
      endScreen();
    }
    else if(gameoverScreen){
      gameoverScreen();
    }
  }
     // Start Button
     fill(255, 255, 255);
     rect(225, 100, 300 , 75);
 
     // How To Play Sign
     fill(50);
     textSize(40);
     text("Press 'enter' to play", 235, 150);
 
     // How To Play Button
     fill(255, 255, 255);
     rect(225, 200, 300, 75);
 
     // Play Sign
     fill(50);
     textSize(28);
     text("Press 'i' for instructions", 230, 250);

     if(key == 'e'){
      menuScreen = false;
      Level 1 = true;

      if(key == 'i'){
        menuScreen = false;
        instructionScreen = true;

        public void instructionScreen(){
          background(255, 158, 158);
          // Instruction Title
          fill(0);
          textSize(50);
          text("Instructions", 250, 75);
      
          // Instructions
          fill(0);
          textSize(30);
          text("Click your mouse button", 30, 150);
          text("to choose the right colour", 30, 190);
          text("Click the right colour to ", 30, 250);
          text("move onto the next level ", 30, 290);
          text("If you don't move fast", 400, 150);
          text("enough, you will die!", 400, 190);
          text("Press 'm' to go back to the", 400, 250);
          text("main menu when prompted", 400, 290);


      
















       // Trail
       background(32);
       ellipse(mouseX, mouseY, 15, 15);

    // Drawing falling snow
    for (int circleX = 0; circleX < 50; circleX++) {
      ellipse(circleX*8, circleY[circleX], 8, 4);
    }
  
    for (int i = 0; i < 50; i++) {
      circleY[i] += snowSpeed;
      if (circleY[i] >= 400) {
        circleY[i] = 0;
        snowfall[i] += 3;
      }
    }
    
    
    
    
    }

  private void gameoverScreen() {
  }

  private void instructionScreen() {
  }

  private void menuScreen() {
  }
  }

  
