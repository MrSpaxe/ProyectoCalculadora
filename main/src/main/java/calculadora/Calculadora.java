package calculadora;

public class Calculadora {
    int num1;
    int num2;
    
    public Calculadora(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void realizarOperacion(Operaciones operacion){
        switch (operacion) {
            case SUMA:
                System.out.println("Suma = "+suma(num1, num2));
                break;
            case RESTA:
                System.out.println("Resta = "+resta(num1, num2));
                break;
            case MULTIPLICACION:
                System.out.println("Multiplicacion = "+multiplicacion(num1, num2));
                break;
<<<<<<< HEAD
            case DIVISION:
                try {
                    System.out.println("Division = "+division(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
=======
>>>>>>> multiplicar
            default:
                System.out.println("Error !");
            
        }
    }
    private int suma(int num1, int num2) {
        return num1 + num2;
    }
    private int resta(int num1, int num2) {
        return num1 - num2;
    }
    private int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
<<<<<<< HEAD
    private double division(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double)num1 / num2;
    }
=======
>>>>>>> multiplicar
}
