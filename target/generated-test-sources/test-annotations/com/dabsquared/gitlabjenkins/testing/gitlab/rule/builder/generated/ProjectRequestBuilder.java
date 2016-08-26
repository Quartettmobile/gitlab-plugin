package com.dabsquared.gitlabjenkins.testing.gitlab.rule.builder.generated;

import com.dabsquared.gitlabjenkins.testing.gitlab.rule.ProjectRequest;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class ProjectRequestBuilder
    implements Cloneable {
  protected ProjectRequestBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$webHookUrl$java$lang$String;
  protected boolean isSet$webHookUrl$java$lang$String;
  protected boolean value$pushHook$boolean;
  protected boolean isSet$pushHook$boolean;
  protected boolean value$mergeRequestHook$boolean;
  protected boolean isSet$mergeRequestHook$boolean;
  protected boolean value$noteHook$boolean;
  protected boolean isSet$noteHook$boolean;

  /**
   * Factory Method to construct a ProjectRequestBuilder
   *
   * @return a new ProjectRequestBuilder
   */
  public static ProjectRequestBuilder projectRequest() {
    return new ProjectRequestBuilder();
  }

  /**
   * Creates a new {@link ProjectRequestBuilder}.
   */
  public ProjectRequestBuilder() {
    self = (ProjectRequestBuilder)this;
  }

  /**
   * Sets the default value for the {@link ProjectRequest#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectRequestBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ProjectRequest#webHookUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectRequestBuilder withWebHookUrl(String value) {
    this.value$webHookUrl$java$lang$String = value;
    this.isSet$webHookUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ProjectRequest#pushHook} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectRequestBuilder withPushHook(boolean value) {
    this.value$pushHook$boolean = value;
    this.isSet$pushHook$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ProjectRequest#mergeRequestHook} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectRequestBuilder withMergeRequestHook(boolean value) {
    this.value$mergeRequestHook$boolean = value;
    this.isSet$mergeRequestHook$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ProjectRequest#noteHook} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ProjectRequestBuilder withNoteHook(boolean value) {
    this.value$noteHook$boolean = value;
    this.isSet$noteHook$boolean = true;
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
      ProjectRequestBuilder result = (ProjectRequestBuilder)super.clone();
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
  public ProjectRequestBuilder but() {
    return (ProjectRequestBuilder)clone();
  }

  /**
   * Creates a new {@link ProjectRequest} based on this builder's settings.
   *
   * @return the created ProjectRequest
   */
  public ProjectRequest build() {
    try {
      ProjectRequest result = new ProjectRequest(value$name$java$lang$String, value$webHookUrl$java$lang$String, value$pushHook$boolean, value$mergeRequestHook$boolean, value$noteHook$boolean);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
