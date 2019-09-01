package factory.pattern;

public class SecureConnectionFactory extends ConnectionFactory {
    @Override
    public Connection getConnection(String type) {

        if(type.equals("Oracle")){
            return new OracleSecureConnection();
        }
        return new MySqlSecureConnection();
    }
}
