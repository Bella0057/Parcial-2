import java.util.Scanner; 
public class examen {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese el consumo KWh");
        double consumoKwh = sc.nextDouble();

        System.out.println("Ingrese el valor KWh");
        double valorKwh = sc.nextDouble();

        double subtotal = consumoKwh * valorKwh;
        System.out.println("Valor total de la factura es igual a: " + subtotal  );

        // Calcular IVA

        double totalFactura = subtotal * 0.19 + 5000;
        System.out.println("Total de la factura:" +  totalFactura);

        //EJERCICIO #2

        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = sc.nextInt();
        double[] notas = new double[numeroEstudiantes];
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double promedio = 0;
        for (int i = 0; i < numeroEstudiantes; i++) {
            promedio += notas[i];
        }
        promedio /= numeroEstudiantes;
        System.out.println("El promedio de notas es: " + promedio);


        sc.close();
    }
}