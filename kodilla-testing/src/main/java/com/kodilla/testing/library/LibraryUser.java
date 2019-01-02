package com.kodilla.testing.library;



public class LibraryUser {
    String firstname;
    String lastname;
    String peselID;

    public LibraryUser(String firstname, String lastname, String peselID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselID = peselID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselID() {
        return peselID;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselID='" + peselID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        if (!firstname.equals(that.firstname)) return false;
        if (!lastname.equals(that.lastname)) return false;
        return peselID.equals(that.peselID);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselID.hashCode();
        return result;
    }
}
