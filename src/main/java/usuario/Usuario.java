package usuario;

import java.io.Serializable;

public class Usuario implements Serializable{

	private Integer id;
	private String nome;
	
	public Usuario(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "id:" + id + " | Nome:" + nome;
	}
	
	
}
