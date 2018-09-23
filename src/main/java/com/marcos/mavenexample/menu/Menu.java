package com.marcos.mavenexample.menu;

import java.util.Scanner;

public class Menu {

	private static String menu = 
			  "######################################\n"
			+ "# 1 - Cadatrar Usuario               #\n"
			+ "# 2 - Buscar Usuario                 #\n"
			+ "# 0 - Sair                           #\n"
			+ "######################################";
	
	public static int mostraMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println(menu);
		System.out.printf("Escolha uma opção: ");
		return scan.nextInt();
	}
	
}
