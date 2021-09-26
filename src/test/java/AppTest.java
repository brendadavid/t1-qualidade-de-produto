import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

   @Test
   public void testeEntradaInvalidaNumerosNegativos(){

      String actual = App.identificaTriangulo(6.0,8.0,-10.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeEntradaInvalidoNumerosZerados(){

      String actual = App.identificaTriangulo(0.0,0.0,0.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeNaoFormaTriangulo(){

      String actual = App.identificaTriangulo(5.0,7.0,2.0);
      String expected = "NAO FORMA TRIANGULO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeAcutanguloIsosceles(){

      String actual = App.identificaTriangulo(7.0,5.0,7.0);
      String expected = "TRIANGULO ACUTANGULO" + "\n" + "TRIANGULO ISOSCELES";
      assertEquals(expected, actual);
   }

   @Test
   public void testeObtusanguloIsosceles(){

      String actual = App.identificaTriangulo(6.0,6.0,10.0);
      String expected = "TRIANGULO OBTUSANGULO" + "\n" + "TRIANGULO ISOSCELES";
      assertEquals(expected, actual);
   }

   @Test
   public void testeAcutanguloEquilatero(){

      String actual = App.identificaTriangulo(6.0,6.0,6.0);
      String expected = "TRIANGULO ACUTANGULO" + "\n" + "TRIANGULO EQUILATERO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeRetangulo(){

      String actual = App.identificaTriangulo(6.0,8.0,10.0);
      String expected = "TRIANGULO RETANGULO";
      assertEquals(expected, actual);
   }
}