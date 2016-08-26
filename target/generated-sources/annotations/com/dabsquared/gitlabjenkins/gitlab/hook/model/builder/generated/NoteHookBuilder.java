package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.MergeRequestObjectAttributes;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.NoteHook;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.NoteObjectAttributes;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Project;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Repository;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.User;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class NoteHookBuilder
    implements Cloneable {
  protected NoteHookBuilder self;
  protected String value$objectKind$java$lang$String;
  protected boolean isSet$objectKind$java$lang$String;
  protected Repository value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository;
  protected boolean isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository;
  protected User value$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User;
  protected boolean isSet$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User;
  protected Project value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected boolean isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected NoteObjectAttributes value$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$NoteObjectAttributes;
  protected boolean isSet$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$NoteObjectAttributes;
  protected MergeRequestObjectAttributes value$mergeRequest$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes;
  protected boolean isSet$mergeRequest$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes;

  /**
   * Factory Method to construct a NoteHookBuilder
   *
   * @return a new NoteHookBuilder
   */
  public static NoteHookBuilder noteHook() {
    return new NoteHookBuilder();
  }

  /**
   * Creates a new {@link NoteHookBuilder}.
   */
  public NoteHookBuilder() {
    self = (NoteHookBuilder)this;
  }

  /**
   * Sets the default value for the {@link NoteHook#objectKind} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteHookBuilder withObjectKind(String value) {
    this.value$objectKind$java$lang$String = value;
    this.isSet$objectKind$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteHook#repository} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteHookBuilder withRepository(Repository value) {
    this.value$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository = value;
    this.isSet$repository$com$dabsquared$gitlabjenkins$gitlab$hook$model$Repository = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteHook#user} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteHookBuilder withUser(User value) {
    this.value$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User = value;
    this.isSet$user$com$dabsquared$gitlabjenkins$gitlab$hook$model$User = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteHook#project} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteHookBuilder withProject(Project value) {
    this.value$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = value;
    this.isSet$project$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteHook#objectAttributes} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteHookBuilder withObjectAttributes(NoteObjectAttributes value) {
    this.value$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$NoteObjectAttributes = value;
    this.isSet$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$NoteObjectAttributes = true;
    return self;
  }

  /**
   * Sets the default value for the {@link NoteHook#mergeRequest} property.
   *
   * @param value the default value
   * @return this builder
   */
  public NoteHookBuilder withMergeRequest(MergeRequestObjectAttributes value) {
    this.value$mergeRequest$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes = value;
    this.isSet$mergeRequest$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes = true;
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
      NoteHookBuilder result = (NoteHookBuilder)super.clone();
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
  public NoteHookBuilder but() {
    return (NoteHookBuilder)clone();
  }

  /**
   * Creates a new {@link NoteHook} based on this builder's settings.
   *
   * @return the created NoteHook
   */
  public NoteHook build() {
    try {
      NoteHook result = new NoteHook();
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
      if (isSet$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$NoteObjectAttributes) {
        result.setObjectAttributes(value$objectAttributes$com$dabsquared$gitlabjenkins$gitlab$hook$model$NoteObjectAttributes);
      }
      if (isSet$mergeRequest$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes) {
        result.setMergeRequest(value$mergeRequest$com$dabsquared$gitlabjenkins$gitlab$hook$model$MergeRequestObjectAttributes);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
