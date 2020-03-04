package oop;

import java.util.Scanner;
public class method {
	
	boolean lamp ;
	
	public void turnOn() {
		System.out.println("Lampaga ligada");
	}
	
	public void turnOf() {
		System.out.println("Lampada desligada");
	}
	
	
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		method lampada = new method();
		
		
		System.out.println("aperte o botão: ");
		String b = scan.next();
		
		if(b.equalsIgnoreCase("l")) {
			lampada.lamp = true;
			lampada.turnOn();			
		} else if(b.equalsIgnoreCase("d")) {
			lampada.lamp = true;
			lampada.turnOf();	
		}
		
		
	}
	
	
}
