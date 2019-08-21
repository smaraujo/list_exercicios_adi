public class Main
{
   public static void main(String[] args)
   {
       String palavra;
       String inverso;
       Scanner leitor = new Scanner(System.in);

       do
       {
           System.out.print("Digite uma palavra: ");
           palavra = leitor.next();
       } while( palavra.length() != 5 );

       inverso = new StringBuilder(palavra).reverse().toString();

       if( palavra.equals(inverso) )
           System.out.println("É um palindromo.");
       else
           System.out.println("Não é um palindromo.");
   }
}