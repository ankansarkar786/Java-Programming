package javaDsa;
import java.util.*;

public class Hashing_2 {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of given array: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
		    System.out.print("Enter the element of that array: ");
			arr[i] = in.nextInt();
		}
		
		//precompute
		int hash[] = new int[13];
		Arrays.fill(hash, 0);
		for(int i = 0;i<n;i++) {
			hash[arr[i]]+=1;
		}
		
		//Query
		System.out.print("Enter the size of the query: ");
		int q = in.nextInt();
		while(q-- > 0) {
			System.out.print("Enter the elements of query: ");
			int num = in.nextInt();
			//fetch
			System.out.println(hash[num]);
		}

	}

}
