import Calculadora.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        // Se pasa los números para las operaciones
        operacion.establecerNumeros(100, 50);

        // Mostrar resultados
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
    }
}
