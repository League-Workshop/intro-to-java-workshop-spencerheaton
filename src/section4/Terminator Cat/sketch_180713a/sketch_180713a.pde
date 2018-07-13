PImage catPic;
int x = 406;
int y = 490;
void setup(){
  size(800,800);
   catPic = loadImage("cat.jpg");
  catPic.resize(800,800);
  background(catPic);
}
void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
fill(#FC0000);
ellipse(x,y,25,25);
  ellipse(x - 51,y - 9,25,25);
  
  
} void keyPressed(){
  x +=10;
  y +=10;
}