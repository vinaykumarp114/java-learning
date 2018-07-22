/**
 * 
 */
package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author vinay
 *
 */
public class LambdaFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LambdaFunctions example = new LambdaFunctions();

			// Runnable Interface
			System.out.println("************** Runnable **************");
			example.testRunnable();

			// Comparator
			System.out.println("************** Comparator **************");
			example.testComparator();

			// Function - 4 Category
			// Supplier <R> - Single Interface doesn't take any object but return an object
			System.out.println("************** Supplier **************");
			example.testSupplier();

			// Consumer - Accept objects but no return type
			// Consumer <T>
			System.out.println("************** Consumer **************");
			example.testConsumer();

			// BiConsumer <T,U>
			System.out.println("************** Bi-Consumer **************");
			example.testBiConsumer();

			// Predicate - Accept objects and return boolean
			// Predicate <T>
			System.out.println("************** Predicate **************");
			example.testPredicate();

			// BiPredicate <T,U>
			System.out.println("************** Bi-Predicate **************");
			example.testBiPredicate();

			// Function - Accept objects and return same or different type of object
			// Function <T,R>
			System.out.println("************** Function **************");
			example.testFunction();

			// BiFunction <T,U,R>
			System.out.println("************** Bi-Function **************");
			example.testBiFunction();

			// UnaryOperator <T,T>
			System.out.println("************** Function Unary Operator **************");
			example.testUnaryOperator();

			// BinaryOperator <T,T,T>
			System.out.println("************** Function Binary Operator **************");
			example.testBinaryOperator();
		} catch (Exception e) {
			System.out.println("Exception - " + e.getMessage());
		}
	}

	private void testRunnable() throws InterruptedException {
		Runnable r = () -> {
			for (int i = 0; i < 2; i++) {
				System.out.println("Runnable - " + Thread.currentThread());
			}
		};

		Thread t = new Thread(r);
		t.start();
	}

	private void testComparator() {
		Comparator<String> c1 = (s1, s2) -> Integer.compare(s1.length(), s1.length());

		List<String> l1 = Arrays.asList("*", "****", "**");
		Collections.sort(l1, c1);
		System.out.println("Comparator - " + l1);

		Comparator<Integer> c2 = Integer::compare;
		List<Integer> l2 = Arrays.asList(1, 4, 2, 8, 6);
		Collections.sort(l2, c2);
		System.out.println("Comparator ASC order - " + l2);

		Comparator<Integer> c3 = (i1, i2) -> Integer.compare(i2, i1);
		Collections.sort(l2, c3);
		System.out.println("Comparator DESC order - " + l2);
	}

	private void testSupplier() {
		Supplier<String> s = () -> {
			return "Supplier Test";
		};
		System.out.println(s.get());

		Consumer<String> c = System.out::println;
		Supplier<Consumer<String>> s2 = () -> {
			return c;
		};
		s2.get().accept("Supplier returns Consumer");
	}

	private void testConsumer() {
		Consumer<String> c = System.out::println;
		c.accept("Consumer Test");

		List<String> l1 = Arrays.asList("One", "Two", "Three");
		List<String> l2 = new ArrayList<>();
		Consumer<String> c1 = l2::add;

		l1.forEach(c1.andThen(c));
	}

	private void testBiConsumer() {
		BiConsumer<String, Integer> c = (s, i) -> System.out.println(s + "::" + i);
		c.accept("Test Bi-Consumer", 1);
	}

	private void testPredicate() {
		Predicate<Integer> p = i -> i > 10;
		Predicate<Integer> p1 = i -> i < 20;

		Predicate<Integer> p2 = p.and(p1);
		System.out.println("Predicate 1::" + p2.test(12));

		Predicate<String> p3 = Predicate.isEqual("Two");
		System.out.println("Predicate 2::" + p3.test("One"));
	}

	private void testBiPredicate() {
		BiPredicate<String, Integer> b1 = (s, i) -> s.contains("e") && i > 0;
		BiPredicate<String, Integer> b2 = (s, i) -> s.equals("One") && i < 10;

		BiPredicate<String, Integer> b3 = b1.or(b2);
		System.out.println(b3.test("One", 20));
	}

	private void testFunction() {
		Function<String, Boolean> f = s -> {
			return s.length() > 3;
		};
		System.out.println(f.apply("Three"));
	}

	private void testBiFunction() {
		BiFunction<String, Integer, String> f = (s, i) -> {
			return s + i;
		};
		System.out.println(f.apply("$", 10));
	}

	private void testUnaryOperator() {
		UnaryOperator<Integer> u = i -> {
			return i + 10;
		};
		System.out.println(u.apply(5));
	}

	private void testBinaryOperator() {
		BinaryOperator<String> b = (s1, s2) -> {
			StringJoiner sj = new StringJoiner(",","{","}");
			sj.add(s1).add(s2);
			return sj.toString();
		};
		System.out.println(b.apply("One", "Two"));
	}
}
