package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Cargos;

public class Funcionario {

	private String nome;
	private double salarioFixo;
	private Cargos cargo;
	private Departamento departmento;
	private List<FolgaTrabalhista> horas = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(String nome, double salarioFixo, Cargos cargo, Departamento departmento) {
		this.nome = nome;
		this.salarioFixo = salarioFixo;
		this.cargo = cargo;
		this.departmento = departmento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartmento() {
		return departmento;
	}

	public void setDepartmento(Departamento departmento) {
		this.departmento = departmento;
	}

	public List<FolgaTrabalhista> getHoras() {
		return horas;
	}

	public void addHoras(FolgaTrabalhista hora) {
		horas.add(hora);
	}

	public void removeHoras(FolgaTrabalhista hora) {
		horas.remove(hora);
	}

	public double ganhos(int ano, int mes) {
		double sum = salarioFixo;
		Calendar cal = Calendar.getInstance();

		for (FolgaTrabalhista c : horas) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				sum += c.valorTotal();
			}
		}
		return sum;

	}

}
