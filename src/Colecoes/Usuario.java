package Colecoes;

import java.util.Objects;

public class Usuario {

	String nome;

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

//---------------------------------------------------------
	// Método adicionado manualmente 
	public String toString() {
		return "Meu nome é: " + this.nome + ".";
	}
//---------------------------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}

}
