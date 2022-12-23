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
public class MaquinaExpendedora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos me = new metodos();
        int opcion;
        String pos;
        double cant;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    pos = JOptionPane.showInputDialog(null, "Ingrese el codigo: ");
                    if (Integer.parseInt(pos) > -1) {
                        cant = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a pedir: "));                     
                        JOptionPane.showMessageDialog(null, me.pedir(String.valueOf(pos), cant));
                    }else{
                        JOptionPane.showMessageDialog(null,"Codigo no valido");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, " ================================ DATOS DE LA MAQUINA ================================ \n " + me.mostrar()+"-----------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    String contraseña = JOptionPane.showInputDialog(null, "Ingrese la contraseña");

                    if (me.validarUsuario(contraseña)) {
                        pos = JOptionPane.showInputDialog(null, "Ingrese el codigo: ");
                        if (Integer.parseInt(pos) > -1) {
                        cant = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad: "));                     
                            me.rellenar(pos + "", cant);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, " ========= ESTADISTICAS DE LA MAQUINA ========= \n"+me.estadisticasMaquina()+"------------------------------------------------------------------------------");
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        } while (opcion != 5);
    }

    static int menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " ================ Menú ================ \n 1. Pedir golosina\n 2. Mostrar golosina\n 3. Rellenar golosina\n 4. Estadisticas de la maquina\n 5. Salir\n------------------------------------------------------------------\nSeleccione una opción del 1 al 5"));
        while (opcion < 0 && opcion > 6) {
            JOptionPane.showMessageDialog(null, "No seleccionó una opción valida");
         opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " ================ Menú ================ \n 1. Pedir golosina\n 2. Mostrar golosina\n 3. Rellenar golosina\n 4. Estadisticas de la maquina\n 5. Salir\n------------------------------------------------------------------\nSeleccione una opción del 1 al 5"));
        }
        return opcion;
    }
}
