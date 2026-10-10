import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);

    String usuario;
    int senha;
    float saldo;

    public Conta(String usuario, int senha, float saldo){
        this.usuario = usuario;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void entradaUserSenha(){
        System.out.print("Qual é seu usuario: ");
        this.usuario = sc.next();

        System.out.print("Qual é sua senha (Apenas numeros, Senha Com 6 Numeros): ");
        this.senha = sc.nextInt();

        System.out.print("Quantos de saldo tem na conta: ");
        this.saldo = sc.nextFloat();

    }

    public static void main(String[] args) {
        Conta conta1 = new Conta(null, 0, 0);
        conta1.entradaUserSenha();

    
    }
}
