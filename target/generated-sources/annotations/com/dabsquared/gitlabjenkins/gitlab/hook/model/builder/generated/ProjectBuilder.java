package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.Project;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class ProjectBuilder
    implements Cloneable {
  protected ProjectBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$description$java$lang$String;
  protected boolean isSet$description$java$lang$String;
  protected String value$webUrl$java$lang$String;
  protected boolean isSet$webUrl$java$lang$String;
  protected String value$avatarUrl$java$lang$String;
  protected boolean isSet$avatarUrl$java$lang$String;
  protected String value$namespace$java$lang$String;
  protected boolean isSet$namespace$java$lang$String;
  protected Integer value$visibilityLevel$java$lang$Integer;
  protected boolean isSet$visibilityLevel$java$lang$Integer;
  protected String value$pathWithNamespace$java$lang$String;
  protected boolean isSet$pathWithNamespace$java$lang$String;
  protected String value$defaultBranch$java$lang$String;
  protected boolean isSet$defaultBranch$java$lang$String;
  protected String value$homepage$java$lang$String;
  protected boolean isSet$homepage$java$lang$String;
  protected String value$url$java$lang$String;
  protected boolean isSet$url$java$lang$String;
  protected String value$sshUrl$java$lang$String;
  protected boolean isSet$sshUrl$java$lang$String;
  protected String value$httpUrl$java$lang$String;
  protected boolean isSet$httpUrl$java$lang$String;

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
   * Sets the default value for the {@link Project#description} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withDescription(String value) {
    this.value$description$java$lang$String = value;
    this.isSet$description$java$lang$String = true;
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
   * Sets the default value for the {@link Project#avatarUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withAvatarUrl(String value) {
    this.value$avatarUrl$java$lang$String = value;
    this.isSet$avatarUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#namespace} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withNamespace(String value) {
    this.value$namespace$java$lang$String = value;
    this.isSet$namespace$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#visibilityLevel} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withVisibilityLevel(Integer value) {
    this.value$visibilityLevel$java$lang$Integer = value;
    this.isSet$visibilityLevel$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#pathWithNamespace} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withPathWithNamespace(String value) {
    this.value$pathWithNamespace$java$lang$String = value;
    this.isSet$pathWithNamespace$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#defaultBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withDefaultBranch(String value) {
    this.value$defaultBranch$java$lang$String = value;
    this.isSet$defaultBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#homepage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withHomepage(String value) {
    this.value$homepage$java$lang$String = value;
    this.isSet$homepage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#url} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withUrl(String value) {
    this.value$url$java$lang$String = value;
    this.isSet$url$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#sshUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withSshUrl(String value) {
    this.value$sshUrl$java$lang$String = value;
    this.isSet$sshUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Project#httpUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectBuilder withHttpUrl(String value) {
    this.value$httpUrl$java$lang$String = value;
    this.isSet$httpUrl$java$lang$String = true;
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
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$description$java$lang$String) {
        result.setDescription(value$description$java$lang$String);
      }
      if (isSet$webUrl$java$lang$String) {
        result.setWebUrl(value$webUrl$java$lang$String);
      }
      if (isSet$avatarUrl$java$lang$String) {
        result.setAvatarUrl(value$avatarUrl$java$lang$String);
      }
      if (isSet$namespace$java$lang$String) {
        result.setNamespace(value$namespace$java$lang$String);
      }
      if (isSet$visibilityLevel$java$lang$Integer) {
        result.setVisibilityLevel(value$visibilityLevel$java$lang$Integer);
      }
      if (isSet$pathWithNamespace$java$lang$String) {
        result.setPathWithNamespace(value$pathWithNamespace$java$lang$String);
      }
      if (isSet$defaultBranch$java$lang$String) {
        result.setDefaultBranch(value$defaultBranch$java$lang$String);
      }
      if (isSet$homepage$java$lang$String) {
        result.setHomepage(value$homepage$java$lang$String);
      }
      if (isSet$url$java$lang$String) {
        result.setUrl(value$url$java$lang$String);
      }
      if (isSet$sshUrl$java$lang$String) {
        result.setSshUrl(value$sshUrl$java$lang$String);
      }
      if (isSet$httpUrl$java$lang$String) {
        result.setHttpUrl(value$httpUrl$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
