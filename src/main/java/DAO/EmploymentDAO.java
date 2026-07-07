package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ModelEmployment;

public class EmploymentDAO {   // 指導＋就職情報

    private static final String URL = "jdbc:mysql://localhost:3306/jop_managment_system?useSSL=false&serverTimezone=Asia/Tokyo";
    private static final String USER = "root";
    private static final String PASS = "kcsf";

    /**
     * 就職情報（指導含む）を全件取得
     */
    public List<ModelEmployment> findAll() {
        List<ModelEmployment> list = new ArrayList<>();

        String sql = "SELECT 就職情報ID, 指導ID, 学籍番号, 企業ID, 選考状況1, 選考状況2, " +
                     "選考状況3, 選考状況4, 選考状況5, 予定日数, 勤務地, 試験情報, " +
                     "提出状況, 試験会場, 試験時間, 内定承諾期限, 備考 " +
                     "FROM 就職情報 " +
                     "ORDER BY 就職情報ID";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(URL, USER, PASS);
                 PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                	ModelEmployment e = new ModelEmployment();

                    e.setShushokuJohoId(rs.getInt("就職情報ID"));
                    e.setShidoId(rs.getInt("指導ID"));
                    e.setGakusekiBango(rs.getInt("学籍番号"));
                    e.setKigyouId(rs.getInt("企業ID"));
                    e.setSenkoJokyo1(rs.getString("選考状況1"));
                    e.setSenkoJokyo2(rs.getString("選考状況2"));
                    e.setSenkoJokyo3(rs.getString("選考状況3"));
                    e.setSenkoJokyo4(rs.getString("選考状況4"));
                    e.setSenkoJokyo5(rs.getString("選考状況5"));
                    e.setYoteiNissu(rs.getDate("予定日数"));
                    e.setKinmuChi(rs.getString("勤務地"));
                    e.setShikenJoho(rs.getString("試験情報"));
                    e.setTeishutsuJokyo(rs.getInt("提出状況"));
                    e.setShikenKaijo(rs.getString("試験会場"));
                    e.setShikenJikan(rs.getTime("試験時間"));
                    e.setNaiteiShodakuKigen(rs.getDate("内定承諾期限"));
                    e.setBiko(rs.getString("備考"));

                    list.add(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("就職情報取得エラー: " + e.getMessage());
        }
        return list;
    }
    
    /**
     * 指定した学籍番号の指導情報（就職情報）を取得
     * @param gakusekiBango 学籍番号
     * @return 就職情報リスト（1人の学生が複数の企業に応募している場合を考慮）
     */
    public List<ModelEmployment> findByGakusekiBango(int gakusekiBango) {
        List<ModelEmployment> list = new ArrayList<>();

        String sql = "SELECT 就職情報ID, 指導ID, 学籍番号, 企業ID, " +
                     " 選考状況1, 選考状況2, 選考状況3, 選考状況4, 選考状況5, " +
                     " 予定日数, 勤務地, 試験情報, 提出状況, 試験会場, " +
                     " 試験時間, 内定承諾期限, 備考 " +
                     "FROM 就職情報 " +
                     "WHERE 学籍番号 = ? " +
                     "ORDER BY 就職情報ID";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(URL, USER, PASS);
                 PreparedStatement ps = con.prepareStatement(sql)) {   // ← ここまででps作成

                ps.setInt(1, gakusekiBango);   

                try (ResultSet rs = ps.executeQuery()) {

                    while (rs.next()) {
                    	ModelEmployment e = new ModelEmployment();

                        e.setShushokuJohoId(rs.getInt("就職情報ID"));
                        e.setShidoId(rs.getInt("指導ID"));
                        e.setGakusekiBango(rs.getInt("学籍番号"));
                        e.setKigyouId(rs.getInt("企業ID"));
                        e.setSenkoJokyo1(rs.getString("選考状況1"));
                        e.setSenkoJokyo2(rs.getString("選考状況2"));
                        e.setSenkoJokyo3(rs.getString("選考状況3"));
                        e.setSenkoJokyo4(rs.getString("選考状況4"));
                        e.setSenkoJokyo5(rs.getString("選考状況5"));
                        e.setYoteiNissu(rs.getDate("予定日数"));
                        e.setKinmuChi(rs.getString("勤務地"));
                        e.setShikenJoho(rs.getString("試験情報"));
                        e.setTeishutsuJokyo(rs.getInt("提出状況"));
                        e.setShikenKaijo(rs.getString("試験会場"));
                        e.setShikenJikan(rs.getTime("試験時間"));
                        e.setNaiteiShodakuKigen(rs.getDate("内定承諾期限"));
                        e.setBiko(rs.getString("備考"));

                        list.add(e);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("就職情報取得エラー: " + e.getMessage());
        }
        return list;
    }
}
