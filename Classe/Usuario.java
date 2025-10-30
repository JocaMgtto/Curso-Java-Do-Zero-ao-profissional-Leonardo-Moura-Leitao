package Classe;

public class Usuario {

		public String nome;
		public String email;
		
		
		@Override
		public boolean equals(Object objeto) {
			if (objeto instanceof Usuario) { // se objeto for uma instancia de usuario
				
				Usuario outro = (Usuario) objeto;
				
				boolean nomeIgual = outro.nome.equals(this.nome);
				boolean emailIgual = outro.email.equals(this.email);
				
				return nomeIgual && emailIgual;
				
			}else {return false;}
			
		
		}
		
}
