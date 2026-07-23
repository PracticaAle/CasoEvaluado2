/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ventas { 
    
    
    
    
    public static void totalVentasProducto(int[][] ventas, String[] productos) {
        //sume las columnas de cantidades de venta de cada producto
        for (int i=0; i< productos.length; i++) {
            int suma = 0;
            for (int j = 0; j < 7; j++) {
                suma+=ventas[j][i];
            }
            JOptionPane.showMessageDialog(null, "Cantidad de ventas de "+productos[i]+": "+suma);
           
        }

    }
    
    public static void diaMayorVentas(int[][] ventas) {
    //valores iniciales
    int mayorVenta=0;
    int mayorDia=0;

    
    for (int i = 0; i < 7; i++){
        int suma=0;
        for (int j = 0; j < ventas[i].length; j++) {
            suma+=ventas[i][j];
        }

        if (suma>mayorVenta) {
            mayorVenta=suma;
            mayorDia=i;
        }
    }
    JOptionPane.showMessageDialog(null,
            "El día con mayores ventas fue el día "
            + mayorDia 
            + " con un total de "
            + mayorVenta + " ventas.");
    }
}
