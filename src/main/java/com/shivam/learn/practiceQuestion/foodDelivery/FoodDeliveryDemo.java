package com.shivam.learn.practiceQuestion.foodDelivery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Cuisines;
import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Location;
import com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager.DeliveryPartner;
import com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager.DeliveryPartnerManager;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.AddOns;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.Dish;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.Menu;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.Restaurant;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.RestaurantManager;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.RestaurantOwner;

public class FoodDeliveryDemo {
    
    public static void main(String[] args) {
       // Chinese Restaurant
        RestaurantOwner owner1 = new RestaurantOwner("owner1");
        Restaurant chineseRest = new Restaurant(new Location(1, 2), "chinese store", owner1);
        Dish noodles = new Dish("noodles","Chilli garlic noodles", 200, Cuisines.CHINESE);
        noodles.addOns(new AddOns("premium sauce", 20));
        Dish friedRice = new Dish("fried rice","Schezwan Rice", 180, Cuisines.CHINESE);
        Dish springRolls = new Dish("spring rolls","Extra chilli and spicy", 120,Cuisines.CHINESE);
        Menu chineseMenu = new Menu(List.of(noodles, friedRice, springRolls));
        chineseRest.addMenu(chineseMenu);


         // Chinese Restaurant
         RestaurantOwner owner2 = new RestaurantOwner("owner1");
         Restaurant southIndianRest = new Restaurant(new Location(2, 3),"south indian food", owner2);
         Dish idli = new Dish("idli","White Rice idli", 220, Cuisines.SOUTHINDIAN);
         Dish dosa = new Dish("dosa","Masaal aloo dosa", 150, Cuisines.SOUTHINDIAN);
         Dish uthappam = new Dish("uthappam","Extra chilli and spicy", 120,Cuisines.SOUTHINDIAN);
         Menu southIndianMenu = new Menu(List.of(idli, dosa, uthappam));
         chineseRest.addMenu(southIndianMenu);


        // Restaurant Manager
        RestaurantManager restaurantMgr = RestaurantManager.getInstance();
        restaurantMgr.addRestaurant("chinese store", chineseRest);
        restaurantMgr.addRestaurant("south indian food", southIndianRest);

        // Delivery Partners
        DeliveryPartner alpha = new DeliveryPartner("alpha");
        DeliveryPartner beta = new DeliveryPartner("beta");
        DeliveryPartner gamma = new DeliveryPartner("gamma");

        DeliveryPartnerManager deliveryPartnerMgr = DeliveryPartnerManager.getInstance();
        deliveryPartnerMgr.addDeliveryPartner("alpha", alpha);
        deliveryPartnerMgr.addDeliveryPartner("beta", beta);
        deliveryPartnerMgr.addDeliveryPartner("gamma", gamma);

        // Users
        User keerti = new User("keerti", new Location(10, 11));
        User gaurav = new User("gaurav", new Location(13, 14));
        User yogita = new User("yogita", new Location(15, 16));

        UserManager userMgr = UserManager.getInstance();
        userMgr.addUser("keerti", keerti);
        userMgr.addUser("gaurav", gaurav);
        userMgr.addUser("yogita", yogita);

        // Order
        Map<Dish, Integer> cart = new HashMap<>();
        cart.put(noodles, 2);
        cart.put(friedRice, 1);
        Order order1 = new Order(keerti, chineseRest, cart);

        OrderManagerI orderMgr = OrderManager.getOderManagerInstance();
        orderMgr.createOrder("order1", order1); // Ideally, the id should be created in order manager when order is created

        // Clean up resources if necessary (Java has garbage collection)
    }
}
