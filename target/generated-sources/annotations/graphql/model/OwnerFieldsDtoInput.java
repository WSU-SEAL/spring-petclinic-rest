package graphql.model;

import java.io.Serializable;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("Generated by GraphQLify-Java: com.graphqlify.codegen.GraphQLifyAnnotationProcessor")
public class OwnerFieldsDtoInput implements Serializable {
  private String firstName;

  private String lastName;

  private String address;

  private String city;

  private String telephone;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
}
