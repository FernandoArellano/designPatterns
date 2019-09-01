package facade.pattern;

public class TerribleClass {

    char[] name = new char[5];

    public void setFirstChar(char c){
        name[0] = c;
    }

    public void setSecondChar(char c){
        name[1] = c;
    }
    public void setThirdChar(char c){
        name[2] = c;
    }
    public void setFourthChar(char c){
        name[3] = c;
    }
    public void setFifthChar(char c){
        name[4] = c;
    }

    public String getName(){
        return new String(name);
    }

}
