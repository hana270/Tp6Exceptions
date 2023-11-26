package tp6Exceptions;

import java.util.Scanner;

public class Authentification {
    final String LoginCorrect = "scott";
    final String PwdCorrect = "tiger";
    static Scanner sc = new Scanner(System.in);

    public void getUserLogin() throws WrongLoginException {
        System.out.print(" Entrez login :  ");
        String login = sc.nextLine();
        if (!LoginCorrect.equals(login)) {
            throw new WrongLoginException("Le login est incorrect.");
        }
    }

    public void getUserPwd() throws WrongPwdException, WrongInputLength {
        boolean passwordCorrect = false;
        while (!passwordCorrect) {
            System.out.print("Entrez le mot de passe correct :");
            String pwd = sc.nextLine();
            if (pwd.length() > 10) {
                throw new WrongInputLength("Le mot de passe ne doit pas depasse 10 caractères.");
            } else if (!PwdCorrect.equals(pwd)) {
                throw new WrongPwdException("Le mot de passe est incorrect.");
            } else {
                passwordCorrect = true;
            }
        }
    }
    Authentification() throws WrongLoginException, WrongInputLength, WrongPwdException {
        getUserLogin();
        getUserPwd();
    }
}