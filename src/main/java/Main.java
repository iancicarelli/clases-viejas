public class Main {
    public static void main(String[] args){
        Ingredientes i0 = new Ingredientes("cebolla","top",6);
        Pizza p = new Pizza("española","tradicional",30);
        p.añadirIngrediente(new Ingredientes("salame","top",8));
        p.añadirIngrediente(new Ingredientes("queso","top",6));
        p.añadirIngrediente(new Ingredientes("champiñon","top",6));
        p.añadirIngrediente(new Ingredientes("tomate","top",4));
        System.out.println(p.getIngredientes());
        p.verIngredientes();
        p.getIngredientes().get(2).setPorcion(10);




    }
}
