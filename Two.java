package org.digits;

public class Two {
	public void evenNumbers() {
		for(int i=0; i<9; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[]args) {
		Two t = new Two();
		t.evenNumbers();
	}

}
