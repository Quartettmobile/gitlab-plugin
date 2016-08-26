package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.User;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class UserBuilder
    implements Cloneable {
  protected UserBuilder self;
  protected Integer value$id$java$lang$Integer;
  protected boolean isSet$id$java$lang$Integer;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$username$java$lang$String;
  protected boolean isSet$username$java$lang$String;
  protected String value$email$java$lang$String;
  protected boolean isSet$email$java$lang$String;
  protected String value$avatarUrl$java$lang$String;
  protected boolean isSet$avatarUrl$java$lang$String;

  /**
   * Factory Method to construct a UserBuilder
   *
   * @return a new UserBuilder
   */
  public static UserBuilder user() {
    return new UserBuilder();
  }

  /**
   * Creates a new {@link UserBuilder}.
   */
  public UserBuilder() {
    self = (UserBuilder)this;
  }

  /**
   * Sets the default value for the {@link User#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserBuilder withId(Integer value) {
    this.value$id$java$lang$Integer = value;
    this.isSet$id$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link User#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link User#username} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserBuilder withUsername(String value) {
    this.value$username$java$lang$String = value;
    this.isSet$username$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link User#email} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserBuilder withEmail(String value) {
    this.value$email$java$lang$String = value;
    this.isSet$email$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link User#avatarUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserBuilder withAvatarUrl(String value) {
    this.value$avatarUrl$java$lang$String = value;
    this.isSet$avatarUrl$java$lang$String = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      UserBuilder result = (UserBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public UserBuilder but() {
    return (UserBuilder)clone();
  }

  /**
   * Creates a new {@link User} based on this builder's settings.
   *
   * @return the created User
   */
  public User build() {
    try {
      User result = new User();
      if (isSet$id$java$lang$Integer) {
        result.setId(value$id$java$lang$Integer);
      }
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$username$java$lang$String) {
        result.setUsername(value$username$java$lang$String);
      }
      if (isSet$email$java$lang$String) {
        result.setEmail(value$email$java$lang$String);
      }
      if (isSet$avatarUrl$java$lang$String) {
        result.setAvatarUrl(value$avatarUrl$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
