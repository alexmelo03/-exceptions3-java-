package entities;

public class ContaPoupanca extends ContaComum {   // 'extendeds' permite herdar os atributos da Superclasse ContaComum
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numConta, String cliente, Double saldo, Double taxaJuros) {
		super(numConta, cliente, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	

}
