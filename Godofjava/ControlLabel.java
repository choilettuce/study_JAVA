package Godofjava;

public class ControlLabel {
	public static void main(String args[]) {
		ControlLabel control=new ControlLabel();
		control.printTimesTable();
	}
	public void printTimesTable() {
		for(int a=2; a<10; a++) {
			for(int b=1; b<10; b++) {
				System.out.println(a+"*"+b+"="+a*b);
			}
		}
	}

}
