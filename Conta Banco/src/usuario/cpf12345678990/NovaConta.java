package usuario.cpf12345678990;

import java.util.Locale;
import java.util.Scanner;

public class NovaConta {
    public void Usuario() {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
            
        System.out.println("Digite seu nome:");
            String nomeDoCliente = Scanner.next();

        System.out.println("Faca um deposito de no minimo R$20 para abertura da conta.");
        double depositoParaAbertura = Scanner.nextDouble();

        if(depositoParaAbertura >= 20){
          
             System.out.println("Digite o numero da conta");
                 int numeroDaConta = Scanner.nextInt(); 
                     
              System.out.println("Digite a agencia:");
                 String agencia = Scanner.next();
             
 
         double saldo = depositoParaAbertura;
 
         System.out.print("Ola " + nomeDoCliente +", obrigado por criar uma conta em nosso banco, sua agencia e: " + agencia + ", conta: " + numeroDaConta + ", e o seu saldo de R$" + saldo + " ja esta disponivel para retirada.");
            
            }else{
                System.out.println("Deposito minimo invalido, insira um valor minimo de R$20 reais.");
                
            
    }
}
}
    

