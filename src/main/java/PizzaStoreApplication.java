import enums.ChicagoStylePizzaEnums;
import enums.NYStylePizzaEnums;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;
import factories.stores.ChicagoPizzaStore;
import factories.stores.NYPizzaStore;
import factories.stores.PizzaStore;

@Log4j2
public class PizzaStoreApplication {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(NYStylePizzaEnums.NY_STYLE_CHEESE_PIZZA.name());
        log.info("Got Pizza: {}", pizza.getName());
        pizza = pizzaStore.orderPizza(NYStylePizzaEnums.NY_STYLE_PEPPERONI_PIZZA.name());
        log.info("Got Pizza: {}", pizza.getName());
        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza(ChicagoStylePizzaEnums.CHICAGO_STYLE_CLAM_PIZZA.name());
        log.info("Got Pizza: {}", pizza.getName());
    }
}
