import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroAcceso {
    Empleado empleado = new Empleado();
    Atraccion atraccion = new Atraccion();
    LocalDate fecha;
    LocalTime horaEntrada;
    LocalTime horaSalida;



    void mostrarRegistro(){
        System.out.println("Empleado " + empleado);
        System.out.println("Atraccion " + atraccion);
        System.out.println("fecha " + fecha);
        System.out.println("Entro a " + horaEntrada);
        System.out.println("Salio a " + horaSalida);
    }

    Duration calcularDuracion(){
        Duration jornada = Duration.between(horaEntrada,horaSalida );
        return jornada;
    }
    
}