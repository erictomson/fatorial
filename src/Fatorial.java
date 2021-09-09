import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        // Faça um programa que LEIA um valor N inteiro e positivo, calcule e mostre o valor de E

        // Número a ser lido
        // Observar limitação do tipo de dado int. Ler até 20
        int N=0;
        // Acumulador
        int E=0;
        // Número a ser fatorado
        int fatorial=1;

        // Solicitar o número que será o limite
        System.out.println("Digite um número inteiro e positivo: ");
        // Configurando Scanner para leitura do teclado
        Scanner ler = new Scanner(System.in);
        // Lendo N
        N=ler.nextInt();

        // Calcular e acumular o fatorial de todos os inteiros positivos
        // de 1 até N, somando-os com 1
        for(int i=1;i<=N;i++) {
            //Calcular o fatorial atual
            fatorial *= i;
            // Acumular o fatorial calculado somando 1, conforme fórmula
            E = E + 1 + fatorial;
        }
        System.out.println("Resultado de E: " + E);
    }
}
