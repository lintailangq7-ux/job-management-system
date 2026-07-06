package model;

public class Student {
    private int    gakusekiNo;        // 学籍番号 (PK)
    private String name;              // 氏名
    private String nameKana;          // 読み仮名
    private String classCode;         // クラス (FK)
    private String gender;            // 性別
    private String birthDate;         // 生年月日
    private String address;           // 住所
    private String phone;             // 電話番号
    private String email;             // メールアドレス
    private String desiredIndustry;   // 希望業界
    private String desiredOccupation; // 希望職種
    private String desiredLocation;   // 希望勤務地
    private int    shidouId;          // 指導ID (FK)
    private String status;            // 活動状況など

    // Getter & Setter（省略せずに全部書きます）
    public int getGakusekiNo() { return gakusekiNo; }
    public void setGakusekiNo(int gakusekiNo) { this.gakusekiNo = gakusekiNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getNameKana() { return nameKana; }
    public void setNameKana(String nameKana) { this.nameKana = nameKana; }

    public String getClassCode() { return classCode; }
    public void setClassCode(String classCode) { this.classCode = classCode; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDesiredIndustry() { return desiredIndustry; }
    public void setDesiredIndustry(String desiredIndustry) { this.desiredIndustry = desiredIndustry; }

    public String getDesiredOccupation() { return desiredOccupation; }
    public void setDesiredOccupation(String desiredOccupation) { this.desiredOccupation = desiredOccupation; }

    public String getDesiredLocation() { return desiredLocation; }
    public void setDesiredLocation(String desiredLocation) { this.desiredLocation = desiredLocation; }

    public Integer getShidouId() { return shidouId; }
    public void setShidouId(Integer shidouId) { this.shidouId = shidouId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}