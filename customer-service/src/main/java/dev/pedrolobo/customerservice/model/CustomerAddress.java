package dev.pedrolobo.customerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "tb_customer_address")
public class CustomerAddress {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String streetName;

  private int houseNumber;

  private String neighborhoodName;

  private String cityName;

  private String state;
  
  private String zipCode;

}
