package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.MergeRequestHook;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.MergeRequestObjectAttributes;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Project;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Repository;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.User;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class MergeRequestHookBuilder
    implements Cloneable {
  protected MergeRequestHookBuilder self;
  protected String value$objectKind$java$lang$String;
  protected boolean isSet$objectKind$java$lang$String;
  protected Repository value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository;
  protected boolean isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository;
  protected User value$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User;
  protected boolean isSet$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User;
  protected Project value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected boolean isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected MergeRequestObjectAttributes value$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes;
  protected boolean isSet$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes;

  /**
   * Factory Method to construct a MergeRequestHookBuilder
   *
   * @return a new MergeRequestHookBuilder
   */
  public static MergeRequestHookBuilder mergeRequestHook() {
    return new MergeRequestHookBuilder();
  }

  /**
   * Creates a new {@link MergeRequestHookBuilder}.
   */
  public MergeRequestHookBuilder() {
    self = (MergeRequestHookBuilder)this;
  }

  /**
   * Sets the default value for the {@link MergeRequestHook#objectKind} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestHookBuilder withObjectKind(String value) {
    this.value$objectKind$java$lang$String = value;
    this.isSet$objectKind$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestHook#repository} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestHookBuilder withRepository(Repository value) {
    this.value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository = value;
    this.isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestHook#user} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestHookBuilder withUser(User value) {
    this.value$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User = value;
    this.isSet$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestHook#project} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestHookBuilder withProject(Project value) {
    this.value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = value;
    this.isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestHook#objectAttributes} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestHookBuilder withObjectAttributes(MergeRequestObjectAttributes value) {
    this.value$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes = value;
    this.isSet$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes = true;
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
      MergeRequestHookBuilder result = (MergeRequestHookBuilder)super.clone();
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
  public MergeRequestHookBuilder but() {
    return (MergeRequestHookBuilder)clone();
  }

  /**
   * Creates a new {@link MergeRequestHook} based on this builder's settings.
   *
   * @return the created MergeRequestHook
   */
  public MergeRequestHook build() {
    try {
      MergeRequestHook result = new MergeRequestHook();
      if (isSet$objectKind$java$lang$String) {
        result.setObjectKind(value$objectKind$java$lang$String);
      }
      if (isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository) {
        result.setRepository(value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository);
      }
      if (isSet$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User) {
        result.setUser(value$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User);
      }
      if (isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project) {
        result.setProject(value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project);
      }
      if (isSet$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes) {
        result.setObjectAttributes(value$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
