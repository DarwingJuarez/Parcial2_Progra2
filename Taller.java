/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2;

import javax.swing.JOptionPane;

/**
 *
 * @author juare
 */
public class Taller{
   
  public static void main(String[] args) {
        
        Vehiculo carro1 = new Vehiculo();
        Vehiculo carro2 = new Vehiculo();
        Vehiculo carro3 = new Vehiculo();
        Vehiculo carro4 = new Vehiculo();
        Vehiculo carro5 = new Vehiculo();
        
        String col;
        int opcion = 1;
        int cant = 0;
        int canti = 0;
        
               
                carro1.setPropietario("Juan Perez");
                carro1.setMarca("Toyota");
                carro1.setColor("Negro");
                carro1.setMatricula("P216FMV");
                carro1.setModelo("GR Yaris");
                carro1.setProblema("Cambio de llantas de enfrente");
                
                carro2.setPropietario("Pedro Gonzalez");
                carro2.setMarca("Ford");
                carro2.setColor("Beige");
                carro2.setMatricula("F220GHM");
                carro2.setModelo("Explorer 4x4");
                carro2.setProblema("Luces no encienden");
                
                carro3.setPropietario("Daniela Mejía");
                carro3.setMarca("Honda");
                carro3.setColor("Rojo");
                carro3.setMatricula("T215FGT");
                carro3.setModelo("Civic 2022");
                carro3.setProblema("Frenos inservibles");
                
                carro4.setPropietario("Paola Orozco");
                carro4.setMarca("Toyota");
                carro4.setColor("Blanco");
                carro4.setMatricula("M222PGS");
                carro4.setModelo("Etios Aibo");
                carro4.setProblema("Chasis en mal estado");
                
                carro5.setPropietario("Joan Bolaños");
                carro5.setMarca("Toyota");
                carro5.setColor("Gris");
                carro5.setMatricula("T008GTS");
                carro5.setModelo("Corolla-Hybrid");
                carro5.setProblema("Choque laterales");
        
        opcion = opcion;
        while(opcion != 0){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              *******TALLER 8VZ*******
                                                              1:Vehiculos en Existencia
                                                              2:Entregar auto
                                                              3:Cambiar color
                                                              0:Cerrar
                                                              """));
        
        switch(opcion){
            case 1: 
                      
                JOptionPane.showMessageDialog(null,"*********TALLER 8VZ*********\n"+"Vehiculos en Existencia:\n"+carro1.getPropietario()+"\n"+carro1.getModelo()
                        +"\n"+carro1.getMarca()+"\n"+carro1.getColor()+"\n"+carro1.getMatricula()+"\n"+carro1.getProblema()+"\n"+"-----------------------------------------\n"+
                        carro2.getPropietario()+"\n"+carro2.getModelo()+"\n"+carro2.getMarca()+"\n"+carro2.getColor()+"\n"+carro2.getMatricula()+"\n"+carro2.getProblema()+"\n"+"-----------------------------------------\n"+
                        carro3.getPropietario()+"\n"+carro3.getModelo()+"\n"+carro3.getMarca()+"\n"+carro3.getColor()+"\n"+carro3.getMatricula()+"\n"+carro3.getProblema()+"\n"+"-----------------------------------------\n"+
                        carro4.getPropietario()+"\n"+carro4.getModelo()+"\n"+carro4.getMarca()+"\n"+carro4.getColor()+"\n"+carro4.getMatricula()+"\n"+carro4.getProblema()+"\n"+"-----------------------------------------\n"+
                        carro5.getPropietario()+"\n"+carro5.getModelo()+"\n"+carro5.getMarca()+"\n"+carro5.getColor()+"\n"+carro5.getMatricula()+"\n"+carro5.getProblema()+"\n"+"-----------------------------------------\n");
            break;
            
            case 2:
                cant = Integer.parseInt(JOptionPane.showInputDialog("Que auto se va entregar?"));
                if (cant == 1){
                  JOptionPane.showMessageDialog(null,"Se entrego el auto:\n"+carro1.getPropietario()+"\n"+carro1.getModelo()
                        +"\n"+carro1.getMarca()+"\n"+carro1.getColor()+"\n"+carro1.getMatricula()+"\n"+carro1.getProblema());
                  carro1.setPropietario(" ");
                  carro1.setModelo(" ");
                  carro1.setMarca(" ");
                  carro1.setColor(" ");
                  carro1.setMatricula(" ");
                  carro1.setProblema(" ");
                } else if (cant == 2){
                    JOptionPane.showMessageDialog(null,"Se entrego el auto:\n"+carro2.getPropietario()+"\n"+carro2.getModelo()
                        +"\n"+carro2.getMarca()+"\n"+carro2.getColor()+"\n"+carro2.getMatricula()+"\n"+carro2.getProblema());
                  carro2.setPropietario(" ");
                  carro2.setModelo(" ");
                  carro2.setMarca(" ");
                  carro2.setColor(" ");
                  carro2.setMatricula(" ");
                  carro2.setProblema(" ");
                } else if (cant == 3){
                    JOptionPane.showMessageDialog(null,"Se entrego el auto:\n"+carro3.getPropietario()+"\n"+carro3.getModelo()
                        +"\n"+carro3.getMarca()+"\n"+carro3.getColor()+"\n"+carro3.getMatricula()+"\n"+carro3.getProblema());
                  carro3.setPropietario(" ");
                  carro3.setModelo(" ");
                  carro3.setMarca(" ");
                  carro3.setColor(" ");
                  carro3.setMatricula(" ");
                  carro3.setProblema(" ");
                } else if (cant == 4){
                    JOptionPane.showMessageDialog(null,"Se entrego el auto:\n"+carro4.getPropietario()+"\n"+carro4.getModelo()
                        +"\n"+carro4.getMarca()+"\n"+carro4.getColor()+"\n"+carro4.getMatricula()+"\n"+carro4.getProblema());
                  carro4.setPropietario(" ");
                  carro4.setModelo(" ");
                  carro4.setMarca(" ");
                  carro4.setColor(" ");
                  carro4.setMatricula(" ");
                  carro4.setProblema(" ");
                }
                else if (cant == 5){
                    JOptionPane.showMessageDialog(null,"Se entrego el auto:\n"+carro5.getPropietario()+"\n"+carro5.getModelo()
                        +"\n"+carro5.getMarca()+"\n"+carro5.getColor()+"\n"+carro5.getMatricula()+"\n"+carro5.getProblema());
                  carro5.setPropietario(" ");
                  carro5.setModelo(" ");
                  carro5.setMarca(" ");
                  carro5.setColor(" ");
                  carro5.setMatricula(" ");
                  carro5.setProblema(" ");
                }
                else 
                {
                  JOptionPane.showMessageDialog(null,"VEHICULO NO EXISTENTE");  
                }
                
            break;
            
            case 3:
            canti = Integer.parseInt(JOptionPane.showInputDialog(" que auto va cambiar el color?"));
                if (canti == 1){
                  col = JOptionPane.showInputDialog("Ingrese nuevo color");
                  carro1.setColor("Nuevo color: "+col);
                } else if (canti == 2){
                    col = JOptionPane.showInputDialog("Ingrese nuevo color");
                  carro2.setColor("Nuevo color: "+col);
                } else if (canti == 3){
                     col = JOptionPane.showInputDialog("Ingrese nuevo color");
                  carro3.setColor("Nuevo color: "+col);
                } else if (canti == 4){
                     col = JOptionPane.showInputDialog("Ingrese nuevo color");
                  carro4.setColor("Nuevo color: "+col);
                }
                else if (canti == 5){
                     col = JOptionPane.showInputDialog("Ingrese nuevo color");
                  carro5.setColor("Nuevo color: "+col);
                }
                else 
                {
                  JOptionPane.showMessageDialog(null,"VEHICULO NO EXISTENTE");  
                }
                
                
            break;
        }
  }
         
  }
    
} 

