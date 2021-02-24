//init array to hold individual particles
let particles = [];


// 600x400 canvas
function setup() {
	createCanvas(500, 400);
}


function draw() {
    //create Particle object p and add to array
    background(100);
    let p1 = new Particle();
    let p2 = new Particle();

    particles.push(p1);
    particles.push(p2);
    
    p1.setPos(150, 300);
    p2.setSpeed(-2, 2, -9, -2);
    
    for (let i = particles.length - 1; i > 0; i--) {
	// increase velocity and decrease color of element in array
	particles[i].renew();
        particles[i].reveal();
	
	// if element's alpha value is < 0, remove from array
        if(particles[i].toDelete()) {
		particles.splice(i, 1);
        }
    }
}
