package model;

public class Contapoupanca extends Conta{
private double rendimento;
 Contapoupanca(String email, double rendimento) {
		super(email);
				this.rendimento = rendimento;
		// TODO Auto-generated constructor stub
	}
	public String Saque(double valorSaque) {
	if	(valorSaque<= saldo) {
		saldo =- valorSaque;
		return (
				"Valor Sacado: " + valorSaque
				+"\nValor Saldo Após o Saque: " + saldo);
	}else {
		return "Saldo insuficiente";
	}
	}
 public String Deposito(double valordeposito) {
 	saldo += (valordeposito + (valordeposito*rendimento));
 	return ("Valor sacado: " + valordeposito +"\nValor do saldo após o saque: " + saldo);
 }
 public double getSaldo() {
 	return saldo;
 }
}   
