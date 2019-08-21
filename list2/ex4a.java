
public class Prova
{
    public static final int NUMERO_QUESTOES = 15;
    
    // adaptacao para a segunda questao
    private char respostasCorretas[];
    
    // adaptacao para a segunda questao
    public char[] getRespostasCorretas()
    {
        return respostasCorretas;
    }
    
    // adaptacao para a segunda questao
    public void setRespostasCorretas(char respostasCorretas[])
    {
        this.respostasCorretas = respostasCorretas;
    }
    
    public char respostaQuestao(int numeroQuestao)
    {
        char resposta = '-';
        if (numeroQuestao >= 1 && numeroQuestao <= NUMERO_QUESTOES)
            resposta = respostasCorretas[numeroQuestao - 1];
        
        return resposta;
    }
}
