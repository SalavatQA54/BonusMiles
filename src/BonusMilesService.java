public class BonusMilesService {
    public int calculate(int cost) {
        int costOneMile = 20;
        int miles = cost / costOneMile;

        return miles;
    }
}
