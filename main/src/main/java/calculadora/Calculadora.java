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
                System.out.println(num1+num2);
                break;
            default:
                System.out.println("Error !");
        }
    }
}
