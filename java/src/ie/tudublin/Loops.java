package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;
	int sides = 3;
	int way = 0;

	public void settings() {
		size(500, 500);
		
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		println(mode);
	}

	float magicMap(float a, float b, float c, float d, float e) {
		float output;
		a -= b;
		c -= b;
		e -= d;

		output = ((a / c) * e) + d;

		return output;
	}

	float magicMap1(float a, float b, float c, float d, float e) {
		float r1 = c - b;
		float r2 = e - d;
		float howFar = a - b;

		return d + ((howFar / r1) * r2);
	}

	float offset = 0;

	public void draw() {
		switch (mode) {
			case 0:
				background(0);
				int bars = (int) (mouseX / 20.0f);
				float w = width / (float) bars;
				for (int i = 0; i < bars; i++) {
					noStroke();
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}
				break;
			case 1: {
				background(0);
				int squares = (int) (mouseX / 20.0f);
				float h = width / (float) squares;
				for (int i = 0; i < squares; i++) {
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					rect((width - h) - x, x, h, h);
				}
			}
				break;
			case 2:
			{
				background(255);
				int circles = (int) (mouseX / 20.0f);
				offset += (mouseY / 100.0f);
				float d = width / (float) circles;
				for (int j = 0; j < circles; j++) {
					for (int i = 0; i < circles; i++) {
						noStroke();
						float c = map((i + j + offset), 0, circles * 2, 0, 255) % 256;
						fill(c, 255, 255);
						float x = map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						float y = map(j, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						circle(x, y, d);
					}
				}

				break;
			}
			case 3:
			background(0);
				int circles = (int) (mouseX / 20.0f);
				for (int i = 0; i < circles; i++) {
					noStroke();
					//Scale the i value from the value 0 to the value circles to a range of 0 to 255
					fill(map(i, 0, circles, 0, 255), 255, 255);
					//Scale the i value from 0 to the value circles to a range of 0 to width - 50
					float circleWidth = width - map(i, 0, circles, 0, width - 50);
					circle(width / 2, height / 2, circleWidth);
				}
				break; 

			case 4:
			background(0);
			colorMode(RGB);
			float border = width * 0.1f;
			
			for (int x = -5; x <= 5; x++) {
				float i = map(x, -5, 5, border, width-border);
				stroke(0,255,0);
				strokeWeight(2);
				line(i, border, i, height-border);
				line(border, i, width-border, i);
				  
			  } 
			colorMode(HSB);
			break;

			case 5:
			background(0);
			colorMode(RGB);
			stroke(255);
			float cx = width / 2 ;
			float cy = height / 2;
			float radius = 200;
			//int sides = (int)map(mouseX,1,width,0,200);
			//int sides = (int) random(10,20);
			
			
			if ( way == 0){
				sides++;
			}
			if(way == 1){
				sides--;
			}
			if (sides == 3){
				way = 0;
			}
			if (sides == 100){
				way = 1;
			}
			for (int i = 0; i <= sides; i++) {

				float theta1 = map(i - 1, 0, sides, 0, TWO_PI);
				float x1 = cx + sin(theta1) * radius;
				float y1 = cx + cos(theta1) * radius;

				float theta2 = map(i, 0, sides, 0, TWO_PI);
				float x2 = cx - sin(theta2) * radius/2;
				float y2 = cx - cos(theta2) * radius/2;

				line(x1, y1, width-x2, height-y2);
				
			
			
			}
			break;

			case 6:
			{
			background(0);
			colorMode(RGB);
			int color = (int) random(255);
			stroke(color);
			int sidecount = (int) random(5, 13);

			float yr = random(height);
			float xr = random(width);

			if ((frameCount % 30) == 0) {
				
			}
		}
			break;
				// map(a,b,c,d,e);
				// a = inputvalue
				// b - c - start and end of the first range
				// d, e 0 - start and and of the end range

				// map(-2, 10, 90, 200, 233);

		}
	}
}
