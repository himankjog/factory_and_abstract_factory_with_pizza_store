package products.pizzas;

public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void pack();
    String getName();
}
