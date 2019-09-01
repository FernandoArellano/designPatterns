package adapter.pattern;

public class AtosToAcmeAdapter implements Acme {

    public AtosToAcmeAdapter(Atos atos){
        this.atos = atos;
        this.name = this.atos.getName().split(" ")[0];
        this.lastName = this.atos.getName().split(" ")[1];
    }

    private Atos atos;
    private String name;
    private String lastName;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
