class MysqlDatabase1 implements Database1 {
    public void persist(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}


class PostgresDatabase implements Database1 {
    public void persist(String data) {
        System.out.println("Saving data to PostgreSQL: " + data);
    }
}

public class User {
    Database1 database;

    public User(Database1 database) {
        this.database = database;
    }

    public void add(String data) {
        database.persist(data);
    }

    public static void main(String[] args) {
        Database1 db = new MysqlDatabase1();
        Database1 db2 = new PostgresDatabase();

        User user = new User(db);
        user.add("Test Data MysqlDatabase");

        User user1 = new User(db2);
        user1.add("Test Data PostgreSQL");
    }
}
