package hack;
import hack.CrackerFactory;
import hack.Cracker;

import java.util.*;

public class CrackerService {
    public static void main(String[] args) {
        CrackerFactory crackerFactory = new CrackerFactory();
        Scanner sc = new Scanner(System.in);
        Cracker cracker = null;
        String mdp;
        System.out.println("veuillez Saisir votre mot de passe : ");
        mdp = sc.nextLine();
        System.out.println("Veuiller choisir l'algo a utiliser");
        System.out.println("1\tAttack par Brute force\n2\tAttack par Dictionaire");
        int choix = sc.nextInt();

        switch(choix) {
            case 1: 
            cracker = crackerFactory.algo("BRUTE_FORCE");
            cracker.hack(mdp);
                break;
            
            case 2 :
            cracker = crackerFactory.algo("DICTIONNARY");
            cracker.hack(mdp);
                break;
            
            default : 
            System.out.println("choix Incorrect");

    
    
        }


    }
}
