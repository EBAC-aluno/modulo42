package dev.pedrolobo.customerservice.service;

import org.springframework.stereotype.Service;

import dev.pedrolobo.customerservice.dto.CustomerRequest;
import dev.pedrolobo.customerservice.model.CustomerAddress;
import dev.pedrolobo.customerservice.model.Customer;
import dev.pedrolobo.customerservice.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final ICustomerRepository customerRepository;

  public void add(CustomerRequest customerRequest) {
    CustomerAddress address = CustomerAddress.builder()
        .streetName(customerRequest.getAddress().getStreetName())
        .houseNumber(customerRequest.getAddress().getHouseNumber())
        .neighborhoodName(customerRequest.getAddress().getNeighborhoodName())
        .cityName(customerRequest.getAddress().getCityName())
        .state(customerRequest.getAddress().getState())
        .zipCode(customerRequest.getAddress().getZipCode())
        .build();

    Customer customer = Customer.builder()
        .name(customerRequest.getName())
        .gender(customerRequest.getGender())
        .email(customerRequest.getEmail())
        .birthDay(customerRequest.getBirthDay())
        .telephone(customerRequest.getTelephone())
        .address(address)
        .build();

    customerRepository.save(customer);
  }

}
