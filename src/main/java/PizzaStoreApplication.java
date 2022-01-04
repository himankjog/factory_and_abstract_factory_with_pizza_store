import enums.ChicagoStylePizzaEnums;
import enums.NYStylePizzaEnums;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;
import stores.ChicagoPizzaStore;
import stores.NYPizzaStore;
import stores.PizzaStore;

@Log4j2
public class PizzaStoreApplication {
    public static void main(String[] args) {
        PizzaStore pizzaStore = NYPizzaStore.builder().build();
        Pizza pizza = pizzaStore.orderPizza(NYStylePizzaEnums.NY_STYLE_CHEESE_PIZZA.name());
        log.info("Got Pizza: {}", pizza.getName());
        pizza = pizzaStore.orderPizza(NYStylePizzaEnums.NY_STYLE_PEPPERONI_PIZZA.name());
        log.info("Got Pizza: {}", pizza.getName());
        pizzaStore = ChicagoPizzaStore.builder().build();
        pizza = pizzaStore.orderPizza(ChicagoStylePizzaEnums.CHICAGO_STYLE_CLAM_PIZZA.name());
        log.info("Got Pizza: {}", pizza.getName());
    }
}
