package com.dabsquared.gitlabjenkins.trigger.handler.builder.generated;

import com.dabsquared.gitlabjenkins.trigger.handler.AbstractWebHookTriggerHandler.BuildStatusUpdate;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class BuildStatusUpdateBuilder
    implements Cloneable {
  protected BuildStatusUpdateBuilder self;
  protected Integer value$projectId$java$lang$Integer;
  protected boolean isSet$projectId$java$lang$Integer;
  protected String value$sha$java$lang$String;
  protected boolean isSet$sha$java$lang$String;
  protected String value$ref$java$lang$String;
  protected boolean isSet$ref$java$lang$String;

  /**
   * Factory Method to construct a BuildStatusUpdateBuilder
   *
   * @return a new BuildStatusUpdateBuilder
   */
  public static BuildStatusUpdateBuilder buildStatusUpdate() {
    return new BuildStatusUpdateBuilder();
  }

  /**
   * Creates a new {@link BuildStatusUpdateBuilder}.
   */
  public BuildStatusUpdateBuilder() {
    self = (BuildStatusUpdateBuilder)this;
  }

  /**
   * Sets the default value for the {@link BuildStatusUpdate#projectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public BuildStatusUpdateBuilder withProjectId(Integer value) {
    this.value$projectId$java$lang$Integer = value;
    this.isSet$projectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link BuildStatusUpdate#sha} property.
   *
   * @param value the default value
   * @return this builder
   */
  public BuildStatusUpdateBuilder withSha(String value) {
    this.value$sha$java$lang$String = value;
    this.isSet$sha$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link BuildStatusUpdate#ref} property.
   *
   * @param value the default value
   * @return this builder
   */
  public BuildStatusUpdateBuilder withRef(String value) {
    this.value$ref$java$lang$String = value;
    this.isSet$ref$java$lang$String = true;
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
      BuildStatusUpdateBuilder result = (BuildStatusUpdateBuilder)super.clone();
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
  public BuildStatusUpdateBuilder but() {
    return (BuildStatusUpdateBuilder)clone();
  }

  /**
   * Creates a new {@link BuildStatusUpdate} based on this builder's settings.
   *
   * @return the created BuildStatusUpdate
   */
  public BuildStatusUpdate build() {
    try {
      BuildStatusUpdate result = new BuildStatusUpdate(value$projectId$java$lang$Integer, value$sha$java$lang$String, value$ref$java$lang$String);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
