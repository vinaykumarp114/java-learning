/**
 * 
 */
package java8.string_io;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * @author vinay
 *
 */
public class StringAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringAPI stringapi = new StringAPI();
		
		stringapi.testString();
		stringapi.testStringJoiner();
	}

	private void testString() {
		String s = "Hello World";
		IntStream stream = s.chars();
		stream.mapToObj(c -> (char) c).map(Character::toUpperCase).forEach(System.out::print);
		System.out.println();
	}

	private void testStringJoiner() {
		StringJoiner sj = new StringJoiner(",","{","}");
		sj.add("One").add("two");
		System.out.println("String Joiner::"+sj.toString());
	}
}
