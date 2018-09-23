package database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.marcos.mavenexample.menu.Grava;

import usuario.Usuario;

public class DatabaseUtil {
	
	private static Map<Integer, Usuario> usuarios = new HashMap<>();
	
	public static Usuario buscaUsuarioPorId(Integer id) {
		return usuarios.get(id);
	}
	
	public static List<Usuario> buscaUsuariosPorNome(String nome) {
		List<Usuario> lstRetorno = new ArrayList<>();
		
		for(Usuario u: usuarios.values()) {
			if (u.getNome().contains(nome)) lstRetorno.add(u);
		}
		
		return lstRetorno;
	}
	
	public static void criaUsuario(String nome) {
		int id = usuarios.keySet().size() + 1;
		Usuario obj = new Usuario(id, nome);
		usuarios.put(id, obj);
	}
	
	public static void carregarBase() throws ClassNotFoundException {
		usuarios = Grava.carregaObjeto(Usuario.class);
	}
	
	public static void salvarBase() throws IOException {
		Grava.gravaObjeto(usuarios, Usuario.class);
	}

}
