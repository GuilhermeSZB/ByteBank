import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);

    String usuario;
    int senha;

    public Conta(String usuario, int senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public void entradaUserSenha(){
        System.out.print("Qual é seu usuario: ");
        this.usuario = sc.next();

        System.out.print("Qual é sua senha (Apenas numeros, Senha Com 6 Numeros): ");
        this.senha = sc.nextInt();
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta(null, 0);
        conta1.entradaUserSenha();

    
    }
}
