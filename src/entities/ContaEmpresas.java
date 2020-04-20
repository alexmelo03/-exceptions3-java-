package entities;

public class ContaEmpresas extends ContaComum  { // 'extendeds' permite herdar os atributos da Superclasse ContaComum
	
	private Double limiteEmprestimo;
	
	public ContaEmpresas() {
		super();
	}

	public ContaEmpresas(Integer numConta, String cliente, Double saldo, Double limiteEmprestimo) {
		super(numConta, cliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double montante) {
		if(montante <= limiteEmprestimo)
		saldo += montante - 10;            // atributo 'saldo' acessado atraves do protected na Superclasse ContaComum
	} 
	

}
