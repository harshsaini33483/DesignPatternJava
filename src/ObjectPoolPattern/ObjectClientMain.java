package ObjectPoolPattern;

import java.sql.Connection;

public class ObjectClientMain {
     // Create the ConnectionPool:
     JDBCPoolConnection pool = new JDBCPoolConnection(
        "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
        "sa", "secret");
  
      // Get a connection:
      Connection con = pool.checkOut();
  
      // Use the connection
        //Copied from
    // https://sourcemaking.com/design_patterns/object_pool
  
      // Return the connection:
      pool.checkIn(con);
}
