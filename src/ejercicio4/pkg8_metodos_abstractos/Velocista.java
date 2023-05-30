package ejercicio4.pkg8_metodos_abstractos;

public class Velocista extends Ciclista{
    private double potencia_promedio;
    private double velocidad_promedio;
    
    public Velocista(int identificador,String nombre,double potencial_promedio,double velocidad_promedio){
        super(identificador,nombre);
        potencia_promedio = potencia_promedio;
        this.velocidad_promedio = velocidad_promedio;
    }
    protected double getPotencia_promedio(){
        return potencia_promedio;
    }
    protected void setPotencia_promedio(double potencia_promedio){
        this.potencia_promedio = potencia_promedio;
    }
    protected double getVelocidad_promedio(){
        return velocidad_promedio;
    }
    protected void setVelocidad_promedio(double velocidad_promedio){
        this.velocidad_promedio = velocidad_promedio;
    }
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.println("Potencia promedio: "+potencia_promedio);
        System.out.println("Velocidad promedio: "+velocidad_promedio);
    }
    @Override
    protected String imprimir_tipo(){
        return "Es Velocista";
    }
}
