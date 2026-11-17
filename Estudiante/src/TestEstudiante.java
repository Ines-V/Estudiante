public class TestEstudiante {
    public static void main(String[] args){
        try{
            //Estudiante con nota 0
            Estudiante estudiantePedro=new Estudiante("Pedro", 18, 0);
            System.out.println(estudiantePedro);
            System.out.println("---------");
            estudiantePedro.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("/////");

        try{
            //Estudiante con nota 10
            Estudiante estudianteMaria=new Estudiante("María", 19, 10);
            System.out.println(estudianteMaria);
            System.out.println("---------");
            estudianteMaria.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("/////");

        try{
            //Añadir estudiante con nota -1
            Estudiante estudianteMarcos=new Estudiante("Marcos", 18,-1);
            System.out.println(estudianteMarcos);
            System.out.println("---------");
            estudianteMarcos.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("/////");

        try{
            //Añadir estudiante con nota 10.5
            Estudiante estudianteCarla=new Estudiante("Carla", 21,10.5);
            System.out.println(estudianteCarla);
            System.out.println("---------");
            estudianteCarla.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("/////");

        try{
            //Estudiante con nota 5.
            Estudiante estudianteJuan=new Estudiante("Juan", 20, 5);
            System.out.println(estudianteJuan);
            System.out.println("---------");
            estudianteJuan.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("/////");

        try{
            //Añadir estudiante sin nombre.
            Estudiante estudianteSofia=new Estudiante(" ", 18,7.5);
            System.out.println(estudianteSofia);
            System.out.println("---------");
            estudianteSofia.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("/////");

        try{
            //Añadir estudiante sin edad.
            Estudiante estudianteJuana=new Estudiante("Juana", -1, 8);
            System.out.println(estudianteJuana);
            System.out.println("---------");
            estudianteJuana.mostrarInformacion();
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
