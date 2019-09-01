package iterator.pattern;

public class Division {

    private VP[] vps = new VP[100];
    private String name;
    private int counter= -1;

    public Division(String name){
        this.name = name;
    }

    public void addVP(String n){
        VP vp = new VP(n, name);
        vps[++counter] = vp;
    }

    public IteratorVP getIterator(){
        return new IteratorVP(vps);
    }
}
