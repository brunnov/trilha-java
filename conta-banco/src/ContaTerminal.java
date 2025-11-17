import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência:");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da conta:"); 
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente:"); 
        String nomeCliente = scanner.next();    
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }   
}
