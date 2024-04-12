package asd.service;


import asd.model.Address;

import java.util.List;

public interface AddressService {
    Address addNewAddress(Address newAddress);
    List<Address> getAllAddress();
}
