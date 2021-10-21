import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private String masa;
    private int diametro;
    private boolean bordeQueso;
    private ArrayList<Ingredientes> ingredientes;

    public Pizza(String nombre,String masa,int diametro) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.bordeQueso = false;
        ingredientes = new ArrayList<>();
    }

    public Pizza(String nombre,String masa, int diametro, boolean bordeQueso) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.bordeQueso = bordeQueso;
        ingredientes = new ArrayList<>();
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void setBordeQueso(boolean bordeQueso) {
        this.bordeQueso = bordeQueso;
    }
    public void añadirIngrediente(Ingredientes i){
        ingredientes.add(i);
        System.out.println("nuevo ingrediente agregado");
    }//añade un ingrediente a la arraylist ingredientes

    public void añadirIngredientes(Ingredientes[] i){
        for (int j =0;j<i.length;j++){
            añadirIngrediente(i[j]);

        }


    }//añade ingredientes que pasen por un arreglo a los ingredientes

    public void verIngredientes(){
        System.out.println("ingredientes de la pizza"+nombre);
        for (int i =0;i<ingredientes.size();i++){
            System.out.println(ingredientes.get(i));
        }
    }

}
