public class App {
    public static void main(String[] args) {
        JDBC conn = new MsSQL();
        conn.getConnection();
    }
}
