package week3.assignments;

public class Desktop implements HardWare, Software{

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources");
		
	}
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resources");
	}
	public void desktopModel() {
		System.out.println("Desktop Model");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Desktop obj = new Desktop();
		   obj.softwareResources();
		   obj.hardwareResources();
		   obj.desktopModel();
		   
	}

	
}
