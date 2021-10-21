public class Vehiculos {
    //atributos de los vehiculos

    private double rendimiento;
    private String patente;
    private int kilometraje;
    private int ruedas;
    private double motor;
    private String tipo;

    public Vehiculos(String tipo, double motor, String patente) {
        this.tipo = tipo;
        this.motor = motor;
        this.patente = patente;
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public String getPatente() {
        return patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getRuedas() {
        return ruedas;
    }

    public double getMotor() {
        return motor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void avanzar(){
        this.kilometraje += 5;
        System.out.println("se recorrio 5km");
    }
    public void avanzar(int n){
        if (n<0){
            n=0;
        }
        this.kilometraje+=n;
        System.out.println("se recorrio"+n+"km");
    }

}
