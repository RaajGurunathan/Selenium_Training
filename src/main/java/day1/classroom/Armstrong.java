package day1.classroom;

public class Armstrong {
	
	public void findArmstrong()
	{
	int a=153;
	int b=a;
	int c=a;
	int count =0;
	int remainder=0;
	int sum=0;
	while(a>0)
	{
		count++;
		a=a/10;
	}
	while(b>0)
	{
		remainder = b%10;
		sum= sum + power(remainder,count);
		b=b/10;
	}
	if(c==sum)
	{
	System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong Number");
	}
	}
	int power(int remainder,int count)
	{
		int d=1;
		for(int i=0;i<count;i++) {
			d=d*remainder;
	}
	return d;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armstrong a=new Armstrong();
		a.findArmstrong();
		
	}
}
