public class Main {

    public static void main(String[] args) {
        Shape tr1 = new Triangle(3, 4, 5);
        tr1.setColor("white");
        tr1.setFilled(false);
        System.out.println(tr1);

        Shape tr2 = new Triangle(2, 2, 2);
        System.out.println(tr2);

    }
}
