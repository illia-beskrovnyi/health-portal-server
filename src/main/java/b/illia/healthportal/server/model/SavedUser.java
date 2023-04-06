package b.illia.healthportal.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SavedUser
 */

public class SavedUser {

  private Long id;

  private String username;

  private String firstName;

  private String lastName;

  private String email;

  private Boolean superuser = false;

  /**
   * Default constructor
   * @deprecated Use {@link SavedUser#SavedUser(Long, String, String, String, String)}
   */
  @Deprecated
  public SavedUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SavedUser(Long id, String username, String firstName, String lastName, String email) {
    this.id = id;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public SavedUser id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SavedUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @NotNull 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SavedUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SavedUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SavedUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SavedUser superuser(Boolean superuser) {
    this.superuser = superuser;
    return this;
  }

  /**
   * Get superuser
   * @return superuser
  */
  
  @Schema(name = "superuser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superuser")
  public Boolean getSuperuser() {
    return superuser;
  }

  public void setSuperuser(Boolean superuser) {
    this.superuser = superuser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedUser savedUser = (SavedUser) o;
    return Objects.equals(this.id, savedUser.id) &&
        Objects.equals(this.username, savedUser.username) &&
        Objects.equals(this.firstName, savedUser.firstName) &&
        Objects.equals(this.lastName, savedUser.lastName) &&
        Objects.equals(this.email, savedUser.email) &&
        Objects.equals(this.superuser, savedUser.superuser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, superuser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    superuser: ").append(toIndentedString(superuser)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

