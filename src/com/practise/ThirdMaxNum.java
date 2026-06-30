package com.practise;

public class ThirdMaxNum {

	public static void main(String[] args) {
	
		        int arr[] = {3,2,1};

		        long first = Long.MIN_VALUE;
		        long second = Long.MIN_VALUE;
		        long third = Long.MIN_VALUE;


		        for(int num: arr){

		            if(num == first || num == second || num == third)
		                continue;

		            if(num > first){
		                third = second;
		                second = first;
		                first = num;
		            }

		            else if(num > second){
		                third = second;
		                second = num;
		            }

		            else if(num > third){
		                third = num;
		            }
		        }

		        System.out.println(third);
		    }
		}

