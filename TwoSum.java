package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,4,6,7};
		int target = 10;
		TwoSum ts = new TwoSum();
		System.out.println(Arrays.toString(ts.twoSum1(nums, target)));

	}
	
	//looping through each element and finding out if there is any match
	public int[] twoSum(int nums[], int target)
	{
		for(int i =0; i< nums.length; i++)
			for(int j = i+1; j< nums.length; j++)
				if(nums[i] + nums[j] == target)
					return new int[] {i,j};
		return new int[] {0,0};
	}
	
	//using hashmap and storing the unmatched value in the map. Find the delta in map and retun the indices
	public int[] twoSum1(int nums[], int target)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0; i<nums.length; i++)
		{
			if(hm.containsKey(target-nums[i]))
				return new int[] {hm.get(target-nums[i]),i};
			hm.put(nums[i], i);
		}
		return new int[] {0,0};
	}

}
