package Sensor;

import java.awt.*;

public class MainSensor {
    public static void main() {
        Sensor s1=new Sensor();
        Sensor s2=new Sensor();

        s1.setIdSensor("MIBOMBO");
        s1.setValorActual(6.7);
        s1.setUnidad("C");

        s2.setIdSensor("MIBOMBO");
        s2.setValorActual(6.7);
        s2.setUnidad("F");

        s1.mostrarLectura();
        s2.mostrarLectura();


    }



}
