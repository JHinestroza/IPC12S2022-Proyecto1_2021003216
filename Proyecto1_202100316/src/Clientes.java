    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hinestroza
 */
public class Clientes {
    
    private int CUI;
    private String Nombre;
    private String Apellido;

    public Clientes(int CUI, String Nombre, String Apellido) {
        this.CUI = CUI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    
    
     public void Imprimir() {
        System.out.println("CUI: " + this.CUI + ", Nombre: " + this.Nombre + ", Apellido: " + this.Apellido);
    }

    public int getCUI() {
        return CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    
}
