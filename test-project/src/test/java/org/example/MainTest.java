package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Gabriel Aguilera on 13/9/24
 */
class MainTest {
	
	
	@Test
	void test(){
		int valueDec = 1_1;
		int valueHex = 0x41;
		int valueBin = 0b1111;
		float pi =  3.1415F;
		long creditCardNumber = 1234_5678_9012_3456L;
		
		System.out.println("Value decimal: " + Integer.toBinaryString(valueDec));
		System.out.println("Value hexadecimal: " + valueHex);
		System.out.println("Value binary: " + valueBin);
		System.out.println("Value pi: " + pi);
		System.out.println("Credit card number: " + creditCardNumber);
		
		
	}
	
	@Test
	void testDirectories(){
		File file = new File("/home/moroniaguilera/Documents/machine_learning");
		System.out.println("List files 1:"+retrieveCountFiles("/home/moroniaguilera/Documents/machine_learning"));
		
		file = new File("/home/moroniaguilera/Documents/AnyDesk");
		System.out.println("List files 2:"+ retrieveCountFiles("/home/moroniaguilera/Documents/AnyDesk"));
		
		System.out.println("List files 3:"+retrieveCountFiles("/home/moroniaguilera/Documents"));
		
	}

	
	String retrieveCountFiles(String path){
		File file = new File(path);
		return  file.isDirectory() ?   String.valueOf( file.listFiles().length):"0";
	}
	
}