
public class ProvaAluno extends Prova
{
    private char respostas[];
    private int ultimaResposta;
    
    public ProvaAluno()
    {
        respostas = new char[NUMERO_QUESTOES];
        ultimaResposta = 0;
    }
    
    public void respostaAluno(char umaResposta)
    {
        if (ultimaResposta < NUMERO_QUESTOES)
        {
            respostas[ultimaResposta] = umaResposta;
            ultimaResposta++;
        }
    }
    
    public int acertos()
    {
        int qAcertos = 0;
        
        for (int q = 0; q < ultimaResposta; q++)
            if (respostas[q] == respostaQuestao(q + 1))
                qAcertos++;
        
        return qAcertos;
    }
    
    public double nota()
    {
        double aNota = 0;

        for (int q = 0; q < ultimaResposta; q++)
            if (respostas[q] == respostaQuestao(q + 1))
            {
                if (q < (NUMERO_QUESTOES * 2) / 3)
                    aNota += .5;
                else
                    aNota++;
            }
        
        return aNota;
    }
    
    public double maior(ProvaAluno outro)
    {
        double notaMaior;
        
        int acertosMeus = acertos(),
            acertosOutro = outro.acertos();
        
        double notaMinha = nota(),
               notaOutro = outro.nota();
        
        if (acertosMeus > acertosOutro)
            notaMaior = notaMinha;
        else if (acertosMeus < acertosOutro)
            notaMaior = notaOutro;
        else {
            if (notaMinha >= notaOutro)
                notaMaior = notaMinha;
            else
                notaMaior = notaOutro;
        }
        
        return notaMaior;
    }
}
