package CaixaEletronico;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Caixa_Eletronico {
 public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    BigDecimal deposito = new BigDecimal("0");
    BigDecimal saldo = new BigDecimal("1000"); 
    int opcao;
    do{
        
        
        System.out.println("1 - Consultar saldo"); 
        System.out.println("2 - Depositar"); 
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");

        System.out.print("Seleciona uma opção: ");
        opcao = sc.nextInt();

        if(opcao == 1){
            System.out.println("O Saldo é: " + saldo);
        }

        if(opcao == 2){
            System.out.print("Qual a quantidade que quer Depositar: ");
          deposito = sc.nextBigDecimal();
          saldo = deposito.add(saldo);
           

        }

        if(opcao == 3){
            System.out.print("Qual a quantidade que quer Sacar: ");
          deposito = sc.nextBigDecimal();
         saldo = saldo.subtract(deposito);

        }
        
        if(opcao == 4){
            sc.close();
            System.exit(0);
        }



        System.out.println(saldo);
        
    }while(opcao != 0);
 }  
}
