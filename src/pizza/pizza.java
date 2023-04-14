package pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pizza {

  
  private Map<String, Map<String, Double>> menu;


  private Map<String, Integer> inventory;

  
  private List<Order> orders;

  public pizza() {
   
    menu = new HashMap<>();
    Map<String, Double> vegMenu = new HashMap<>();
    vegMenu.put("Deluxe Veggie (Regular)", 150.0);
    vegMenu.put("Deluxe Veggie (Medium)", 200.0);
    vegMenu.put("Deluxe Veggie (Large)", 325.0);
    vegMenu.put("Cheese and corn (Regular)", 175.0);
    vegMenu.put("Cheese and corn (Medium)", 375.0);
    vegMenu.put("Cheese and corn (Large)", 475.0);
    vegMenu.put("Paneer Tikka (Regular)", 160.0);
    vegMenu.put("Paneer Tikka (Medium)", 290.0);
    vegMenu.put("Paneer Tikka (Large)", 340.0);
    menu.put("Vegetarian Pizza", vegMenu);
    Map<String, Double> nonVegMenu = new HashMap<>();
    nonVegMenu.put("Non-Veg Supreme (Regular)", 190.0);
    nonVegMenu.put("Non-Veg Supreme (Medium)", 325.0);
    nonVegMenu.put("Non-Veg Supreme (Large)", 425.0);
    nonVegMenu.put("Chicken Tikka (Regular)", 210.0);
    nonVegMenu.put("Chicken Tikka (Medium)", 370.0);
    nonVegMenu.put("Chicken Tikka (Large)", 500.0);
    nonVegMenu.put("Pepper Barbecue Chicken (Regular)", 220.0);
    nonVegMenu.put("Pepper Barbecue Chicken (Medium)", 380.0);
    nonVegMenu.put("Pepper Barbecue Chicken (Large)", 525.0);
    menu.put("Non-Vegetarian Pizza", nonVegMenu);


    inventory = new HashMap<>();
    inventory.put("Black olive", 50);
    inventory.put("Capsicum", 50);
    inventory.put("Paneer", 50);
    inventory.put("Mushroom", 50);
    inventory.put("Fresh tomato", 50);
    inventory.put("Chicken tikka", 50);
    inventory.put("Barbeque chicken", 50);
    inventory.put("Grilled chicken", 50);
    inventory.put("Extra cheese", 50);
    inventory.put("Cold drink", 100);
    inventory.put("Mousse cake", 50);

   
    orders = new ArrayList<>();
  }

 
  public Order placeOrder(String pizzaType, String size, String crustType, List<String> toppings, boolean extraCheese, List<String> sides) throws Exception {
  
    if (!menu.containsKey(pizzaType)) {
      throw new Exception("Invalid pizza type");
    }

  
    Map<String, Double> sizePrices = menu.get(pizzaType);
    if (!sizePrices.containsKey(size)) {
      throw new Exception("Invalid pizza size");
    }
  
