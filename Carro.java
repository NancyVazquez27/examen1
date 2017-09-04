public class Carro
{
    private String placas;
    private int horas;
    private int minutos;

    public Carro(int horasE,int minutosE, String placasA)
    {
        placas=placasA;
        horas=horasE;
        minutos=minutosE;
    }
    
    public String dimePlacas()
    {
        return(placas);
    }
    
    public int dimeHoras()
    {
        return(horas);
    }
    
    public int dimeMinutos()
    {
        return(minutos);
    }
}
        