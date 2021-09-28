import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

   @Test
   public void testeEntradaInvalidaUmNumeroNegativo(){

      String actual = App.identificaTriangulo(6.0,8.0,-10.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeEntradaInvalidaDoisNumerosNegativos(){

      String actual = App.identificaTriangulo(6.0,-8.0,-10.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeEntradaInvalidTresNumerosNegativos(){

      String actual = App.identificaTriangulo(-6.0,-8.0,-10.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeUmaEntradaZerada(){

      String actual = App.identificaTriangulo(0.0,9.0,10.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeDuasEntradasZeradas(){

      String actual = App.identificaTriangulo(0.0,0.0,10.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeTresEntradasZeradas(){

      String actual = App.identificaTriangulo(0.0,0.0,0.0);
      String expected = "ENTRADA INVALIDA";
      assertEquals(expected, actual);
   }

   @Test
   public void testeNaoFormaTrianguloAnguloIncorreto(){

      String actual = App.identificaTriangulo(90.0,90.0,90.0);
      String expected = "NAO FORMA TRIANGULO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeNaoFormaTrianguloAaSomaIgual(){

      String actual = App.identificaTriangulo(5.0,7.0,2.0);
      String expected = "NAO FORMA TRIANGULO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeNaoFormaTrianguloENaoFormaIsoscelesAaIgual(){

      String actual = App.identificaTriangulo(1.0,1.0,2.0);
      String expected = "NAO FORMA TRIANGULO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeNaoFormaTrianguloAaMaior(){

      String actual = App.identificaTriangulo(7.0,1.0,2.0);
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
   public void testeIsosceles(){

      String actual = App.identificaTriangulo(90.0,90.0,1.0);
      String expected = "\n" + "TRIANGULO ISOSCELES";
      assertEquals(expected, actual);
   }

   @Test
   public void testeObtusanguloIsosceles(){

      String actual = App.identificaTriangulo(6.0,6.0,10.0);
      String expected = "TRIANGULO OBTUSANGULO" + "\n" + "TRIANGULO ISOSCELES";
      assertEquals(expected, actual);
   }

   @Test
   public void testeObtusangulo(){

      String actual = App.identificaTriangulo(60.0,40.0,80.0);
      String expected = "TRIANGULO OBTUSANGULO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeAcutanguloEquilatero(){

      String actual = App.identificaTriangulo(6.0,6.0,6.0);
      String expected = "TRIANGULO ACUTANGULO" + "\n" + "TRIANGULO EQUILATERO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeAcutangulo(){

      String actual = App.identificaTriangulo(60.0,60.0,60.0);
      String expected = "TRIANGULO ACUTANGULO";
      assertEquals(expected, actual);
   }

   @Test
   public void testeRetangulo(){

      String actual = App.identificaTriangulo(6.0,8.0,10.0);
      String expected = "TRIANGULO RETANGULO";
      assertEquals(expected, actual);
   }
}