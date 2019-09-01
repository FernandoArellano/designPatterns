package factory.pattern;

public abstract class ConnectionFactory {

    public abstract Connection getConnection(String type);
}
