
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hinestroza
 */
public class Historial {

    String ID;
    String hora;
    String Nombre;
    String Apellido;
    String tipo;
    int acreditado;
    int debito;

    public Historial(String ID, String hora, String Nombre, String Apellido,String tipo, int dinero, int debito) {
        this.ID = ID;
        this.hora = hora;
        this.Nombre = Nombre;
        this.Apellido = Apellido;   
        this.tipo = tipo;
        this.acreditado = dinero;
        this.debito = debito;
    }

    public int getAcreditado() {
        return acreditado;
    }

    public int getDebito() {
        return debito;
    }

    public String getID() {
        return ID;
    }

    public String getHora() {
        return hora;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTipo() {
        return tipo;
    }
}
