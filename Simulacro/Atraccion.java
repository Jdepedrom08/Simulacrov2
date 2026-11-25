
import java.time.LocalTime;

public class Atraccion{
    String nombre;
    Integer capacidadMaxima;
    LocalTime horaApertura;
    LocalTime horaCierre;


    void mostrarInformacion(){
        System.out.println("La atracción " + nombre);
        System.out.println("Aguanta a " + capacidadMaxima + " personas");
        System.out.println("Abre a las " + horaApertura);
        System.out.println("Cierra a las " + horaCierre);
    }

    Boolean estaAbierta(){
        LocalTime horaActual = LocalTime.now();

        if(horaActual.isAfter(horaActual) && horaActual.isBefore(horaCierre)){
            return true;
        }else{
            return false;
        }

    }
}