PImage snoopy ;
PImage mustache;
void setup() {
  size(600, 600);
snoopy = loadImage("Snoopy.png");
snoopy.resize(600,600);
mustache = loadImage("mustache.jpg");
  mustache.resize(50,50);
  background(snoopy);
}
void draw() {
  background(snoopy); 
  if (mousePressed) {
    image(mustache, mouseX, mouseY);
  }
}