public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", 18, 90.0, 1.78);
        Persona persona2 = new Persona("Tomas Lopez", 25, 83.0, 1.70);
        Persona persona3 = new Persona("Fernando Hidalgo", 28, 95.0, 1.80);
        Persona persona4 = new Persona("Cesar Baron", 30, 70.0, 1.64);
        Persona persona5 = new Persona("Javier Venegas", 31, 80.0, 1.81);

        Persona[] personas = {persona1, persona2, persona3, persona4, persona5};

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ":");
            System.out.println("Calculando su IMC...");
            double imc = persona.calcularIMC();
            System.out.printf("Su índice de masa corporal es de: %.1f\n", imc);
            System.out.println("Usted se encuentra con " + persona.clasificarIMC());
            System.out.println("Su edad es de: " + persona.getEdad());
            if (persona.esMayorDeEdad()) {
                System.out.println("Su edad es mayor de edad");
            }else {
                System.out.println("Usted es menor de edad");
            }
            System.out.println(persona);
            System.out.println();
        }
    }
}
