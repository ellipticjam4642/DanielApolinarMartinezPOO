public class operaciones{
    //Atributos 

    public double a; 
    public double b;

    //Metodos

    public double sumarNumeros (){
        return a+b;
    }

    public double restarNumeros(){
        restar a-b;
    }

    public double multiplicarNumeros(){
        return a*b; 
    }

    public static void main(String[] args) {
        Operaciones operaciones1 = new Operaciones();

        operaciones1.a =10;
        operaciones1.b =20;

        double suma = operaciones1.sumarNumeros();
        System.out.println("Resultado de suma es igual a") + suma);

        double resta = operaciones1.restarNumeros();
        System.out.println("Resultado de resta es igual a") + resta);

        double multiplicar = operaciones1.multiplicarNumeros();
        System.out.println("Resultado de multiplicacion es igual a") + multiplicar);


    
    }
}