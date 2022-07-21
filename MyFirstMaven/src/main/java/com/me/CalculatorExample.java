package com.me;

import java.util.Scanner;

public class CalculatorExample {

	public static int findBig(int x, int y) {
		if(x>y)
			return x;
		else 
			return y;
	}
	
	public static int findBiggest(int x, int y, int z) {
		if(x>y && y>z)
            return x;
        else if(y>x && y>z)
            return y;
        else
            return z;
		
		
	}
	// check the length of credit card numbers - should be sixteen
	public static int checkCCNum(String ccNum) {
		int ccLength = ccNum.length();
		return ccLength;
	}
	// find the max int
	public static int findMax(int nums[]) {
		int max = nums[0];
		for (int i=1; i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
			}
		} return max;
	}

}
