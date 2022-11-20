package javaapplication13;
import java.util.Scanner;

public class JavaApplication13 {
static int soma (int a, int b){
int resultado;
resultado = a+b;
return resultado;  
} 

static int produto (int a, int b){
int resultado;
resultado = a*b;
return resultado;
}

static int divisao (int a, int b){
int resultado;
resultado = a/b;
return resultado;
}

static int subtracao (int a, int b){
int resultado;
resultado = a-b;
return resultado;
}

static void menu (){
System.out.println("Olá, meu nome é Samuel e estou apresentando o Programa de calculadora, digite: 1 - soma, 2 - produto, 3 - divisão, 4 - subtração, -1 - sair");
Scanner sc = new Scanner(System.in);
int operacao = sc.nextInt();
    System.out.println("Digite o primeiro número");
int a = sc.nextInt();
    System.out.println("Digite o segundo número");
int b = sc.nextInt();

switch (operacao){
        case 1:
        System.out.println(soma(a,b)); 
    break;          
        case 2: 
        System.out.println(produto(a,b)); 
    break;
        case 3: 
        System.out.println(divisao(a,b)); 
    break;
        case 4: 
        System.out.println(subtracao(a,b)); 
    break;

}
}
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        menu();
        
    }
}
