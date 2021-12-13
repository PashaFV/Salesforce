package models;

public class Account {
    String accountName;
    String webSite;
    String type;
    String phone;
    String employees;
    String industry;
    String description;
    String billingStreet;
    String shippingStreet;

    public Account(String accountName, String webSite, String type, String phone, String employees, String industry, String description, String billingStreet, String shippingStreet) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.phone = phone;
        this.employees = employees;
        this.industry = industry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
}
