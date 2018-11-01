package trail;


import java.util.ArrayList;


public class HappyTrails{
	
      private HappyTrails next;
      private String name;
      private int rating;
      private double latitude;
      private double longitude;
      private String state;
      private boolean haveHiked;
      private String[] landmarks;


      public HappyTrails(String name, int rating, double latitude, double longitude, String state, boolean haveHiked, String[] landmarks, HappyTrails next){

           this.name=name;
           this.rating=rating;
           this.latitude=latitude;
           this.longitude=longitude;
           this.state=state;
           this.haveHiked=haveHiked;
           this.landmarks=landmarks;
           this.next=next;

      }
    public String getName(){
  		return this.name;
  	}
  	public int getRating(){
  		return this.rating;
  	}
  	public double getLatitude(){
  		return this.latitude;
  	}
  	public String getState(){
  		return this.state;
  	}
  	public double getLongtitude(){
  		return this.longitude;
  	}
  	public boolean getHaveHiked(){
  		return this.haveHiked;
  	}
  	public String[] getLandmarks(){
  		return this.landmarks;
  	}
  	public HappyTrails getNext()
	{
		return next;
	}
	
	public void setName(String name)
	{
		 this.name = name; 
	}

	public void setRating(int rating)
	{
		this.rating = rating;
	}

	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	public void setLongtitude(double longtitude)
	{
		this.longitude = longtitude;
	}

	public void setState(String state)
	{
		this.state.equals(state);
	}

	public void setHaveHiked(boolean haveHiked)
	{
		this.haveHiked = haveHiked;
	}
	public void setNext(HappyTrails theNext)
	{
		this.next.equals(theNext);
	}

