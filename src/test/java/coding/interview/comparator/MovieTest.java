package coding.interview.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MovieTest {
	@Test
	public void Test() {
		Movie movie1 = new Movie(10, 1999, "Movie1999");
		Movie movie2 = new Movie(5, 1990, "Movie1995");
		Movie movie3 = new Movie(7, 1998, "Movie1998");
		Movie movie4 = new Movie(6, 1994, "Movie1994");
		Movie movie5 = new Movie(5, 1995, "Movie1990");
		List<Movie> list = new ArrayList();
		list.add(movie1);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		list.add(movie5);
		SortByRating sbr = new SortByRating();
		Collections.sort(list, sbr);
		list.forEach(listItem -> System.out.println(listItem.name));
	}

}
