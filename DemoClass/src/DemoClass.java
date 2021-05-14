import java.sql.*;
import java.util.ArrayList;

public class DemoClass {

    public static void main(String[] args) throws Exception {
        Person person = new Person("Gary","Anstey", 51, 411111,293847571);
        Person person1 = new Person("Shauna", "Anstey", 50, 3111111,293847572);
        Person person2 = new Person("Kyleigh", "Anstey", 21, 2111111111,293847573);
        Person person3 = new Person("Cam", "Anstey", 17, 1111111111,293847574);
        

        //create table - insert records into the db
        createTable();
        //insert
        insertPerson(person);
        insertPerson(person1);
        insertPerson(person2);
        insertPerson(person3);
        

        //print out selected persons
        System.out.println(selectPerson(4));
        for(Person p: findAllPeople()){
            System.out.println(p);
        }
        deletePerson(4);

        for(Person p: findAllPeople()){
            System.out.println(p);
        }

    }//end main
    
    //Delete Person Method

    public static Connection deletePerson(int id){
        Connection connection = null;
        Statement stmt = null;

        try {
            connection = getConnection();
            connection.setAutoCommit(false);

            stmt = connection.createStatement();
            String sql = "DELETE from MARK where ID=" + id + ";";
            stmt.executeUpdate(sql);
            connection.commit();
            connection.close();

            System.out.println("(Deleted Person "+ id + ") done successfully");
        } catch ( Exception e ) {
            System.out.println(e);
            connection = null;
        }
        return connection;

    }//end Delete Person Method
    
    //Select Person Method

    public static Person selectPerson(int id){
        Connection connection = null;
        Statement statement = null;
        Person person = new Person();
        try {
            connection = getConnection();
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM MARK where ID=" + id + ";");
            while ( rs.next() ) {
                person.setFirstName(rs.getString("firstname"));
                person.setLastName(rs.getString("lastname"));
                person.setAge(rs.getInt("age"));
                person.setCreditCard(rs.getInt("creditcard"));
                person.setSsn(rs.getInt("ssn"));
            }
            rs.close();
            statement.close();
            connection.close();

            System.out.println("(Select Person " + id + ") done successfully");
        } catch ( Exception e ) {
            System.out.println(e);
            person = null;
        }
            return person;

    }//end Select Person Method (Moved from Person.java)
    
    
    //Fins All People Method
    public static ArrayList<Person> findAllPeople(){
        Connection connection = null;
        Statement statement = null;
        ArrayList<Person> person = new ArrayList<>();

        try {
            connection = getConnection();
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM MARK;");
            while ( rs.next() ) {
                person.add(new Person(rs.getString("firstname"), rs.getString("lastname"), rs.getInt("age"), rs.getInt("creditcard"),rs.getInt("ssn")));
            }
            rs.close();
            statement.close();
            connection.close();

            System.out.println("(Find All People) done successfully");
        } catch ( Exception e ) {
            System.out.println(e);
            person = null;
        }
        return person;
    }//end Find All People Method
    
    //Insert Person Method (internal note - moved from Person.java)
    public static Connection insertPerson(Person person){
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            String sql = "INSERT INTO MARK (FIRSTNAME,LASTNAME,AGE,CREDITCARD,SSN) " +
                    "VALUES ("+
                          "'" + person.getFirstName() + "'," +
                          "'" + person.getLastName() + "'," +
                                person.getAge() + "," +
                                person.getCreditCard() + "," +
                                person.getSsn() + " );";
            statement.executeUpdate(sql);
            statement.close();
            connection.commit();
            connection.close();
        

            System.out.println("(Insert Person " + person.getFirstName() + " " + person.getLastName() + ") completed");
        } catch ( Exception e ) {
            System.out.println(e);
            connection = null;
        }

            return connection;
    }


    public static Connection createTable(){
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();

            statement = connection.createStatement();
            String sql = "CREATE TABLE MARK " +
                         "(ID INTEGER PRIMARY KEY        AUTOINCREMENT, " +
                         "FIRSTNAME           CHAR(30)   NOT NULL, " +
                         "LASTNAME            CHAR(30)   NOT NULL, " +
                         "AGE                 INT                , " +
                         "CREDITCARD          BIGINT             , " +
                         "SSN                 BIGINT             ) ";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();

            System.out.println("Table created successfully");
        }catch (Exception e){
            System.out.println(e);
            connection = null;
        }

        return connection;
    }

    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:MyDatabase.db");
            System.out.println("Opened database successfully");
        }catch (Exception e){
            System.out.println(e);
            connection = null;
        }

        return connection;
    }


}


