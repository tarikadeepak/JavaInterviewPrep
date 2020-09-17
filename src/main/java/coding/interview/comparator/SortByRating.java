package coding.interview.comparator;

import java.util.Comparator;

public class SortByRating implements Comparator<Movie>{

	@Override
	public int compare(Movie arg0, Movie arg1) {
		if(arg0.rating < arg1.rating)
			return -1;
		if(arg0.rating > arg1.rating)
			return 1;
		//If in addition to rating you want to sort on name.
		return (arg0.name.compareTo(arg1.name));
	}
	

}
