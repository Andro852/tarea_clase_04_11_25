/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_clase_04_10_25;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jonatan y Gabriel
 */
public class Ejercicio_clase_04_10_25 {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
//        Cliente cliente = new Cliente(1,"Jorge",36); 
//        Cliente cliente2 = new Cliente(2,"Jorge",80);
//        System.out.println("1."+cliente.getCodigo());
//        System.out.println("2."+cliente.getNombre());
//        System.out.println("3."+cliente.getEdad());
//        System.out.println("+++++++++++++++++++++");
//        System.out.println("1."+cliente2.getCodigo());
//        System.out.println("2."+cliente2.getNombre());
//        System.out.println("3."+cliente2.getEdad());
//        System.out.println("+++++++++++++++++++++");
//        List<Cliente> listaCliente = new ArrayList<>();
//        listaCliente.add(new Cliente(1, "Maria", 33));
//        listaCliente.add(new Cliente(2,"Maria", 33));
//        listaCliente.add(new Cliente(3, "Maria", 33));     
//        for(Cliente clienteVer : listaCliente){
//            System.out.println("ID."+clienteVer.getCodigo());
//            System.out.println("Nombre."+clienteVer.getNombre());
//            System.out.println("Edad."+clienteVer.getEdad());
//        }
        List<Cliente> listaCliente = new ArrayList<>();
        String nombre,pregunta;
        Integer codigo,edad;
        do{
        System.out.println("Ingrese codigo"); 
        codigo=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre"); 
        nombre=sc.nextLine();
        System.out.println("Ingrese edad"); 
        edad=sc.nextInt();
        listaCliente.add(new Cliente(codigo,nombre,edad));
        System.out.println("Desea Repitir"); 
        pregunta=sc.next();
        }while (pregunta.equals("si"));
        for(Cliente clienteVer : listaCliente){
            System.out.println("ID."+clienteVer.getCodigo());
            System.out.println("Nombre."+clienteVer.getNombre());
            System.out.println("Edad."+clienteVer.getEdad());
        }
    }  
}
