// https://www.hackerrank.com/challenges/migratory-birds/problem
package  com.inPrep.inProgress;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MigratingBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        int highest = -1;
        HashMap<Integer, Integer> map = new HashMap();

        for(int i : arr){

            if(highest == -1){
                highest = i ;
                map.put(i,1);
            }
            else{
                map.put(i, map.get(i)+1);
          }
        }
		return highest;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = migratoryBirds(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    	System.out.println("hello world");
    }
}
