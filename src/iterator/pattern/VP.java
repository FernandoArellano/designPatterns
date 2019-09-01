package iterator.pattern;

public class VP {

    private String name;
    private String division;

    public VP(String name, String division){
        this.name = name;
        this.division =division;
    }

    public void print(){
        System.out.println(name + ":" + division);
    }

    public String getName(){
        return name;
    }
}
