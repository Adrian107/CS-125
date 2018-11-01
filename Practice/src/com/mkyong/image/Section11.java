package com.mkyong.image;
public class Section11 {
	public static void main(String args[]){
		draw("image.jpg",0,0,500,500);}
	public static void draw(String name,int x, int y,int width, int height){
		if (width<50||height<50){ return;}
		Zen.drawImage(name, x, y, width, height);
		draw(name,x/2,y/2,width/2,height/2);
		return;
		}

	
	
}

