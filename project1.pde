boolean kpressed = false;

 
void setup() {
  size(displayWidth,displayHeight);
  background(243,240,235);
}
 
void draw() {
  if(keyPressed){
       if(key =='a' || key == 'A'){
     PFont op;
  op = loadFont("opensans.vlw");
       textFont(op, 25);
    fill(241,123,135);
    text("Appreciate all their strengths",width/17,height/2.2);
  }
    else if(key =='b' || key == 'B'){
     PFont op;
  op = loadFont("opensans.vlw");

       textFont(op, 35);
    fill(172,126,222);
    text("Balance dependence&independence",width/2,height/1.3);
  }
    else if(key =='c' || key == 'C'){
     PFont op;
  op = loadFont("opensans.vlw");
       //textSize(50);
       textFont(op,55);
    fill(94,210,239);
    text("Communicate empathically",width/2.1,height/3.8);
  }
     else if(key =='d' || key == 'D'){
     PFont op;
  op = loadFont("opensans.vlw");
       //textSize(55);
       textFont(op,55);
    fill(94,210,239);
    text("Don't blame",width/1.6,height/1.8);
  }
     else if(key =='e' || key == 'E'){
     PFont op;
  op = loadFont("opensans.vlw");
       //textSize(55);
       textFont(op,38);
    fill(235,70,22);
    text("Enjoy a steady diet of good sex",width/4.4,height/1.9);
  }
     else if(key =='f' || key == 'F'){
     PFont op;
  op = loadFont("opensans.vlw");
       //textSize(55);
       textFont(op,30);
    fill(172,126,222);
    text("Fix and change them isn't worth trying",width/1.8,height/9.5);
  }
    else if(key == 'k' || key == 'K'){
        PFont op;
  op = loadFont("opensans.vlw");
    textSize(60);
    textFont(op);
    fill(94,210,239);
    text("Keep it adventurous, playful, fun",width/8.5,height/3);}
  else if(key =='h' || key == 'H'){
      PFont op;
  op = loadFont("opensans.vlw");
       textSize(30);
       textFont(op);
    fill(235,70,22);
    text("Have regular bonding time",width/6,height/1.3);
  }
   else if(key =='m' || key == 'M'){
     PFont op;
  op = loadFont("opensans.vlw");
       textSize(50);
       textFont(op);
    fill(241,123,135);
    text("Master the art of compromise",width/6,height/3);
  }


}

}

