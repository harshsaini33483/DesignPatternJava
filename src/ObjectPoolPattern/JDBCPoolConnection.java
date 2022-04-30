package ObjectPoolPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPoolConnection extends ObjectPool<Connection> {

    private String dsn, usr, pwd;

    public JDBCPoolConnection(String driver, String dsn, String usr, String pwd) {
      super();
      try {
        Class.forName(driver).newInstance();
      } catch (Exception e) {
        e.printStackTrace();
      }
      this.dsn = dsn;
      this.usr = usr;
      this.pwd = pwd;
    }

    protected Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }


    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}