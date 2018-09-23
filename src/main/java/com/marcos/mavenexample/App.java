package com.marcos.mavenexample;

import java.io.IOException;

import com.marcos.mavenexample.menu.Grava;
import com.marcos.mavenexample.menu.Menu;

import database.DatabaseUtil;
import usuario.Usuario;
import usuario.UsuarioService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException
    {
    	DatabaseUtil.carregarBase();
    	
    	int opcao = Menu.mostraMenu();
        while (opcao != 0) {
	    	if (opcao == 1) {
	    		//System.out.println("Iremos implementar aqui como cadastrar um Usuario");
	    		UsuarioService usuarioService = new UsuarioService();
	    		usuarioService.cadastraUsuario();
	    		System.out.println("Usuario cadastrado com sucesso!");
	    	} else if (opcao == 2) {
	    		UsuarioService usuarioService = new UsuarioService();
	    		usuarioService.buscarUsuario();
	    	}
	    	
	    	opcao = Menu.mostraMenu();
        }
        
        DatabaseUtil.salvarBase();
        System.out.println("Bye bye!");
    }
}
