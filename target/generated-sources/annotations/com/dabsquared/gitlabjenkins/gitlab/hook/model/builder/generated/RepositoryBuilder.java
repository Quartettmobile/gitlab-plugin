package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.Repository;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class RepositoryBuilder
    implements Cloneable {
  protected RepositoryBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$description$java$lang$String;
  protected boolean isSet$description$java$lang$String;
  protected String value$url$java$lang$String;
  protected boolean isSet$url$java$lang$String;
  protected String value$homepage$java$lang$String;
  protected boolean isSet$homepage$java$lang$String;
  protected String value$gitSshUrl$java$lang$String;
  protected boolean isSet$gitSshUrl$java$lang$String;
  protected String value$gitHttpUrl$java$lang$String;
  protected boolean isSet$gitHttpUrl$java$lang$String;
  protected Integer value$visibilityLevel$java$lang$Integer;
  protected boolean isSet$visibilityLevel$java$lang$Integer;

  /**
   * Factory Method to construct a RepositoryBuilder
   *
   * @return a new RepositoryBuilder
   */
  public static RepositoryBuilder repository() {
    return new RepositoryBuilder();
  }

  /**
   * Creates a new {@link RepositoryBuilder}.
   */
  public RepositoryBuilder() {
    self = (RepositoryBuilder)this;
  }

  /**
   * Sets the default value for the {@link Repository#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Repository#description} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withDescription(String value) {
    this.value$description$java$lang$String = value;
    this.isSet$description$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Repository#url} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withUrl(String value) {
    this.value$url$java$lang$String = value;
    this.isSet$url$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Repository#homepage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withHomepage(String value) {
    this.value$homepage$java$lang$String = value;
    this.isSet$homepage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Repository#gitSshUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withGitSshUrl(String value) {
    this.value$gitSshUrl$java$lang$String = value;
    this.isSet$gitSshUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Repository#gitHttpUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withGitHttpUrl(String value) {
    this.value$gitHttpUrl$java$lang$String = value;
    this.isSet$gitHttpUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Repository#visibilityLevel} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RepositoryBuilder withVisibilityLevel(Integer value) {
    this.value$visibilityLevel$java$lang$Integer = value;
    this.isSet$visibilityLevel$java$lang$Integer = true;
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
      RepositoryBuilder result = (RepositoryBuilder)super.clone();
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
  public RepositoryBuilder but() {
    return (RepositoryBuilder)clone();
  }

  /**
   * Creates a new {@link Repository} based on this builder's settings.
   *
   * @return the created Repository
   */
  public Repository build() {
    try {
      Repository result = new Repository();
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$description$java$lang$String) {
        result.setDescription(value$description$java$lang$String);
      }
      if (isSet$url$java$lang$String) {
        result.setUrl(value$url$java$lang$String);
      }
      if (isSet$homepage$java$lang$String) {
        result.setHomepage(value$homepage$java$lang$String);
      }
      if (isSet$gitSshUrl$java$lang$String) {
        result.setGitSshUrl(value$gitSshUrl$java$lang$String);
      }
      if (isSet$gitHttpUrl$java$lang$String) {
        result.setGitHttpUrl(value$gitHttpUrl$java$lang$String);
      }
      if (isSet$visibilityLevel$java$lang$Integer) {
        result.setVisibilityLevel(value$visibilityLevel$java$lang$Integer);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
