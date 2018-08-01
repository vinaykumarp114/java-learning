/**
 * 
 */
package design_pattern.structural.bridge;

/**
 * @author vinay
 *
 */
public class Detail {

	private String label;
	private String value;
	
	public Detail(String label, String value) {
		this.label = label;
		this.value = value;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
