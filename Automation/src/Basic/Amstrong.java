package Basic;

public class Amstrong {
public static void main(String[] args) {
	int num=8028;
	int temp=num;
	int temp1=num;
	int count=0;
	int sum=0;
	while(num>0)
	{
		count++;
		num=num/10;
	}
	while(temp>0)
	{
		int rem=temp%10;
		int pro=1;
		for (int i = 0; i < count; i++) {
			pro=pro*rem;
		}
		sum=sum+pro;//153
		temp=temp/10;
	}
	if(temp1==sum)
	{
		System.out.println("the given is Amstrong no");
	}
	else
	{
		System.out.println("th given no is not Amstrong no");
	}
}
}
