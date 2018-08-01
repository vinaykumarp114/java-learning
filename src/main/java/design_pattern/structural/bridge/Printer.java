/**
 * 
 */
package design_pattern.structural.bridge;

import java.util.List;

/**
 * @author vinay
 *
 */
public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	public abstract String getHeader();

	public abstract List<Detail> getDetails();
}
