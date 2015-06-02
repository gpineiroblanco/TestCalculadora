/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author gpineiroblanco
 */
@RunWith(Parameterized.class)
public class MainTest {

    private float n1, n2, expRes;
    private String op;

    @Before
    public void initialize() {

    }

    public MainTest(float no1, float no2, String ope, float result) {
        this.n1 = no1;
        this.n2 = no2;
        this.op = ope;
        this.expRes = result;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {1.0f, 2.0f, "sumar", 3},
            {2, 3, "multiplicar", 6},
            {8, 5, "restar", 3},
            {10, 2, "dividir", 5}
        });
    }

    /**
     * Test of realizaOperacion method, of class Main.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("Parameterized Number is : " + n1 + " " + n2 + " ---> " + op);
        assertEquals(expRes,
                Main.realizaOperacion(n1, n2, op),0.0);
    }

}
