package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Candidate;

public class Dao {
    String url = "jdbc:mysql://localhost:3306/batch1194";
    String uname = "root";
    String pwd = "root";
    String sql = "SELECT * FROM batch1194.candidate;";
    String sqlinsert = "INSERT INTO batch1194.candidate VALUES (4, 'goa', 'pune', 'west', 'best', 'hest', 60);";

    public List<Candidate> getAllCandidates() {
        System.out.println("This is the DAO layer");
        List<Candidate> candidates = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, uname, pwd);
             Statement statement = connection.createStatement()) {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            // Execute Insert Query
            int rows = statement.executeUpdate(sqlinsert);
            if (rows > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Something went wrong with the insert query");
            }

            // Execute Select Query
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String partyName = rs.getString(3);
                String assembly = rs.getString(4);
                String stateName = rs.getString(5);
                String gender = rs.getString(6);
                int age = rs.getInt(7);

                Candidate candidate = new Candidate(name, age, assembly);
                candidates.add(candidate);

                System.out.println("Candidate name: " + name + ", Party name: " + partyName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return candidates;
    }
}
