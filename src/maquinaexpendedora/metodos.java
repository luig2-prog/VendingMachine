/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class metodos {

    matriz ma = new matriz();

    public metodos() {
    }

    public String pedir(String pos, double cantP) {
        String me = "";
        int fila, colum;
        double cantM;
        if (pos.length() == 2) {
            fila = Integer.parseInt(String.valueOf(pos.charAt(0)));
            colum = Integer.parseInt(String.valueOf(pos.charAt(1)));
            if (fila > -1 && fila < ma.getTamFila() && colum > -1 && colum < ma.getTamColum()) {
                cantM = ma.getCantidad(fila, colum);
                if (cantP <= cantM) {
                    cantM = cantM - cantP;
                    ma.setVentasTotales(fila, colum, cantP * ma.getPrecio(fila, colum));
                    ma.setCantidad(fila, colum, cantM);
                    me = " ======= GOLOSINA VENDIDA ======== \n  Nombre: " + ma.getNombresGolosinas(fila, colum) + "\n  Precio: " + ma.getPrecio(fila, colum) + "\n  Cantidad solicitada: " + cantP + "\n  Valor a pagar: " + cantP * ma.getPrecio(fila, colum) + "\n---------------------------------------------------------";
                } else {
                    me = "La cantidad pedida supera la cantidad existente\n";
                }
            } else {
                me = "Codigo no valido: " + pos;
            }
        } else {
            me = "Codigo no valido: " + pos;
        }
        return me;
    }

    String mostrar() {
        String me = "";
        for (int i = 0; i < ma.getTamFila(); i++) {
            for (int j = 0; j < ma.getTamColum(); j++) {
                me += " Nombre: " + ma.getNombresGolosinas(i, j) + " - Precio: " + ma.getPrecio(i, j) + " - Cantidad en maquina: " + ma.getCantidad(i, j) + " - Codigo a ingresar: " + i + "" + j + "\n\n";
            }
        }
        return me;
    }

    boolean validarUsuario(String contraseña) {
        if (contraseña.equals("Maquina2020")) {
            return true;
        }
        return false;
    }

    public void rellenar(String pos, double cantN) {

        int fila, colum;
        double cantM;

        if (pos.length() == 2) {
            fila = Integer.parseInt(String.valueOf(pos.charAt(0)));
            colum = Integer.parseInt(String.valueOf(pos.charAt(1)));
            cantM = ma.getCantidad(fila, colum);

            cantM = cantM + cantN;
            ma.setCantidad(fila, colum, cantM);
        } else {
            JOptionPane.showMessageDialog(null, "Posicion invalida: " + pos);
        }
    }

    String estadisticasMaquina() {
        String me = "";
        double suma = 0;
        for (int i = 0; i < ma.getTamFila(); i++) {
            for (int j = 0; j < ma.getTamColum(); j++) {
                me += " Nombre: " + ma.getNombresGolosinas(i, j) + " --- Ventas totales: " + ma.getVentasTotales(i, j) + "\n";
                suma += ma.getVentasTotales(i, j);
            }
        }

        me += "\nTotal acomulados de todas las ventas: " + suma + "\n";
        return me;
    }

}
