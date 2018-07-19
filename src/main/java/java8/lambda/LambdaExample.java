/**
 * 
 */
package java8.lambda;

/**
 * @author vinay
 *
 */
public class LambdaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		try {
		LambdaExample example = new LambdaExample();
		
		// Runnable Interface
		System.out.println("************** Runnable **************");
		example.testRunnable();
		} catch(Exception e) {
			System.out.println("Exception - "+e.getMessage());
		}

	}
	
	private void testRunnable() throws InterruptedException {
		Runnable r = () -> {
			for(int i = 0; i<3; i++) {
				System.out.println("Runnable - "+ Thread.currentThread());
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
