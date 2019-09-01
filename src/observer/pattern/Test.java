package observer.pattern;

public class Test {

    public static void main(String [] args){
        Database database = new Database();

        Client client = new Client();
        Boss boss = new Boss();

        database.addObserver(client);
        database.addObserver(boss);

        database.editRecord("delete", "delete fer");

    }
}