	public void setLandmarks(String[] landmarks)
	{
		this.landmarks = landmarks;
	}
	public static void main (String[]args)
	{
		int number = 0;
		String[] empty = new String[0];
		HappyTrails firstnote= new HappyTrails("!",-1,-100,100,"!",false, empty , null);
		String [] LeePark = {"lake"};
		HappyTrails Leepark = new HappyTrails("L",4,30.0,89.0,"MA",true, LeePark , null);
		String [] waterFall = {"waterfall"};
		HappyTrails waterfall = new HappyTrails("Bl",4,40.0,88.0,"IL",false, waterFall,null);
		String [] creek = {"creek"};
		HappyTrails creeK = new HappyTrails("b",5,30.0,70.0,"WA",true, creek,null);
		firstnote.next = Leepark;
		Leepark.next = waterfall;
		waterfall.next = creeK;
		while (2==2)
		{
			TextIO.putln("Welcome to Happy Trails! Select an option below:");
			TextIO.putln();
			TextIO.putln("1) add a hiking trail");
			TextIO.putln("2) remove a hiking trail");
			TextIO.putln("3) display hiking trails alphabetically");
			TextIO.putln("4) display hiking trails >= a certain rating");
			TextIO.putln("5) display hiking trails in a specified state");
			TextIO.putln("6) display the nearest hiking trail to specified hiking trail");
			TextIO.putln("7) list all trails with a specified landmark");
			TextIO.putln("8) list all hiking trails the user has yet to hike");
			TextIO.putln("9) quit");
			TextIO.putln();
			TextIO.putln("Select an option above:");
			number = TextIO.getInt();
			
			while (number==1)
			{
				String a = TextIO.getln();
				TextIO.putln("Name?");
				String name = TextIO.getln();
				TextIO.putln("Rating?");
				int rating = TextIO.getInt();
				while (rating >5 || rating <0){
					TextIO.putln("Entered value is invalid, please re-enter");
					int rating1 = TextIO.getInt();
					if(rating1<=5&&rating1>=0){
						break;
					}
				}
				TextIO.putln("Latitude?");
				double latitude = TextIO.getlnDouble();
				TextIO.putln("Longitude?");
				double longitude = TextIO.getlnDouble();
				TextIO.putln("State?");
				String state = TextIO.getln();
				TextIO.putln("Have hiked?");
				boolean haveHiked = TextIO.getlnBoolean();
				firstnote.add(name, rating, latitude, longitude, state, haveHiked);
				TextIO.putln("Added Sucessfully, continue?");
				boolean continues = TextIO.getlnBoolean();
				if (continues)
				{
					number = 1;
				}
				else
				{
					number = 10;
				}
			}
			while (number==2)
			{
				TextIO.putln("Which trail do you want to remove?");
				String a = TextIO.getln();
				String name = TextIO.getlnString();
				firstnote.remove(name);
				TextIO.putln("Back to the original list?");
				boolean continues = TextIO.getlnBoolean();
				if (continues==true)
				{
					number = 10;
				}
				else
				{
					number = 9;
				}
			}
			while (number==3)
			{	
				if(firstnote.toString().compareTo("")==0){
					return;
				}
				else{
					firstnote.next.display();
				}
				TextIO.putln("continue?");
				boolean continues = TextIO.getlnBoolean();
				if (continues)
				{
					number = 0;
				}
				else
				{
					number = 9;
				}
				number = 10;
			}
			while (number==4)
			{
				TextIO.putln("what rating do you want?");
				String a = TextIO.getln();
				int rate = TextIO.getlnInt();
				firstnote.displayByGreaterRating(rate);
				TextIO.putln("Back to the original list?");
				boolean continues = TextIO.getlnBoolean();
				if (continues)
				{
					number = 10;
				}
				else
				{
					number = 9;
				}
				
			}
			while (number==5)
			{
				TextIO.putln("which state do you want?");
				String a = TextIO.getln();
				String state = TextIO.getln();
				firstnote.displayInState(state);
				TextIO.putln("Back to the original list?");
				boolean continues = TextIO.getlnBoolean();
				if (continues)
				{
					number = 10;
				}
				else
				{
					number = 9;
				}
			}
			while (number==6)
			{
				TextIO.putln("What's the start point?");
				String name1 = TextIO.getlnString();
				String a1 = TextIO.getln();
				HappyTrails a = firstnote.foundByName(name1);
				HappyTrails b = a.findClosest(a, 99999);
				TextIO.putln("the closest one is " + b);
				TextIO.putln("Back to the original list?");
				boolean continues = TextIO.getlnBoolean();
				if (continues)
				{
					number = 10;
				}
				else
				{
					number = 9;
				}
			}
			while (number==7)
			{
				TextIO.putln("What landmark do you want?");
				String a = TextIO.getln();
				String landmark = TextIO.getln();
				firstnote.displayHasLandmark(landmark);
				TextIO.putln("Back to the original list?");
				boolean continues = TextIO.getlnBoolean();
				if (continues)
				{
					number = 10;
				}
				else
				{
					number = 9;
				}
			}
			while (number==8)
			{
				TextIO.putln("We recommend hiking:");
				firstnote.displayHasntHiked();
				TextIO.putln(", where");
				firstnote.displayHighestHasntHiked();
				TextIO.putln("is the name of the unhiked trail with the highest rating");
				TextIO.putln("Back to the original list?");
				boolean continues = TextIO.getlnBoolean();
				if (continues==true)
				{
					number = 10;
				}
				else
				{
					number = 9;
				}
			}
			if(number==9)
			{
				TextIO.putln("Are you sure you want to quit? - all your data will be lost.");

				if (TextIO.getlnBoolean() == true)
				{
					break;
				}
				else
				{
					number =10;
				}
			}
		}
	}
	
	public HappyTrails add(String name, int rating, double latitude, double longitude, String state, boolean haveHiked) 
	{
		this.name=name.toUpperCase();
		if (this.next == null)
		{
			String[] empty = new String[0];
			this.next = new HappyTrails(name, rating, latitude, longitude, state, haveHiked, empty , null);
			return this;
		}
		if ((this.name.compareTo(name)<0)==false)
		{
			String[] empty = new String[0];
			return new HappyTrails(name, rating, latitude, longitude, state, haveHiked, empty , this);
		}
		else{
			this.next = next.add(name, rating, latitude, longitude, state, haveHiked);
		}
		return this;
	}
	
	public void remove(String name)
	{
		if((next==null)==false)
		{
			if (next.name.compareTo(name)!=0)
			{
				next.remove(name);
			}
			else
			{
				this.next = next.next;
			}
		}
		else
		{
			TextIO.putln("Name doesn't found");
			return;
		}
	}
	
	
	
	public void display()
	{
		if (next==null)
		{
			TextIO.putln(this);
		}
		else
		{
			TextIO.putln(this);
			next.display();
		}
	}
	
	public void displayByGreaterRating(int rate)
	{
		if (next!=null)
		{
			if(rating>=rate)
			{
				TextIO.putln(this);
			}
			next.displayByGreaterRating(rate);
			return;
		}
		else
		{
			if(rating>=rate)
			{
				TextIO.putln(this);
				return;
			}
		}
	}
	
