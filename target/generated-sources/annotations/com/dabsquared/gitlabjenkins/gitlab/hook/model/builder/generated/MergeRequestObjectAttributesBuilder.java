package com.dabsquared.gitlabjenkins.gitlab.hook.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.Action;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Commit;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.MergeRequestObjectAttributes;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.Project;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.State;
import java.util.Date;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class MergeRequestObjectAttributesBuilder
    implements Cloneable {
  protected MergeRequestObjectAttributesBuilder self;
  protected Integer value$id$java$lang$Integer;
  protected boolean isSet$id$java$lang$Integer;
  protected Integer value$iid$java$lang$Integer;
  protected boolean isSet$iid$java$lang$Integer;
  protected String value$sourceBranch$java$lang$String;
  protected boolean isSet$sourceBranch$java$lang$String;
  protected String value$targetBranch$java$lang$String;
  protected boolean isSet$targetBranch$java$lang$String;
  protected Integer value$sourceProjectId$java$lang$Integer;
  protected boolean isSet$sourceProjectId$java$lang$Integer;
  protected Integer value$targetProjectId$java$lang$Integer;
  protected boolean isSet$targetProjectId$java$lang$Integer;
  protected Integer value$authorId$java$lang$Integer;
  protected boolean isSet$authorId$java$lang$Integer;
  protected Integer value$assigneeId$java$lang$Integer;
  protected boolean isSet$assigneeId$java$lang$Integer;
  protected String value$title$java$lang$String;
  protected boolean isSet$title$java$lang$String;
  protected Date value$createdAt$java$util$Date;
  protected boolean isSet$createdAt$java$util$Date;
  protected Date value$updatedAt$java$util$Date;
  protected boolean isSet$updatedAt$java$util$Date;
  protected State value$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State;
  protected boolean isSet$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State;
  protected String value$description$java$lang$String;
  protected boolean isSet$description$java$lang$String;
  protected Project value$source$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected boolean isSet$source$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected Project value$target$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected boolean isSet$target$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project;
  protected Commit value$lastCommit$com$dabsquared$gitlabjenkins$gitlab$hook$model$Commit;
  protected boolean isSet$lastCommit$com$dabsquared$gitlabjenkins$gitlab$hook$model$Commit;
  protected String value$mergeStatus$java$lang$String;
  protected boolean isSet$mergeStatus$java$lang$String;
  protected String value$url$java$lang$String;
  protected boolean isSet$url$java$lang$String;
  protected Action value$action$com$dabsquared$gitlabjenkins$gitlab$hook$model$Action;
  protected boolean isSet$action$com$dabsquared$gitlabjenkins$gitlab$hook$model$Action;
  protected Boolean value$workInProgress$java$lang$Boolean;
  protected boolean isSet$workInProgress$java$lang$Boolean;

  /**
   * Factory Method to construct a MergeRequestObjectAttributesBuilder
   *
   * @return a new MergeRequestObjectAttributesBuilder
   */
  public static MergeRequestObjectAttributesBuilder mergeRequestObjectAttributes() {
    return new MergeRequestObjectAttributesBuilder();
  }

  /**
   * Creates a new {@link MergeRequestObjectAttributesBuilder}.
   */
  public MergeRequestObjectAttributesBuilder() {
    self = (MergeRequestObjectAttributesBuilder)this;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withId(Integer value) {
    this.value$id$java$lang$Integer = value;
    this.isSet$id$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#iid} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withIid(Integer value) {
    this.value$iid$java$lang$Integer = value;
    this.isSet$iid$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#sourceBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withSourceBranch(String value) {
    this.value$sourceBranch$java$lang$String = value;
    this.isSet$sourceBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#targetBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withTargetBranch(String value) {
    this.value$targetBranch$java$lang$String = value;
    this.isSet$targetBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#sourceProjectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withSourceProjectId(Integer value) {
    this.value$sourceProjectId$java$lang$Integer = value;
    this.isSet$sourceProjectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#targetProjectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withTargetProjectId(Integer value) {
    this.value$targetProjectId$java$lang$Integer = value;
    this.isSet$targetProjectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#authorId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withAuthorId(Integer value) {
    this.value$authorId$java$lang$Integer = value;
    this.isSet$authorId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#assigneeId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withAssigneeId(Integer value) {
    this.value$assigneeId$java$lang$Integer = value;
    this.isSet$assigneeId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#title} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withTitle(String value) {
    this.value$title$java$lang$String = value;
    this.isSet$title$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#createdAt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withCreatedAt(Date value) {
    this.value$createdAt$java$util$Date = value;
    this.isSet$createdAt$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#updatedAt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withUpdatedAt(Date value) {
    this.value$updatedAt$java$util$Date = value;
    this.isSet$updatedAt$java$util$Date = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#state} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withState(State value) {
    this.value$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State = value;
    this.isSet$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#description} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withDescription(String value) {
    this.value$description$java$lang$String = value;
    this.isSet$description$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#source} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withSource(Project value) {
    this.value$source$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = value;
    this.isSet$source$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#target} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withTarget(Project value) {
    this.value$target$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = value;
    this.isSet$target$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#lastCommit} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withLastCommit(Commit value) {
    this.value$lastCommit$com$dabsquared$gitlabjenkins$gitlab$hook$model$Commit = value;
    this.isSet$lastCommit$com$dabsquared$gitlabjenkins$gitlab$hook$model$Commit = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#mergeStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withMergeStatus(String value) {
    this.value$mergeStatus$java$lang$String = value;
    this.isSet$mergeStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#url} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withUrl(String value) {
    this.value$url$java$lang$String = value;
    this.isSet$url$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#action} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withAction(Action value) {
    this.value$action$com$dabsquared$gitlabjenkins$gitlab$hook$model$Action = value;
    this.isSet$action$com$dabsquared$gitlabjenkins$gitlab$hook$model$Action = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequestObjectAttributes#workInProgress} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestObjectAttributesBuilder withWorkInProgress(Boolean value) {
    this.value$workInProgress$java$lang$Boolean = value;
    this.isSet$workInProgress$java$lang$Boolean = true;
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
      MergeRequestObjectAttributesBuilder result = (MergeRequestObjectAttributesBuilder)super.clone();
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
  public MergeRequestObjectAttributesBuilder but() {
    return (MergeRequestObjectAttributesBuilder)clone();
  }

  /**
   * Creates a new {@link MergeRequestObjectAttributes} based on this builder's settings.
   *
   * @return the created MergeRequestObjectAttributes
   */
  public MergeRequestObjectAttributes build() {
    try {
      MergeRequestObjectAttributes result = new MergeRequestObjectAttributes();
      if (isSet$id$java$lang$Integer) {
        result.setId(value$id$java$lang$Integer);
      }
      if (isSet$iid$java$lang$Integer) {
        result.setIid(value$iid$java$lang$Integer);
      }
      if (isSet$sourceBranch$java$lang$String) {
        result.setSourceBranch(value$sourceBranch$java$lang$String);
      }
      if (isSet$targetBranch$java$lang$String) {
        result.setTargetBranch(value$targetBranch$java$lang$String);
      }
      if (isSet$sourceProjectId$java$lang$Integer) {
        result.setSourceProjectId(value$sourceProjectId$java$lang$Integer);
      }
      if (isSet$targetProjectId$java$lang$Integer) {
        result.setTargetProjectId(value$targetProjectId$java$lang$Integer);
      }
      if (isSet$authorId$java$lang$Integer) {
        result.setAuthorId(value$authorId$java$lang$Integer);
      }
      if (isSet$assigneeId$java$lang$Integer) {
        result.setAssigneeId(value$assigneeId$java$lang$Integer);
      }
      if (isSet$title$java$lang$String) {
        result.setTitle(value$title$java$lang$String);
      }
      if (isSet$createdAt$java$util$Date) {
        result.setCreatedAt(value$createdAt$java$util$Date);
      }
      if (isSet$updatedAt$java$util$Date) {
        result.setUpdatedAt(value$updatedAt$java$util$Date);
      }
      if (isSet$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State) {
        result.setState(value$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State);
      }
      if (isSet$description$java$lang$String) {
        result.setDescription(value$description$java$lang$String);
      }
      if (isSet$source$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project) {
        result.setSource(value$source$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project);
      }
      if (isSet$target$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project) {
        result.setTarget(value$target$com$dabsquared$gitlabjenkins$gitlab$hook$model$Project);
      }
      if (isSet$lastCommit$com$dabsquared$gitlabjenkins$gitlab$hook$model$Commit) {
        result.setLastCommit(value$lastCommit$com$dabsquared$gitlabjenkins$gitlab$hook$model$Commit);
      }
      if (isSet$mergeStatus$java$lang$String) {
        result.setMergeStatus(value$mergeStatus$java$lang$String);
      }
      if (isSet$url$java$lang$String) {
        result.setUrl(value$url$java$lang$String);
      }
      if (isSet$action$com$dabsquared$gitlabjenkins$gitlab$hook$model$Action) {
        result.setAction(value$action$com$dabsquared$gitlabjenkins$gitlab$hook$model$Action);
      }
      if (isSet$workInProgress$java$lang$Boolean) {
        result.setWorkInProgress(value$workInProgress$java$lang$Boolean);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
