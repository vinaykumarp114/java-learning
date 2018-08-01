/**
 * 
 */
package design_pattern.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vinay
 *
 */
public class MoviePrinter extends Printer {

	private Movie movie;

	public MoviePrinter(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String getHeader() {
		return movie.getClassification();
	}

	@Override
	public List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		
		details.add(new Detail("Title", movie.getTitle()));
		details.add(new Detail("Runtime", movie.getRuntime()));
		details.add(new Detail("Price", Double.toString(movie.getPrice())));
		
		return details;
	}

}
