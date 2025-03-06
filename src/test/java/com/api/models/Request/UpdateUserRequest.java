package com.api.models.Request;

public class UpdateUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    // Default constructor
    public UpdateUserRequest() {}

    // Parameterized constructor
    public UpdateUserRequest(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
    

   // Builder Class
    public static class UserDetailsBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;

        public UserDetailsBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDetailsBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDetailsBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserDetailsBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UpdateUserRequest build() {
        	UpdateUserRequest updateUser = new UpdateUserRequest(firstName,lastName,email,mobileNumber);
            return updateUser;
        }
    }
}
