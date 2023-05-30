package ejercicio4.pkg8_metodos_abstractos;

public class Contrarrelojista extends Ciclista{
    private double velocidad_maxima;
    
    public Contrarrelojista(int identificador,String nombre,double velocidad_maxima){
        super(identificador,nombre);
        this.velocidad_maxima = velocidad_maxima;
    }
    protected double getVelocidad_maxima(){
        return velocidad_maxima;
    }
    protected void setVelocidad_maxima(double velocidad_maxima){
        this.velocidad_maxima = velocidad_maxima;
    }
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.println("La velocidad maxima es de:"+velocidad_maxima);
    }
    @Override
    protected String imprimir_tipo(){
        return "Es Contrarrelojista.";
    }
}
