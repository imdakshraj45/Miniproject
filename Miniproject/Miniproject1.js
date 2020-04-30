var imgcanvas;
var image;
var original;
var canvas2;
function upload(){
	var fileinput= document.getElementById("finput");
	imgcanvas= document.getElementById("c1");
	//var filename = fileinput.value;
	image= new SimpleImage(fileinput);
	original= new SimpleImage(fileinput);
	image.drawTo(imgcanvas);
}
 function Reset(){
 	original.drawTo(imgcanvas);
 }
function filterred(){
	for( var pixel of image.values())
	{
		pixel.setRed(255);
	}
	image.drawTo(imgcanvas);
}
function filtergreen(){
	for( var pixel of image.values())
	{
		pixel.setGreen(255);
	}
	image.drawTo(imgcanvas);
}
function filterblue(){
	for( var pixel of image.values())
	{
		pixel.setBlue(255);
	}
	image.drawTo(imgcanvas);
}
function makeGray(){
  for (var pixel of image.values()) {
    var avg = (pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3;
    pixel.setRed(avg);
    pixel.setGreen(avg);
    pixel.setBlue(avg);
  }
  image.drawTo(imgcanvas);
}
