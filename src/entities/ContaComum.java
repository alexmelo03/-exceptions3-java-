package entities;

public class ContaComum {
	private Integer numConta;
	private String cliente;
	protected Double saldo;  //protected Permite que o atributo 'saldo' seja acessado pela Subclasse ContaEmpresa
	
	public ContaComum() {
		
	}

	public ContaComum(Integer numConta, String cliente, Double saldo) {
		this.numConta = numConta;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	
	public void saque(double montante) {
		saldo -= montante;
	}
	
	public void  deposito(double montante) {
		saldo += montante;
	}
	
	

}
