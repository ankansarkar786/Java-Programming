package com.ankan;

public class SimpleBinarySearch {
	static int f(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;

        if (nums[mid] == target) return mid;
        else if (target > nums[mid]) {
            return f(nums, mid + 1, high, target);
        }
        return f(nums, low, mid - 1, target);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        return f(nums, 0, n - 1, target);
    }

    public static void main(String[] args) {
        SimpleBinarySearch sol = new SimpleBinarySearch();
        int[] nums = {-10, -3, 0, 5, 9, 12, 17};
        int target = 9;

        int result = sol.search(nums, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
