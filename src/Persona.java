public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean esMayorDeEdad() {
        return edad > 18;
    }

    public String clasificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        }else {
            return "Obesidad";
        }
    }
    public String toString() {
        return "Persona [nombre = " + nombre + ", edad = " + edad +
                ", peso = " + peso + ", altura = " + altura + "]";
    }
}
