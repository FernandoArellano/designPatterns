package composition.pattern;

public class Test {

    Corporation corporation;

    public static void main(String [] args){

        Test test = new Test();


    }

    public Test(){
        corporation = new Corporation();

        Division randd = new Division("R&D");
        randd.addCorporate(new VP("Fer","R&D"));
        randd.addCorporate(new VP("Fer2","R&D"));
        randd.addCorporate(new VP("Fer3","R&D"));
        
        Division sales = new Division("Sales");
        sales.addCorporate(new VP("Fer", "Sales"));
        sales.addCorporate(new VP("Fer2", "Sales"));
        sales.addCorporate(new VP("Fer3", "Sales"));

        Division westernSales = new Division("Western Sales");
        westernSales.addCorporate(new VP("Fer","Western Sales"));
        westernSales.addCorporate(new VP("Fer2","Western Sales"));
        westernSales.addCorporate(new VP("Fer3","Western Sales"));

        sales.addCorporate(westernSales);

        VP vp = new VP("Fer","Free");

        corporation.addCorporate(randd);
        corporation.addCorporate(sales);
        corporation.addCorporate(vp);

        corporation.print();

    }
}
