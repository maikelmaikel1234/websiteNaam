import java.util.Scanner;

public class Webshop {
	
	public String name;
	public int age;
	private char geslacht;
	private boolean registered;
	int iq;
	short huisNummer;
	
	
	
	public static void main (String[] args){
	
Scanner sc = new Scanner (System.in);

	System.out.println("welkom bij xxl nutrition");
	System.out.println("voer uw naam in...");
	String name = sc.nextLine();

	System.out.println("voer uw leeftijd in...");
	int age = sc.nextInt();


	System.out.println("voer uw geslacht in...");
	char geslacht = sc.next().charAt(0);

	System.out.println("bent u al geregistreerd...");
	boolean registered = sc.nextBoolean();

	System.out.println("Wat is uw iq...");
	int iq = sc.nextInt();

	System.out.println("Wat is uw huisnummer...");
	short huisNummer = sc.nextShort();
	
	System.out.println(" ");
	System.out.println("Hallo "+name);
	System.out.println("je bent "+age+" jaar oud");
	System.out.println("Uw geslacht is " +geslacht);
	System.out.println("bent u geregistreerd? "+registered);
	System.out.println("Uw iq is "+iq);
	System.out.println("en uw huisnummer is "+huisNummer);

	System.exit(0);
	
}	
}