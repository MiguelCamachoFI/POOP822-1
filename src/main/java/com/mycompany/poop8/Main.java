/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop8;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("###Objetos se comportan como superclases###");
        PoligonoC poligonoC = new PoligonoC();
        //Polígono puede comportase como su superclase Object
        Object objeto = poligonoC; //objeto = perroK;
        System.out.println(poligonoC);
        System.out.println(objeto);
        poligonoC = (PoligonoC) objeto; //Se requiere hacer un casteo
        System.out.println(poligonoC);
        
        float flotante;
        double doble = 1.6666666666666666666666666;
        flotante = (float) doble;
        
        poligonoC = new TrianguloC();
        System.out.println(poligonoC);
        poligonoC = new CuadrilateroC();
        System.out.println(poligonoC.toString());
        
        PoligonoC poli = new CuadrilateroC();
        System.out.println(poli.toString());
        //poli.setBase(5.5f);   //El método no está definido en el PolígonoC,
                                //por lo tanto no puede sobreescribirlo
        
        System.out.println("###Clases abstractas###");
        
        //PoligonoA polA = new PoligonoA(); -> No se puede crear objetos de clases abstractas
        PoligonoA polA = new TrianguloA();
        System.out.println(polA);
        polA = new CuadrilateroA();
        System.out.println(polA);
        
        System.out.println("###Interfaces###");
        
        //Podemos crear una referencia a interfaz
        InstrumentoMusical instrumento;
        //Pero no podemos implementarla
        //InstrumentoMusical instru = new InstrumentoMusical();
        
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
        
        System.out.println("... Actividad extra ...");
        System.out.println("El mes " + Meses.DOS + " corresponde a: ");
        System.out.println(Meses.NOMBRES_MESES[Meses.DOS]);

        Scanner op = new Scanner(System.in);

        int mes;
        do {
            System.out.println("\nIngrese un número de mes para ver a cual corresponde. \nPuede ingresar '0' para salir");
            mes = op.nextInt();
            System.out.println("");

            switch (mes) {
                case 0:
                    System.out.println("Se eligió salir, ayooos");
                    break;
                case 1:
                    System.out.println("El mes " + Meses.UNO + " corresponde a: " + Meses.NOMBRES_MESES[Meses.UNO]);
                    break;
                case 2:
                    System.out.println("El mes " + Meses.DOS + " corresponde a: " + Meses.NOMBRES_MESES[Meses.DOS]);
                    break;
                case 3:
                    System.out.println("El mes " + Meses.TRES + " corresponde a: " + Meses.NOMBRES_MESES[Meses.TRES]);
                    break;
                case 4:
                    System.out.println("El mes " + Meses.CUATRO + " corresponde a: " + Meses.NOMBRES_MESES[Meses.CUATRO]);
                    break;
                case 5:
                    System.out.println("El mes " + Meses.CINCO + " corresponde a: " + Meses.NOMBRES_MESES[Meses.CINCO]);
                    break;
                case 6:
                    System.out.println("El mes " + Meses.SEIS + " corresponde a: " + Meses.NOMBRES_MESES[Meses.SEIS]);
                    break;
                case 7:
                    System.out.println("El mes " + Meses.SIETE + " corresponde a: " + Meses.NOMBRES_MESES[Meses.SIETE]);
                    break;
                case 8:
                    System.out.println("El mes " + Meses.OCHO + " corresponde a: " + Meses.NOMBRES_MESES[Meses.OCHO]);
                    break;
                case 9:
                    System.out.println("El mes " + Meses.NUEVE + " corresponde a: " + Meses.NOMBRES_MESES[Meses.NUEVE]);
                    break;
                case 10:
                    System.out.println("El mes " + Meses.DIEZ + " corresponde a: " + Meses.NOMBRES_MESES[Meses.DIEZ]);
                    break;
                case 11:
                    System.out.println("El mes " + Meses.ONCE + " corresponde a: " + Meses.NOMBRES_MESES[Meses.ONCE]);
                    break;
                case 12:
                    System.out.println("El mes " + Meses.DOCE + " corresponde a: " + Meses.NOMBRES_MESES[Meses.DOCE]);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (mes != 0);
    }
}
