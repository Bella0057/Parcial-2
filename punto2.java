import java.util.Scanner;
public class facturaElectricidad {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double consumoKwh = pedirConsumo(sc);
        double valorKwh = pedirValor(sc);

        double subtotal = calcularSubtotal(consumoKwh, valorKwh);
        double totalFactura = calcularTotal(subtotal);

        System.out.println("Valor total de la factura es igual a: " + subtotal);
        System.out.println("Total de la factura: " + totalFactura);

        sc.close();
    }

    private static double pedirConsumo(Scanner scanner) {
        System.out.println("Ingrese el consumo KWh");
        return scanner.nextDouble();
    }

    private static double pedirValor(Scanner scanner) {
        System.out.println("Ingrese el valor KWh");
        return scanner.nextDouble();
    }

    private static double calcularSubtotal(double consumoKwh, double valorKwh) {
        return consumoKwh * valorKwh;
    }

    private static double calcularTotal(double subtotal) {
        return subtotal * 0.19 + 5000;
    }
}

