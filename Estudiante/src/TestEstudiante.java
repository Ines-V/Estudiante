public class TestEstudiante {
    public static void main(String[] args){
        Estudiante estudiantePedro=new Estudiante("Pedro", 18, 0);
        System.out.println(estudiantePedro);

        Estudiante estudianteMaria=new Estudiante("María", 19, 10);
        System.out.println(estudianteMaria);

        Estudiante estudianteJuan=new Estudiante("Juan", 20, 5);
        System.out.println(estudianteJuan);

        //Añadir estudiante con nota -1
        Estudiante estudianteMarcos=new Estudiante("Marcos", 18,-1);
        System.out.println(estudianteMarcos);

        //Añadir estudiante con nota 10.5
        Estudiante estudianteCarla=new Estudiante("Carla", 21,10.5);
        System.out.println(estudianteCarla);

        //Añadir estudiante sin nombre.
        Estudiante estudianteSofia=new Estudiante(" ", 18,7.5);
        System.out.println(estudianteSofia);

        //Añadir estudiante sin edad.
        Estudiante estudianteJuana=new Estudiante("Juana", -1, 8);
        System.out.println(estudianteJuana);
    }
}
