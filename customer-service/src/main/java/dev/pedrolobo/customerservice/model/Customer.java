package dev.pedrolobo.customerservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import dev.pedrolobo.customerservice.utils.Gender;

@Data
@Entity
@Builder
@Table(name = "tb_customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Gender gender;

  private String email;

  private String telephone;

  @Temporal(TemporalType.DATE)
  private LocalDate birthDay;
  
  @OneToOne(cascade=CascadeType.ALL)
  private CustomerAddress address;

}