	public void displayInState(String state)
	{
		if (next==null)
		{
			if(this.state.compareTo(state)==0&&this.haveHiked == false)
			{
				TextIO.putln(this);
				return;
			}
		}
		else
		{
			if(this.state.compareTo(state)==0&&haveHiked == false)
			{
				TextIO.putln(this);
			}
			next.displayInState(state);
			return;
		}
	}
	
	public String toString()
	{
		String landmark = "";
		String ifhiked = "";
		for (int i = 0; i<landmarks.length; i++)
		{
			landmark+=landmarks[i];
		}
			if (landmark.compareTo("")==0)
			{
				landmark = "Empty";
			}
			if (this.haveHiked == false)
			{
				ifhiked+=" ";
			}
			else{
				ifhiked+="*";
			}
		String string = "Name: " + this.name + "; Rating: " + this.rating + "; Location:(" + this.latitude + " , " + this.longitude + "); State: " + state + "; Landmarks: " + landmark + "; Hiked: " + ifhiked;
		return string;
	}
	
	
	public void displayHasLandmark(String landmark)
	{
		if ((next==null)==false)
		{
			for (int i = 0; i<landmarks.length; i++)
			{
				if (landmarks[i].compareTo(landmark)==0)
				{
					TextIO.putln(this);
				}
			}
			next.displayHasLandmark(landmark);
		}
		
		else
		{
			for (int i = 0; i<landmarks.length; i++)
			{
				if (landmarks[i].compareTo(landmark)==0)
				{
					TextIO.putln(this);
				}
			}
		}
		
	}
	
	
	public int lookingHasntHiked(int hrate)
	{
		if (next!=null)
		{
			if (this.haveHiked==false)
			{
				if(this.rating>hrate){
					hrate = rating;
					return this.lookingHasntHiked(hrate);
				}
				else{
					return rating;
				}
			}
			else
			{
				return next.lookingHasntHiked(hrate);
			}
		}
		else
		{
			if (this.haveHiked==false && this.rating>hrate)
			{
				return this.rating;
			}
			else
			{
				return hrate;
			}
			
		}
	}
	
	public void displayHighestHasntHiked()
	{
		int highest = lookingHasntHiked(0);
		displayByGreaterRating(highest);
	}
	
	public void displayHasntHiked()
	{
		if (next==null)
		{
			if(haveHiked == false)

			TextIO.putln(this.name);
			
		}
		else
		{
			if(haveHiked ==false)
			{
				TextIO.putln(this.name);
				next.displayHasntHiked();
			}
			else{
				next.displayHasntHiked();
				}
		}
	}
	public HappyTrails foundByName(String name)
	{
		if (next==null)
		{
			if (this.name.compareTo(name)==0)
			{
				return this;
			}
			else
			{
				TextIO.putln("Sorry, name is not found.");
				return null;
			}
		}
		else
		{
			if (this.name.compareTo(name)==0)
			{
				return this;
			}
			else
			{
				return next.foundByName(name);
			}
		}
	}
	public static double distance(HappyTrails a, HappyTrails b)
	{
		double long_1 = Math.toRadians(a.longitude);
		double long_2 = Math.toRadians(b.longitude);
		double latitude_1 = Math.toRadians(a.latitude);
		double latitude_2 = Math.toRadians(b.latitude);
		double sigma = Math.acos(Math.sin(latitude_1)*Math.sin(latitude_1)+Math.cos(latitude_1)*Math.cos(latitude_2)*Math.cos(Math.abs(long_1-long_2)));
		double distanceance = sigma*3959;
		return distanceance;
	}
	
	public HappyTrails finddistance (HappyTrails start, double distanceance)
	{
		if (next!=null)
		{
			if(distance(start,this)==distanceance)
			{
				return (this);
			}
			else
			{
				return next.finddistance(start,distanceance);
			}
		}
		else
		{
			if(distance(start,this)==distanceance)
			{
				return this;
			}
			else
			{
				return null;
			}
			
		}
	}
	
	public HappyTrails findClosest(HappyTrails start, double distanceance)
	{
		if (this.name==start.name && next!=null)
		{
			return next.findClosest(start,distanceance);
		}
		if (next==null&&this.name!=start.name)
		{
			if (distance(start,this)>distanceance)
			{
				return finddistance (start, distanceance);			
			}
			else
			{
				return this;
			}
		}
		else
		{
			if (distance(start,this)>distanceance)
			{				
				return  next.findClosest(start, distanceance);
			}
			else
			{
				distanceance = distance(start,this);
				return next.findClosest(start, distanceance);
			}
		}
	}
	
	
	
	
}



          

