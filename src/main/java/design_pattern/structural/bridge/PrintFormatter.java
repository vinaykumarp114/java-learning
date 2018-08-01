/**
 * 
 */
package design_pattern.structural.bridge;

import java.util.List;

/**
 * @author vinay
 *
 */
public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header).append("\n");
		details.stream().forEach(d -> {
			builder.append(d.getLabel()).append(":").append(d.getValue()).append("\n");
		});
		return builder.toString();
	}

}
