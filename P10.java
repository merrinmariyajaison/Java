import java.io.*;

class P10 {

	public static int reverse(int Num) {
		int Rev = 0; 
		while(Num!=0) {
			Rev = (Rev*10) + (Num%10);
			Num = Num/10;
		}
		return Rev;
	}

	public static int palindrome(int Num) {
		int Rev = reverse(Num);
		if(Num == Rev)
			return 1;
		else
			return 0;
	}
	
	public static void main(String args[]) {
		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Num;
		try {
			System.out.print("\nPalidrome Checker!\n------------------\n Enter a number to check: ");
			Num = Integer.parseInt(dis.readLine());
			if(palindrome(Num) == 1)
				System.out.println("Enterd Number "+Num+ " is Palindrome!");
			else
				System.out.println("Enterd Number "+Num+" is not palindrome!");
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}