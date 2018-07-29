/**
 * 
 */
package design_pattern.creational;

/**
 * @author vinay
 * Singleton - lazy loading and Thread-safe.
 *
 */
public class Singleton {

	private static volatile Singleton _instance = null;
	
	private Singleton() {
		if(_instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	
	public static Singleton getInstance() {
		if(_instance == null) {
			synchronized(Singleton.class) {
				if(_instance == null) {
					_instance = new Singleton();
				}
			}
		}
		return _instance;
	}
}
