package JavaMiscellaneous;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, count=0;
		List<String> names= new ArrayList<String>();
		names.add("Anki");
		names.add("Anna");
		names.add("Aman");
		names.add("Akhil");
		names.add("Amit");
		names.add("Varun");
		names.add("Oly");
		
		
		//count the names starting with 'A' alphabet
		/*
		 * code without using Streams
		 * for (i=0;i<names.size();i++) {
			if(names.get(i).startsWith("A"))
				count++;
		}		
		System.out.println(count);
		*/
		
		//count using streams in Java
		Long count1= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count1);
		System.out.println();
		
		//printing elements starting with "A" using streams
		System.out.println("1. printing elements starting with \"A\" using streams");
		names.stream().filter(s->s.startsWith("A")).forEach(s->System.out.print(s+"; "));
		System.out.println();
		
		//printing elements ending with "A" using streams
		System.out.println();
		System.out.println("2. printing elements ending with \"A\" using streams");
		names.stream().filter(s->s.endsWith("a")).forEach(s->System.out.print(s+"; "));
		System.out.println();
				
		//printing limited elements
		System.out.println();
		System.out.println("3. printing limited elements");
		names.stream().filter(s->s.startsWith("A")).limit(2).forEach(s->System.out.print(s+"; "));
		System.out.println();
		
		//to print elements having length more than 4
		System.out.println();
		System.out.println("4. to print elements having length more than 4");
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.print(s+"; "));
		System.out.println();
		
		//to modify filtered stream
		System.out.println();
		System.out.println("5. to print modify & print filtered stream");
		names.stream().filter(s->s.length()>4).limit(2).map(s->s.toUpperCase()).forEach(s->System.out.print(s+"; "));
		System.out.println();
		
		// to concatenate 2 streams
		System.out.println();
		System.out.println("6. to concatenate 2 streams");
		List<String> names1= Arrays.asList("hello", "hi", "how", "are", "you", "my", "world");
		Stream<String> concat= Stream.concat(names.stream(),names1.stream());
		System.out.println("Size of new stream: "+ concat.count());
		System.out.println();
		
		// to check required element is available or not
		System.out.println();
		System.out.println("7. to check required element is available or not");
		boolean flag= names1.stream().anyMatch(s->s.equalsIgnoreCase("HELLO"));
		System.out.println("Element is available: "+ flag);
		System.out.println();
		
		//to collect the filtered elements
		System.out.println();
		System.out.println("8. to collect the filtered elements in a list");
		List<String> newList= names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		newList.stream().forEach(s->System.out.print(s+"; "));
		System.out.println();
		
		//to collect unique items in a list, sort and print them
		System.out.println();
		System.out.println("9. to collect unique items in a list and print themt");
		List<Integer> val= Arrays.asList(1,5,6,7,4,6,8,8,3,9,2,0,2,4,7,9,2,3,3,8,9,9,6,3,2,0);
		List<Integer> unique=val.stream().distinct().collect(Collectors.toList());
		unique.stream().sorted().forEach(s->System.out.print(s+"; "));
		System.out.println();
		
	}
	
}
