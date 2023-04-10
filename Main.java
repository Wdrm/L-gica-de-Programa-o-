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
                    "5 Próximo Número\n"+
                    "6 Resto da Divisão\n"+
                    "7 Idade em Dias\n"+
                    "8 Conversão de Fahrenheit para Celcius\n"+
                    "9 Capacidade de Armazenamento\n"); 
                    

                int opcao = sc.nextInt();
        switch (opcao){
            case 0:
                break;
            case 1: Diversos divA = new Diversos(); divA.retangulo();
            break;
            case 2:Diversos divB = new Diversos();divB.quadrado();
            break;
            case 3: Diversos divC = new Diversos();divC.circunferencia();
            break;
            case 4: Diversos diveD = new Diversos(); diveD.triangulo();
            break;
            case 5: Diversos divE = new Diversos(); divE.proximoNumero();
            break;
            case 6: Diversos divF = new Diversos(); divF.restoDivisao();
            break;
            case 7: Diversos divG = new Diversos(); divG.idadeEmDias();
            break;
            case 8: Diversos divH =new Diversos(); divH.temperatura();
            break;
            case 9: Diversos divI = new Diversos(); divI.volume();
            break;
     
         }


    }
}
