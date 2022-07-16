/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int salir = 0;
        //for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        //  System.out.printf("%s", c.obtenerDataCiudad().get(i));
        //}
       // System.out.println("Cuantas veces desea ingresar una ciudad: ");
        //int veces = sc.nextInt();
        while (bandera) {
           // for (int i = 0; i < veces; i++) {
                Enlace c = new Enlace();
                System.out.println("Ingrese el nombre de la ciudad: ");
                String n = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese la poblacion de la ciudad: ");
                int pob = sc.nextInt();
                Ciudad ciudad = new Ciudad(n, pob);
                c.insertarCiudad(ciudad);
                for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
                    System.out.printf("%s", c.obtenerDataCiudad().get(i));
                }
            //}
            System.out.println("Ingrese 2 para salir");
            salir = sc.nextInt();
            if (salir == 2) {
                bandera = false;
            }
            sc.nextLine();
        }

    }
}
