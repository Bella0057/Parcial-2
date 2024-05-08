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

        


        sc.close();
    }
}
