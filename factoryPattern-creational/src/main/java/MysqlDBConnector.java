

public class MysqlDBConnector implements DBConnector {
    public void connect() {
    System.out.println("Connection with mysql DB successful!");
    }

    public void close() {
    System.out.println("Connection with Mysql has been closed successful!");
    }
    
}