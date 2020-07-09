package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departamento;
import entities.FolgaTrabalhista;
import entities.Funcionario;
import entities.enums.Cargos;

public class Application {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.println("Entre com o nome do departamento: ");
		String nomeDepartamento = scan.next();
		System.out.println("Entre com os dados do funcionário ");
		System.out.println("Nome: ");
		String nome = scan.next();
		System.out.println("Cargo na loja: ");
		scan.nextLine();
		String cargo = scan.next();
		System.out.println("Salário Fixo : ");
		double salario = scan.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario, Cargos.valueOf(cargo),  new Departamento(nomeDepartamento));
		
		
		System.out.println( " quantas folgas trabalhistas realizou " + nome+ " ?");
		int qtd = scan.nextInt();
		for(int n = 1;n<=qtd;n++) {
			System.out.println("Entre com os dados da "+ n+ "# ft: ");
			System.out.println("Data (DD/MM/YYYY)");
			Date ftData = sdf.parse(scan.next());
			System.out.println("Valor por hora trabalhada : ");
			double hr = scan.nextDouble();
			System.out.println("Quantas horas trabalhadas? (hours) ");
			int horas = scan.nextInt();
			FolgaTrabalhista ft = new FolgaTrabalhista(ftData, hr, horas);
			funcionario.addHoras(ft);
		}
		System.out.println();
		System.out.println("Entre com o mês e o ano que se deseja calcular os ganhos (MM/YYYY) ");
		String monthAndYear = scan.next();
		int mes = Integer.parseInt(monthAndYear.substring(0,2));
		int ano = Integer.parseInt(monthAndYear.substring(3));
		System.out.println();
		System.out.println("Mostrando os dados na tela : ");
		System.out.println("Nome : " + funcionario.getNome() );
		System.out.println("Departamento: "+ funcionario.getDepartmento().getNome());
		System.out.println("ganhos para o mês " + monthAndYear +" " +  funcionario.ganhos(ano	, mes));
		System.out.println();
		System.out.println("Obrigado por usar o programa ! xD");
		
		

		scan.close();

	}

}
