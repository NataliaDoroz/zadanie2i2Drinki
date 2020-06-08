public class DrinkDescription {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Wściekły pies";
        drink.price = 12;
        drink.alcohol = true;
        System.out.println(drink.name + "\t " + drink.price + "zł \t Alcohol? " + drink.alcohol + "\n");

        Ingredient ingredient = new Ingredient();
        ingredient.name = "wódka";
        ingredient.amount = 20;
        System.out.println("Pierwszy składnik: \t" + ingredient.name + " " + ingredient.amount + "ml ");

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "sok malinowy";
        ingredient2.amount = 5;
        System.out.println("Drugi składnik: \t" + ingredient2.name + " " + ingredient2.amount + "ml ");

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "sos tabasko";
        ingredient3.amount = 1;
        System.out.println("Trzeci składnik:\t" + ingredient3.name + " " + ingredient3.amount + "ml " + "\n");

        int amountIngridienst = ingredient.amount + ingredient2.amount + ingredient3.amount;
        System.out.println("Pojemność drinka: " + amountIngridienst + "ml");
        
    }
}
