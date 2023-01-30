import ru.netology.packagess.sqr.sqrservices.SQRservice;

public class Main {

    public static void main(String[] args) {
        SQRservice service = new SQRservice();
        System.out.println(service.calcSqrService(500, 200));
    }
}