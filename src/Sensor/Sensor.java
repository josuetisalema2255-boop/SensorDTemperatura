package Sensor;

public class Sensor {
    //atributos privados
    private String idSensor;
    private double valorActual;
    private String unidad;

    /*constructor para inicializar atributos
    public Sensor (String idSensor, double valorActual, String unidad){
        this.idSensor=idSensor;
        this.valorActual=valorActual;
        this.unidad=unidad.toUpperCase();
    }*/

    //metodos set y get

    public void setUnidad(String unidad){
        if (unidad!=null && !unidad.isBlank()){
            if (unidad.toUpperCase().equals("C")|| unidad.toUpperCase().equals("F")){
               this.unidad=unidad.toUpperCase();
            }
        }
    }
    public void setValorActual(double valorActual){
        this.valorActual=valorActual;
    }
    public void setIdSensor(String idSensor){
        this.idSensor=idSensor;
    }

    public String getIdSensor(){
        return idSensor;
    }

    public double getValorActual(){
        return valorActual;
    }

    public String getUnidad(){
        return unidad;
    }

    public void mostrarLectura(){
        System.out.println("Sensor ID: "+ idSensor+ "Lectura: "+ valorActual+ " "+ unidad);
    }


}
