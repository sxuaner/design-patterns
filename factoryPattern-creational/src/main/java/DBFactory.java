
public class DBFactory {
    private DBConnector dbc;
    public DBFactory(String db){
        if(db.equalsIgnoreCase("mysql")){
            this.dbc= new MysqlDBConnector();
        }
        else{
            System.out.println("Wrong db name! Check again");
        }
    }

    public void connectToDB() {
        dbc.connect();
    }

    public void CloseDB() {
        dbc.close();
    }
}
