package com.practise;
import java.util.*;

public class IntersectionOfTwoArrays {

	    public static void main(String[] args) {


	        int arr1[] = {1,2,2,1};
	        int arr2[] = {2,2};


	        HashSet<Integer> set = new HashSet<>();

	        for(int i:arr1)
	            set.add(i);


	        for(int j:arr2){

	            if(set.contains(j))
	            {
	                System.out.print(j+" ");
	                set.remove(j);
	            }
	        }

	    
	}
}
