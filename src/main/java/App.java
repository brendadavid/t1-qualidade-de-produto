

public class App {

    public static void identificaTriangulo(double a, double b, double c) {


        double AA = Math.max(a, Math.max(b, c));
        double BB = 0;
        double CC = 0;
        if(a < 0 || b < 0 || c < 0) {
            System.out.println("ENTRADA INVÁLIDA");
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
                System.out.println("NAO FORMA TRIANGULO");

            } else if (AA * AA > ((BB * BB) + (CC * CC))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (AA * AA == ((BB * BB) + (CC * CC))) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (AA * AA < ((BB * BB) + (CC * CC))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if ((AA == BB) && (AA == CC)) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (((AA == BB) && (AA != CC)) || ((AA == CC) && (AA != BB)) || ((BB == CC) && (BB != AA))) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }

    public static void main(String[] args) {

        identificaTriangulo(6.0,6.0,-7.0);
    }
}


