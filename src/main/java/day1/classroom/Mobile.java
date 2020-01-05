package day1.classroom;

public class Mobile {
	
	public boolean makeCall(int a)
	{	
		return true;
	}
	public String sendSMS(String name)
	{
		return "Hello";
	}
	public void shutDown()
	{
		System.out.println("Mobile shutdown");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		boolean makeCall = m.makeCall(123456);
		System.out.println(makeCall);
		String sendSMS = m.sendSMS("Raaj");
		System.out.println(sendSMS);
		m.shutDown();
	}

}
