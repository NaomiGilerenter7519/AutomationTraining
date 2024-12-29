package dto;

import org.utilities.RandomUtils;

public class BookDTO {
    private String lastName;
    private String firstName;
    private String address;
    private String email;
    private String city;
    private String phone;

    public BookDTO() {
// Initialization with random data
        this.firstName = RandomUtils.randomFirstName();
        this.lastName = RandomUtils.randomLastName();
        this.address = RandomUtils.randomAddress();
        this.email = RandomUtils.randomEmail();
        this.city = RandomUtils.randomCity();
        this.phone = RandomUtils.randomTruePhone();
    }

    // Getters and Setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
