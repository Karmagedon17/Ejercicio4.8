package ejercicio4.pkg8_metodos_abstractos;

public class Escalador extends Ciclista{
    private double aceleracion_promedio;
    private double grado_rampa;
    
    public Escalador(int identificador,String nombre,double aceleracion_promedio,double grado_rampa){
        super(identificador,nombre);
        this.aceleracion_promedio = aceleracion_promedio;
        this.grado_rampa = grado_rampa;
    }
    protected double getAceleracion_promedio(){
        return aceleracion_promedio;
    }
    protected void setAceleracion_promedio(double aceleracion_promedio){
        this.aceleracion_promedio = aceleracion_promedio;
    }
    protected double getGrado_rampa(){
        return grado_rampa;
    }
    protected void setGrado_rampa(double grado_rampa){
        this.grado_rampa = grado_rampa;
    }
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.println("La aceleracion promedio es: "+aceleracion_promedio);
        System.out.println("El grado de la rampa es:"+grado_rampa);
    }
    protected String imprimir_tipo(){
        return "Es escalador.";
    }
}
