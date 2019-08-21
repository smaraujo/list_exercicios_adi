
public class Aluno
{
    private String matricula,
                   nome;
    private int prova1,
                prova2,
                trabalho;
    
    public Aluno(String matricula, String nome,
                 int prova1, int prova2, int trabalho)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }
    
    public double media()
    {
        return (prova1 * 2.5 + prova2 * 2.5 + trabalho * 2) / 7;
    }
    
    public int calculaFinal()
    {
        double totalPontos = prova1 * 2.5 + prova2 * 2.5 + trabalho * 2;
        int aFinal = 0;
        
        if (totalPontos >= 28 && totalPontos < 49)
            aFinal = (int)Math.round((50 - totalPontos) / 3);
        
        return aFinal;
    }
}
