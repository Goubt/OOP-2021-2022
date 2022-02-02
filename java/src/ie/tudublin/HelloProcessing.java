package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
	}

	
	public void draw()
	{	
		background(255,0,0);
		fill(255,255,0);
		stroke(255,255,0);
		circle(250,250,450);
		fill(0,255,255);
		stroke(0,255,255);
		triangle(10,450,490,450,250,5);
		fill(200);
		stroke(200);
		ellipse(250,220,200,100);
		fill(0);
		stroke(0);
		circle(250,220,75);

	}
}
