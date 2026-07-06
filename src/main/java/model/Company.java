package model;

public class Company {
    private int companyId;        // 企業ID (PK)
    private String companyName;       // 企業名
    private String industry;          // 業種
    private String address;           // 所在地
    private String phone;             // 電話番号
    private String email;             // メールアドレス
    private String hiringStatus;      // 採用実績など

    // Getter & Setter
    public int getCompanyId() { return companyId; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getIndustry() { return industry; }
    public void setIndustry(String industry) { this.industry = industry; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getHiringStatus() { return hiringStatus; }
    public void setHiringStatus(String hiringStatus) { this.hiringStatus = hiringStatus; }
}