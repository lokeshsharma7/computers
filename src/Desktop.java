
public class Desktop implements HardWare,Software{

	@Override
	public void softwareResources() {
		System.out.println("software");
		
	}
	@Override
	public void hardwareResources() {
		System.out.println("hardware");		
	}	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResources();
		d.hardwareResources();
	}
}
