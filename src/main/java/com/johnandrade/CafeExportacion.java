package com.johnandrade;

public class CafeExportacion extends Cafe {

  // Constantes y Atributos
  private Integer CIF_BASE = 20;
  private Integer cif;
  private boolean verde;

  // Constructor
  public CafeExportacion() {
    this.peso = this.PESO_BASE;
    this.calidadC = this.CALIDAD_C_BASE;
    this.precioBase = this.PRECIO_BASE;
    this.cif = this.CIF_BASE;
    this.verde = false;
    this.tipoCafe = "exportacion";
  }

  public CafeExportacion(Double precioBase, Integer peso) {
    this.peso = peso;
    this.calidadC = this.CALIDAD_C_BASE;
    this.precioBase = precioBase;
    this.cif = this.CIF_BASE;
    this.verde = false;
    this.tipoCafe = "exportacion";
  }

  public CafeExportacion(
    Double precioBase,
    Integer peso,
    char calidadC,
    Integer cif,
    boolean verde
  ) {
    this.peso = peso;
    this.calidadC = calidadC;
    this.precioBase = precioBase;
    this.cif = cif;
    this.verde = verde;
    this.tipoCafe = "exportacion";
  }

  // Métodos
  // la aplicación utiliza SUPER para referirse a una variable local en un método y a una variable de la superclase que tiene el mismo nombre. El programa también utiliza super para invocar al constructor de la superclase desde en constructor de la subclase
  public Double calcularPrecio() {
    Double adicion = 0.0;
    adicion = super.calcularPrecio();
    if (this.verde == true) {
      adicion += 50;
    }
    if (this.cif > 40) {
      adicion += this.precioBase * 0.3;
    }
    return adicion;
  }
}
