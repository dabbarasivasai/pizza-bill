public class pizza {
    private int price;
    private boolean veg;
    private int ExtracheesePrice = 100;
    private int ExtraToppingsPrice= 150;
    private int backPackPrice = 20;
    private int basePizzaprice;
    private boolean isExtracheeseadded = false;
    private boolean isExtraToppingsadded = false;
    private boolean isoptedfortakeaway = false;

    public pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaprice = this.price;
    }
//    creating add ons for the base pizza
    public void addExtracheese(){
        isExtracheeseadded = true;

        this.price += ExtracheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsadded = true;

        this.price += ExtraToppingsPrice;
    }
    public void Takeaway(){
        isoptedfortakeaway = true;

        this.price += backPackPrice;

    }
    public void getBill(){
        String Bill = "";
        System.out.println("pizza pried is: " + basePizzaprice);
        if(isExtracheeseadded){
            Bill += "extracheese is added : " + ExtracheesePrice + "\n";
        }
        if(isExtraToppingsadded){
            Bill += "extraToppings are added :  " + ExtraToppingsPrice + "\n";
        }
        if(isoptedfortakeaway){
            Bill += "opted for takeaway : " + backPackPrice + "\n";
        }
        Bill += "Bill : " +this.price+ "\n";
        System.out.println(Bill);

    }
//    public void getPizzaprice(){
//        System.out.println(this.price);
//    }
}
