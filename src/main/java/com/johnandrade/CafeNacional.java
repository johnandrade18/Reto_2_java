package com.johnandrade;

public class CafeNacional extends Cafe {

  // Constantes y Atributos
  private boolean TOSTADO = false;
  private boolean tostado;

  // Constructor
  public CafeNacional() {
    this.peso = this.PESO_BASE;
    this.calidadC = this.CALIDAD_C_BASE;
    this.precioBase = this.PRECIO_BASE;
    this.tostado = this.TOSTADO;
    this.tipoCafe = "nacional";
  }

  public CafeNacional(Double precioBase, Integer peso) {
    this.peso = peso;
    this.calidadC = this.CALIDAD_C_BASE;
    this.precioBase = precioBase;
    this.tostado = this.TOSTADO;
    this.tipoCafe = "nacional";
  }

  public CafeNacional(
    Double precioBase,
    Integer peso,
    char calidadC,
    boolean tostado
  ) {
    this.peso = peso;
    this.calidadC = calidadC;
    this.precioBase = precioBase;
    this.tostado = tostado;
    this.tipoCafe = "nacional";
  }

  // Métodos
   // la aplicación utiliza SUPER para referirse a una variable local en un método y a una variable de la superclase que tiene el mismo nombre. El programa también utiliza super para invocar al constructor de la superclase desde en constructor de la subclase
  public Double calcularPrecio() {
    Double adicion = 0.0;
    adicion = super.calcularPrecio();
    if (this.tostado == true) {
      adicion += 50;
    }
    return adicion;
  }
}
