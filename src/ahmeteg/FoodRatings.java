package ahmeteg;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FoodRatings {
    public static void main(String[] args) {
        String[] foods = new String[]{"kimchi","miso","sushi","moussaka","ramen","bulgogi"};
        String[] cuisine = new String[]{"korean","japanese","japanese","greek","japanese","korean"};
        int[] ratings = new int[]{9,12,8,15,14,7};
        FoodRatings foodRatings = new FoodRatings(foods, cuisine, ratings);
        System.out.println( foodRatings.highestRated("korean"));
        System.out.println( foodRatings.highestRated("japanese"));

        foodRatings.changeRating("sushi", 16);
        System.out.println( foodRatings.highestRated("japanese"));
        foodRatings.changeRating("ramen", 16);
        System.out.println( foodRatings.highestRated("japanese"));
    }

    ArrayList<Food> foods = new ArrayList<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            this.foods.add(new Food(foods[i], cuisines[i], ratings[i]));

        }
        Collections.sort(this.foods, Comparator.comparing(Food::getRating).reversed().thenComparing(Food::getName));
    }

    public void changeRating(String food, int newRating) {
        for (Food foo : foods) {
            if (foo.name == food) {
                foo.rating = newRating;
            }
        }
        Collections.sort(this.foods, Comparator.comparing(Food::getRating).reversed().thenComparing(Food::getName));
    }

    public String highestRated(String cuisine) {

        if(foods.stream().filter(food -> food.cuisine==cuisine).findFirst().isPresent())
        return foods.stream().
                filter(food -> food.cuisine == cuisine).
                findFirst().map(Food::getName).get();
        else return null;
    }

    public class Food {
        String name;
        String cuisine;
        int rating;

        public int getRating() {
            return rating;
        }

        public String getName() {
            return name;
        }

        private Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }


    }
}
