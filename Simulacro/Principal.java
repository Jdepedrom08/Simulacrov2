import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;

public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer opcion;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Empleado empleado1 = new Empleado();
        Atraccion atraccion1 = new Atraccion();;
        RegistroAcceso registro1= new RegistroAcceso();;

        do{

            System.out.println("\n===== MENU ZOMBIELAND =====");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Registrar atracción");
            System.out.println("3. Registrar acceso");
            System.out.println("4. Mostrar empleado");
            System.out.println("5. Calcular antigüedad");
            System.out.println("6. Comprobar atracción");
            System.out.println("7. Calcular duración");
            System.out.println("8. Salir");


            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    
                    System.out.print("Digame el nombre del empleado: ");
                    empleado1.nombre = teclado.nextLine();
                    System.out.print("Diga cuando lo contratarom(dd/MM/yyyy): ");
                    empleado1.fechaContratacion = LocalDate.parse(teclado.nextLine() ,formato);
                    empleado1.fechaContratacion.format(formato);
                    break;
                case 2:
                    System.out.print("Nombre atracción: ");
                    String nombreAtraccion = teclado.nextLine();

                    System.out.print("Capacidad máxima: ");
                    Integer capacidad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Hora apertura (HH:mm): ");
                    LocalTime horaEntrada = LocalTime.parse(
                        teclado.nextLine()
                    );

                    System.out.print("Hora cierre (HH:mm): ");
                    LocalTime cierre = LocalTime.parse(
                        teclado.nextLine()
                    );

                   

                    break;

                case 3:

                    if (empleado1 != null && atraccion1 != null) {

                        System.out.print("Hora entrada (HH:mm): ");
                        LocalTime horaE = LocalTime.parse(
                            teclado.nextLine()
                        );

                        System.out.print("Hora salida (HH:mm): ");
                        LocalTime salida = LocalTime.parse(
                            teclado.nextLine()
                        );

                        
                    } else {
                        System.out.println("Registra primero empleado y atracción.");
                    }

                    break;
                    case 5:

                        if (empleado1 != null) {

                            Period antiguedad = empleado1.calcularAntiguedad();

                            System.out.println("Años: " + antiguedad.getYears());
                            System.out.println("Meses: " + antiguedad.getMonths());
                            System.out.println("Días: " + antiguedad.getDays());

                        } else {
                            System.out.println("No hay empleado registrado.");
                        }

                        break;


                    case 6:

                        if (registro1 != null) {

                            Duration duracion = registro1.calcularDuracion();

                            System.out.println("Horas: " + duracion.toHours());
                            System.out.println("Minutos: " + duracion.toMinutes());

                        } else {
                            System.out.println("No hay ningún registro.");
                        }

                        break;


                    case 7:

                        if (atraccion1 != null) {

                            if (atraccion1.estaAbierta()) {
                                System.out.println("La atracción está abierta.");
                            } else {
                                System.out.println("La atracción está cerrada.");
                            }

                        } else {
                            System.out.println("No hay atracción registrada.");
                        }

                                
                                    default:
                                        break;
                                }


        } while (opcion != 8); 
            
        teclado.close();
    }
}