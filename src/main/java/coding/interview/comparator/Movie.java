package coding.interview.comparator;

public class Movie {
	int rating;
	int yearRelease;
	String name;

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getYearRelease() {
		return yearRelease;
	}
	public void setYearRelease(int yearRelease) {
		this.yearRelease = yearRelease;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(int rating, int yearRelease, String name) {
		this.rating = rating;
		this.yearRelease = yearRelease;
		this.name = name;
	}
	

}
