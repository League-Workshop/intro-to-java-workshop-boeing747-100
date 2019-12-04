PImage catPic;
void setup() {
  catPic = loadImage("cat.jpg");
                catPic.resize(width, height);
background(catPic);
size(600,600);  
}
void draw() {
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}

}
