package usuario;

import java.util.List;
import java.util.Scanner;

import database.DatabaseUtil;

public class UsuarioService {

	public void cadastraUsuario() {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite o nome do novo Usuario: ");
		String nome = scan.nextLine();
		
		DatabaseUtil.criaUsuario(nome);
	}
	
	public void buscarUsuario() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite o nome do novo Usuario: ");
		String nome = scan.nextLine();
		
		List<Usuario> lst = DatabaseUtil.buscaUsuariosPorNome(nome);
		
		if (lst.size() > 0) 
			System.out.println("\nUsuario(s) encontrado(s):");
		else
			System.out.println("\nNão foram encontrados usuarios com nome '"+nome+"' \n");
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("\n");
	}
	
}
