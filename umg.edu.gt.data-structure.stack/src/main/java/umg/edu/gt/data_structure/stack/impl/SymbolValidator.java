package umg.edu.gt.data_structure.stack.impl;

import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class SymbolValidator {
	
	public boolean isBalanced(String s) {
        // jalamos nuestra propia pila manual, nada de java
        StackLinked stack = new StackLinked();
        
        for (char c : s.toCharArray()) {
            
            // si es de apertura lo metemos a la pila
            if (c == '(' || c == '[' || c == '{') {
                if (stack.isEmpty()) {
                    // usamos el init para el primerito
                    stack.initStack(c); 
                } else {
                    // para los demas le damos push normal
                    stack.push(c); 
                }
            } 
            // si es de cierre evaluamos 
            else if (c == ')' || c == ']' || c == '}') {
                
                // si la pila esta vacia y llega un cierre, se jode
                if (stack.isEmpty()) return false;
                
                // sacamos el que esta arriba
                char top = stack.pop();
                
                // revisamos si hacen su pareja correcta
                if (!isPair(top, c)) return false;
            }
        }
        
        // si la pila quedo limpia al final, todo bien
        return stack.isEmpty();
    }
	
    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
    }
}