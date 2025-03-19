
public class Departamento {
    private String nombre;
    private int numEmpleados;
    private Empleado[] empleados = new Empleado[2];
    Departamento(String nombre) {
        this.nombre = nombre;

    }
    void anadir(Empleado v){
        empleados[0]=v;
    }
}
