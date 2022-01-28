import processing.core.PApplet;

public class Sketch2 extends PApplet {

  private static final boolean Level1 = false;

  float[] circleY = new float[50];
  float[] snowfall = new float[50];
  float[] mousePositionsX = new float[25];
  float[] mousePositionsY = new float[25];
  int snowSpeed = 3;
  int num = 25;
  int index = 0;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(0);
    for (int i = 0; i < 50; i++) {
      circleY[i] = random(0, 400);
    }
    for (int i = 0; i < 50; i++) {
      snowfall[i] = 5;
    }

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



  
