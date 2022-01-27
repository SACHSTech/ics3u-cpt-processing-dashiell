import processing.core.PApplet;

public class Sketch extends PApplet {

	
  /**
   * 
   */
  public void settings() {
	// size call
    size(624, 351);
  }

  /** 
   * backround
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
  }
  
  // define other methods down here.
}