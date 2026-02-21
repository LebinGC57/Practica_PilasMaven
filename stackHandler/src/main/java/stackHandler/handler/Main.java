package stackHandler.handler;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;

public class Main {
    public static void main(String[] args) {
        SymbolValidator validator = new SymbolValidator();
        System.out.println("PRUEBAS DE VALIDACION DE EXPRESIONES");

        // Caso valido exacto que pide la tarea
        String testValido = "(a+b) * [c-d]";
        boolean resultadoValido = validator.isBalanced(testValido);
        System.out.println("Prueba 1: " + testValido + " -> " + resultadoValido);

        // Caso invalido exacto que pide la tarea
        String testInvalido = "([)]";
        boolean resultadoInvalido = validator.isBalanced(testInvalido);
        System.out.println("Prueba 2: " + testInvalido + " -> " + resultadoInvalido);
    }
}