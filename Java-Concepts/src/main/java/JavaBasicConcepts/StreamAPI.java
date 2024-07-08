package JavaBasicConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	 public static void main(String[] args) {

	        List<Integer> nums = Arrays.asList(9,2,6,1,8,3,7);

	        nums.stream() //stream() returns a stream itself
	                .filter(val -> val%2 == 1) //filter() takes a predicate which is a functional interface which has a method which returns true/false.
	                                           // Filter only returns those value which pass the condition passed in filter
	                .sorted()                  //sorted() sorts the stream
	                .map(n -> n*2)             //map() will perform the operation on each element of the stream
	                .forEach(each -> System.out.println(each)); //forEach() process each element at a time

	        //numsStream.forEach(num -> System.out.println(num));
	        
	        //List<Integer> newList =  nums.stream().filter(val -> val>3).collect(Collectors.toList());
	        List<Integer> newList = nums.stream().filter(val -> val>3).collect(Collectors.toList());
	        System.out.println(newList);
	        newList.forEach(each -> System.out.print(each + " "));
	    }
}
