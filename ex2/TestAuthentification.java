package tp6Exceptions;


public class TestAuthentification {
	public static void main(String[] args) {
		
		boolean erreur=false;
			do {
		try {
			
			Authentification a=new Authentification();
			
			erreur=true;
			}
		catch (WrongLoginException e) {
		    System.out.println("login incorrect");
		    e.printStackTrace();
		    erreur = false;
		}
		catch (WrongInputLength m) {
		    System.out.println("mot de passe dépasse 10");
		    m.printStackTrace();
		    erreur = false;
		}
		catch (WrongPwdException w) {
		    System.out.println("mot de passe incorrect");
		    w.printStackTrace();
		    erreur = false;
		}
			
		}
		while(!erreur);
	
}}
