package ejercicio4.pkg8_metodos_abstractos;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempo_acumulado= 0;
    
    public Ciclista(int identificador,String nombre){
        this.identificador = identificador;
        this.nombre = nombre;
    }
    abstract String imprimir_tipo();
    protected int getIdentifiador(){
        return identificador;
    }
    protected void setIdentificador(){
        this.identificador = identificador;
    }
    protected String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected int getPosicion_general(int posicion_general){
        return posicion_general;
    }
    protected void setPosicion_general(int posicion_general){
        posicion_general = posicion_general;
    }
    protected int getTiempo_acumulado(){
        return tiempo_acumulado;
    }
    protected void setTiempo_acumulado(int tiempo_acumulado){
        this.tiempo_acumulado = tiempo_acumulado;
    }
    protected void imprimir(){
        System.out.println("Identificador:"+identificador);
        System.out.println("Nombre: "+nombre);
        System.out.println("Tiempo acumulado: "+tiempo_acumulado);
    }
}
