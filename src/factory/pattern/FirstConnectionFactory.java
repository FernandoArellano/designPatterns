package factory.pattern;

public class FirstConnectionFactory extends ConnectionFactory {
    @Override
    public Connection getConnection(String type) {
        if(type.equals("Oracle")){
            return new OracleConnection();
        }
        else return new MysqlConnection();
    }
}
