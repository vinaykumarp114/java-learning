/**
 * 
 */
package design_pattern.structural.bridge;

import java.util.List;

/**
 * @author vinay
 *
 */
public interface Formatter {

	String format(String header, List<Detail> details);
}
