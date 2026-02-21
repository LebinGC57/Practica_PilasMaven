package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

	private Node top; // tope de la pila

	public boolean isEmpty() {
		return top == null;
	}
	
	public void initStack(char value) {
		top = new Node(value, top, 0); 
	}

	public void push(char value) {
		top = new Node(value, top, top.count); // el nuevo nodo apunta al anterior
	}
	
	public int size() {
		return top.count;
	}

	public char pop() {
		if (isEmpty()) {
			//throw new IllegalStateException("Stack is empty");
			return '0';
		}
		char value = top.value;
		top = top.next;
		return value;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack underflow");
		}
		return top.value;
	}

	// --- METODOS AGREGADOS PARA CUMPLIR CON LA TAREA ---

	// Metodo adicional para devolver cuants datos tiene la pila
	public int getCount() {
		if (isEmpty()) {
			return 0;
		}
		return top.count; // o simplemente return size();
	}

	// metodo que devuelve el nodo inicial de la pila (el del fondo)
	public Node getNodeInit() {
		if (isEmpty()) {
			return null;
		}
		
		Node current = top;
		// Recorremos la pila hacia abajo hasta que ya no haya un nodo siguiente
		while (current.next != null) {
			current = current.next;
		}
		
		return current; // Retornamos el nodo que encontramos hasta el final
	}
}