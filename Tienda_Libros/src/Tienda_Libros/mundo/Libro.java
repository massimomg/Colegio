package Tienda_Libros.mundo;

import java.util.*;

public class Libro {
      //Atributos
      private String isbn;
      private String titulo;
      private double precioVenta;
      private int cantidadActual;
      private double precioCompra;
      private String rutaImagen;
      private ArrayList<Transaccion> transacciones;
      
      //Contructor sin parametros
      
      public Libro() {
          isbn = " ";
          titulo = " ";
          precioVenta = 0.0;
          cantidadActual = 0;
          precioCompra= 0.0;
          rutaImagen = " ";
          transacciones = new ArrayList<Transaccion>();
      }
      
      public Libro(String pIsbn, String pTit, double pPrecVta, int pCantAct, double pPrecComp, String pRuta, ArrayList<Transaccion> pTran) {
          isbn = pIsbn;
          titulo = pTit;
          precioVenta = pPrecVta;
          cantidadActual = pCantAct;
          precioCompra = pPrecComp;
          rutaImagen =pRuta;
          transacciones = pTran;
      }
      
      public ArrayList<Transaccion> DarTransaccion() {
          return transacciones;
      }
      
      public void cambArrayList(ArrayList<Transaccion> pTran) {
          transacciones = pTran;
      }
}