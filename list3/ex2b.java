
public class EquipamentoCorrigido extends Equipamento
{
    private int mesCompra[];
    private int mesAtual;
    
    public EquipamentoCorrigido(int numeroEquipamentos)
    {
        super(numeroEquipamentos);
        mesCompra = new int[numeroEquipamentos];
        mesAtual = 1;
    }
    
    public int getMesCompra(int numeroEquipamento)
    {
        return mesCompra[numeroEquipamento];
    }
    
    public void setMesCompra(int numeroEquipamento, int mes)
    {
        mesCompra[numeroEquipamento] = mes;
    }
    
    public void corrige(float percentualCorrecao)
    {
        float corrige = 1 + (percentualCorrecao / 100);
        
        for (int e = 0; e < getNumeroEquipamentos(); e++)
            if (mesCompra[e] == mesAtual)
                setValor(e, getValor(e) * corrige);
        
        mesAtual = (mesAtual % 12) + 1;
    }
    
    public void substitui(EquipamentoCorrigido outro)
    {
        if (getNumeroEquipamentos() == outro.getNumeroEquipamentos())
        {
            for (int m = 0; m < mesCompra.length; m++) {
                setValor(m, outro.getValor(m));
                mesCompra[m] = outro.mesCompra[m];
            }
        }
    }
}






