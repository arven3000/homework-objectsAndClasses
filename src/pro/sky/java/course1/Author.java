package pro.sky.java.course1;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object otherAuthor){
        if(this == otherAuthor) return true;
        if(otherAuthor == null || this.getClass() != otherAuthor.getClass()) return false;
        Author author = (Author) otherAuthor;
        return this.firstName.equals(author.firstName) && this.lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
