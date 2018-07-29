/**
 * 
 */
package design_pattern.creational;

/**
 * @author vinay
 *
 */
public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("Both instance are same");
		}
	}

}
