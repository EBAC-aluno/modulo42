package dev.pedrolobo.customerservice.controller;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.pedrolobo.customerservice.dto.CustomerRequest;
import dev.pedrolobo.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/customer-service")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void save(@RequestBody CustomerRequest customerRequest) {
    customerService.add(customerRequest);
  }

  @GetMapping
  public String getCustomerById() {
    return "João";
  }

}
