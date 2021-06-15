package unitests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testacalc {
    @Test

    public void testarSomarDoisNumeros(){
        int num1 = 2;
        int num2 = 2;
        int resultadoEsperado = 4;

      int resultadoAtual = Calc.somarDoisNumeros(num1,num2);

      assertEquals(resultadoEsperado, resultadoAtual);
        // 3 - Validar - Then
        System.out.println("O resultado Esperado é " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado,resultadoAtual);
    }


