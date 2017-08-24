
public class Reloj
{
    private int horas, minutos;
    public Reloj(int h, int m)
    {
        horas = h;
        minutos= m;
    }

    public void tictac()
    {
        if(minutos<60)
        {
            minutos+=1;
        }
        if(minutos==60)
        {
            if(horas<24)
            {
                horas+=1;
            }
            if(horas==24)
            {
                horas=0;
            }
            minutos=0;
        }
    }
    public void mostrarhora()
    {
        
    }
}
