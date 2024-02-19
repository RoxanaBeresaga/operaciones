package Calculadora;

public class Operacion {
    private double numero1;
    private double numero2;

    // Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método constructor sin los atributos pasados por parámetro.
    public Operacion() {
        // Puedes inicializar los atributos con valores predeterminados si es necesario.
    }

    // Métodos get y set.
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Método para establecer los números a calcular
    public void establecerNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método sumar(): calcular la suma de los números.
    public double sumar() {
        return numero1 + numero2;
    }

    // Método restar(): calcular la resta de los números.
    public double restar() {
        return numero1 - numero2;
    }

    // Método multiplicar(): Se valida que no se haga una multiplicación por cero.
    // En ese caso, el método devuelve 0 y se le informa al usuario el error.
    // Si no, se hace la multiplicación.
    public double multiplicar() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        }
        return numero1 * numero2;
    }

    // Método dividir(): primero valida que no se haga una división por cero.
    // Dado ese caso, el método devuelve 0 y se le informa al usuario el error.
    // Si no, se hace la división y se devuelve el resultado.
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return numero1 / numero2;
    }
}

