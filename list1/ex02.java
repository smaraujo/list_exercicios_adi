

public class AumentoSalarialInt
{


    public static void main(String[] args)
    {
        String nome;
        System.out.print("Digite seu nome: ");
        nome = EntradaTeclado.leiaString();
        
        int salarioAtual;
        System.out.print("Digite o salario atual: ");
        salarioAtual = EntradaTeclado.leiaInt();
        
        int salarioReajustado;
        if (salarioAtual <= 150)
            salarioReajustado = (int)(salarioAtual * 1.25);
        else if (salarioAtual <= 300)
            salarioReajustado = (int)(salarioAtual * 1.2);
        else if (salarioAtual <= 600)
            salarioReajustado = (int)(salarioAtual * 1.15);
        else
            salarioReajustado = (int)(salarioAtual * 1.1);
        
        System.out.println("Nome: " + nome);
        System.out.println("Salario atual: " + salarioAtual);
        System.out.println("Salario reajustado: " + salarioReajustado);
    }

}
