import java.util.Scanner;

public class Strings {  
    public static void proString(String... strings) {  
	for (String str:strings){
        int length = str.length();
        String concatenated = str.concat("shet"); 
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
	boolean Startwith = str.startsWith("v");
	boolean Endwith = str.endsWith("k");


        System.out.println("Concatenated: " + concatenated);
        System.out.println("Uppercase: " + upper);
        System.out.println("Length: " + length);
        System.out.println("Lowercase: " + lower);
        System.out.println("startwith: " + Startwith);
        System.out.println("endswith: " + Endwith);

    }
}
    public static void main(String[] args) {
	if (args.length > 0){
		System.out.println("command-line args"+args.length);
	}	
	else
	{
		System.out.println("no command-line args");
	}
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        proString(userInput);  
        scanner.close();
    }
}


