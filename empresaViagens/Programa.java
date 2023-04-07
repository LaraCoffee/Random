package empresaViagens;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int data = 0;
        int opMenu = 0;
        String modal = " ";
        String transporte = " ";
        Double valor = 0.00;
        Double valorModal = 0.00;
        int passageiros = 0;
        System.out.println("bem vindo a viagens dotcom");
        do{
            System.out.println("selecione um modal: \n1- terrestre\n2- aquatico\n3-aereo");
            int opcao = input.nextInt();
            if (opcao == 1) {
                modal = "terrestre";
                System.out.println("modal terrestre selecionado");
                System.out.println("selecione uma das opções: \n1- ônibus - R$100\n2- metrô - R$60\n3- trem - R$150");
                int opcaoTerrestre = input.nextInt();
                if (opcaoTerrestre == 1) {
                    valorModal = 100.00;
                    System.out.println("você escolheu ônibus");
                    transporte = "ônibus";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }else if (opcaoTerrestre == 2) {
                    valorModal = 60.00;
                    System.out.println("você escolheu Metrô");
                    transporte = "Metrô";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }else if (opcaoTerrestre == 3) {
                    valorModal = 150.00;
                    System.out.println("você escolheu Trem");
                    transporte = "Trem";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }
            }else if (opcao == 2) {
                modal = "aquatico";
                System.out.println("modal terrestre selecionado");
                System.out.println("selecione uma das opções: \n1- balsa - R$30\n2- cruzeiro - R$400\n3- ferry boat - R$150");
                int opcaoTerrestre = input.nextInt();
                if (opcaoTerrestre == 1) {
                    valorModal = 30.00;
                    System.out.println("você escolheu balsa");
                    transporte = "balsa";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }else if (opcaoTerrestre == 2) {
                    valorModal = 400.00;
                    System.out.println("você escolheu cruzeiro");
                    transporte = "cruzeiro";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }else if (opcaoTerrestre == 3) {
                    valorModal = 150.00;
                    System.out.println("você escolheu ferry boat");
                    transporte = "ferry boat";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }
            }else if (opcao == 3) {
                modal = "aereo";
                System.out.println("modal aereo selecionado");
                System.out.println("selecione uma das opções: \n1- comercial - R$400\n2- executivo - R$900\n3- helicoptero - R$150");
                int opcaoTerrestre = input.nextInt();
                if (opcaoTerrestre == 1) {
                    valorModal = 400.00;
                    System.out.println("você escolheu comercial");
                    transporte = "avião comercial";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }else if (opcaoTerrestre == 2) {
                    valorModal = 900.00;
                    System.out.println("você escolheu jato executivo");
                    transporte = "jato executivo";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }else if (opcaoTerrestre == 3) {
                    valorModal = 150.00;
                    System.out.println("você escolheu helicoptero");
                    transporte = "helicoptero";
                    System.out.print("quantos passageiros: ");
                    passageiros = input.nextInt();
                    valor = valorModal * passageiros;
                    System.out.print("digite a data de partida dia/mês/ano: ");
                    data = input.nextInt();
                }
            }
            
            System.out.println("");
            System.out.println("*****************************************");
            System.out.println("modal utilizado: "+ modal);
            System.out.println("transporte utilizado: "+ transporte);
            System.out.println("data da viagem: "+ data);
            System.out.println("quantidade de passageiros: "+ passageiros);
            System.out.println("valor total das passagens: "+ valor);
            System.out.println("*******************************************");
            System.out.println("\ndeseja comprar outra passagem \n1- sim/2- não: ");
            opMenu = input.nextInt();
        }while(opMenu != 2);
        System.out.println("programa encerrado");


    }
}

