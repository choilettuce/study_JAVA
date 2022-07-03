package Godofjava;

public class ControlSwich {
	public static void main(String args[]) {
		ControlSwich control=new ControlSwich();
		control.swtichStatement(1);
		control.swtichStatement(2);
		control.swtichStatement(3);
		control.swtichStatement(4);
		control.swtichStatement(6);
	
		
	}
	
	public void swtichStatement(int numberOfWheel) {
		switch (numberOfWheel) {
		case 1:
			System.out.println(numberOfWheel+":It is a one foot bicycle.");
			break;
		case 2:
			System.out.println(numberOfWheel+":It is a motor cycle or bicycle.");
			break;
		case 3:
			System.out.println(numberOfWheel+":It is a three wheel car.");
			break;
		case 4:
			System.out.println(numberOfWheel+":It is a car.");
			break;
		default:
			System.out.println(numberOfWheel+":It is am expensive car.");
			break;
		
		}
	}

}
