package coding;
//Given an integer array of size n , find all elements that appear more than n/3 times
/*
It will solve in three step :-
1.Create Hashmap 2. find freq of all nums store in map 3. traverse in map and check num frequency greater than n/3
 */

import java.util.*;

public class MajorityElementInArray {
    static int[] nums = {1,3,2,5,1,3,1,5,1};


    //output = 1
    public static void printElementWithMajorityCount(int[] nums)
    {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>(); //create hashmap

        //find freq of all nums store in map
        for(int i=0;i<n;i++)
        {
         if(map.containsKey(nums[i])) //if key exist in map
         {
             map.put(nums[i], map.get(nums[i])+1);
         }
         else
         {
             map.put(nums[i],1);
         }
        }

        //traverse in map
        for(int key : map.keySet())
        {
            if(map.get(key) > n/3)
            {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args)
    {
        printElementWithMajorityCount(nums);
    }
}