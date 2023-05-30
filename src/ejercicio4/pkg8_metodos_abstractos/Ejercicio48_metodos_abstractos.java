package ejercicio4.pkg8_metodos_abstractos;

public class Ejercicio48_metodos_abstractos {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        //Tipo ciclistas.        
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas",320, 25);       
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25,10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981,"Jonathan Castroviejo", 120); 
        //Organizar equipos
        equipo1.añadir_ciclista(velocista1);
        equipo1.añadir_ciclista(escalador1);
        equipo1.añadir_ciclista(contrarrelojista1);
        //tiempo por velocista.
        velocista1.setTiempo_acumulado(365);
        escalador1.setTiempo_acumulado(385);
        contrarrelojista1.setTiempo_acumulado(370);
        //Calcular tiempo de el equipo
        equipo1.calcular_total_tiempo();
        //imprimir resultados
        equipo1.imprimir();
        //detalles integrantes de el equipo
        System.out.println("\nIntegrantes de el equipo:");
        equipo1.listar_equipo();
    }
}   

