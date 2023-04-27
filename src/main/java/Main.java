import ru.netology.statistic.StatisticsService;

public class Main {

    public static void main(String[] args) {
        long[] sales = {
                12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12
        };
        StatisticsService service = new StatisticsService();
        long findMax = service.findMax(sales);
        System.out.println("Максимальное значение " + findMax);

    }
}
