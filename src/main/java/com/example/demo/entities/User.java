package com.example.demo.entities;

import java.awt.PrintJob;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Builder
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "name")
  private String name;
  @Column(name = "email")
  private String email;
  @Column(name = "password")
  private String password;
  @OneToOne(mappedBy = "user")
  private Profile profile;
  @OneToMany(mappedBy = "user")
  @Builder.Default
  private List<Address> addresses = new ArrayList(); 

  public void addAddress(Address address){
    addresses.add(address);
    address.setUser(this);
  }
  public void removeAddress(Address address){
    addresses.remove(address);
    address.setUser(null);
  }

  public void addProfile(Profile profile){
    this.profile = profile;
    profile.setUser(this);
  }
}
