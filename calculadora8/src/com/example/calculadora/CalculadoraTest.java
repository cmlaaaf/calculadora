package com.example.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testSomarPositivos() {
        assertEquals(5.0, calc.somar(2.0, 3.0));
    }

    @Test
    public void testSomarNegativos() {
        assertEquals(-5.0, calc.somar(-2.0, -3.0));
    }

    @Test
    public void testSomarComZero() {
        assertEquals(2.0, calc.somar(2.0, 0.0));
    }

    @Test
    public void testSubtrairPositivos() {
        assertEquals(2.0, calc.subtrair(5.0, 3.0));
    }

    @Test
    public void testSubtrairNegativos() {
        assertEquals(1.0, calc.subtrair(-2.0, -3.0));
    }

    @Test
    public void testSubtrairComZero() {
        assertEquals(2.0, calc.subtrair(2.0, 0.0));
    }

    @Test
    public void testMultiplicarPositivos() {
        assertEquals(6.0, calc.multiplicar(2.0, 3.0));
    }

    @Test
    public void testMultiplicarNegativos() {
        assertEquals(6.0, calc.multiplicar(-2.0, -3.0));
    }

    @Test
    public void testMultiplicarComZero() {
        assertEquals(0.0, calc.multiplicar(2.0, 0.0));
    }

    @Test
    public void testDividirPositivos() {
        assertEquals(2.0, calc.dividir(6.0, 3.0));
    }

    @Test
    public void testDividirNegativos() {
        assertEquals(2.0, calc.dividir(-6.0, -3.0));
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5.0, 0.0));
    }
}