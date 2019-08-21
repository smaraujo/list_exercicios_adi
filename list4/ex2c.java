
public class Utilitarios
{
    public void copia(Repositorio a, Repositorio b)
    {
        Pessoa p = a.primeiro();
        
        while (p != null) {
            b.guarda(p);
            p = a.proximo();
        }
    }
    
    public void diferenca(Repositorio a, Repositorio b,
                          Repositorio c)
    {
        Pessoa p = a.primeiro();
        
        while (p != null) {
            if (b.recupera(p.getCPF()) == null)
                c.guarda(p);
            
            p = a.proximo();
        }
    }
}
