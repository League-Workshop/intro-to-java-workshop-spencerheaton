PImage rainbow;
PImage unicorn;
void setup() {
  size(900,900);
rainbow = loadImage("Rainbow.jpeg");
size(900,900);
rainbow.resize(900,900);
background(rainbow);
unicorn = loadImage("UNicorn.jpeg");
}
void draw() {
  background(rainbow);
  image(unicorn, mouseX,mouseY);
}