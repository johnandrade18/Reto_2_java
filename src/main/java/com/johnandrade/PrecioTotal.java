package com.johnandrade;

public class PrecioTotal {
    // Atributos
    private Double totalCafe;
    private Double totalCafeNacional;
    private Double totalCafeExportacion;

    // Constructor
    PrecioTotal(Cafe[] cafes) {
        for (int i = 0; i < cafes.length; i++) {
            totalCafe += cafes[i].calcularPrecio();
            if (cafes[i].tipoCafe.equals("nacional")) {
                totalCafeNacional += cafes[i].calcularPrecio();
            } else if (cafes[i].tipoCafe.equals("exportacion")) {
                totalCafeExportacion += cafes[i].calcularPrecio();
            }
        }
    }

    public void mostrarTotales() {
        // Mostramos los resultados
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
}
