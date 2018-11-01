
public class Happy {

	private String name;
	private int rating;
	private double latitude;
	private double longtitude;
	private String state;
	private boolean haveHiked;
	private String landmarks;	
	
	public Happy(String name, int rating,double latitude,double longtitude,
			String state, boolean haveHiked, String landmarkds) {
		this.name = name;
		this.rating = rating;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.state = state;
		this.haveHiked = haveHiked;
		this.landmarks = landmarks;
	}
	public Happy( Happy other) {
		this.name = other.name;
		this.rating = other.rating;
		this.latitude = other.latitude;
		this.longtitude = other.longtitude;
		this.state = other.state;
		this.haveHiked = other.haveHiked;
		this.landmarks = other.landmarks;
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
		return this.longtitude;
	}
	public boolean getHaveHiked(){
		return this.haveHiked;
	}
	public String getLandmarks(){
		return this.landmarks;
	}
		// TODO Auto-generated constructor stub
	public String toString(){
		return "\tName: \t\t" 				+ this.name + 
				"\n\tRating:\t\t"		+ this.rating + 
				"\n\tLatitude:\t\t" 	 		+ this.latitude + 
				"\n\tState:\t\t" 	 	+ ( this.state ) + 
				"\n\tLongtitude:\t" 	+ this.longtitude + 
				"\n\tHaveHiked:\t\t\t" 			+ this.haveHiked + 
				"\n\tLandmarks:\t\t"     + this.landmarks + "\n\n";
	}

}
