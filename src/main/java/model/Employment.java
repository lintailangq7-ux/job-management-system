package model;

import java.sql.Date;
import java.time.LocalDateTime;

public class Employment {
    
    private int shidouId;           // 指導ID (PK?)
    private String gakusekiNo;          // 学籍番号 (FK)
    private int companyId;          // 会社ID (FK)
    
    private String activityStatus;      // 活動状況
    private String companyName;         // 会社名（未定の場合など）
    private String testVenue;           // 試験会場
    private Integer scheduledDays;      // 予定日数
    private Date activityDate;          // 活動日
    private String submissionStatus;    // 提出状況
    private String desiredInfo;         // 希望情報
    private String examTime;            // 試験時間
    private LocalDateTime finalOfferDeadline; // 内定確定期限
    private String result;              // 結果（内定・不採用など）
    
    // コンストラクタ
    public Employment() {}

    // Getter & Setter
    public Integer getShidouId() {
        return shidouId;
    }

    public void setShidouId(int shidouId) {
        this.shidouId = shidouId;
    }

    public String getGakusekiNo() {
        return gakusekiNo;
    }

    public void setGakusekiNo(String gakusekiNo) {
        this.gakusekiNo = gakusekiNo;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTestVenue() {
        return testVenue;
    }

    public void setTestVenue(String testVenue) {
        this.testVenue = testVenue;
    }

    public Integer getScheduledDays() {
        return scheduledDays;
    }

    public void setScheduledDays(Integer scheduledDays) {
        this.scheduledDays = scheduledDays;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public String getDesiredInfo() {
        return desiredInfo;
    }

    public void setDesiredInfo(String desiredInfo) {
        this.desiredInfo = desiredInfo;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public LocalDateTime getFinalOfferDeadline() {
        return finalOfferDeadline;
    }

    public void setFinalOfferDeadline(LocalDateTime finalOfferDeadline) {
        this.finalOfferDeadline = finalOfferDeadline;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}