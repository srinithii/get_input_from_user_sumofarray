package srinnithi;
import java.util.Scanner;
public class Sumofarray_getinputfromuser {
	public static void main(String[]args) {
		Scanner z= new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=z.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the elements");
		int sum=0;
		for(int i=0; i<n; i++) {
			arr[i]=z.nextInt();
			sum=sum+arr[i];
		
		}
		System.out.println(sum);
		
	}

}
