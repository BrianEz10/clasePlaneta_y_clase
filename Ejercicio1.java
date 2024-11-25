public class Ejercicio1 {
    // Atributos
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento; // Nuevo atributo
    private char genero; // Nuevo atributo: 'H' o 'M'

    // Constructores
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Métod para imprimir datos
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de documento: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println();
    }

    // Métod main
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Argentina", 'M');

        p1.imprimir();
        p2.imprimir();
    }
}