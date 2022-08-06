public class BonusMilesService {

    public int calculate(int price) {
        int cost;
        cost = price / 20; // Количество бонусных миль

        return cost;
    }
}