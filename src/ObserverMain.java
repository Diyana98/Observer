
public class ObserverMain {

	public static void main(String[] args) {
		
		Food food = new Food();
		Observer obs1 = new FoodType("Wheat");
		Observer obs2 = new FoodType("Wheat1");

		
		food.eat(obs1);
		food.eat(obs2);
		
		
		food.setName("New food");
		food.setName("Other food");
	}

}
