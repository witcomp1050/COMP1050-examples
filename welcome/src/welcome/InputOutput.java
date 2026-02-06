package welcome;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		File f = new File("myFile.txt");
		
//		Scanner fileInput = new Scanner(f);  // must be in try-catch
		
		try {
//			//file input
//
			Scanner fileInput = new Scanner(f);
//			
			while (fileInput.hasNextLine()) {
				String nextLine = fileInput.nextLine();
				System.out.printf(nextLine+"%n");
			}
//			
		}
		catch(FileNotFoundException fn) {
			System.out.println("Make sure file exists");
			System.exit(0);
		}
//		
//		
//		//file output
//		
//		File numbersFile = new File("numbers.txt");
////		
		try (PrintWriter fout = new PrintWriter(new File("numbers.txt"))) {
			for (int i=1; i<=100; i++) {
				fout.printf("%d%n", i);
			}
		} catch (FileNotFoundException ex) {
			System.out.printf("File not found!%n");
			System.exit(0);
		}
////
////		
		try (
				Scanner fin = new Scanner(new File("numbers.txt"));
				PrintWriter fout = new PrintWriter(new File("odds.txt")); 
				) {
					while (fin.hasNextInt()) {
						int next = fin.nextInt();
						if (next % 2 == 1) {
							fout.printf("%d%n", next);
					}
				}
				} 
		catch (FileNotFoundException ex) {
				System.out.printf("File not found!%n");
				System.exit(0);
				} 
		catch (IOException ex) {
				System.out.printf("IO error occurred!%n");
				System.exit(0);
				}

	}

}
