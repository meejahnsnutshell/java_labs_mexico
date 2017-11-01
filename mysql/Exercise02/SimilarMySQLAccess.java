package mysql.Exercise02;

import java.sql.*;
import java.util.ArrayList;

public class SimilarMySQLAccess {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        SimilarMySQLAccess exampledidoo = new SimilarMySQLAccess();

        try {
            exampledidoo.readDataBase();
        } catch (Exception e){
            System.out.println("error in readDataBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase() throws Exception {

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            // Setup the connection with the University DB.
            connection = DriverManager.getConnection("jdbc:mysql://localhost/University?" +
                    "user=root&password=Password123=false");

            // Statement to be able to issue SQL queries to the database
            statement = connection.createStatement();

            // Store the result of the SQL query in resultSet
            resultSet = statement.executeQuery("select * from University.students;");

            // Pass resultSet to mapResultSetToObjects, which returns an ArrayList containing results of
            // the SQL query
            ArrayList<Student> students = mapResultSetToObjects(resultSet);

            // iterate through every element in students and print it using toString
            for (Student s: students) {
                System.out.println(s.toString());
            }

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    // method to map a resultSet (of a SQL query) in an ArrayList. Instance vars in Student POJO match
    // columns in Students DB.
    private ArrayList<Student> mapResultSetToObjects(ResultSet resultSet) throws SQLException {

        ArrayList<Student> retList = new ArrayList();

        // next() iterates line by line (or row by row), until there are no more lines
        while (resultSet.next()) {
            Student stud = new Student();
            stud.setId(resultSet.getInt("id"));
            stud.setF_name(resultSet.getString("f_name"));
            stud.setL_name(resultSet.getString("l_name"));
            stud.setP_language(resultSet.getString("p_language"));
            stud.setEmail(resultSet.getString("email"));

            retList.add(stud);
        }

        return retList;
    }

    // close the DB connections
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }

}

