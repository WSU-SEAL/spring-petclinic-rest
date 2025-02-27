package graphql.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Generated by GraphQLify-Java: com.graphqlify.codegen.GraphQLifyAnnotationProcessor")
public class VetDtoInput implements Serializable {
  private String firstName;

  private String lastName;

  private List<SpecialtyDtoInput> specialties;

  private Integer id;

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

  public List<SpecialtyDtoInput> getSpecialties() {
    return this.specialties;
  }

  public void setSpecialties(List<SpecialtyDtoInput> specialties) {
    this.specialties = specialties;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
