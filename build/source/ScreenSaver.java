import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ScreenSaver extends PApplet {

int cnt = 0;
public void mouseMoved(){
  cnt++;
  if (cnt > 10){
    exit();
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ScreenSaver" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
