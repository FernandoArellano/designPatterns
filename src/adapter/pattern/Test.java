package adapter.pattern;

public class Test {
    public static void main(String [] args){

        Atos atosObject = new AtosObject();
        atosObject.setName("Fernando Arellano");

        Acme acme = new AtosToAcmeAdapter(atosObject);

        System.out.println("Nombre: " + acme.getName());
        System.out.println("Apellido: " + acme.getLastName());
    }
}

