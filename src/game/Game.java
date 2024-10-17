/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;


public class Game {

    
   

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
         String nome;
        int opcao = 0,aposta=0;

        int tentativas = 0;
        int acertos=0, total=0;
        int mult=1;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Primeiramente digite seu nome:");
        nome= scanner.nextLine();
        System.out.println("Você deseja iniciar a partida?(1.Sim 2.Não)");
        opcao=scanner.nextInt();
        if(opcao==1){
            System.out.println("OK! Bom jogo");
            System.out.println("Qual o valor da aposta?");
        aposta= scanner.nextInt();
        }else{
            System.out.println("Muito obrigado! Tchau!");
        }
       
       

       while(opcao==1){
        while (!acertou) {
            
                    int numeroSecreto = random.nextInt(100) + 1;
            System.out.println(numeroSecreto);
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
                total+=mult*(acertos*aposta);
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas."+total);
            }
        }
        
           System.out.println("Você deseja continuar?(1.Sim 2.Não)");
        opcao=scanner.nextInt();
        if(opcao==1){
            acertou=false;
        }
       
        mult *=2;
        
       }
        scanner.close();
    
    }
    

}
    
    

