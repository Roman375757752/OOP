public class Customer {
    private final String email;
    private final String phone;

    public Customer(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}