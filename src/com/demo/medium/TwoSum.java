package com.demo.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {9, 7, 11, 15};
		int target = 18;
		long start = System.currentTimeMillis();
		int[] result = twoSum(nums, target);
		long end = System.currentTimeMillis();
		
		System.out.println((end-start) + "ms");
		
		System.out.println(result[0] + "|" + result[1] );
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int[] result = new int[2];
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		int value = target - nums[i];
    		if(map.containsKey(value)) {
    			result[0] = map.get(value);
    			result[1] = i;
    			return result;
    			
    		} else {
    			map.put(nums[i], i);
    		}
    	}
    	
    	return null;
    }
}
