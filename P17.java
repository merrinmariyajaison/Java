import java.io.*;
import java.util.*;

class Sum_Even {
	public int sumofEven() {
		Sum_Digits obj = new Sum_Digits();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int num = Integer.parseInt(s.nextLine());
		int sum = 0;
		for(int i=0;i<=num;i=i+2) {
			sum = sum + i;
		}
		return sum;
	}
}

class P17 {
	public static void main(String args[]) {
		int sum;
		Sum_Even obj = new Sum_Even();
		sum = obj.sumofEven();
		System.out.print("Sum of the even digits: "+sum);
			
	}
}