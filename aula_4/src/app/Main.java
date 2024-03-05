package app;
import model.Usuario;
import view.Mensagens;
public class Main {

	public static void main(String[] args) {

		
		Mensagens mensagem = new  Mensagens ();
		
		String Nome, CPF, Celular, Email, Senha, opcao;
		
		mensagem.mostrarInformacao("Seja bem-vindo");
		
		do {
			mensagem.mostrarInformacao("Cadastro de usuario");
			
			Nome = mensagem.solicitarEntrada("digite o seu nome");
			CPF = mensagem.solicitarEntrada("digite seu CPF");
			Celular = mensagem.solicitarEntrada("digite seu celular");
			Email = mensagem.solicitarEntrada("digite seu email");
			Senha = mensagem.solicitarEntrada("digite sua senha");
			Usuario usuario = new Usuario(Nome, CPF,Celular,Email,Senha);
			mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
			opcao = "ok";
		} while(opcao == "ok");
  
	}

}