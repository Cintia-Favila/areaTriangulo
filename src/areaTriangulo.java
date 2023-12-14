import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float base;
        float altura;
        float area;

        System.out.println("Ingrese la base del triangulo");
        base = scanner.nextFloat();

        System.out.println("Ingrese la altura del triangulo");
        altura = scanner.nextFloat();

        area = (base*altura)/2;

        System.out.println("El area del triangulo es: "+area);
    }
}