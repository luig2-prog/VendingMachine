/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

/**
 *
 * @author PC
 */
public class matriz {

    private String[][] nombresGolosinas = {
        {"Kitkat", "Chicles de fresa", "Lacasitos", "Palotes"},
        {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
        {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
        {"Lacasitos", "Crunch", "Milkybar", "KitKat"}};

    private double[][] precio = {
        {1000, 200, 500, 950},
        {1800, 100, 120, 100},
        {1750, 130, 120, 800},
        {1500, 110, 720, 350}};

    private double[][] cantidad = {
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5}
    };

    private int tamFila = 4;
    private int tamColum = 4;

    private double[][] ventasTotales = new double[tamFila][tamColum];

    public matriz() {

    }

    public String getNombresGolosinas(int f, int c) {
        return nombresGolosinas[f][c];
    }

    public void setNombresGolosinas(int f, int c, String dato) {
        this.nombresGolosinas[f][c] = dato;
    }

    public double getPrecio(int f, int c) {
        return precio[f][c];
    }

    public void setPrecio(int f, int c, double dato) {
        this.precio[f][c] = dato;
    }

    public double getCantidad(int f, int c) {
        return cantidad[f][c];
    }
    
    public void setVentasTotales(int f, int c, double dato) {
        this.ventasTotales[f][c] = dato;
    }

    public double getVentasTotales(int f, int c) {
        return ventasTotales[f][c];
    }
    
    public void setCantidad(int f, int c, double dato) {
        this.cantidad[f][c] = dato;
    }

    public int getTamFila() {
        return tamFila;
    }

    public void setTamFila(int tamFila) {
        this.tamFila = tamFila;
    }

    public int getTamColum() {
        return tamColum;
    }

    public void setTamColum(int tamColum) {
        this.tamColum = tamColum;
    }

}
