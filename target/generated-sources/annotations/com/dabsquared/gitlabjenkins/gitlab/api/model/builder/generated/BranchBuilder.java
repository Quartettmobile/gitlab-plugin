package com.dabsquared.gitlabjenkins.gitlab.api.model.builder.generated;

import com.dabsquared.gitlabjenkins.gitlab.api.model.Branch;
import com.dabsquared.gitlabjenkins.gitlab.api.model.Commit;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class BranchBuilder
    implements Cloneable {
  protected BranchBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected Boolean value$protectedBranch$java$lang$Boolean;
  protected boolean isSet$protectedBranch$java$lang$Boolean;
  protected Commit value$commit$com$dabsquared$gitlabjenkins$gitlab$api$model$Commit;
  protected boolean isSet$commit$com$dabsquared$gitlabjenkins$gitlab$api$model$Commit;

  /**
   * Factory Method to construct a BranchBuilder
   *
   * @return a new BranchBuilder
   */
  public static BranchBuilder branch() {
    return new BranchBuilder();
  }

  /**
   * Creates a new {@link BranchBuilder}.
   */
  public BranchBuilder() {
    self = (BranchBuilder)this;
  }

  /**
   * Sets the default value for the {@link Branch#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public BranchBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Branch#protectedBranch} property.
   *
   * @param value the default value
   * @return this builder
   */
  public BranchBuilder withProtectedBranch(Boolean value) {
    this.value$protectedBranch$java$lang$Boolean = value;
    this.isSet$protectedBranch$java$lang$Boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Branch#commit} property.
   *
   * @param value the default value
   * @return this builder
   */
  public BranchBuilder withCommit(Commit value) {
    this.value$commit$com$dabsquared$gitlabjenkins$gitlab$api$model$Commit = value;
    this.isSet$commit$com$dabsquared$gitlabjenkins$gitlab$api$model$Commit = true;
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
      BranchBuilder result = (BranchBuilder)super.clone();
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
  public BranchBuilder but() {
    return (BranchBuilder)clone();
  }

  /**
   * Creates a new {@link Branch} based on this builder's settings.
   *
   * @return the created Branch
   */
  public Branch build() {
    try {
      Branch result = new Branch();
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$protectedBranch$java$lang$Boolean) {
        result.setProtectedBranch(value$protectedBranch$java$lang$Boolean);
      }
      if (isSet$commit$com$dabsquared$gitlabjenkins$gitlab$api$model$Commit) {
        result.setCommit(value$commit$com$dabsquared$gitlabjenkins$gitlab$api$model$Commit);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
