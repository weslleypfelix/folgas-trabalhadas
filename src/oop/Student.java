package oop;
import java.util.Scanner;
public class Student {

	String nome;
	double nota1;
	double nota2;
	double nota3;
	static int notaFinal;
	static int min = 60;
	static int qtFalta;
	
	public double notas() {
		
		notaFinal = (int) (nota1+nota2+nota3);
		System.out.println("A nota final de "+ nome + " é: " + notaFinal);
		return notaFinal;
		
	}
	
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the name of Student: ");
		student.nome = scan.nextLine();
		System.out.println("Enter the first note: ");
		student.nota1 = scan.nextInt();
		System.out.println("Enter the second note: ");
		student.nota2 = scan.nextInt();
		System.out.println("Enter the third note: ");
		student.nota3 = scan.nextInt();
		
		
		student.notas();
		System.out.println();
		
		qtFalta = notaFinal - 60;
		
		if(notaFinal >= 60 && notaFinal < 100 ) {
			System.out.println("APROVADO ! Parabéns " + student.nome);
		}else if (notaFinal > 100) {
			System.out.println("pego na mentira fila da mãin");
		}
		
		else {
			System.out.println("Reprovado " + student.nome+ ". Lhe faltou " + qtFalta);
		}
		
	}
	
	
}
