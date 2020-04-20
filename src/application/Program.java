package application;

import entities.ContaComum;
import entities.ContaEmpresas;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		ContaComum contacomum = new ContaComum(3261, "Alex", 1200.0);
		ContaEmpresas contaemp = new ContaEmpresas(1025, "Maria", 900.0, 500.0);
		
		
		//UPCASTING
		
		ContaComum cc1 = contaemp;
		ContaComum cc2 = new ContaEmpresas(2589, "Maria", 200.0, 300.0);
		ContaComum cc3 = new ContaPoupanca(7894, "João", 600.0, 0.01);
		
		//DOWNCASTING
		
		ContaEmpresas cc4 = (ContaEmpresas)cc2;
		cc4.emprestimo(100.00);
		
		// ContaEmpresas cc5 = (ContaEmpresas)cc3;   |"Irá dar erro pq o obj 'cc3' foi instanciado com classe ContaPoupanca"|
		// Vamos testar abaixo
		
		if (cc3 instanceof ContaEmpresas) {
			ContaEmpresas cc5 = (ContaEmpresas)cc3;
			cc5.emprestimo(200.0);
			System.out.println("Emprestimo");
		}
		
		if(cc3 instanceof ContaPoupanca) {
			ContaPoupanca cc5 = (ContaPoupanca)cc3;
			cc5.atualizarSaldo();
			System.out.println("Atualizado");
		}
	}

}
