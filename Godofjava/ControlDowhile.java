package Godofjava;

public class ControlDowhile {
	public static void main(String args []) {
		ControlDowhile control=new ControlDowhile();
		control.doWhile();
		
	}
	public void doWhile() {
		ControlOfFlow control = new ControlOfFlow();
		int loop=0;
		do {
			loop++;
			control.switchCalendar(loop);
		} while(loop<12);
	}
}
