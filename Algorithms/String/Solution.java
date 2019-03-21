// Problem: https://www.hackerrank.com/challenges/repeated-string/problem
// Java 8

// Feel free to optimize the code 


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        long count = scanner.nextLong(); 
        if ((str.length() < 1 || str.length() > 100) || (count < 1 || count > Math.pow(10, 12))) {
            System.out.println("Function not call");
            return;
        }
        
        repeatedString(str, count);
        scanner.close();

    }

    public static long repeatedString(String str, long num) {
        try {

            long subStringCounter = 0;
            long totalCount = 0;

            //Number of 'a' of each substring
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    subStringCounter++;
                }
            }

            // Number of repeated substring 
            long numOfsubStrings = num / str.length();
            totalCount = subStringCounter * numOfsubStrings;

            long reminder = num % str.length();

            for (int j = 0; j < reminder; j++) {

                if (str.charAt(j) == 'a') {
                    totalCount++;
                }
            }
            
            System.out.println(totalCount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }
}

