  import processing.core.PApplet;

  public class Sketch extends PApplet {

  //variables
  int ballSize =       12;         
  int paddleWidth =    12;         
  int paddleHeight =   100;
  float playerSpeed =  15;       
  float ballX, ballY;             
  float ballSpeedX, ballSpeedY;    

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
    ballSpeedX =        4;          
    ballSpeedY =        4;
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

     