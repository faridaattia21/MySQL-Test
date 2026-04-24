package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        try {
            String url="jdbc:mysql://localhost:3306/testdb";
            String user="root";
            String password="F@rida_SQL2026!";

            Connection con=DriverManager.getConnection(url,user,password);

            System.out.println("Connected Successfully");

        } catch(Exception e){
            System.out.println(e);
        }

    }

}
