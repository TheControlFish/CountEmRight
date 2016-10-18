import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = "";
		String []sp;
		while (!s.equals("EXITblah")){
			System.out.print("Type in a sentence and press ENTER. ");
			s = kb.nextLine();
			s = s.toUpperCase();
			s += "blah";
			sp = s.split("S\\s+A|SA");
			System.out.println("There are " + (sp.length - 1) + " occurrences of the letter \"s\" followed by the letter \"a\"\n");
		}
		System.out.println("DONE");
	}

}
