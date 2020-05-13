package dao;

import dto.Address;

import java.util.List;

public interface AddressBookDao {

    Address addAddress(String recordNumber, Address address)
        throws AddressBookDaoException;
    Address removeAddress(String lastName)
        throws AddressBookDaoException;
    int countTotalAddress()
        throws AddressBookDaoException;
    List <Address> getAllAddresses()
        throws AddressBookDaoException;
    Address getAddress(String lastName)
        throws AddressBookDaoException;
    Address editAddress(String lastName);





}
