package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1
            Scanner scan = new Scanner(System.in);

            System.out.println("Exercitiul 1: ");
            Calc calculator = new Calc();
            System.out.println("Rezultatul adunarii: " + calculator.adunare(2,4));
            System.out.println("Rezultatul scaderii: " + calculator.scadere(5, 3));
            System.out.println("Rezultatul inmultirii: " + calculator.inmultire(9,6));
            System.out.println("Rezultatul impartirii: " + calculator.impartire(8,5));
//3
            System.out.println("Exercitiul 3: ");
            //creare obiect
            LogicalOp op = new LogicalOp(); //
            int biggest = op.checkBiggerNumber(2,7);
            System.out.println("Numarul mai mare este: " + biggest);
//4
            System.out.println("Exercitiul 4: ");
            System.out.println(op.compare4("Evozon"));
//5
            System.out.println("Exercitiul 5: ");
            System.out.println(op.compare5(" Evozon ", 3));
//6
            System.out.println("Exercitiul 6:");
            System.out.println(op.compare6(2));
//7
            System.out.println("Exercitiul 7: ");
            System.out.println(op.compare7(9));
//8
            System.out.println("Exercitiul 8: ");
            int number;
            op.nrPimit(9);

//9
            System.out.println("Exercitiul 9: ");
            System.out.println("Dati numarul:");
            int nr = scan.nextInt();
            if (op.isNumberEven(nr) == true)
                    System.out.println("Numarul " + nr + " este par");
            else System.out.println("Numarul " + nr + " este impar");

//10
            System.out.println("Exercitiul 10: ");
            System.out.println("Dati varsta:");
            int varsta = scan.nextInt();
            if (op.isEligibleToVote(varsta)==true)
            System.out.println("Poate sa voteze.");
            else System.out.println("Nu poate sa voteze.");

//11
            System.out.println("Exercitiul 11:");
            System.out.println("Cel mai mare numar este " + op.compare11(9, 8, 9));

    }
}
