// CHECKSTYLE:OFF

package com.dabsquared.gitlabjenkins;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code CommitNotifier.Success}: {@code Build {0} succeeded in
     * {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Build {0} succeeded in {1}}
     */
    public static String CommitNotifier_Success(Object arg0, Object arg1) {
        return holder.format("CommitNotifier.Success", arg0, arg1);
    }

    /**
     * Key {@code CommitNotifier.Success}: {@code Build {0} succeeded in
     * {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Build {0} succeeded in {1}}
     */
    public static Localizable _CommitNotifier_Success(Object arg0, Object arg1) {
        return new Localizable(holder, "CommitNotifier.Success", arg0, arg1);
    }

    /**
     * Key {@code GitLabPushTrigger.CannotCheckBranches}: {@code Cannot
     * connect to GitLab to check whether selected branches exist.}.
     * 
     * @return
     *     {@code Cannot connect to GitLab to check whether selected branches
     *     exist.}
     */
    public static String GitLabPushTrigger_CannotCheckBranches() {
        return holder.format("GitLabPushTrigger.CannotCheckBranches");
    }

    /**
     * Key {@code GitLabPushTrigger.CannotCheckBranches}: {@code Cannot
     * connect to GitLab to check whether selected branches exist.}.
     * 
     * @return
     *     {@code Cannot connect to GitLab to check whether selected branches
     *     exist.}
     */
    public static Localizable _GitLabPushTrigger_CannotCheckBranches() {
        return new Localizable(holder, "GitLabPushTrigger.CannotCheckBranches");
    }

    /**
     * Key {@code GitLabPushTrigger.NoSourceRepository}: {@code Repository
     * url must be saved first.}.
     * 
     * @return
     *     {@code Repository url must be saved first.}
     */
    public static String GitLabPushTrigger_NoSourceRepository() {
        return holder.format("GitLabPushTrigger.NoSourceRepository");
    }

    /**
     * Key {@code GitLabPushTrigger.NoSourceRepository}: {@code Repository
     * url must be saved first.}.
     * 
     * @return
     *     {@code Repository url must be saved first.}
     */
    public static Localizable _GitLabPushTrigger_NoSourceRepository() {
        return new Localizable(holder, "GitLabPushTrigger.NoSourceRepository");
    }

    /**
     * Key {@code GitLabPushTrigger.BranchesNotFound}: {@code Following
     * patterns don''t match any branch in source repository: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Following patterns don''t match any branch in source
     *     repository: {0}}
     */
    public static String GitLabPushTrigger_BranchesNotFound(Object arg0) {
        return holder.format("GitLabPushTrigger.BranchesNotFound", arg0);
    }

    /**
     * Key {@code GitLabPushTrigger.BranchesNotFound}: {@code Following
     * patterns don''t match any branch in source repository: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Following patterns don''t match any branch in source
     *     repository: {0}}
     */
    public static Localizable _GitLabPushTrigger_BranchesNotFound(Object arg0) {
        return new Localizable(holder, "GitLabPushTrigger.BranchesNotFound", arg0);
    }

    /**
     * Key {@code GitHubCommitNotifier.SettingCommitStatus}: {@code Setting
     * commit status on GitLab for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Setting commit status on GitLab for {0}}
     */
    public static String GitHubCommitNotifier_SettingCommitStatus(Object arg0) {
        return holder.format("GitHubCommitNotifier.SettingCommitStatus", arg0);
    }

    /**
     * Key {@code GitHubCommitNotifier.SettingCommitStatus}: {@code Setting
     * commit status on GitLab for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Setting commit status on GitLab for {0}}
     */
    public static Localizable _GitHubCommitNotifier_SettingCommitStatus(Object arg0) {
        return new Localizable(holder, "GitHubCommitNotifier.SettingCommitStatus", arg0);
    }

    /**
     * Key {@code CommitNotifier.Unstable}: {@code Build {0} found unstable
     * in {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Build {0} found unstable in {1}}
     */
    public static String CommitNotifier_Unstable(Object arg0, Object arg1) {
        return holder.format("CommitNotifier.Unstable", arg0, arg1);
    }

    /**
     * Key {@code CommitNotifier.Unstable}: {@code Build {0} found unstable
     * in {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Build {0} found unstable in {1}}
     */
    public static Localizable _CommitNotifier_Unstable(Object arg0, Object arg1) {
        return new Localizable(holder, "CommitNotifier.Unstable", arg0, arg1);
    }

    /**
     * Key {@code GitLabPushTrigger.CannotConnectToGitLab}: {@code Cannot
     * connect to GitLab: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot connect to GitLab: {0}}
     */
    public static String GitLabPushTrigger_CannotConnectToGitLab(Object arg0) {
        return holder.format("GitLabPushTrigger.CannotConnectToGitLab", arg0);
    }

    /**
     * Key {@code GitLabPushTrigger.CannotConnectToGitLab}: {@code Cannot
     * connect to GitLab: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot connect to GitLab: {0}}
     */
    public static Localizable _GitLabPushTrigger_CannotConnectToGitLab(Object arg0) {
        return new Localizable(holder, "GitLabPushTrigger.CannotConnectToGitLab", arg0);
    }

    /**
     * Key {@code CommitNotifier.Failed}: {@code Build {0} failed in {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Build {0} failed in {1}}
     */
    public static String CommitNotifier_Failed(Object arg0, Object arg1) {
        return holder.format("CommitNotifier.Failed", arg0, arg1);
    }

    /**
     * Key {@code CommitNotifier.Failed}: {@code Build {0} failed in {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Build {0} failed in {1}}
     */
    public static Localizable _CommitNotifier_Failed(Object arg0, Object arg1) {
        return new Localizable(holder, "CommitNotifier.Failed", arg0, arg1);
    }

    /**
     * Key {@code GitLabPushTrigger.BranchesMatched}: {@code Matching {0}
     * branch{0,choice,1#|2#s}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, a number.
     * @return
     *     {@code Matching {0} branch{0,choice,1#|2#s}.}
     */
    public static String GitLabPushTrigger_BranchesMatched(Object arg0) {
        return holder.format("GitLabPushTrigger.BranchesMatched", arg0);
    }

    /**
     * Key {@code GitLabPushTrigger.BranchesMatched}: {@code Matching {0}
     * branch{0,choice,1#|2#s}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, a number.
     * @return
     *     {@code Matching {0} branch{0,choice,1#|2#s}.}
     */
    public static Localizable _GitLabPushTrigger_BranchesMatched(Object arg0) {
        return new Localizable(holder, "GitLabPushTrigger.BranchesMatched", arg0);
    }

}
