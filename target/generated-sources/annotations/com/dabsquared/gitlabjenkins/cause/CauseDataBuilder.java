package com.dabsquared.gitlabjenkins.cause;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class CauseDataBuilder
    implements Cloneable {
  protected CauseDataBuilder self;
  protected CauseData.ActionType value$actionType$com$dabsquared$gitlabjenkins$cause$CauseData$ActionType;
  protected boolean isSet$actionType$com$dabsquared$gitlabjenkins$cause$CauseData$ActionType;
  protected Integer value$sourceProjectId$java$lang$Integer;
  protected boolean isSet$sourceProjectId$java$lang$Integer;
  protected Integer value$targetProjectId$java$lang$Integer;
  protected boolean isSet$targetProjectId$java$lang$Integer;
  protected String value$branch$java$lang$String;
  protected boolean isSet$branch$java$lang$String;
  protected String value$sourceBranch$java$lang$String;
  protected boolean isSet$sourceBranch$java$lang$String;
  protected String value$userName$java$lang$String;
  protected boolean isSet$userName$java$lang$String;
  protected String value$userEmail$java$lang$String;
  protected boolean isSet$userEmail$java$lang$String;
  protected String value$sourceRepoHomepage$java$lang$String;
  protected boolean isSet$sourceRepoHomepage$java$lang$String;
  protected String value$sourceRepoName$java$lang$String;
  protected boolean isSet$sourceRepoName$java$lang$String;
  protected String value$sourceNamespace$java$lang$String;
  protected boolean isSet$sourceNamespace$java$lang$String;
  protected String value$sourceRepoUrl$java$lang$String;
  protected boolean isSet$sourceRepoUrl$java$lang$String;
  protected String value$sourceRepoSshUrl$java$lang$String;
  protected boolean isSet$sourceRepoSshUrl$java$lang$String;
  protected String value$sourceRepoHttpUrl$java$lang$String;
  protected boolean isSet$sourceRepoHttpUrl$java$lang$String;
  protected String value$mergeRequestTitle$java$lang$String;
  protected boolean isSet$mergeRequestTitle$java$lang$String;
  protected String value$mergeRequestDescription$java$lang$String;
  protected boolean isSet$mergeRequestDescription$java$lang$String;
  protected Integer value$mergeRequestId$java$lang$Integer;
  protected boolean isSet$mergeRequestId$java$lang$Integer;
  protected Integer value$mergeRequestIid$java$lang$Integer;
  protected boolean isSet$mergeRequestIid$java$lang$Integer;
  protected String value$targetBranch$java$lang$String;
  protected boolean isSet$targetBranch$java$lang$String;
  protected String value$targetRepoName$java$lang$String;
  protected boolean isSet$targetRepoName$java$lang$String;
  protected String value$targetNamespace$java$lang$String;
  protected boolean isSet$targetNamespace$java$lang$String;
  protected String value$targetRepoSshUrl$java$lang$String;
  protected boolean isSet$targetRepoSshUrl$java$lang$String;
  protected String value$targetRepoHttpUrl$java$lang$String;
  protected boolean isSet$targetRepoHttpUrl$java$lang$String;
  protected String value$triggeredByUser$java$lang$String;
  protected boolean isSet$triggeredByUser$java$lang$String;
  protected String value$before$java$lang$String;
  protected boolean isSet$before$java$lang$String;
  protected String value$after$java$lang$String;
  protected boolean isSet$after$java$lang$String;
  protected String value$lastCommit$java$lang$String;
  protected boolean isSet$lastCommit$java$lang$String;
  protected String value$targetProjectUrl$java$lang$String;
  protected boolean isSet$targetProjectUrl$java$lang$String;

  /**
   * Factory Method to construct a CauseDataBuilder
   *
   * @return a new CauseDataBuilder
   */
  public static CauseDataBuilder causeData() {
    return new CauseDataBuilder();
  }

  /**
   * Creates a new {@link CauseDataBuilder}.
   */
  public CauseDataBuilder() {
    self = (CauseDataBuilder)this;
  }

  /**
   * Sets the default value for the {@link CauseData#actionType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withActionType(CauseData.ActionType value) {
    this.value$actionType$com$dabsquared$gitlabjenkins$cause$CauseData$ActionType = value;
    this.isSet$actionType$com$dabsquared$gitlabjenkins$cause$CauseData$ActionType = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceProjectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceProjectId(Integer value) {
    this.value$sourceProjectId$java$lang$Integer = value;
    this.isSet$sourceProjectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetProjectId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetProjectId(Integer value) {
    this.value$targetProjectId$java$lang$Integer = value;
    this.isSet$targetProjectId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#branch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withBranch(String value) {
    this.value$branch$java$lang$String = value;
    this.isSet$branch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceBranch(String value) {
    this.value$sourceBranch$java$lang$String = value;
    this.isSet$sourceBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#userName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withUserName(String value) {
    this.value$userName$java$lang$String = value;
    this.isSet$userName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#userEmail} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withUserEmail(String value) {
    this.value$userEmail$java$lang$String = value;
    this.isSet$userEmail$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceRepoHomepage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceRepoHomepage(String value) {
    this.value$sourceRepoHomepage$java$lang$String = value;
    this.isSet$sourceRepoHomepage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceRepoName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceRepoName(String value) {
    this.value$sourceRepoName$java$lang$String = value;
    this.isSet$sourceRepoName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceNamespace} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceNamespace(String value) {
    this.value$sourceNamespace$java$lang$String = value;
    this.isSet$sourceNamespace$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceRepoUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceRepoUrl(String value) {
    this.value$sourceRepoUrl$java$lang$String = value;
    this.isSet$sourceRepoUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceRepoSshUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceRepoSshUrl(String value) {
    this.value$sourceRepoSshUrl$java$lang$String = value;
    this.isSet$sourceRepoSshUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#sourceRepoHttpUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withSourceRepoHttpUrl(String value) {
    this.value$sourceRepoHttpUrl$java$lang$String = value;
    this.isSet$sourceRepoHttpUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#mergeRequestTitle} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withMergeRequestTitle(String value) {
    this.value$mergeRequestTitle$java$lang$String = value;
    this.isSet$mergeRequestTitle$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#mergeRequestDescription} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withMergeRequestDescription(String value) {
    this.value$mergeRequestDescription$java$lang$String = value;
    this.isSet$mergeRequestDescription$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#mergeRequestId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withMergeRequestId(Integer value) {
    this.value$mergeRequestId$java$lang$Integer = value;
    this.isSet$mergeRequestId$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#mergeRequestIid} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withMergeRequestIid(Integer value) {
    this.value$mergeRequestIid$java$lang$Integer = value;
    this.isSet$mergeRequestIid$java$lang$Integer = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetBranch(String value) {
    this.value$targetBranch$java$lang$String = value;
    this.isSet$targetBranch$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetRepoName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetRepoName(String value) {
    this.value$targetRepoName$java$lang$String = value;
    this.isSet$targetRepoName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetNamespace} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetNamespace(String value) {
    this.value$targetNamespace$java$lang$String = value;
    this.isSet$targetNamespace$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetRepoSshUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetRepoSshUrl(String value) {
    this.value$targetRepoSshUrl$java$lang$String = value;
    this.isSet$targetRepoSshUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetRepoHttpUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetRepoHttpUrl(String value) {
    this.value$targetRepoHttpUrl$java$lang$String = value;
    this.isSet$targetRepoHttpUrl$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#triggeredByUser} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTriggeredByUser(String value) {
    this.value$triggeredByUser$java$lang$String = value;
    this.isSet$triggeredByUser$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#before} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withBefore(String value) {
    this.value$before$java$lang$String = value;
    this.isSet$before$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#after} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withAfter(String value) {
    this.value$after$java$lang$String = value;
    this.isSet$after$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#lastCommit} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withLastCommit(String value) {
    this.value$lastCommit$java$lang$String = value;
    this.isSet$lastCommit$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link CauseData#targetProjectUrl} property.
   *
   * @param value the default value
   * @return this builder
   */
  public CauseDataBuilder withTargetProjectUrl(String value) {
    this.value$targetProjectUrl$java$lang$String = value;
    this.isSet$targetProjectUrl$java$lang$String = true;
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
      CauseDataBuilder result = (CauseDataBuilder)super.clone();
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
  public CauseDataBuilder but() {
    return (CauseDataBuilder)clone();
  }

  /**
   * Creates a new {@link CauseData} based on this builder's settings.
   *
   * @return the created CauseData
   */
  public CauseData build() {
    try {
      CauseData result = new CauseData(value$actionType$com$dabsquared$gitlabjenkins$cause$CauseData$ActionType, value$sourceProjectId$java$lang$Integer, value$targetProjectId$java$lang$Integer, value$branch$java$lang$String, value$sourceBranch$java$lang$String, value$userName$java$lang$String, value$userEmail$java$lang$String, value$sourceRepoHomepage$java$lang$String, value$sourceRepoName$java$lang$String, value$sourceNamespace$java$lang$String, value$sourceRepoUrl$java$lang$String, value$sourceRepoSshUrl$java$lang$String, value$sourceRepoHttpUrl$java$lang$String, value$mergeRequestTitle$java$lang$String, value$mergeRequestDescription$java$lang$String, value$mergeRequestId$java$lang$Integer, value$mergeRequestIid$java$lang$Integer, value$targetBranch$java$lang$String, value$targetRepoName$java$lang$String, value$targetNamespace$java$lang$String, value$targetRepoSshUrl$java$lang$String, value$targetRepoHttpUrl$java$lang$String, value$triggeredByUser$java$lang$String, value$before$java$lang$String, value$after$java$lang$String, value$lastCommit$java$lang$String, value$targetProjectUrl$java$lang$String);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
