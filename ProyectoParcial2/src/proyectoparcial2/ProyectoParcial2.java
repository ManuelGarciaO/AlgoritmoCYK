/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparcial2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Manuel_2
 */
public class ProyectoParcial2 {
    static String cadena;
    static BinaryTree arbol;
    //cyk matriz
    static ArrayList<String>[][] cyk ;
    static int len;
    static String[][] gramatica;
   
    
    public ProyectoParcial2(String cad, String[][] gramatica){
        this.cadena = cad;
        this.gramatica = gramatica;
        this.len=cadena.length();
        cyk = new ArrayList[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                cyk[i][j] = new ArrayList<String>();
            }
        }   
    }
        
        public static void generar(){
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len-i; j++) {
                    int k=i+j;
                    if(i==0){
                        buscar(String.valueOf(cadena.charAt(j)),j,k);
                    }
                    else{
                        for (int l = k-i, o =j+1; l < k && o <= j+i; l++,o++) {
                            for (int m = 0; m < cyk[j][l].size(); m++) {
                                for (int n = 0; n < cyk[o][k].size(); n++) {
                                    buscar(cyk[j][l].get(m)+cyk[o][k].get(n),j,k);
                                }
                            }
                        }
                    }
                    
                }
            }
        }
        public static void buscar(String c,int k, int h){
            for (int i = 0; i < gramatica.length; i++) {
                for (int j = 1; j < gramatica[i].length; j++) {
                    if(gramatica[i][j].equals(c)){
                        boolean poner = true;
                        for (int l = 0; l < cyk[k][h].size(); l++) {
                            if(cyk[k][h].get(l).equals(gramatica[i][0])){
                                poner=false;
                            }                                 
                        }
                        if(poner){
                            cyk[k][h].add(gramatica[i][0]);
                        }
                    }
                }
            }
        }
        
        public static boolean aceptado(){
            boolean aceptado=false;
            for (int i = 0; i < cyk[0][len-1].size(); i++) {
                if(cyk[0][len-1].get(i).equals("S")){
                    aceptado = true;
                    System.out.println("Verdadero");
                    break;
                }
            }
            return aceptado;
        }
        
        public static void generarArbol(){
            arbol = new BinaryTree();
            arbol.insertRoot("S");
            generarArbol(0,len-1,"S",arbol.root);
            dibujarArbol();
        }
        
        static void generarArbol(int i, int j, String simbolo, Node nodoActual){
            if(i!=j){
                System.out.println("i:"+i+" j:"+j);
                for (int m = i, o = i+1; m < j; m++,o++) {
                    for (int n = 0; n < cyk[i][m].size(); n++) {
                       for (int p = 0; p < cyk[o][j].size(); p++) {
                             if(buscar2(simbolo,cyk[i][m].get(n)+cyk[o][j].get(p))){
                                 System.out.println(simbolo+" contiene "+cyk[i][m].get(n)+cyk[o][j].get(p));
                                 nodoActual.setLeft(new Node(cyk[i][m].get(n)));
                                 nodoActual.setRight(new Node(cyk[o][j].get(p)));
                                 generarArbol(i,m,cyk[i][m].get(n), nodoActual.getLeft());//nodo izquierdo
                                 generarArbol(o,j,cyk[o][j].get(p), nodoActual.getRight());//nodo derecho
                             }
                        }
                    }       
                }
            }
            else{
                nodoActual.setLeft(new Node(cadena.substring(i,i+1)));
            }            
        }
        
        static boolean buscar2(String simbolo, String prod){
            for (int i = 0; i < gramatica.length; i++) {
                if(gramatica[i][0].equals(simbolo)){
                    for (int j = 1; j < gramatica[i].length; j++) {
                        if(gramatica[i][j].equals(prod)){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        
        
        static void dibujarArbol(){
            Lienzo objLienzo = new Lienzo();
            System.out.println("--------\n"
                    + "generando arbol");
            objLienzo.setArbol(arbol);

            JFrame ventana = new JFrame();
            ventana.getContentPane().add(objLienzo);
            ventana.setDefaultCloseOperation(1);
            ventana.setSize(1400,800);
            ventana.setVisible(true);
            System.out.println("arbol en pre orden");
            arbol.preorder();
        }
        
        public static void imprimirCYK(){
            for (int i = 0; i < cyk.length; i++) {
                for (int j = 0; j < cyk[i].length; j++) {
                    System.out.print(cyk[i][j]+" ");
                }
                System.out.println("");
            }
        }
    
}


