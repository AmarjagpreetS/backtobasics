package com.tutorial.hackerrank;

import java.io.IOException;

public class Solution {

    // Complete the equal function below.
	//[2,2,5,3]->[3,3,0,2]->[1,1,0,0]->[0,0,0,0]
    static int equal(int[] arr) {
        int j = 0, count =0;
        if (max(diff(arr)) == 0)
        	return 0;
        else {
//        	int[] d = diff(arr);
        	int[] d = arr;
        	int minus =0;
        	while(max(d) != 0) {
        		for (int k : d)
        			System.out.print(k);
	        	minus = best_option(max(d));
	        	System.out.println("\tbest option:" + minus);
	        	for(int i=0; i < d.length; i++) {
	        		if(d[i]>=minus)
	        			d[i]=d[i]-minus;
//	        		if(d[i]<0)
//	        			d[i]=0;
	        	}
	        	count++;
	        	System.out.println("\n");
        	}
        }
        return count;
    }
    
    static int best_option(int a) {
    	int[] options = {1,2,5};
    	int best_option = 0;
    	for(int i : options) {
//    		if(a < i) there is a problem
    		if (a>=i)
    			best_option = i;
    		else
    			break;
    	}
    	return best_option;
    }

    static int max(int[] arr) {
    	int max = 0;
    	for(int i : arr){
            if(max < i)
            	max = i;
        }
		return max;
    }
    
    static int[] diff(int[] arr) {
        int diff[] =new int[arr.length];
    	int j =0;
        int max = max(arr);
        for(int i : arr){
         	diff[j]=max-i;
         	j++;
         }
        return diff;
    }
    
//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] arr = new int[n];
//
//            String[] arrItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int arrItem = Integer.parseInt(arrItems[i]);
//                arr[i] = arrItem;
//            }
//
//            int result = equal(arr);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
    	int[] ar = {2,2,7,3}; //[6,3,1,0](5)->[1,3,1,0](2)->[1,1,1,0](1)->[0,0,0,0]
    	int res = equal(ar);
    	System.out.println(res);
    }
}

//
//public class Solution {
//
//}
