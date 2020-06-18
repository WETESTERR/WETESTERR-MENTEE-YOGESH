package javaPractice;


public class DrivingAbstract extends ParentGuideAbstract {

	public static void main(String[] args) {
		// THis is for abstract learning

		DrivingAbstract drive = new DrivingAbstract();
		drive.carSafety();
		drive.bikeSafety();
		drive.roadSaftey();
	
	}		
	

	@Override
	public void roadSaftey() {
		// TODO Auto-generated method stub
		System.out.println("avoid potholes");
	}

}
