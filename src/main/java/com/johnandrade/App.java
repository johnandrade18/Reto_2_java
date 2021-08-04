package com.johnandrade;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Cafe cafe[]=new Cafe[10];
        cafe[0]=new Cafe(250.0, 50, 'D');
        cafe[1]=new CafeNacional(180.0, 30);
        cafe[2]=new CafeExportacion(550.0, 80, 'B', 42, false);
        cafe[3]=new Cafe();
        cafe[4]=new Cafe(550.0, 20, 'D');
        cafe[5]=new CafeNacional(300.0, 40, 'c', true);
        cafe[6]=new CafeExportacion(250.0, 70);
        cafe[7]=new CafeNacional(400.0, 100, 'B', true);
        cafe[8]=new CafeExportacion(250.0, 50, 'D', 30, true);
        cafe[9]=new Cafe(50.0, 10);
        PrecioTotal solucion = new PrecioTotal(cafe);
        solucion.mostrarTotales();
    }
}
