class Particle{
	constructor() {
		// position of source (at bottom)
		this.x = 350;
		this.y = 300;

		// generates random velocity in the x and y direction
		this.velocityX = random(-1, 1);
		this.velocityY = random(-3, -1);

		// particle's color is white
		this.alpha = 255;  
	}
  	
	// changes position of the object called
	setPos(initX, initY){
      		this.x = initX;
     		this.y = initY;
    	}
  
    	
	// changes velocity of the object called
	setSpeed(minX, maxX, minY, maxY){
      		this.velocityX = random(minX, maxX);
      		this.velocityY = random(minY, maxY);
    	}
	
	reveal() {
        	noStroke();
		fill(255, this.alpha);
		ellipse(this.x, this.y, 14);
	}
	
	
    	// increases the x and y coordinate of particle by velocityX and Y, respectively
    	// decreases object's (this) alpha by 7 to create a fading effect
	renew() {
		this.x += this.velocityX;
		this.y += this.velocityY;
		this.alpha -= 7;
	}

	
	// boolean return value if the color of the particle is < 0
	toDelete() {
	      	return this.alpha < 0;
	}

}
