package assessmenttwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssessmentTwo {
	
	
public static void main(String[] args) {
		
		//Question 1. Input: List = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
		//Write a java code to find duplicate elements in the above list using java 8 streams.
		List<Integer> elements = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        Set<Integer> duplicateElements = elements.stream().filter(element -> Collections.frequency(
        		elements, element) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate elements are : " + duplicateElements );
        
    
		// Question 2. Input: List = {4,5,7,8,99,100,101,33,32,4,4}
        // Write a java code to remove duplicate elements from the List Using Java 8 without using set.
		List<Integer> numbers = Arrays.asList(4, 5, 7, 8, 99, 100, 101, 33, 32, 4, 4);
		List<Integer> distNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("numbers after remove duplicates : " + distNumbers);

		
		// Question 3. Input: List = {3,90,350,5}
		// Find the max element from the given list using java 8
		List<Integer> lst = Arrays.asList(3,90,350,5);
		Integer max = lst.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("maximum element is : " + max);	
		//  or
		Integer maxElmnt = lst.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
		System.out.println("maximum element is : " + maxElmnt);	
		// or
		Integer maxElement = Stream.of(3, 90, 350, 5).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maximum element : " + maxElement);

		
		// Question 4. Input :list { 6, 8, 3, 5, 1, 9 };
		// Find minimum and maximum elements in an array in Java using streams.
		Integer minNum = Stream.of(6, 8, 3, 5, 1, 9).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minimum number : " + minNum);
		
		Integer maxNum = Stream.of(6, 8, 3, 5, 1, 9).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maximum number : " + maxNum);

	}

}
