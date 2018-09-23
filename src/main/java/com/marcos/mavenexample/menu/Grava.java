package com.marcos.mavenexample.menu;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

public class Grava
{

	public static <T> void gravaObjeto(Map<Integer, T> mapa, Class<T> targetClass) throws IOException {
			 
		File fw = new File("E:\\Desenvolvimento\\Marcos\\MavenExample\\mavenexample\\"+targetClass.getName()+".txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fw));
		
		outputStream.writeObject(mapa);
		
		outputStream.close();
        
	    System.out.printf("\nGravado com sucesso\n");
	} 
	
	public static <T> Map carregaObjeto(Class<T> targetClass) throws ClassNotFoundException {
		
		try {
			File fw = new File("E:\\Desenvolvimento\\Marcos\\MavenExample\\mavenexample\\"+targetClass.getName()+".txt");
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fw));
	
			return (Map) is.readObject();
		
		} catch (IOException e) {
			System.out.println("Arquivo "+targetClass.getName()+ " não encontrado.");
		}
		
		return null;
//	    System.out.printf("\Carregado com sucesso");
	} 
}
