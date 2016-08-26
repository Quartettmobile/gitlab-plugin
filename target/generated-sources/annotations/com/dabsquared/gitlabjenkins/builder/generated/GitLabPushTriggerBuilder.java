package com.dabsquared.gitlabjenkins.builder.generated;

import com.dabsquared.gitlabjenkins.GitLabPushTrigger;
import com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest;
import com.dabsquared.gitlabjenkins.trigger.filter.BranchFilterType;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class GitLabPushTriggerBuilder
    implements Cloneable {
  protected GitLabPushTriggerBuilder self;
  protected boolean value$triggerOnPush$boolean;
  protected boolean isSet$triggerOnPush$boolean;
  protected boolean value$triggerOnMergeRequest$boolean;
  protected boolean isSet$triggerOnMergeRequest$boolean;
  protected TriggerOpenMergeRequest value$triggerOpenMergeRequestOnPush$com$dabsquared$gitlabjenkins$trigger$TriggerOpenMergeRequest;
  protected boolean isSet$triggerOpenMergeRequestOnPush$com$dabsquared$gitlabjenkins$trigger$TriggerOpenMergeRequest;
  protected boolean value$triggerOnNoteRequest$boolean;
  protected boolean isSet$triggerOnNoteRequest$boolean;
  protected String value$noteRegex$java$lang$String;
  protected boolean isSet$noteRegex$java$lang$String;
  protected boolean value$skipWorkInProgressMergeRequest$boolean;
  protected boolean isSet$skipWorkInProgressMergeRequest$boolean;
  protected boolean value$ciSkip$boolean;
  protected boolean isSet$ciSkip$boolean;
  protected boolean value$setBuildDescription$boolean;
  protected boolean isSet$setBuildDescription$boolean;
  protected boolean value$addNoteOnMergeRequest$boolean;
  protected boolean isSet$addNoteOnMergeRequest$boolean;
  protected boolean value$addCiMessage$boolean;
  protected boolean isSet$addCiMessage$boolean;
  protected boolean value$addVoteOnMergeRequest$boolean;
  protected boolean isSet$addVoteOnMergeRequest$boolean;
  protected boolean value$acceptMergeRequestOnSuccess$boolean;
  protected boolean isSet$acceptMergeRequestOnSuccess$boolean;
  protected BranchFilterType value$branchFilterType$com$dabsquared$gitlabjenkins$trigger$filter$BranchFilterType;
  protected boolean isSet$branchFilterType$com$dabsquared$gitlabjenkins$trigger$filter$BranchFilterType;
  protected String value$includeBranchesSpec$java$lang$String;
  protected boolean isSet$includeBranchesSpec$java$lang$String;
  protected String value$excludeBranchesSpec$java$lang$String;
  protected boolean isSet$excludeBranchesSpec$java$lang$String;
  protected String value$targetBranchRegex$java$lang$String;
  protected boolean isSet$targetBranchRegex$java$lang$String;

  /**
   * Factory Method to construct a GitLabPushTriggerBuilder
   *
   * @return a new GitLabPushTriggerBuilder
   */
  public static GitLabPushTriggerBuilder gitLabPushTrigger() {
    return new GitLabPushTriggerBuilder();
  }

  /**
   * Creates a new {@link GitLabPushTriggerBuilder}.
   */
  public GitLabPushTriggerBuilder() {
    self = (GitLabPushTriggerBuilder)this;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#triggerOnPush} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withTriggerOnPush(boolean value) {
    this.value$triggerOnPush$boolean = value;
    this.isSet$triggerOnPush$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#triggerOnMergeRequest} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withTriggerOnMergeRequest(boolean value) {
    this.value$triggerOnMergeRequest$boolean = value;
    this.isSet$triggerOnMergeRequest$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#triggerOpenMergeRequestOnPush} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withTriggerOpenMergeRequestOnPush(TriggerOpenMergeRequest value) {
    this.value$triggerOpenMergeRequestOnPush$com$dabsquared$gitlabjenkins$trigger$TriggerOpenMergeRequest = value;
    this.isSet$triggerOpenMergeRequestOnPush$com$dabsquared$gitlabjenkins$trigger$TriggerOpenMergeRequest = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#triggerOnNoteRequest} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withTriggerOnNoteRequest(boolean value) {
    this.value$triggerOnNoteRequest$boolean = value;
    this.isSet$triggerOnNoteRequest$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#noteRegex} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withNoteRegex(String value) {
    this.value$noteRegex$java$lang$String = value;
    this.isSet$noteRegex$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#skipWorkInProgressMergeRequest} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withSkipWorkInProgressMergeRequest(boolean value) {
    this.value$skipWorkInProgressMergeRequest$boolean = value;
    this.isSet$skipWorkInProgressMergeRequest$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#ciSkip} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withCiSkip(boolean value) {
    this.value$ciSkip$boolean = value;
    this.isSet$ciSkip$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#setBuildDescription} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withSetBuildDescription(boolean value) {
    this.value$setBuildDescription$boolean = value;
    this.isSet$setBuildDescription$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#addNoteOnMergeRequest} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withAddNoteOnMergeRequest(boolean value) {
    this.value$addNoteOnMergeRequest$boolean = value;
    this.isSet$addNoteOnMergeRequest$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#addCiMessage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withAddCiMessage(boolean value) {
    this.value$addCiMessage$boolean = value;
    this.isSet$addCiMessage$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#addVoteOnMergeRequest} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withAddVoteOnMergeRequest(boolean value) {
    this.value$addVoteOnMergeRequest$boolean = value;
    this.isSet$addVoteOnMergeRequest$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#acceptMergeRequestOnSuccess} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withAcceptMergeRequestOnSuccess(boolean value) {
    this.value$acceptMergeRequestOnSuccess$boolean = value;
    this.isSet$acceptMergeRequestOnSuccess$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#branchFilterType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withBranchFilterType(BranchFilterType value) {
    this.value$branchFilterType$com$dabsquared$gitlabjenkins$trigger$filter$BranchFilterType = value;
    this.isSet$branchFilterType$com$dabsquared$gitlabjenkins$trigger$filter$BranchFilterType = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#includeBranchesSpec} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withIncludeBranchesSpec(String value) {
    this.value$includeBranchesSpec$java$lang$String = value;
    this.isSet$includeBranchesSpec$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#excludeBranchesSpec} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withExcludeBranchesSpec(String value) {
    this.value$excludeBranchesSpec$java$lang$String = value;
    this.isSet$excludeBranchesSpec$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link GitLabPushTrigger#targetBranchRegex} property.
   *
   * @param value the default value
   * @return this builder
   */
  public GitLabPushTriggerBuilder withTargetBranchRegex(String value) {
    this.value$targetBranchRegex$java$lang$String = value;
    this.isSet$targetBranchRegex$java$lang$String = true;
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
      GitLabPushTriggerBuilder result = (GitLabPushTriggerBuilder)super.clone();
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
  public GitLabPushTriggerBuilder but() {
    return (GitLabPushTriggerBuilder)clone();
  }

  /**
   * Creates a new {@link GitLabPushTrigger} based on this builder's settings.
   *
   * @return the created GitLabPushTrigger
   */
  public GitLabPushTrigger build() {
    try {
      GitLabPushTrigger result = new GitLabPushTrigger(value$triggerOnPush$boolean, value$triggerOnMergeRequest$boolean, value$triggerOpenMergeRequestOnPush$com$dabsquared$gitlabjenkins$trigger$TriggerOpenMergeRequest, value$triggerOnNoteRequest$boolean, value$noteRegex$java$lang$String, value$skipWorkInProgressMergeRequest$boolean, value$ciSkip$boolean, value$setBuildDescription$boolean, value$addNoteOnMergeRequest$boolean, value$addCiMessage$boolean, value$addVoteOnMergeRequest$boolean, value$acceptMergeRequestOnSuccess$boolean, value$branchFilterType$com$dabsquared$gitlabjenkins$trigger$filter$BranchFilterType, value$includeBranchesSpec$java$lang$String, value$excludeBranchesSpec$java$lang$String, value$targetBranchRegex$java$lang$String);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
