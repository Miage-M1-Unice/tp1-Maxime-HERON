package fr.unice.miage.heron.tp1;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File folder = new File("../");
		String[] file = folder.list();
		for(int i =0; i < file.length; i++) {
			System.out.println(file[i]);
		}
		
		
	}

}
