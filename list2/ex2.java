
public class Data
{
    private int dia = 1,
                mes = 1,
                ano = 1901;
    
    public Data(int dia, int mes, int ano)
    {
        define(dia, mes, ano);
    }
    
    public void define(int dia, int mes, int ano)
    {
        if (ano >= 1 && mes >= 1 && mes <= 12)
        {
            int diasMes = 31;
            if (mes == 2) {
                if (ano % 4 == 0)
                    diasMes = 29;
                else
                    diasMes = 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                diasMes = 30;
            
            if (dia >= 1 && dia <= diasMes) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        }
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public String mesExtenso()
    {
        String extenso[] = {"Janeiro", "Fevereiro", "Marco",
                            "Abril", "Maio", "Junho", "Julho",
                            "Agosto", "Setembro", "Outubro",
                            "Novembro", "Dezembro"};
        return extenso[mes-1];
    }
    
    public boolean bissexto()
    {
        return (ano % 4 == 0);
    }
    
    public int compara(Data outra)
    {
        int resultado = 1;
        if (this.ano < outra.ano)
            resultado = -1;
        else if (this.ano == outra.ano) {
            if (this.mes < outra.mes)
                resultado = -1;
            else if (this.mes == outra.mes) {
                if (this.dia < outra.dia)
                    resultado = -1;
                else if (this.dia == outra.dia)
                    resultado = 0;
            }
        }
        return resultado;
    }
}
