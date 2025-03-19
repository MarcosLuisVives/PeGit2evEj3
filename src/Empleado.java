
public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    void incrementarSueldo(int porcentajeIncremento) {
        this.sueldo += sueldo * (porcentajeIncremento/100.0);
    }

}
