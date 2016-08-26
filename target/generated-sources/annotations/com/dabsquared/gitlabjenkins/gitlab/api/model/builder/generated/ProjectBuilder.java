package com.dabsquared.gitlabjenkins.gitlab.api.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.api.model.Namespace;
import com.dabsquared.gitlabjenkins.gitlab.api.model.Project;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class ProjectBuilder
    implements Cloneable {
  protected ProjectBuilder self;
  protected Integer value$id$java$lang$Integer;
  protected boolean isSet$id$java$lang$Integer;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected Namespace value$namespace$com$dabsquared$gitlabjenkins$gitlab$api$model$Namespace;
  protected boolean isSet$namespace$com$dabsquared$gitlabjenkins$gitlab$api$model$Namespace;
  protected String value$webUrl$java$lang$String;
  protected boolean isSet$webUrl$java$lang$String;
  protected String value$sshUrlToRepo$java$lang$String;
  protected boolean isSet$sshUrlToRepo$java$lang$String;
  protected String value$httpUrlToRepo$java$lang$String;
  protected boolean isSet$httpUrlToRepo$java$lang$String;

  /**
   * Factory Method to construct a ProjectBuilder
   *
   * @return a new ProjectBuilder
   */
  public static ProjectBuilder project() {
    return new ProjectBuilder();
  }

  /**
   * Creates a new {@link ProjectBuilder}.
   */
  public ProjectBuilder() {
    self = (ProjectBuilder)this;
  }

  /**
   * Sets the default value for the {@link Project#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withId(Integer value) {
    this.value$id$java$lang$Integer = value;
    this.isSet$id$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#namespace} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withNamespace(Namespace value) {
    this.value$namespace$com$dabsquared$gitlabjenkins$gitlab$api$model$Namespace = value;
    this.isSet$namespace$com$dabsquared$gitlabjenkins$gitlab$api$model$Namespace = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#webUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withWebUrl(String value) {
    this.value$webUrl$java$lang$String = value;
    this.isSet$webUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#sshUrlToRepo} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withSshUrlToRepo(String value) {
    this.value$sshUrlToRepo$java$lang$String = value;
    this.isSet$sshUrlToRepo$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#httpUrlToRepo} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withHttpUrlToRepo(String value) {
    this.value$httpUrlToRepo$java$lang$String = value;
    this.isSet$httpUrlToRepo$java$lang$String = true;
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
      ProjectBuilder result = (ProjectBuilder)super.clone();
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
  public ProjectBuilder but() {
    return (ProjectBuilder)clone();
  }

  /**
   * Creates a new {@link Project} based on this builder's settings.
   *
   * @return the created Project
   */
  public Project build() {
    try {
      Project result = new Project();
      if (isSet$id$java$lang$Integer) {
        result.setId(value$id$java$lang$Integer);
      }
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$namespace$com$dabsquared$gitlabjenkins$gitlab$api$model$Namespace) {
        result.setNamespace(value$namespace$com$dabsquared$gitlabjenkins$gitlab$api$model$Namespace);
      }
      if (isSet$webUrl$java$lang$String) {
        result.setWebUrl(value$webUrl$java$lang$String);
      }
      if (isSet$sshUrlToRepo$java$lang$String) {
        result.setSshUrlToRepo(value$sshUrlToRepo$java$lang$String);
      }
      if (isSet$httpUrlToRepo$java$lang$String) {
        result.setHttpUrlToRepo(value$httpUrlToRepo$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
