package template.pattern;

public abstract class Base {

    public void go(){
        init();
        getParts();
        assemble();
        test();
        finish();
    }

    public void init(){
        System.out.println("Starting robot");
    }

    public void getParts(){
        System.out.println("Getting parts");
    }

    public void assemble(){
        System.out.println("Assembling");
    }

    public void test(){
        System.out.println("Testing result");
    }

    public void finish(){
        System.out.println("Finished");
    }
}
