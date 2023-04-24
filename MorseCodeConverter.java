/*
 * Class: CMSC204 30416
 * Instructor: Prof. Khandan Monshi
	 * Description:  Morse Code
	 * Due: 2/7/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michelle Eileen
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {

	private static MorseCodeTree tree = new MorseCodeTree();
	
	public MorseCodeConverter() {
	}
	
	public static String convertToEnglish(File codeFile) throws FileNotFoundException {
		Scanner in = new Scanner(codeFile);
		String result = "";
		while(in.hasNext()) {
			result += convertToEnglish(in.nextLine());
		}
		return result;
	}
	
	public static String convertToEnglish(String code) {
		String result = "";
		String string = "";
		code += " ";
		for (String c : code.split("")) {
			if (c.equals("/")) {
				result += " ";
			}
			else if(c.equals(" ")) {
				if(string.length()!=0) {
					result += tree.fetch(string);
					string = "";
				}
			}
			else {
				string += c;
			}
		}
		return result;
	}
	
	public static String printTree() {
		String data = "";
		ArrayList<String> list = new ArrayList<String>();
		list = tree.toArrayList();
		for (int i = 0; i<list.size(); i++) {
			data += list.get(i);
		}
		return data;
	}
}