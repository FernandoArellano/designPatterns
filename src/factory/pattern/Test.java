package factory.pattern;

public class Test {
    public static void main(String [] args){

        ConnectionFactory connectionFactory = new FirstConnectionFactory();

        Connection connection = connectionFactory.getConnection("Oracle");
        System.out.println(connection.description());

        connection = connectionFactory.getConnection("Mysql");
        System.out.println(connection.description());

        ConnectionFactory secureFactory = new SecureConnectionFactory();

        connection = secureFactory.getConnection("Oracle");
        System.out.println(connection.description());

        connection = secureFactory.getConnection("SqlServer");
        System.out.println(connection.description());
    }
}
