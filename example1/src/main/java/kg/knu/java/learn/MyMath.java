package kg.knu.java.learn;

public class MyMath {
    private static final double EPSILON = 1.0E-10;

    public double sin(double x, double accuracy) {
        double numerator = x;
        double denominator = 1.0;
        double sum = 0.0;
        double squareX = x * x;
        double partial = numerator / denominator;
        int i = 1;
        while ((partial >= 0 ? partial : -partial) > accuracy) {
            sum = sum + partial;
            numerator = numerator * squareX; // x * (x * x) * (x * x) = x^5
            denominator = -denominator * ++i * ++i; // 1 * 2 * 3 = 3! * 4 * 5 = 5!
            partial = numerator / denominator; //  x^3 / 3!
            System.out.println("следующая частичная сумма=" + partial + " [" + numerator + "/(" + denominator + ")]" + ", накопленная сумма=" + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        double x = 0.0;// Math.PI / 4; // sqrt(2)/2
        double standard = Math.sin(x);
        System.out.println("*** Результат стандартной функции: " + standard + " -> " + Math.sqrt(2.0) / 2.0 + "\n");

        MyMath a = new MyMath();
        double calculated = a.sin(x, EPSILON);
        if (Math.abs(calculated - standard) < EPSILON) {
            System.out.println("\n*** Приближенное значение вычислено правильно, с точностью: " + EPSILON + " и равно " + calculated);
        } else {
            System.out.println("\n*** Приближенное значение вычислено неправильно. Заданная точность: " + EPSILON + ". Вычисленное значение: " + calculated);
        }
    }
}
