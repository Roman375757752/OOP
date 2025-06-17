package User;

public class User {
    private String name;
    private String email;
    private boolean isActive;

    public User(String name, String email, boolean isActive) {
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }


    public void activate() {
        isActive = true;
    }

    public void deactivate() {
        isActive = false;
    }

    public void displayInfo() {
        System.out.println("Пользователь: " + name + ", email: " + email + ", статус: " + (isActive ? "активен" : "неактивен"));
    }

    public boolean getStatus() {
        return isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public String toString() {
        return name + " <" + email + "> (" + (isActive ? "активен" : "неактивен") + ")";
    }
}