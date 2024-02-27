package model;

public class Contacorrente extends Conta{
            private double ValorTaxa;
	Contacorrente(String email, double ValorTaxa) {
		super(email);
		this.ValorTaxa = ValorTaxa;
	}
	public String Saque(double valorSaque) {
	if	(valorSaque + ValorTaxa<= saldo) {
		saldo =- valorSaque;
		saldo =- ValorTaxa;
		return (
				"Valor Sacado: " + valorSaque
				+"\nValor Saldo Após o Saque: " + saldo);
	}else {
		return "Saldo insuficiente";
	}
	}
    public String Deposito(double valordeposito) {
    	saldo += (valordeposito);
    	return ("Valor sacado: " + valordeposito +"\nValor do saldo após o saque: " + saldo);
    }
    public double getSaldo() {
    	return saldo;
    }
}   
