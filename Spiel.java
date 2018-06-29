

public class Spiel
{
    
    private String ort;
    private int datum;
 

    
    public Spiel(String ort,int datum)
    {
        this.ort=ort;
        this.datum=datum;
    }

    
    public int gibDatum()
    {
        return datum;
    }
    public String gibOrt()
    {
        return ort;
    }
}
