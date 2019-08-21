
public class NFUNCIONARIOS
{
    public static final int NFUNCIONARIOS = 5;

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        float salario[] = new float[NFUNCIONARIOS], soma = 0;
        
        for (int f = 0; f < NFUNCIONARIOS; f++) {
            System.out.print("Digite um salario: ");
            salario[f] = Float.parseFloat(teclado.nextLine());
            
            
            soma += salario[f];
        }
        
        float media = soma / NFUNCIONARIOS;
        System.out.println("Media: " + media);
        
        for (int f = 0; f < NFUNCIONARIOS; f++)
            if (salario[f] > media)
                System.out.println(salario[f] + " maior que a media");
    }

}
