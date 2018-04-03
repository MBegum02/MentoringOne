package Jdbcdemo;
import java.sql.*;


public class ConnectToMySQLDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/Family";
    private static final String USER = "root";
    private static final String PASSWORD = "abc";


    public static void main(String[] args) {
        try {


            // 1. get a connection to database >OOP > OVERLOADING
            Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);

            //2. create a statement
            Statement myStmt = myConn.createStatement();


            //3. Execute a SQL Query
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM FamilyInfo");


            //4. Process the result set
            while (myRs.next()) {
                System.out.println("members" + myRs.getString("membersId") + " " +
                        " " + myRs.getString("LastName") + " " + myRs.getString("FirstName") + " " + myRs.getString("MembersDOB"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
