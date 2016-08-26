package com.dabsquared.gitlabjenkins.gitlab.api.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.api.model.MergeRequest;
import com.dabsquared.gitlabjenkins.gitlab.api.model.User;
import com.dabsquared.gitlabjenkins.gitlab.hook.model.State;
import java.util.List;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class MergeRequestBuilder
    implements Cloneable {
  protected MergeRequestBuilder self;
  protected Integer value$id$java$lang$Integer;
  protected boolean isSet$id$java$lang$Integer;
  protected Integer value$iid$java$lang$Integer;
  protected boolean isSet$iid$java$lang$Integer;
  protected String value$sourceBranch$java$lang$String;
  protected boolean isSet$sourceBranch$java$lang$String;
  protected String value$targetBranch$java$lang$String;
  protected boolean isSet$targetBranch$java$lang$String;
  protected Integer value$projectId$java$lang$Integer;
  protected boolean isSet$projectId$java$lang$Integer;
  protected String value$title$java$lang$String;
  protected boolean isSet$title$java$lang$String;
  protected State value$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State;
  protected boolean isSet$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State;
  protected Integer value$upvotes$java$lang$Integer;
  protected boolean isSet$upvotes$java$lang$Integer;
  protected Integer value$downvotes$java$lang$Integer;
  protected boolean isSet$downvotes$java$lang$Integer;
  protected User value$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User;
  protected boolean isSet$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User;
  protected User value$assignee$com$dabsquared$gitlabjenkins$gitlab$api$model$User;
  protected boolean isSet$assignee$com$dabsquared$gitlabjenkins$gitlab$api$model$User;
  protected Integer value$sourceProjectId$java$lang$Integer;
  protected boolean isSet$sourceProjectId$java$lang$Integer;
  protected Integer value$targetProjectId$java$lang$Integer;
  protected boolean isSet$targetProjectId$java$lang$Integer;
  protected List<String> value$labels$java$util$List;
  protected boolean isSet$labels$java$util$List;
  protected String value$description$java$lang$String;
  protected boolean isSet$description$java$lang$String;
  protected Boolean value$workInProgress$java$lang$Boolean;
  protected boolean isSet$workInProgress$java$lang$Boolean;
  protected Boolean value$mergeWhenBuildSucceeds$java$lang$Boolean;
  protected boolean isSet$mergeWhenBuildSucceeds$java$lang$Boolean;
  protected String value$mergeStatus$java$lang$String;
  protected boolean isSet$mergeStatus$java$lang$String;

  /**
   * Factory Method to construct a MergeRequestBuilder
   *
   * @return a new MergeRequestBuilder
   */
  public static MergeRequestBuilder mergeRequest() {
    return new MergeRequestBuilder();
  }

  /**
   * Creates a new {@link MergeRequestBuilder}.
   */
  public MergeRequestBuilder() {
    self = (MergeRequestBuilder)this;
  }

  /**
   * Sets the default value for the {@link MergeRequest#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withId(Integer value) {
    this.value$id$java$lang$Integer = value;
    this.isSet$id$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#iid} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withIid(Integer value) {
    this.value$iid$java$lang$Integer = value;
    this.isSet$iid$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#sourceBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withSourceBranch(String value) {
    this.value$sourceBranch$java$lang$String = value;
    this.isSet$sourceBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#targetBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withTargetBranch(String value) {
    this.value$targetBranch$java$lang$String = value;
    this.isSet$targetBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#projectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withProjectId(Integer value) {
    this.value$projectId$java$lang$Integer = value;
    this.isSet$projectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#title} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withTitle(String value) {
    this.value$title$java$lang$String = value;
    this.isSet$title$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#state} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withState(State value) {
    this.value$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State = value;
    this.isSet$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#upvotes} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withUpvotes(Integer value) {
    this.value$upvotes$java$lang$Integer = value;
    this.isSet$upvotes$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#downvotes} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withDownvotes(Integer value) {
    this.value$downvotes$java$lang$Integer = value;
    this.isSet$downvotes$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#author} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withAuthor(User value) {
    this.value$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User = value;
    this.isSet$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#assignee} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withAssignee(User value) {
    this.value$assignee$com$dabsquared$gitlabjenkins$gitlab$api$model$User = value;
    this.isSet$assignee$com$dabsquared$gitlabjenkins$gitlab$api$model$User = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#sourceProjectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withSourceProjectId(Integer value) {
    this.value$sourceProjectId$java$lang$Integer = value;
    this.isSet$sourceProjectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#targetProjectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withTargetProjectId(Integer value) {
    this.value$targetProjectId$java$lang$Integer = value;
    this.isSet$targetProjectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#labels} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withLabels(List<String> value) {
    this.value$labels$java$util$List = value;
    this.isSet$labels$java$util$List = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#description} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withDescription(String value) {
    this.value$description$java$lang$String = value;
    this.isSet$description$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#workInProgress} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withWorkInProgress(Boolean value) {
    this.value$workInProgress$java$lang$Boolean = value;
    this.isSet$workInProgress$java$lang$Boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#mergeWhenBuildSucceeds} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withMergeWhenBuildSucceeds(Boolean value) {
    this.value$mergeWhenBuildSucceeds$java$lang$Boolean = value;
    this.isSet$mergeWhenBuildSucceeds$java$lang$Boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link MergeRequest#mergeStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public MergeRequestBuilder withMergeStatus(String value) {
    this.value$mergeStatus$java$lang$String = value;
    this.isSet$mergeStatus$java$lang$String = true;
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
      MergeRequestBuilder result = (MergeRequestBuilder)super.clone();
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
  public MergeRequestBuilder but() {
    return (MergeRequestBuilder)clone();
  }

  /**
   * Creates a new {@link MergeRequest} based on this builder's settings.
   *
   * @return the created MergeRequest
   */
  public MergeRequest build() {
    try {
      MergeRequest result = new MergeRequest();
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
      if (isSet$projectId$java$lang$Integer) {
        result.setProjectId(value$projectId$java$lang$Integer);
      }
      if (isSet$title$java$lang$String) {
        result.setTitle(value$title$java$lang$String);
      }
      if (isSet$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State) {
        result.setState(value$state$com$dabsquared$gitlabjenkins$gitlab$hook$model$State);
      }
      if (isSet$upvotes$java$lang$Integer) {
        result.setUpvotes(value$upvotes$java$lang$Integer);
      }
      if (isSet$downvotes$java$lang$Integer) {
        result.setDownvotes(value$downvotes$java$lang$Integer);
      }
      if (isSet$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User) {
        result.setAuthor(value$author$com$dabsquared$gitlabjenkins$gitlab$api$model$User);
      }
      if (isSet$assignee$com$dabsquared$gitlabjenkins$gitlab$api$model$User) {
        result.setAssignee(value$assignee$com$dabsquared$gitlabjenkins$gitlab$api$model$User);
      }
      if (isSet$sourceProjectId$java$lang$Integer) {
        result.setSourceProjectId(value$sourceProjectId$java$lang$Integer);
      }
      if (isSet$targetProjectId$java$lang$Integer) {
        result.setTargetProjectId(value$targetProjectId$java$lang$Integer);
      }
      if (isSet$labels$java$util$List) {
        result.setLabels(value$labels$java$util$List);
      }
      if (isSet$description$java$lang$String) {
        result.setDescription(value$description$java$lang$String);
      }
      if (isSet$workInProgress$java$lang$Boolean) {
        result.setWorkInProgress(value$workInProgress$java$lang$Boolean);
      }
      if (isSet$mergeWhenBuildSucceeds$java$lang$Boolean) {
        result.setMergeWhenBuildSucceeds(value$mergeWhenBuildSucceeds$java$lang$Boolean);
      }
      if (isSet$mergeStatus$java$lang$String) {
        result.setMergeStatus(value$mergeStatus$java$lang$String);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
