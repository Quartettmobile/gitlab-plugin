package com.dabsquared.gitlabjenkins.gitlab.api.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.api.model.Namespace;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class NamespaceBuilder
    implements Cloneable {
  protected NamespaceBuilder self;
  protected String value$path$java$lang$String;
  protected boolean isSet$path$java$lang$String;

  /**
   * Factory Method to construct a NamespaceBuilder
   *
   * @return a new NamespaceBuilder
   */
  public static NamespaceBuilder namespace() {
    return new NamespaceBuilder();
  }

  /**
   * Creates a new {@link NamespaceBuilder}.
   */
  public NamespaceBuilder() {
    self = (NamespaceBuilder)this;
  }

  /**
   * Sets the default value for the {@link Namespace#path} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NamespaceBuilder withPath(String value) {
    this.value$path$java$lang$String = value;
    this.isSet$path$java$lang$String = true;
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
      NamespaceBuilder result = (NamespaceBuilder)super.clone();
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
  public NamespaceBuilder but() {
    return (NamespaceBuilder)clone();
  }

  /**
   * Creates a new {@link Namespace} based on this builder's settings.
   *
   * @return the created Namespace
   */
  public Namespace build() {
    try {
      Namespace result = new Namespace();
      if (isSet$path$java$lang$String) {
        result.setPath(value$path$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
