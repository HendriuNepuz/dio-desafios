// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner (System.in): cria um leitor de Entradas, com métodos úteis com o prefico "next"
// - System.out.println: imprime um texto de Saída (Output) pulando uma linha

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //lê os valores de entrada
        Scanner leitorDeEntrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário do funcionário: ");
        float valorSalario = leitorDeEntrada.nextFloat();
        System.out.println("Quanto o funcionário recebe de benefícios: ");
        float valorBeneficios = leitorDeEntrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //atribui a aliquota de 5% mediante salario
            valorImposto = 0.05F * valorSalario;           
        }
        else if (valorSalario <= 2500) {
            //atribui a aliquota de 10% mediante salario
            valorImposto = 0.10F * valorSalario;            
        }
        else {
            //atribui a aliquota de 15% mediante salario
            valorImposto = 0.15F * valorSalario;
        }

        //Calcula e imprime a saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        leitorDeEntrada.close();
    
    }
}
