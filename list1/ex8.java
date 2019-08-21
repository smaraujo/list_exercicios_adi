
public class NumeroPrimo1
{

    public static void main(String[] args)
    {
        System.out.print("Digite um numero: ");
        int numero = EntradaTeclado.leiaInt();

        boolean ehPrimo = true;
        for (int n = 2; n < numero; n++)
            if (numero % n == 0)
                ehPrimo = false;
        
        if (ehPrimo)
            System.out.println("Eh um numero primo.");
        else
            System.out.println("Nao eh um numero primo.");
    }

}
