import java.util.Scanner;

class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro !");
        }
        return a / b;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice !");

        while (true) { 
            System.out.println("\nChoisissez une opération :");
            System.out.println("1. Addition (+)");
            System.out.println("2. Soustraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice. Au revoir !");
                break; 
            }

            System.out.print("Entrez le premier nombre : ");
            double nombre1 = scanner.nextDouble();
            System.out.print("Entrez le deuxième nombre : ");
            double nombre2 = scanner.nextDouble();

            double resultat = 0;
            try {
                switch (choix) {
                    case 1:
                        resultat = calculatrice.addition(nombre1, nombre2);
                        System.out.println("Résultat de l'addition : " + resultat);
                        break;
                    case 2:
                        resultat = calculatrice.soustraction(nombre1, nombre2);
                        System.out.println("Résultat de la soustraction : " + resultat);
                        break;
                    case 3:
                        resultat = calculatrice.multiplication(nombre1, nombre2);
                        System.out.println("Résultat de la multiplication : " + resultat);
                        break;
                    case 4:
                        resultat = calculatrice.division(nombre1, nombre2);
                        System.out.println("Résultat de la division : " + resultat);
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
