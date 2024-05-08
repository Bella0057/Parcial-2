import java.util.Scanner;
public class punto2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //PUNTO #2

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
