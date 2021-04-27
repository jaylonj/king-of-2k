package team;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class team {

	public static void main(String[] args) throws Exception
	{
	File file = new File("C:\\Users\\Papa Wolf\\Documents\\teams.txt");
	Scanner sc = new Scanner(file);
	String[] teams = getTeams(sc);
	Random rand = new Random();
	System.out.println("Hey Whiz! Use this team: " + teams[rand.nextInt(teams.length)]);
	}
	public static String[] getTeams(Scanner sc){
		String[] t = new String[29];
		for (int i = 0; i < t.length; i++){
			t[i] = sc.nextLine();
		}
		return t;
	}
		
	}
	
