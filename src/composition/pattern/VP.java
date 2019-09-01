package composition.pattern;

import java.util.Iterator;

public class VP extends Corporate {

    private String name;
    private String division;

    public VP(String name, String division){
        this.name = name;
        this.division = division;
    }

    public void print(){
        System.out.println(name + ":" + division);
    }

    public String getName(){
        return name;
    }

    public Iterator iterator(){
        return new VPIterator(this);
    }
}
