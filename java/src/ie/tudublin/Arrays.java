package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	float[] rainfall = {45,37,55,27,38,50,79,48,104,31,100,58};

	String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

	public void settings()
	{
		size(500,500);	
	}
	public void setup()
	{
		float min=Float.MAX_VALUE;
		float max=Float.MIN_VALUE;
		float total = 0;
		float avg = 0;
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] > max)
			{
				max = rainfall[i];
			}
			if(rainfall[i] < min)
			{
				min = rainfall[i];
			}
			total += rainfall[i];
		}
		avg = total/rainfall.length;
		println("Max:" , max ,"\nMin:" + min, "\nTotal:", total, "\nAverage", avg);
	}
	public void draw()
	{
		background(0);
		float gap = width/rainfall.length;
		for(int i = 0; i < rainfall.length; i++)
		{
				fill(255);
				rect(gap *i, height, gap, -rainfall[i] *3);
		}
	}
	
}