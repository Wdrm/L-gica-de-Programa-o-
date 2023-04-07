import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Qual Operação Vamos Realizar\n" +
                    "0 Encerra\n" +
                    "1 Àrea e Perímetro do Retângulo\n"+
                    "2 Área e Perímetro do Quadrado\n"+
                    "3 Área e Perímetro da Circunferência\n"+
                    "4 Perímetro do Triângulo\n"+
                    "5 Próximo Número\n");

                int opcao = sc.nextInt();
        switch (opcao){
            case 0:
                break;
            case 1: Diversos div = new Diversos(); div.retangulo();
            break;
            case 2:Diversos dive = new Diversos();dive.quadrado();
            break;
            case 3: Diversos diver = new Diversos();diver.circunferencia();
            break;
            case 4: Diversos diveD = new Diversos(); diveD.triangulo();
            break;
            case 5: Diversos divE = new Diversos(); divE.proximoNumero();
            break;

         }


    }
}
