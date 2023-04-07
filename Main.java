import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Qual Operação Vamos Realizar\n" +
                    "0 Encerra\n" +
                    "1 Àrea e Perímetro do Retângulo\n"+
                    "2 Área e Perímetro do Quadrado\n");

                int opcao = sc.nextInt();
        switch (opcao){
            case 0:
                break;
            case 1: Diversos div = new Diversos(); div.retangulo();
            break;
            case 2:Diversos dive = new Diversos();dive.quadrado();
            break;

         }






    }
}
