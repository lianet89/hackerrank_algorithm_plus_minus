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

public class Result {
	public static void plusMinus(List<Integer> arr) {
		int n = arr.size();
		float positives = 0;
		float negatives = 0;
		float zero = 0;
		DecimalFormat df = new DecimalFormat("0.000000");
		
		if(0<n && n<=100) {
			for(Integer i:arr) {
				if(-100<=i && i<=100) {
					if(i>0) {
						positives++;
					} 
					if(i<0) {
						negatives++;
					} 
					if (i==0) {
						zero++;
					}
				}			
			}
			System.out.println(df.format(positives/n));
			System.out.println(df.format(negatives/n));
			System.out.println(df.format(zero/n));
		}
	}

}
