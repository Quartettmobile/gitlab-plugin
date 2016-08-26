package com.dabsquared.gitlabjenkins.gitlab.api.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.api.model.Commit;
import java.util.Date;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class CommitBuilder
    implements Cloneable {
  protected CommitBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$message$java$lang$String;
  protected boolean isSet$message$java$lang$String;
  protected Date value$authoredDate$java$util$Date;
  protected boolean isSet$authoredDate$java$util$Date;
  protected String value$authorName$java$lang$String;
  protected boolean isSet$authorName$java$lang$String;
  protected String value$authorEmail$java$lang$String;
  protected boolean isSet$authorEmail$java$lang$String;

  /**
   * Factory Method to construct a CommitBuilder
   *
   * @return a new CommitBuilder
   */
  public static CommitBuilder commit() {
    return new CommitBuilder();
  }

  /**
   * Creates a new {@link CommitBuilder}.
   */
  public CommitBuilder() {
    self = (CommitBuilder)this;
  }

  /**
   * Sets the default value for the {@link Commit#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#message} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withMessage(String value) {
    this.value$message$java$lang$String = value;
    this.isSet$message$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#authoredDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withAuthoredDate(Date value) {
    this.value$authoredDate$java$util$Date = value;
    this.isSet$authoredDate$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#authorName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withAuthorName(String value) {
    this.value$authorName$java$lang$String = value;
    this.isSet$authorName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#authorEmail} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withAuthorEmail(String value) {
    this.value$authorEmail$java$lang$String = value;
    this.isSet$authorEmail$java$lang$String = true;
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
      CommitBuilder result = (CommitBuilder)super.clone();
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
  public CommitBuilder but() {
    return (CommitBuilder)clone();
  }

  /**
   * Creates a new {@link Commit} based on this builder's settings.
   *
   * @return the created Commit
   */
  public Commit build() {
    try {
      Commit result = new Commit();
      if (isSet$id$java$lang$String) {
        result.setId(value$id$java$lang$String);
      }
      if (isSet$message$java$lang$String) {
        result.setMessage(value$message$java$lang$String);
      }
      if (isSet$authoredDate$java$util$Date) {
        result.setAuthoredDate(value$authoredDate$java$util$Date);
      }
      if (isSet$authorName$java$lang$String) {
        result.setAuthorName(value$authorName$java$lang$String);
      }
      if (isSet$authorEmail$java$lang$String) {
        result.setAuthorEmail(value$authorEmail$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
