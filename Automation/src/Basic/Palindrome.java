package Basic;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int rev=0;
	int temp=num;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if(temp==rev)
	{
		System.out.println("the given "+temp+" no is palindrame no");
	}
	else
	{
		System.out.println("the given "+temp+ " no is not a palindrome no");
	}
}
}
