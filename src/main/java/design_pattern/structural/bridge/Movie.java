/**
 * 
 */
package design_pattern.structural.bridge;

/**
 * @author vinay
 *
 */
public class Movie {
	private String runtime;
	private String title;
	private double price;
	private String classification;

	public Movie(String runtime, String title, String classification, double price) {
		this.runtime = runtime;
		this.title = title;
		this.classification = classification;
		this.price = price;
	}
	
	/**
	 * @return the runtime
	 */
	public String getRuntime() {
		return runtime;
	}

	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param url the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}
}
