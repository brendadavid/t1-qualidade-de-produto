

public class App {

    public static String identificaTriangulo(double a, double b, double c) {

        String result = "";
        double AA = Math.max(a, Math.max(b, c));
        double BB = 0;
        double CC = 0;

        if(a <= 0 || b <= 0 || c <= 0) {
            result = "ENTRADA INVALIDA";
        }
        else {
            if (AA == a) {
                BB = Math.max(b, c);
                CC = Math.min(b, c);
            }
            if (AA == b) {
                BB = Math.max(a, c);
                CC = Math.min(a, c);
            }
            if (AA == c) {
                BB = Math.max(b, a);
                CC = Math.min(b, a);
            }
            if (AA >= (BB + CC)) {
                result = "NAO FORMA TRIANGULO";

            } else if (AA * AA > ((BB * BB) + (CC * CC))) {
                result = "TRIANGULO OBTUSANGULO";

            }
            if (AA * AA == ((BB * BB) + (CC * CC))) {
                result = "TRIANGULO RETANGULO";
            }
            if (AA * AA < ((BB * BB) + (CC * CC))) {
                result = "TRIANGULO ACUTANGULO";
            }
            if ((AA == BB) && (AA == CC)) {
                result = result + "\n" + "TRIANGULO EQUILATERO";
            }
            if (((AA == BB) && (AA != CC)) || ((AA == CC) && (AA != BB)) || ((BB == CC) && (BB != AA))) {
                result = result + "\n" + "TRIANGULO ISOSCELES";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(identificaTriangulo(7.0,5.0,7.0));
    }
}


