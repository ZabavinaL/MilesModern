public class BonusMilesService {
    public int calculate(int cost) {
        int rubles = 20;
        int price = cost;
        int miles = price / rubles / 100;
        return miles;
    }
}
