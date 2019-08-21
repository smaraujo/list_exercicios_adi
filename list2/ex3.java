
public class Voo
{
    private int numeroVoo;
    private Data dataVoo;
    protected boolean poltronas[];
    
    public Voo(int numeroVoo, Data dataVoo)
    {
        configura(numeroVoo, dataVoo);
        poltronas = new boolean[100];
    }
    
    public void configura(int numeroVoo, Data dataVoo)
    {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
    }
    
    public int proximoLivre()
    {
        int proximo = -1;
        for (int p = 0; p < 100 && proximo == -1; p++)
            if (poltronas[p] == false)
                proximo = p + 1;
        return proximo;
    }
    
    public boolean verifica(int poltronaDesejada)
    {
        boolean resultado = true;
        if (poltronaDesejada >= 1 && poltronaDesejada <= 100)
            resultado = poltronas[poltronaDesejada - 1];
        return resultado; 
    }
    
    public boolean ocupa(int poltronaDesejada)
    {
        boolean estaOcupada = verifica(poltronaDesejada);
        if (!estaOcupada)
            poltronas[poltronaDesejada - 1] = true;
        return !estaOcupada;
    }
    
    public int vagas()
    {
        int livres = 0;
        for (int p = 0; p <= 99; p++)
            if (!poltronas[p])
                livres++;
        
        return livres;
    }
    
    public int getNumeroVoo()
    {
        return numeroVoo;
    }
    
    public Data getDataVoo()
    {
        return dataVoo;
    }
}
