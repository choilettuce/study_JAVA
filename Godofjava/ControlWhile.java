package Godofjava;

public class ControlWhile {
	public static void main(String args[]) {
		ControlWhile controlof= new ControlWhile();
		controlof.whileLoop1();
		controlof.whileLoop2();
		controlof.whilebreak();
	}
	
	public void whileLoop1() {
		ControlOfFlow controlof = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			controlof.switchCalendar(loop);
		}	
	}
	
	public void whileLoop2() {
		ControlOfFlow controlof = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			controlof.switchCalendar(loop);
			if(loop==6) loop=100;
		}
		
	}
	public void whilebreak() {
		ControlOfFlow controlof = new ControlOfFlow();
		int loop = 0;
		while (loop <12) {
			loop++;
			controlof.switchCalendar(loop);
			if(loop==6) break;
		}
	}
	
}
