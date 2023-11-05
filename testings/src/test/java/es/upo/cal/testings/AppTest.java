package es.upo.cal.testings;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void pruebaConstructor() {
        // Paso 1: Crear un nuevo objeto Integer con un valor de 10.
        Integer miEntero = new Integer(10);
        // Paso 2: Llamar al método intValue() en el objeto Integer.
        int valor = miEntero.intValue();
        
        // Resultado esperado: El método intValue() debe devolver el valor 10.
        int valorEsperado = 10;
        // Comprobar si el valor obtenido es igual al valor esperado.
        Assert.assertEquals(valor, valorEsperado, "El valor obtenido no es igual al valor esperado.");
    }
    
    @Test
    public void pruebaEqualsYHashCode() {
        // Paso 1: Crear dos objetos Integer con el mismo valor.
        Integer entero1 = new Integer(10);
        Integer entero2 = new Integer(10);
        // Paso 2: Llamar al método equals() en los dos objetos Integer.
        boolean resultadoEquals = entero1.equals(entero2);
        // Paso 3: Llamar al método hashCode() en los dos objetos Integer.
        int hashCode1 = entero1.hashCode();
        int hashCode2 = entero2.hashCode();
        
        // Resultados esperados:
        // El método equals() debe devolver true.
        Assert.assertTrue(resultadoEquals, "El método equals() no devolvió true.");
        // Los métodos hashCode() deben devolver el mismo valor.
        Assert.assertEquals(hashCode1, hashCode2, "Los métodos hashCode() no devolvieron el mismo valor.");
    }
    
    @Test
    public void pruebaCompareToYCompare() {
        // Paso 1: Crear dos objetos Integer con valores diferentes.
        Integer entero1 = new Integer(5);
        Integer entero2 = new Integer(10);
        // Paso 2: Llamar al método compareTo() en los dos objetos Integer.
        int resultadoCompareTo = entero1.compareTo(entero2);
        // Paso 3: Llamar al método compare() en los dos objetos Integer.
        int resultadoCompare = Integer.compare(entero1, entero2);
        
        // Resultados esperados:
        // El método compareTo() debe devolver un valor negativo.
        Assert.assertTrue(resultadoCompareTo < 0, "El método compareTo() no devolvió un valor negativo.");
        // El método compare() debe devolver un valor negativo.
        Assert.assertTrue(resultadoCompare < 0, "El método compare() no devolvió un valor negativo.");
    }
    
    @Test
    public void pruebaToStringYToBinaryString() {
        // Paso 1: Crear un objeto Integer con un valor de 10.
        Integer entero = new Integer(10);
        // Paso 2: Llamar al método toString() en el objeto Integer.
        String resultadoToString = entero.toString();
        // Paso 3: Llamar al método toBinaryString() en el objeto Integer.
        String resultadoToBinaryString = Integer.toBinaryString(entero);

        // Resultados esperados:
        // El método toString() debe devolver la cadena "10".
        Assert.assertEquals(resultadoToString, "10", "El método toString() no devolvió '10'.");
        // El método toBinaryString() debe devolver la cadena "1010".
        Assert.assertEquals(resultadoToBinaryString, "1010", "El método toBinaryString() no devolvió '1010'.");
    }
}
