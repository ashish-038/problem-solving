// imports
import java.util.*;
import java.io.*;
import java.lang.*;

// Readers
Scanner scanner = new Scanner(System.in);
scanner.nextInt();
scanner.nextLine();

// Printing Methods
System.out.println();
System.out.println(Arrays.toString(array));
System.out.println(Arrays.asList(map));

// String Helpers
StringBuilder builder = new StringBuilder();
builder.setLength(0);
StringJoiner joiner = new StringJoiner(" ");

// Array
int[] partOfArray = Arrays.copyOfRange(array, startIndex, endIndex);

// ArrayList
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(0, 100);
numbers.remove(0);
numbers.get(0);
System.out.println(numbers);

// HashMap
map.getOrDefault(key, defaultValue);