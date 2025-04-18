package com.ankan;
import java.util.*;
//Better approach but not Optimal
public class LongestSubarr {
	public static int findLongestSubarrayWithSumK(int[] arr, int K) {
        // Map to store sum of elements up to the current index
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        int sum = 0; // To store the current sum of elements
        int maxLength = 0; // To store the maximum length of subarray
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the sum
            sum += arr[i];
            
            // If sum == K, we found a subarray from index 0 to i
            if (sum == K) {
                maxLength = Math.max(maxLength, i + 1); // Length of subarray = i + 1
            }
            
            // If (sum - K) exists in the map, a subarray with sum K is found
            if (sumMap.containsKey(sum - K)) {
                int prevIndex = sumMap.get(sum - K); // Get the index of the previous sum
                maxLength = Math.max(maxLength, i - prevIndex); // Update max length
            }
            
            // Store the sum with its index in the map, but only if it's not already there
            // This ensures we only consider the earliest occurrence of each sum.
            if (!sumMap.containsKey(sum)) {
                sumMap.put(sum, i);
            }
        }
        
        return maxLength; // Return the maximum length of the subarray
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int K = 5;
        System.out.println("Length of the longest subarray with sum " + K + " is: " + findLongestSubarrayWithSumK(arr, K));
    }
}
