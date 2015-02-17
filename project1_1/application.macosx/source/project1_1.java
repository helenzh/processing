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

public class project1_1 extends PApplet {

boolean kpressed = false;
int smallPoint, largePoint;
 
public void setup() {
  size(700,500);
  background(0);
   smallPoint = 3;
  largePoint = 12;
  noStroke();
}
 
public void draw() {
  
  if(keyPressed){  background(0);
  
       if(key =='a' || key == 'A'){

       //textFont(op, 25);

  
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Accept you both have bad moments",width/2.1f,height/2.1f);
       
  }
    else if(key =='b' || key == 'B'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Balance dependence and independence",width/2.1f,height/2.1f);
  }
     else if(key =='c' || key == 'C'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Communicate empathically",width/2.1f,height/2.1f);
  }
     else if(key =='d' || key == 'D'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Don't blame",width/2.1f,height/2.1f);
  }
  else if(key =='e' || key == 'E'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Enjoy a steady diet of good sex",width/2.1f,height/2.1f);
  }
    else if(key =='f' || key == 'F'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Fix and change them isn't worth trying",width/2.1f,height/2.1f);
  }
   else if(key =='g' || key == 'G'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Give little gifts",width/2.1f,height/2.1f);
  }
   else if(key =='h' || key == 'H'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Have regular bonding time",width/2.1f,height/2.1f);
  }
    else if(key =='i' || key == 'I'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("'I LOVE YOU', say it",width/2.1f,height/2.1f);
  }
    else if(key =='j' || key == 'J'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Judging is no good",width/2.1f,height/2.1f);
  }
    else if(key =='k' || key == 'K'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Keep it adventurous, playful, fun",width/2.1f,height/2.1f);
  }
    else if(key =='l' || key == 'L'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Learn how to really listen",width/2.1f,height/2.1f);
  }
    else if(key =='m' || key == 'M'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Master the art of compromise",width/2.1f,height/2.1f);
  }
    else if(key =='n' || key == 'N'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Never stop dating",width/2.1f,height/2.1f);
  }
    else if(key =='o' || key == 'O'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Own your emotions",width/2.1f,height/2.1f);
  }
    else if(key =='p' || key == 'P'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Politeness",width/2.1f,height/2.1f);
  }
    else if(key =='q' || key == 'Q'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Question before fighting: is it worth it? ",width/2.1f,height/2.1f);
  }
    else if(key =='r' || key == 'R'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Remember to laugh",width/2.1f,height/2.1f);
  }
    else if(key =='s' || key == 'S'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Say sorry, make peace",width/2.1f,height/2.1f);
  }
    else if(key =='t' || key == 'T'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Touch a lot",width/2.1f,height/2.1f);
  }
    else if(key =='u' || key == 'U'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Use words of affirmation",width/2.1f,height/2.1f);
  }
    else if(key =='v' || key == 'V'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Vision and common goals are necessary",width/2.1f,height/2.1f);
  }
    else if(key =='w' || key == 'W'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Work out and eat like you are single",width/2.1f,height/2.1f);
  }
    else if(key =='x' || key == 'X'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("X issue always sensitive",width/2.1f,height/2.1f);
  }
    else if(key =='y' || key == 'Y'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Your partner is not you",width/2.1f,height/2.1f);
  }
    else if(key =='z' || key == 'Z'){
   background(0);
     fill(255,87,126);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 40);
    text("Zigzag happens",width/2.1f,height/2.1f);
  }
    else{
   background(0);
     fill(180,180,180);
     PFont fg;
     fg = loadFont("QuicksandLight-Regular-30.vlw");
    textAlign(CENTER, CENTER);
    textFont(fg, 25);
    text("<Press a LETTER key, please>",width/2.1f,height/2.1f);
  }
  }
   float pointillize = map(random(width), random(height), 30,smallPoint, largePoint);
  int x = PApplet.parseInt(2);
  int y = PApplet.parseInt(3);
  fill(245,87,126,5);
  ellipse(width/2, height/2, pointillize, pointillize);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "project1_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
