package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final Connection connection;

    public Util() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:2009/postgres",
                "postgres",
                "noygut");
    }

    public Connection getConnection() {
        // ushul methoddgo connectino nonhereditary
        return connection;
    }
}
