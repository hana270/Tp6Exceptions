package tp6Exceptions;

public class testMathematique {

	static double f(double n,double x) throws NegatifException ,ParametreNullException{
		 if (n == 0) {
	            throw new ParametreNullException("Impossible de faire une division par zéro !");
	        } else if (x < 0) {
	            throw new NegatifException("On ne peut pas calculer une racine pour un réel négatif !!!!");
	        }

	        return Math.sqrt(x) / n;
	    }
	
	public static void main(String[] args) {
		try {
			double n=Double.parseDouble(args[0]);
			double x=Double.parseDouble(args[1]);
			
		System.out.println("Resultat : "+f(n,x));
		
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("<< Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne »");
		}catch(NumberFormatException e) {
			System.out.println(" « Les arguments doivent être des nombres »");
		}/*catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("Ne doit pas divisee par 0");
			e.printStackTrace();
		}*/catch (ParametreNullException e) {
            System.out.println(e.getMessage());
            System.out.println("*************¨ParametreNullException*********************");
        } catch (NegatifException e) {
            System.out.println(e.getMessage());
            System.out.println("<< on ne peut pas calculer une racine pour un réel négatif !!!!!! »");
        }finally {
        	 
        	 System.out.println("<< bloc finally exécuté quel que soit le résultat d’exécution >>");
        	 System.out.println("Fin du programme");
		}
		

	}


}
