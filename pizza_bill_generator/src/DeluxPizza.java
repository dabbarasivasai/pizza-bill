public class DeluxPizza extends pizza{

    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtracheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtracheese() {}

    @Override
    public void addExtraToppings() {}
}
