package tr.org.linux.kamp2016.string;

public class CompareArrays {
	
	public static void main(String args[]){
	
	String str = "Pulbiber Mahallesi";
	String str2 = "pulbiber mahallesi";
	
	System.out.println(str.compareTo(str2));
	System.out.println(str.compareToIgnoreCase(str2));
}
}