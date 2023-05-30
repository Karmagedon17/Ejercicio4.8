package ejercicio4.pkg8_metodos_abstractos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

public class Equipo {
    private String nombre;
    private static double total_tiempo;
    private String pais;
    Vector lista_ciclistas;
    
    public Equipo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        total_tiempo = 0;
        lista_ciclistas = new Vector();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    private String getPais(){
        return pais;
    }
    public void setPais(String pais){
    this.pais = pais;
    }
    void añadir_ciclista(Ciclista ciclista){
        lista_ciclistas.add(ciclista);
    }
    void listar_equipo() {
    
    for (int i = 0; i < lista_ciclistas.size(); i++) {
    Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);
    System.out.println(c.getNombre());
}
}
    void buscar_ciclista() {
    Scanner sc = new Scanner(System.in);
    String nombreCiclista = sc.next();
    for (int i = 0; i < lista_ciclistas.size(); i++) {
    Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);
    if (c.getNombre().equals(nombreCiclista)) {
    System.out.println(c.getNombre());
        }
    }
}
    void calcular_total_tiempo() {
    for (int i = 0; i < lista_ciclistas.size(); i++) {
    Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);

    total_tiempo = total_tiempo + c.getTiempo_acumulado();
}
}
    void imprimir() {
    System.out.println("Nombre del equipo = " + nombre);
    System.out.println("Pais = " + pais);
    System.out.println("Total tiempo del equipo = " + total_tiempo);
}
}

