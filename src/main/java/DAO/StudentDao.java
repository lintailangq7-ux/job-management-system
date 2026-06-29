package DAO;  // パッケージ名は通常 "dao"（小文字）が一般的

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDao {

    private static final String URL = "jdbc:mysql://localhost:3306/jop_managment_system?useSSL=false&serverTimezone=Asia/Tokyo";
    private static final String USER = "root";
    private static final String PASS = "kcsf";

    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM student";

        try {
            // ドライバーを明示的にロード（念のため）
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(URL, USER, PASS);
                 PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    Student s = new Student();
                    s.setGakusekiNo(rs.getInt("gakuseki_no"));   // ★修正
                    s.setName(rs.getString("name"));
                    // 他の項目も必要に応じて追加
                    list.add(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("DB接続エラー: " + e.getMessage());
        }
        return list;
    }
}
