var startButton;
let logo;

function preload() {
  logo = loadImage("../images/StudyCubbyLogo.png");
}

function setup() {
  createCanvas(windowWidth, windowHeight);

  image(logo, width/2, height/2 - 150)

  startButton = createButton("Start Session");
  startButton.position(width/2 - 50, height/2);
}

function draw() {
  background(153, 255, 204);
  imageMode(CENTER);
  image(logo, width/2, height/2 - 150)
}