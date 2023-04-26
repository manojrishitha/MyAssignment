package week1.day1;
public class Mobile {
	public void makeCall() {
	System.out.println("Dial the Number");
	}
	public void sendMsg() {
	System.out.println("Type the Message");
	}
	public void mobileModel() {
	String mobileModel = "samsung";
	System.out.println("Mobile Model =" +mobileModel);
	}
	public void mobileWeight() {
	float mobileWeight = 80.5f;
	System.out.println("Mobile Weight =" +mobileWeight);
	}
	public void isFullyCharged() {
	boolean isFullyCharged = true;
	System.out.println("Fully Charged=" +isFullyCharged);
	}
	public void mobileCost() {
	int mobileCost = 12000;
	System.out.println("Cost of Mobile=" +mobileCost);

	}
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.makeCall(); 
	mob.sendMsg();
	mob.mobileModel();
	mob.mobileWeight();
	mob.isFullyCharged();
	mob.mobileCost();
	System.out.println("This is my Mobile");
	}

}
