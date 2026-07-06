package model;

public class Login {
    
    private int gakusekiBango;      // 学籍番号（FK）
    private String password;        // パスワード
    
    public Login() {}
    
    public int getGakusekiBango() { return gakusekiBango; }
    public void setGakusekiBango(int gakusekiBango) { this.gakusekiBango = gakusekiBango; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
