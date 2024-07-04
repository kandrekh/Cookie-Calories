public class Calories {
    private int cookies;

    public Calories() {

    }

    public Calories(int cookies) {
        this.cookies = cookies;
    }

    public int getCalories() {
        return cookies;
    }

    public void setCalories(int cookies) {
        this.cookies = cookies;
    }

    /***
     *
     * @return total cookies in box
     */
    public int calculateCaloriesInBox() {
        final int TOTAL_SERVINGS = 10;
        final int SERVING_CALORIES = 300;
        return TOTAL_SERVINGS * SERVING_CALORIES;
    }

    public int calculateSingleServingCalories() {
        final int TOTAL_BOX_COOKIES = 40;
        return calculateCaloriesInBox() / TOTAL_BOX_COOKIES;
    }

    public int cookiesRemaining() {
        final int TOTAL_BOX_COOKIES = 40;
        return TOTAL_BOX_COOKIES - cookies;
    }
}
