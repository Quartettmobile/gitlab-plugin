package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.NoteObjectAttributes;
import java.util.Date;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class NoteObjectAttributesBuilder
    implements Cloneable {
  protected NoteObjectAttributesBuilder self;
  protected Integer value$id$java$lang$Integer;
  protected boolean isSet$id$java$lang$Integer;
  protected Integer value$projectId$java$lang$Integer;
  protected boolean isSet$projectId$java$lang$Integer;
  protected Integer value$authorId$java$lang$Integer;
  protected boolean isSet$authorId$java$lang$Integer;
  protected Date value$createdAt$java$util$Date;
  protected boolean isSet$createdAt$java$util$Date;
  protected Date value$updatedAt$java$util$Date;
  protected boolean isSet$updatedAt$java$util$Date;
  protected String value$note$java$lang$String;
  protected boolean isSet$note$java$lang$String;
  protected String value$url$java$lang$String;
  protected boolean isSet$url$java$lang$String;

  /**
   * Factory Method to construct a NoteObjectAttributesBuilder
   *
   * @return a new NoteObjectAttributesBuilder
   */
  public static NoteObjectAttributesBuilder noteObjectAttributes() {
    return new NoteObjectAttributesBuilder();
  }

  /**
   * Creates a new {@link NoteObjectAttributesBuilder}.
   */
  public NoteObjectAttributesBuilder() {
    self = (NoteObjectAttributesBuilder)this;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withId(Integer value) {
    this.value$id$java$lang$Integer = value;
    this.isSet$id$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#projectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withProjectId(Integer value) {
    this.value$projectId$java$lang$Integer = value;
    this.isSet$projectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#authorId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withAuthorId(Integer value) {
    this.value$authorId$java$lang$Integer = value;
    this.isSet$authorId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#createdAt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withCreatedAt(Date value) {
    this.value$createdAt$java$util$Date = value;
    this.isSet$createdAt$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#updatedAt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withUpdatedAt(Date value) {
    this.value$updatedAt$java$util$Date = value;
    this.isSet$updatedAt$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#note} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withNote(String value) {
    this.value$note$java$lang$String = value;
    this.isSet$note$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteObjectAttributes#url} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteObjectAttributesBuilder withUrl(String value) {
    this.value$url$java$lang$String = value;
    this.isSet$url$java$lang$String = true;
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
      NoteObjectAttributesBuilder result = (NoteObjectAttributesBuilder)super.clone();
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
  public NoteObjectAttributesBuilder but() {
    return (NoteObjectAttributesBuilder)clone();
  }

  /**
   * Creates a new {@link NoteObjectAttributes} based on this builder's settings.
   *
   * @return the created NoteObjectAttributes
   */
  public NoteObjectAttributes build() {
    try {
      NoteObjectAttributes result = new NoteObjectAttributes();
      if (isSet$id$java$lang$Integer) {
        result.setId(value$id$java$lang$Integer);
      }
      if (isSet$projectId$java$lang$Integer) {
        result.setProjectId(value$projectId$java$lang$Integer);
      }
      if (isSet$authorId$java$lang$Integer) {
        result.setAuthorId(value$authorId$java$lang$Integer);
      }
      if (isSet$createdAt$java$util$Date) {
        result.setCreatedAt(value$createdAt$java$util$Date);
      }
      if (isSet$updatedAt$java$util$Date) {
        result.setUpdatedAt(value$updatedAt$java$util$Date);
      }
      if (isSet$note$java$lang$String) {
        result.setNote(value$note$java$lang$String);
      }
      if (isSet$url$java$lang$String) {
        result.setUrl(value$url$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
