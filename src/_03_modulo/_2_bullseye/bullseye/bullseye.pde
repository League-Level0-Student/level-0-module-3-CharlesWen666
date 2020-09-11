
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=0; i<5;i++){
  if(i % 2==0 ){
  fill(#151313);
  }
  else{
  fill(#F00C0C);
  }
  ellipse(250,250,250-50*i,250-50*i);
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
