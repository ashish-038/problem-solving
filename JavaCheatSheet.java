import java.util.*;
import java.io.*;
import java.lang.*;

Scanner scanner = new Scanner(System.in);
scanner.nextInt();
scanner.nextLine();

System.out.println();
System.out.println(Arrays.toString(array)); // print array
System.out.println(Arrays.asList(map)); // print hashmap

StringBuilder builder = new StringBuilder();
builder.setLength(0); // clear builder
StringJoiner joiner = new StringJoiner(" ");