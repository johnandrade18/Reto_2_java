package com.johnandrade;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Cafe cafe2[]=new Cafe[10];
        cafe2[0]=new Cafe(250.0, 50, 'D');
        cafe2[1]=new CafeNacional(180.0, 30);
        cafe2[2]=new CafeExportacion(550.0, 80, 'B', 42, false);
        cafe2[3]=new Cafe();
        cafe2[4]=new Cafe(550.0, 20, 'D');
        cafe2[5]=new CafeNacional(300.0, 40, 'c', true);
        cafe2[6]=new CafeExportacion(250.0, 70);
        cafe2[7]=new CafeNacional(400.0, 100, 'B', true);
        cafe2[8]=new CafeExportacion(250.0, 50, 'D', 30, true);
        cafe2[9]=new Cafe(50.0, 10);
        PrecioTotal solucion2 = new PrecioTotal(cafe2);
        solucion2.mostrarTotales();
    }
}
