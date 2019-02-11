package fr.unice.miage.heron.tp1;

import java.io.File;

public class Main {

	public static void readFolder(File folder) {
		
			for(int i =0; i < folder.list().length; i++) {
				System.out.println(folder.listFiles()[i]);
				if(folder.listFiles()[i].isDirectory()) {
					readFolder(folder.listFiles()[i]);
				}
			}
			
			
		}
	
	public static void main(String[] args) {
		
		
		File folder = new File("../");
		readFolder(folder);

}
}
