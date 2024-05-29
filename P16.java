import java.io.*;
import java.util.*;

class Sum_Digits {
	public int sumofDigits(int num) {
		int sum = 0;
		while(num!=0) {
			sum = sum + (num%10);
			num = num/10;
		}
		return sum;
	}
}

class P16 {
	public static void main(String args[]) {
		int num, sum;
		Sum_Digits obj = new Sum_Digits();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = Integer.parseInt(s.nextLine());
		sum = obj.sumofDigits(num);
		System.out.print("Sum of the digits of the number: "+sum);
			
	}
}