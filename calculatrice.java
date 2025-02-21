import java.util.Scanner;
class Calculatrice{
    public double addition(double a,double b){
        return a + b;
    }
    public double soustraction(double a,double b){
        return a - b;
    }
    public double division(double a,double b){
        return a - b;
    }
     public double multiplication(double a,double b){
        return a * b;
    }
    
}
class test{
    public static void main (string[]args){
        public class Test {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        System.out.println("Bienvenue dans la calculatrice Java !");

        while (continuer) {
            try {
                System.out.println("\nChoisissez une opération :");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                int choix = scanner.nextInt();


                System.out.print("Entrez le premier nombre : ");
                double a = scanner.nextDouble();
                System.out.print("Entrez le deuxième nombre : ");
                double b = scanner.nextDouble();

                double resultat = 0;

                switch (choix) {
                    case 1:
                        resultat = calc.addition(a, b);
                        break;
                    case 2:
                        resultat = calc.soustraction(a, b);
                        break;
                    case 3:
                        resultat = calc.multiplication(a, b);
                        break;
                    case 4:
                        resultat = calc.division(a, b);
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                        continue;
                }

                System.out.println("Résultat : " + resultat);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Erreur : Veuillez entrer des valeurs valides.");
                scanner.nextLine(); // Nettoyer le buffer du scanner
            }
        }

        scanner.close();
    }
}
    }
