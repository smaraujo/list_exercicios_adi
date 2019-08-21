
public class Equipamento
{
    private float valor[];
    
    public Equipamento(int numeroEquipamento)
    {
        valor = new float[numeroEquipamento];
    }
    
    public int getNumeroEquipamentos()
    {
        return valor.length;
    }
    
    public float getValor(int numeroEquipamento)
    {
        return valor[numeroEquipamento];
    }
    
    public void setValor(int numeroEquipamento, float valorEquipamento)
    {
        valor[numeroEquipamento] = valorEquipamento;
    }
}
