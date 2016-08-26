package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.Commit;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Project;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.PushHook;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Repository;
import java.util.List;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class PushHookBuilder
    implements Cloneable {
  protected PushHookBuilder self;
  protected String value$objectKind$java$lang$String;
  protected boolean isSet$objectKind$java$lang$String;
  protected Repository value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository;
  protected boolean isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository;
  protected String value$before$java$lang$String;
  protected boolean isSet$before$java$lang$String;
  protected String value$after$java$lang$String;
  protected boolean isSet$after$java$lang$String;
  protected String value$ref$java$lang$String;
  protected boolean isSet$ref$java$lang$String;
  protected Integer value$userId$java$lang$Integer;
  protected boolean isSet$userId$java$lang$Integer;
  protected String value$userName$java$lang$String;
  protected boolean isSet$userName$java$lang$String;
  protected String value$userEmail$java$lang$String;
  protected boolean isSet$userEmail$java$lang$String;
  protected String value$userAvatar$java$lang$String;
  protected boolean isSet$userAvatar$java$lang$String;
  protected Integer value$projectId$java$lang$Integer;
  protected boolean isSet$projectId$java$lang$Integer;
  protected Project value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected boolean isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected List<Commit> value$commits$java$util$List;
  protected boolean isSet$commits$java$util$List;
  protected Integer value$totalCommitsCount$java$lang$Integer;
  protected boolean isSet$totalCommitsCount$java$lang$Integer;

  /**
   * Factory Method to construct a PushHookBuilder
   *
   * @return a new PushHookBuilder
   */
  public static PushHookBuilder pushHook() {
    return new PushHookBuilder();
  }

  /**
   * Creates a new {@link PushHookBuilder}.
   */
  public PushHookBuilder() {
    self = (PushHookBuilder)this;
  }

  /**
   * Sets the default value for the {@link PushHook#objectKind} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withObjectKind(String value) {
    this.value$objectKind$java$lang$String = value;
    this.isSet$objectKind$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#repository} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withRepository(Repository value) {
    this.value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository = value;
    this.isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#before} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withBefore(String value) {
    this.value$before$java$lang$String = value;
    this.isSet$before$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#after} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withAfter(String value) {
    this.value$after$java$lang$String = value;
    this.isSet$after$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#ref} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withRef(String value) {
    this.value$ref$java$lang$String = value;
    this.isSet$ref$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#userId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withUserId(Integer value) {
    this.value$userId$java$lang$Integer = value;
    this.isSet$userId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#userName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withUserName(String value) {
    this.value$userName$java$lang$String = value;
    this.isSet$userName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#userEmail} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withUserEmail(String value) {
    this.value$userEmail$java$lang$String = value;
    this.isSet$userEmail$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#userAvatar} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withUserAvatar(String value) {
    this.value$userAvatar$java$lang$String = value;
    this.isSet$userAvatar$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#projectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withProjectId(Integer value) {
    this.value$projectId$java$lang$Integer = value;
    this.isSet$projectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#project} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withProject(Project value) {
    this.value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = value;
    this.isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#commits} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withCommits(List<Commit> value) {
    this.value$commits$java$util$List = value;
    this.isSet$commits$java$util$List = true;
    return self;
  }

  /**
   * Sets the default value for the {@link PushHook#totalCommitsCount} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PushHookBuilder withTotalCommitsCount(Integer value) {
    this.value$totalCommitsCount$java$lang$Integer = value;
    this.isSet$totalCommitsCount$java$lang$Integer = true;
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
      PushHookBuilder result = (PushHookBuilder)super.clone();
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
  public PushHookBuilder but() {
    return (PushHookBuilder)clone();
  }

  /**
   * Creates a new {@link PushHook} based on this builder's settings.
   *
   * @return the created PushHook
   */
  public PushHook build() {
    try {
      PushHook result = new PushHook();
      if (isSet$objectKind$java$lang$String) {
        result.setObjectKind(value$objectKind$java$lang$String);
      }
      if (isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository) {
        result.setRepository(value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository);
      }
      if (isSet$before$java$lang$String) {
        result.setBefore(value$before$java$lang$String);
      }
      if (isSet$after$java$lang$String) {
        result.setAfter(value$after$java$lang$String);
      }
      if (isSet$ref$java$lang$String) {
        result.setRef(value$ref$java$lang$String);
      }
      if (isSet$userId$java$lang$Integer) {
        result.setUserId(value$userId$java$lang$Integer);
      }
      if (isSet$userName$java$lang$String) {
        result.setUserName(value$userName$java$lang$String);
      }
      if (isSet$userEmail$java$lang$String) {
        result.setUserEmail(value$userEmail$java$lang$String);
      }
      if (isSet$userAvatar$java$lang$String) {
        result.setUserAvatar(value$userAvatar$java$lang$String);
      }
      if (isSet$projectId$java$lang$Integer) {
        result.setProjectId(value$projectId$java$lang$Integer);
      }
      if (isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project) {
        result.setProject(value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project);
      }
      if (isSet$commits$java$util$List) {
        result.setCommits(value$commits$java$util$List);
      }
      if (isSet$totalCommitsCount$java$lang$Integer) {
        result.setTotalCommitsCount(value$totalCommitsCount$java$lang$Integer);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
