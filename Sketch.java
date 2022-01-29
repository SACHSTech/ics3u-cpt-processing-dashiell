import processing.core.PApplet; 
  public class Sketch extends PApplet {
 
  //variables
  int ballSize =       12;        
  int paddleWidth =    12;        
  int paddleHeight =   100;
  float playerSpeed =  15;      
  float ballX, ballY;            
  float ballSpeedX, ballSpeedY;    
 
  float player1, player2;                  // player paddle position
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
    ballX =  width/2;      
    ballY =  height/2;
    ballSpeedX = 4;          
    ballSpeedY = 4;
    player1 = player2 = height/2;    
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
    text(scoreP1, 100,50);
    textAlign(RIGHT, CENTER);
    text(scoreP2, width-100,50);
 
      // draw the ball, update its position
      fill(255);
    ellipse(ballX, ballY, ballSize, ballSize);
    ballX += ballSpeedX;
    ballY += ballSpeedY;  
 
    // paddles
    rect(0, player1, paddleWidth, paddleHeight);
    rect(width-paddleWidth, player2, paddleWidth, paddleHeight);

    //Player 1(Uses Mouse)
 
    player1 = mouseY;
   
    if (ballY < 0 || ballY > height) {
      ballSpeedY *= -1.0;                
    }
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
    if (ballX - ballSize/2 <= paddleWidth && ballY > player1&&  ballY < player1+ paddleHeight) {
      ballSpeedX *= -1.01;
    }
    else if (ballX + ballSize/2 >= width-paddleWidth && ballY > player2 && ballY < player2+ paddleHeight) {
      ballSpeedX *= -1.01;
  }
}
 
  // Player 2 Controls(ARROW KEYS)
  public void keyPressed() {
    if (key == CODED) {
      if (keyCode == UP) {
        player2 -= playerSpeed;          
      }
      else if (keyCode == DOWN) {
        player2 += playerSpeed;          
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
 
 

