import java.time.Period;
import java.time.LocalDate;

public class Empleado{
    String nombre;
    LocalDate fechaContratacion;


    void mostrarInformacion(){
            System.out.println("Buenas soy " + nombre);
            System.out.println("Me contrataron el " + fechaContratacion);


    }

    Period calcularAntiguedad(){
        Period antiguedad = Period.between(fechaContratacion, LocalDate.now());
        return antiguedad;
    }
}