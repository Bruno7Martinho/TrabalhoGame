
package game;

import java.util.Random;
import java.util.Scanner;




    public class Game {
public static void main(String[] args) {
     

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String nome;
    int opcao = 0, aposta = 0;

    int tentativas = 0;
    int acertos = 0, total = 0;
    int mult = 1;
    boolean acertou = false;

    System.out.println (

    "Bem-vindo ao jogo de adivinhação!");
    System.out.println (
    "Primeiramente digite seu nome:");
        nome  = scanner.nextLine();

    System.out.println (
    "Você deseja iniciar a partida?(1.Sim 2.Não)");
        opcao  = scanner.nextInt();
    if(opcao ==1){
            System.out.println("OK! Bom jogo");
        System.out.println("Qual o valor da aposta?(considere valores inteiros)");
        aposta = scanner.nextInt();
    }

    
        else{
            System.out.println("Muito obrigado! Tchau!");
           
            
    }

    while(opcao ==1){
        
                    int numeroSecreto = random.nextInt(100) + 1;
        while (!acertou) {


            
            System.out.println("Estou pensando em um número entre 1 e 100...");
            System.out.print("Digite sua tentativa: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor!");
            } else {
                acertos++;
                acertou = true;
                total += mult * (acertos * aposta);
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas." + total);
            }
        }

        System.out.println("Você deseja continuar?(1.Sim 2.Não)");
        opcao = scanner.nextInt();
        if (opcao == 1) {
            acertou = false;
        }else{
             System.out.println("Você jogou " + tentativas + " vezes e acertou " + acertos+ " vezes e o valor que você deve receber é " + total);
        }

        mult *= 2;
        System.out.println("\n===========================================================\n");
    }

    scanner.close ();

}

}

   

    
     
    

