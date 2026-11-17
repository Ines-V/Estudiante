public class Estudiante {

    //Las variables que se van a usar deben de estar privadas.
    private String nombre;
    private int edad;
    private double nota;
    private static int totalEstudiantes=0; //Empieza el contador a 0 porque no hay estudiantes registrados todavia.

    public Estudiante(String nombre, int edad, double nota) {
        setNombre(nombre);
        setEdad(edad);
        setNota(nota);

        //Si los datos del estudiante estan bien se suma 1 al total de estudiantes. Sino, no.
        totalEstudiantes++;
    }

    //Setters y Getters dfe los valores.
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        //Si no hay nombre escrito salta error.
        if (nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de añadir nombre del estudiante.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
        //Si la edad es negativa salta error.
        if(edad<0){
            throw new IllegalArgumentException("La edad debe ser igual o mayor que 0.");
        }
        this.edad = edad;
    }

    public double isNota() {

        return nota;
    }

    public void setNota(double nota) {
        //Si la nota es negativa o mayor que 10 salta error.
        if (nota<0.00 || nota>10.00) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
        }
        this.nota = nota;
    }

    public int getTotalEstudiantes() {

        return totalEstudiantes;
    }

    public void setTotalEstudiantes(int totalEstudiantes) {

        this.totalEstudiantes = totalEstudiantes;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Nota: "+ nota);
        System.out.println("Total estudiantes: "+ totalEstudiantes);
    }

    // toString para que se impriman los resultados en TestEstudiante.
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota=" + nota +
                ", totalEstudiantes=" + totalEstudiantes +
                '}';
    }
}
