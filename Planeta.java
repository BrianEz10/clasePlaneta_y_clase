enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }

public class Planeta {

    // Atributos
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaSol; // en millones de km
    private TipoPlaneta tipo;
    private boolean observable;
    private double periodoOrbital; // en años
    private double periodoRotacion; // en días

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipo, boolean observable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaMediaSol() {
        return distanciaMediaSol;
    }

    public void setDistanciaMediaSol(int distanciaMediaSol) {
        this.distanciaMediaSol = distanciaMediaSol;
    }

    public TipoPlaneta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(double periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    // Métod para imprimir datos
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia media al Sol: " + distanciaMediaSol + " millones de km");
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable: " + (observable ? "Sí" : "No"));
        System.out.println("Periodo orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de rotación: " + periodoRotacion + " días");
        System.out.println();
    }

    // Métod para calcular densidad
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Metod para determinar si es un planeta exterior
    public boolean esPlanetaExterior() {
        int distanciaUA = distanciaMediaSol * 149597870; // Convertir a kilómetros
        return distanciaUA > 3.4 * 149597870;
    }

    // Métod main
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 149, TipoPlaneta.TERRESTRE, true, 1, 0.99);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        tierra.imprimir();
        System.out.println("Densidad: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("Es planeta exterior: " + (tierra.esPlanetaExterior() ? "Sí" : "No"));
        System.out.println();

        jupiter.imprimir();
        System.out.println("Densidad: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("Es planeta exterior: " + (jupiter.esPlanetaExterior() ? "Sí" : "No"));
    }
}
