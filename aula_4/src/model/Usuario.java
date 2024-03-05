package model;

public class Usuario {
     private String Nome, Celular, Email, Senha, CPF;
     
     private boolean EstaLogado = false;
      
    public Usuario (String Nome, String Celular, String Email, String Senha, String CPF){
    	        this.Nome = Nome;
    			this.Celular = Celular;
    			this.Email = Email;
    			this.Senha = Senha;
    			this.CPF= CPF;
    }
    void Autenticacao(String Email, String Senha) {
    	if(this.Email == Email && this.Senha == Senha) {
    		EstaLogado = true;
    	}
    }
    
    public String getUsuario() {
    	return ("\nNome" + this.Nome 
    	+ "\nCPF" 
    	+ this.CPF 
        + "\nCelular" 
    	+ this.Celular 
    	+ "\nEmail" 
    	+ this.Email 
    	+ "\nSenha" 
    	+ this.Senha 
    	+ "\nEstaLogado" 
    	+ this.EstaLogado);
    			
    			
    }
     }
