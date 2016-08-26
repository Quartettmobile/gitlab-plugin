package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.Commit;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.User;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class CommitBuilder
    implements Cloneable {
  protected CommitBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$message$java$lang$String;
  protected boolean isSet$message$java$lang$String;
  protected Date value$timestamp$java$util$Date;
  protected boolean isSet$timestamp$java$util$Date;
  protected String value$url$java$lang$String;
  protected boolean isSet$url$java$lang$String;
  protected User value$author$com$dabsquared$gitlabjenkins$gitlab$hook$model$User;
  protected boolean isSet$author$com$dabsquared$gitlabjenkins$gitlab$hook$model$User;
  protected List<String> value$added$java$util$List;
  protected boolean isSet$added$java$util$List;
  protected List<String> value$modified$java$util$List;
  protected boolean isSet$modified$java$util$List;
  protected List<String> value$removed$java$util$List;
  protected boolean isSet$removed$java$util$List;

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
   * Sets the default value for the {@link Commit#timestamp} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withTimestamp(Date value) {
    this.value$timestamp$java$util$Date = value;
    this.isSet$timestamp$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#url} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withUrl(String value) {
    this.value$url$java$lang$String = value;
    this.isSet$url$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#author} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withAuthor(User value) {
    this.value$author$com$dabsquared$gitlabjenkins$gitlab$hook$model$User = value;
    this.isSet$author$com$dabsquared$gitlabjenkins$gitlab$hook$model$User = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#added} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withAdded(List<String> value) {
    this.value$added$java$util$List = value;
    this.isSet$added$java$util$List = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#modified} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withModified(List<String> value) {
    this.value$modified$java$util$List = value;
    this.isSet$modified$java$util$List = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Commit#removed} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CommitBuilder withRemoved(List<String> value) {
    this.value$removed$java$util$List = value;
    this.isSet$removed$java$util$List = true;
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
      if (isSet$timestamp$java$util$Date) {
        result.setTimestamp(value$timestamp$java$util$Date);
      }
      if (isSet$url$java$lang$String) {
        result.setUrl(value$url$java$lang$String);
      }
      if (isSet$author$com$dabsquared$gitlabjenkins$gitlab$hook$model$User) {
        result.setAuthor(value$author$com$dabsquared$gitlabjenkins$gitlab$hook$model$User);
      }
      if (isSet$added$java$util$List) {
        result.setAdded(value$added$java$util$List);
      }
      if (isSet$modified$java$util$List) {
        result.setModified(value$modified$java$util$List);
      }
      if (isSet$removed$java$util$List) {
        result.setRemoved(value$removed$java$util$List);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
