/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int salir = 0;
        while (bandera) {
            Enlace c = new Enlace();
            System.out.println("Ingrese la placa: ");
            String placa = sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese el valor de la matricula: ");
            double valorM = sc.nextDouble();
            Auto a = new Auto(placa,valorM);
            a.establecerPlaca(placa);
            a.establecerValorMatricula(valorM);

            c.insertarAuto(a);

            //for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
              //  System.out.printf("%s\n", c.obtenerDataAuto().get(i));
            //}
            System.out.println("Para salir pulse el numero 2 ");
            salir = sc.nextInt();
            if (salir == 2) {
                bandera = false;
            }
            sc.nextLine();
        }

    }
}
