/**
 * 
 */
package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author vinay
 *
 */
public class StreamAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StreamAPI streamapi = new StreamAPI();

		System.out.println("*************** For Each ***************");
		streamapi.testForEach();

		System.out.println("*************** Filter ***************");
		streamapi.testfilter();

		System.out.println("*************** Map ***************");
		streamapi.testMap();

		System.out.println("*************** Flat Map ***************");
		streamapi.testFlatMap();

		System.out.println("*************** Reduction ***************");
		streamapi.testReduction();

		System.out.println("*************** Terminal Operation ***************");
		streamapi.testTerminalOperation();

		System.out.println("*************** Collector ***************");
		streamapi.testCollector();
	}

	private void testForEach() {
		List<String> l1 = new ArrayList<>();
		Stream<String> s = Stream.of("One", "Two", "Three");

		Consumer<String> c = l1::add;
		Consumer<String> c1 = System.out::println;

		s.forEach(c.andThen(c1));
	}

	private void testfilter() {
		Stream<String> stream = Stream.of("one", "Two", "Three", "Four", "five");
		Predicate<String> p = Predicate.isEqual("Two");
		Predicate<String> p1 = s -> s != null && Character.isLowerCase(s.charAt(0));

		Stream<String> stream1 = stream.filter(p.or(p1));
		stream1.forEach(System.out::println);
	}

	private void testMap() {
		List<Person> l1 = new ArrayList<>();
		l1.add(new Person("A", 10));
		l1.add(new Person("B", 20));

		l1.stream().map(p -> p.getAge()).forEach(System.out::println);
	}

	private void testFlatMap() {
		List<Integer> l = Arrays.asList(1, 2, 3, 4);
		List<Integer> l1 = Arrays.asList(10, 20, 30);
		List<Integer> l2 = Arrays.asList(100, 300);

		List<List<Integer>> r = Arrays.asList(l, l1, l2);
		System.out.println("List ::" + r);

		Function<List<?>, Integer> mapSize = List::size;
		Function<List<Integer>, Stream<Integer>> flatmapper = list -> list.stream();

		System.out.println("Map - group size ::");
		r.stream().map(mapSize).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("FlatMap ::");
		r.stream().flatMap(flatmapper).forEach(s -> System.out.print(s + " "));
		System.out.println();
	}

	private void testReduction() {
		BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;
		Integer id = 0;

		Stream<Integer> s = Stream.empty();
		int result = s.reduce(id, sum);
		System.out.println("Reduce - Stream empty::"+result);
		
		s = Stream.of(1);
		result = s.reduce(id, sum);
		System.out.println("Reduce - Stream one element::"+result);
		
		s = Stream.of(1,2,4,6);
		result = s.reduce(id, sum);
		System.out.println("Reduce - Stream multiple element::"+result);
		
		Stream<Boolean> s1 = Stream.of(true,false,true,true);
		Optional<Boolean> r = s1.reduce((b1,b2) -> Boolean.logicalOr(b1, b2));
		System.out.println("Reduce - stream of boolean::"+r);
	}

	private void testTerminalOperation() {

	}

	private void testCollector() {

	}
}

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
