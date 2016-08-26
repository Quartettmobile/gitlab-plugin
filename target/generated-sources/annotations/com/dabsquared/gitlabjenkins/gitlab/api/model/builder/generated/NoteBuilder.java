package com.dabsquared.gitlabjenkins.gitlab.api.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.api.model.Note;
import com.dabsquared.gitlabjenkins.gitlab.api.model.User;
import java.util.Date;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class NoteBuilder
    implements Cloneable {
  protected NoteBuilder self;
  protected Integer value$id$java$lang$Integer;
  protected boolean isSet$id$java$lang$Integer;
  protected Integer value$projectId$java$lang$Integer;
  protected boolean isSet$projectId$java$lang$Integer;
  protected User value$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User;
  protected boolean isSet$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User;
  protected Date value$createdAt$java$util$Date;
  protected boolean isSet$createdAt$java$util$Date;
  protected Date value$updatedAt$java$util$Date;
  protected boolean isSet$updatedAt$java$util$Date;
  protected String value$note$java$lang$String;
  protected boolean isSet$note$java$lang$String;

  /**
   * Factory Method to construct a NoteBuilder
   *
   * @return a new NoteBuilder
   */
  public static NoteBuilder note() {
    return new NoteBuilder();
  }

  /**
   * Creates a new {@link NoteBuilder}.
   */
  public NoteBuilder() {
    self = (NoteBuilder)this;
  }

  /**
   * Sets the default value for the {@link Note#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteBuilder withId(Integer value) {
    this.value$id$java$lang$Integer = value;
    this.isSet$id$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Note#projectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteBuilder withProjectId(Integer value) {
    this.value$projectId$java$lang$Integer = value;
    this.isSet$projectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Note#author} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteBuilder withAuthor(User value) {
    this.value$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User = value;
    this.isSet$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Note#createdAt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteBuilder withCreatedAt(Date value) {
    this.value$createdAt$java$util$Date = value;
    this.isSet$createdAt$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Note#updatedAt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteBuilder withUpdatedAt(Date value) {
    this.value$updatedAt$java$util$Date = value;
    this.isSet$updatedAt$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Note#note} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteBuilder withNote(String value) {
    this.value$note$java$lang$String = value;
    this.isSet$note$java$lang$String = true;
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
      NoteBuilder result = (NoteBuilder)super.clone();
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
  public NoteBuilder but() {
    return (NoteBuilder)clone();
  }

  /**
   * Creates a new {@link Note} based on this builder's settings.
   *
   * @return the created Note
   */
  public Note build() {
    try {
      Note result = new Note();
      if (isSet$id$java$lang$Integer) {
        result.setId(value$id$java$lang$Integer);
      }
      if (isSet$projectId$java$lang$Integer) {
        result.setprojectId(value$projectId$java$lang$Integer);
      }
      if (isSet$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User) {
        result.setAuthor(value$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User);
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
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
