/**
 * 
 */
package design_pattern.creational;

import design_pattern.creational.prototype.Movie;
import design_pattern.creational.prototype.Registry;

/**
 * @author vinay
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie)registry.createItem("Movie");
		movie.setUrl("http://www.google.com");
		movie.setTitle("Create Prototype Pattern");

		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getUrl());
		System.out.println();
		
		movie = (Movie)registry.createItem("Movie");
		movie.setRuntime("15 minutes");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getUrl());
	}

}
