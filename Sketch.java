import processing.core.PApplet;

public class Sketch extends PApplet {

      float[] circleY = new float[50];
      float[] snowfall = new float[50];
      float[] mousePositionsX = new float[25];
      float[] mousePositionsY = new float[25];
      int snowSpeed = 3;
      int num = 25;
      int index = 0;

  public int intStage = 0;
  
  public int intInstructions = 0;

  public void settings() {
    size(400, 400);
  }
 
  public void setup() {}
  
    public void draw() {

  // Starting Screen
  if (intStage == 0) {

    // Reset Background
    background(0, 0,0);

    // Variables

    // Display Text
    textSize(55);
    fill(245, 235, 235);
    text("SNOWFALL", (width / 2) - 150, (height / 2) - 100);

    // Start Button
    stroke(111, 140, 135);
    strokeWeight(1);
    fill(55, 90, 110);
    rect((width / 2) - 160, height / 2, 300, 100, 20);

    fill(255, 255, 255);
    text("Start!", (width / 2) - 80, (height / 2) + 70);

    // Making start button react to cursor
    if (mouseX >= (width / 2) - 160 && mouseX <= (width / 2) + 140 && mouseY >= (height / 2)
        && mouseY <= height / 2 + 100) {

      stroke(111, 140, 135);
      strokeWeight(2);
      fill(255, 0, 0);
      rect((width / 2) - 160, height / 2, 300, 100, 20);

   // Checking if the user clicks the start button
      if (mousePressed) {
        intStage = 1;

  // Draw Blue Box on Cursor
      noStroke();
      fill(56, 111, 133);
      rect(mouseX, mouseY, 20, 20);

       if (intStage == 1) {

        if (intInstructions == 0) {
  
   // Reset Background
          background(91, 193, 252);
  
   // Text Box 1
          stroke(51, 51, 255);
          strokeWeight(2);
  
          fill(255, 255, 255);
          rect((width / 2) - 200, 10,400, 230, 10);

    // Instructions
          fill(41, 20, 54);
          textSize(20);
         text("Use the cursor the avoid falling snowflakes", 10, height - 300);

         fill(41, 20, 54);
         textSize(40);
        String textBoxMessage = "How To Play";
          text(textBoxMessage, 95, 50);

      
    // Start Button For "Stage 2"
        stroke(111, 140, 135);
        strokeWeight(1);
        rect((width / 2) - 160, height / 2, 300, 100, 20);
        fill(255, 255, 255);
        text("Start!", (width / 2) - 80, (height / 2) + 70);

  
    
      

    


     
   
  }












        
     }
     
     }
     
    }
  
    }}
  }



    

    
  











