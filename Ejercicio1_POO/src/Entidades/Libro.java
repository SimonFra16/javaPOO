/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NdePag;
    

public Libro(){

}

public Libro(int ISBN, String Titulo, String Autor, int NdePag) {
    this.ISBN = ISBN;
    this.Titulo = Titulo;
    this.Autor = Autor;
    this.NdePag = NdePag;
}

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNdePag() {
        return NdePag;
    }

    public void setNdePag(int NdePag) {
        this.NdePag = NdePag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NdePag=" + NdePag + '}';
    }
}
