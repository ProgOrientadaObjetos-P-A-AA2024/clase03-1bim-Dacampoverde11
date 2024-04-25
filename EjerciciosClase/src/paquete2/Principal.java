/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        String nombreInst= "San Francisco de Asis", tipoInst= "Fiscomicional";
        int numeroSedes = 1, numeroDocentes = 53, numeroAlumnos = 4865;
        
        i1.establecerNombre(nombreInst);
        i1.establecerTipoInst(tipoInst);
        i1.establecerNumeroSedes(numeroSedes);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        
        
        System.out.printf("Institucion educativa: %s\nTipo de Institucion "
                + "educativa: %s \nNumero de alumnos: %d\nNumero Docentes: %d\n"
                + "Numero de sedes: %d", i1.obtenerNombre(), i1.obtenerTipoInst(),
                i1.obtenerNumeroAlumnos(), i1.obtenerNumeroDocentes(), 
                i1.obtenerNumeroSedes());
    }
}
