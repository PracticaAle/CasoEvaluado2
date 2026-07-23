/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class CasoEvaluado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Pedir al usuario cantidad de productos
        int op = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos desea registrar: "));
        
        //Matriz que almacena en los 7 dias de la semana la cantidad de prodcutos como filas
        int[][] ventas = new int[7][op];
        
        //vector para almacenar nombres de productos
        String productos[] = new String[op];
        
        //Recorra el vector y cada posicion dele nombre
        for (int i = 0; i < op; i++) {
            productos[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + i);
        }
        
        // Registrar las ventas de cada producto
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < op; j++) {
                ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                                "Ingrese las ventas del día " +i
                                + "\nProducto: " + productos[j]));

            }

        }
        //Llamar a los dos metodos creados
        Ventas.totalVentasProducto(ventas, productos);
        Ventas.diaMayorVentas(ventas);
    }
}
