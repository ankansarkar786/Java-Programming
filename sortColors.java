package javaDSA;
//Sort an Array of 0's, 1's and 2's
public class sortColors {
	 public void sortColorsf(int[] nums) {
	        int low = 0;
	        int mid = 0;
	        int high = nums.length - 1;

	        while (mid <= high) {
	            if (nums[mid] == 0) {
	                int temp = 0;
	                temp = nums[mid];
	                nums[mid] = nums[low];
	                nums[low] = temp;
	                low++;
	                mid++;
	            } else if (nums[mid] == 1) {
	                mid++;
	            } else {
	                int temp = 0;
	                temp = nums[mid];
	                nums[mid] = nums[high];
	                nums[high] = temp;
	                high--;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        sortColors sol = new sortColors();

	        int[] nums = {2, 0, 2, 1, 1, 0, 2, 1, 0}; // Example input
	        sol.sortColorsf(nums);

	        // Print the sorted array
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
}
