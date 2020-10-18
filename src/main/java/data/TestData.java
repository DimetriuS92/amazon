package data;

public enum TestData {
    LOGIN ("Combic@ukr.net", "Dima051292");

    private String email;
    private String password;

    private TestData(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
