var image;
var imgcanvas;
var original;

function upload(){
	var fileinput= document.getElementById("finput");
	imgcanvas= document.getElementById("can");
	image= new SimpleImage(fileinput);
	image.drawTo(imgcanvas);
}
function redfilter(){
	for(var pixel of image.values())
	{
		var avg= (pixel.getRed()+pixel.getBlue()+pixel.getGreen())/3;
		if(avg<128)
		{
			pixel.setRed(2*avg);
			pixel.setBlue(0);
			pixel.setGreen(0);
		}
		else
		{
			pixel.setRed(255);
			pixel.setBlue(2*avg-255);
			pixel.setGreen(2*avg-255);
		}
	}
	image.drawTo(imgcanvas);
}
function myfilter(){
	for(var pixel of image.values())
	{
		var avg= (pixel.getRed()+pixel.getBlue()+pixel.getGreen())/3;
		if(avg > 100){
			pixel.setRed(0);
			pixel.setBlue(avg);
			pixel.setGreen(avg);
		}
	}
	image.drawTo(imgcanvas);
}
function rainbow(){
	for( var pixel of image.values()){
		var avg = (pixel.getGreen()+pixel.getBlue()+pixel.getRed())/3;
		var x=pixel.getX();
		var y=pixel.getY();
		var w=image.getHeight();
		if(avg<128)
		{
			if(y< w/7)
			{
				pixel.setRed(2*avg);pixel.setGreen(0);pixel.setBlue(0);
			}
			else if(y <2*w/7)
			{
				pixel.setRed(2*avg);pixel.setGreen(0.8*avg);pixel.setBlue(0);
			}
			else if(y<3*w/7)
			{
				pixel.setRed(2*avg);pixel.setGreen(2*avg);pixel.setBlue(0);
			}
			else if (y<4*w/7) 
			{
				pixel.setRed(0);pixel.setGreen(2*avg);pixel.setBlue(0);
			}
			else if (y<5*w/7) 
			{
				pixel.setRed(0);pixel.setGreen(0);pixel.setBlue(2*avg);
			}
			else if (y<6*w/7) 
			{
				pixel.setRed(0.8*avg);pixel.setGreen(0);pixel.setBlue(2*avg);
			}
			else
			{
				pixel.setRed(1.6*avg);pixel.setGreen(0);pixel.setBlue(1.6*avg);
			}
		}
		else
		{
			if(y < w/7)
			{
				pixel.setRed(255);pixel.setGreen(2*avg-255);pixel.setBlue(2*avg-255);
			}
			else if(y <2*w/7)
			{
				pixel.setRed(255);pixel.setGreen(1.2*avg-51);pixel.setBlue(2*avg-255);
			}
			else if(y<3*w/7)
			{
				pixel.setRed(255);pixel.setGreen(255);pixel.setBlue(2*avg-255);
			}
			else if (y<4*w/7) 
			{
				pixel.setRed(2*avg-255);pixel.setGreen(255);pixel.setBlue(2*avg-255);
			}
			else if (y<5*w/7) 
			{
				pixel.setRed(2*avg-255);pixel.setGreen(2*avg-255);pixel.setBlue(255);
			}
			else if (y<6*w/7) 
			{
				pixel.setRed(1.2*avg);pixel.setGreen(2*avg-255);pixel.setBlue(255);
			}
			else
			{
				pixel.setRed(0.4*avg+153);pixel.setGreen(2*avg-255);pixel.setBlue(0.4*avg+153);
			}
		}
	}
	image.drawTo(imgcanvas);
}