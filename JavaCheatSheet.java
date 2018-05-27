import java.util.*;
import java.io.*;
import java.lang.*;

Scanner scanner = new Scanner(System.in);
scanner.nextInt();
scanner.nextLine();

System.out.println();
System.out.println(Arrays.toString(array));
System.out.println(Arrays.asList(map));

StringBuilder builder = new StringBuilder();
builder.setLength(0);
StringJoiner joiner = new StringJoiner(" ");

int[] partOfArray = Arrays.copyOfRange(array, startIndex, endIndex);