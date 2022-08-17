import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double notaA;
        double notaB;
        double notaC;
        double media;

        System.out.println("Insira a PRIMEIRA nota: ");
        notaA = entrada.nextDouble();
        System.out.println("Insira a SEGUNDA nota: ");
        notaB = entrada.nextDouble();
        System.out.println("Insira a TERCEIRA nota: ");
        notaC = entrada.nextDouble();


        media = (notaA+notaB+notaC) / 3;


        if (media < 4.9){
            System.out.println("Esta de recuperacao");
            System.out.println("Nota faltante para passar = " + (10 - media + 2));
        }if (media < 6.9){
            System.out.println("Prova Final!");
            System.out.println("Nota nota a alcancar para passar = " + (10 - media));
        }if (media > 6.9){
            System.out.println("APROVADO!!!");
        }


    }


}
