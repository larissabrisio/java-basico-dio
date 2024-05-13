import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);


    System.out.println("Por favor, digite seu nome e aperte enter: ");
    String nome = sc.nextLine();
 

    System.out.println("Digite sua agência com o dígito (sem traços) e aperte enter: ");
    String agencia = sc.next();


    System.out.println("Digite o número da sua conta (sem traços) e aperte enter: ");
    int numero = sc.nextInt();


    double saldo = 1500.27; 
    


    System.out.println("Olá, " + nome + "! Obrigada por criar sua conta no nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque.");
    
    sc.close();
    }
}
