package dto;

public class Address {

    private String firstName;
    private String lastName;
    private String streetAddress;

    public Address(){
    }

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

    public String getStreetAddress(){
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }

//    public String getRecordNumber(){
//        return recordNumber;
//    }



}
