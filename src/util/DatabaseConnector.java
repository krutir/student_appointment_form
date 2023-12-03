package util;

import java.sql.*;
import java.util.ArrayList;
import model.student;

/**
 * Database Connector class for interacting with database
 * @author Kruti
 */
public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private DatabaseConnector() {
        // Private constructor to prevent object creation
    }

    public static void addStudent(student newStudent) {
        String query = "INSERT INTO appointment (fName, lName, stuID, email, phone, appointmentReason, fieldOfStudy, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, newStudent.getfName());
            stmt.setString(2, newStudent.getlName());
            stmt.setString(3, newStudent.getStuId());
            stmt.setString(4, newStudent.getEmail());
            stmt.setString(5, newStudent.getPhone());
            stmt.setString(6, newStudent.getAppointmentReason());
            stmt.setString(7, newStudent.getFieldOfStudy());
            stmt.setDate(8, new java.sql.Date(newStudent.getDate().getTime())); // Assuming getDate() returns a java.util.Date

            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<student> getAllAppointments() {
        ArrayList<student> appointments = new ArrayList<>();

        String query = "SELECT * FROM appointment";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                student s = new student();
                s.setfName(rs.getString("fName"));
                s.setlName(rs.getString("lName"));
                s.setStuId(rs.getString("stuID")); 
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                s.setAppointmentReason(rs.getString("appointmentReason"));
                s.setFieldOfStudy(rs.getString("fieldOfStudy"));
                s.setDate(rs.getDate("date"));
               

                appointments.add(s);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }
}
