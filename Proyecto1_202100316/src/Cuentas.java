/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hinestroza
 */
public class Cuentas {
    private int identificador;
    private double saldo;
    private String Nombre;
    private String Apellido;
    private int cui;
    public Cuentas(int identificador, int cui, String Nombre, String Apellido, double saldo){
        this.identificador = identificador;
        this.cui = cui;
        this.saldo = saldo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    public void Imprimir() {
        System.out.println("Numero de Cuenta: " + this.identificador +" CUI: " + this.cui + 
                "  Nombre: " + this.Nombre + "   Apellido: " + this.Apellido+" Saldo: " + this.saldo );
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCui() {
        return cui;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }
    
}
