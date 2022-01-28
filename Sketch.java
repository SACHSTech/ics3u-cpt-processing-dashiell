import processing.core.PApplet;
import processing.core.PFont;
   
 
  public class Sketch extends PApplet {
 
  //variables
  int ballSize =       12;        
  int paddleWidth =    12;        
  int paddleHeight =   100;
  float playerSpeed =  15;      
  float ballX, ballY;            
  float ballSpeedX, ballSpeedY;    
  PFont font;   
 
  float p1y, p2y;                  // player paddle position
  int scoreP1, scoreP2;            // current score for players
 
     
 
    /**
     * Called once at the beginning of execution, put your size all in this method
     */
    public void settings() {
    // size call
      size(800, 700);
    }
    public void setup() {
      background(0);
 
      // for ball and paddles
    ballX =             width/2;      
    ballY =             height/2;
    ballSpeedX =        3;          
    ballSpeedY =        3;
    p1y = p2y =         height/2;    
    scoreP1 = scoreP2 = 0;            
    }
       
    /**
     * Called repeatedly, anything drawn to the screen goes here
     */
    public void draw() {
           
    //this is when someone scores a goal
    background(0);
    fill(255, 100);
    rect(width/2 - 3, 0, 6, height);
    textAlign(LEFT, CENTER);
    text(scoreP1, 50,50);
    textAlign(RIGHT, CENTER);
    text(scoreP2, width-50,50);
 
      // draw the ball, update its position
      fill(255);
    ellipse(ballX, ballY, ballSize, ballSize);
    ballX += ballSpeedX;
    ballY += ballSpeedY;  
 
    // paddles
    rect(0, p1y, paddleWidth, paddleHeight);
    rect(width-paddleWidth, p2y, paddleWidth, paddleHeight);
 
      //scoring
    if (ballX < 0) {      
      scoreP2 += 1;      
      newBall();    
    }
    else if (ballX > width) {
      scoreP1 += 1;
      newBall();
 
    }
    //when hitting the ball back
    if (ballX - ballSize/2 <= paddleWidth && ballY > p1y &&  ballY < p1y + paddleHeight) {
      ballSpeedX *= -1;
    }
    else if (ballX + ballSize/2 >= width-paddleWidth && ballY > p2y && ballY < p2y + paddleHeight) {
      ballSpeedX *= -1;
  }
}
 
  // Player 2 Controls(ARROW KEYS)
  public void keyPressed() {
    if (key == CODED) {
      if (keyCode == UP) {
        p2y -= playerSpeed;          
      }
      else if (keyCode == DOWN) {
        p2y += playerSpeed;          
      }
    }
  }
// This is for when a new ball appears after someone scores
  void newBall() {
    ballX = width/2;
    ballY = height/2;
    ballSpeedX = 4;    
    ballSpeedY = 4;
  }
}
 
 
      // define other methods down here.
 
 

