package facade.pattern;

public class Facade {

    TerribleClass terribleClass = new TerribleClass();

    public void setName(String n){

        if(n.length()>0){
            terribleClass.setFirstChar(n.toCharArray()[0]);
        }

        if(n.length()>1){
            terribleClass.setSecondChar(n.toCharArray()[1]);
        }
        if(n.length()>2){
            terribleClass.setThirdChar(n.toCharArray()[2]);
        }
        if(n.length()>3){
            terribleClass.setFourthChar(n.toCharArray()[3]);
        }
        if(n.length()>4){
            terribleClass.setFifthChar(n.toCharArray()[4]);
        }
    }

    public String getName(){
        return terribleClass.getName();
    }
}
