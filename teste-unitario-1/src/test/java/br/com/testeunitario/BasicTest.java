package br.com.testeunitario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.StringUtil;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

    @Test
    @DisplayName("Primeiro número é maior que o segundo")
    void compareTest() {
        Basic basicTest = new Basic();
        int value = basicTest.compare(2, 1);
        assertEquals(1, value);
    }

    @Test
    @DisplayName("Primeiro número é menor que o segundo")
    void compare2Test() {
        Basic basicTest = new Basic();
        int value = basicTest.compare(2, 3);
        assertEquals(-1, value);
    }

    @Test
    @DisplayName("Primeiro número é igual ao segundo")
    void compare3Test() {
        Basic basicTest = new Basic();
        int value = basicTest.compare(2, 2);
        assertEquals(0, value);
    }


    @Test
    @DisplayName("Array classificação")
    void sortArrayTest() {
        Basic basicTest = new Basic();
        int[] array = {5, 8, 3, 9, 1, 6};
        basicTest.sortArray(array);
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }


    @Test
        void reverseStringTest() {
        Basic basicTest = new Basic();
        // Teste com uma string normal
        String input = "Anderson";
        String expectedOutput = "nosrednA";
        // Chame o método de inversão de string no objeto basicTest
        String value = basicTest.reverseString(input);
        // Verifica se o valor invertido é igual ao valor esperado
        assertEquals(expectedOutput, value);

    }
}