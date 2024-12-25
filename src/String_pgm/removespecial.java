package String_pgm;

public class removespecial {
   public static void main(String[] args) {
	 String s="atchu#$&*tara*^&o";
	 
	 System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
}
}
