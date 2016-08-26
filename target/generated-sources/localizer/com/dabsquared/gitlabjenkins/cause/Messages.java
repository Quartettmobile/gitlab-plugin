// CHECKSTYLE:OFF

package com.dabsquared.gitlabjenkins.cause;

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
     * Key {@code GitLabWebHookCause.ShortDescription.MergeRequestHook_html}:
     * {@code Triggered by <a href="{3}/merge_requests/{0}"
     * target="_blank">GitLab Merge Request #{0}</a>: {1} => {2}}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by <a href="{3}/merge_requests/{0}"
     *     target="_blank">GitLab Merge Request #{0}</a>: {1} => {2}}
     */
    public static String GitLabWebHookCause_ShortDescription_MergeRequestHook_html(Object arg0, Object arg1, Object arg2, Object arg3) {
        return holder.format("GitLabWebHookCause.ShortDescription.MergeRequestHook_html", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.MergeRequestHook_html}:
     * {@code Triggered by <a href="{3}/merge_requests/{0}"
     * target="_blank">GitLab Merge Request #{0}</a>: {1} => {2}}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by <a href="{3}/merge_requests/{0}"
     *     target="_blank">GitLab Merge Request #{0}</a>: {1} => {2}}
     */
    public static Localizable _GitLabWebHookCause_ShortDescription_MergeRequestHook_html(Object arg0, Object arg1, Object arg2, Object arg3) {
        return new Localizable(holder, "GitLabWebHookCause.ShortDescription.MergeRequestHook_html", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.NoteHook_plain}: {@code
     * Triggered by {0} GitLab Merge Request #{1}: {2} => {3}}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by {0} GitLab Merge Request #{1}: {2} => {3}}
     */
    public static String GitLabWebHookCause_ShortDescription_NoteHook_plain(Object arg0, Object arg1, Object arg2, Object arg3) {
        return holder.format("GitLabWebHookCause.ShortDescription.NoteHook_plain", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.NoteHook_plain}: {@code
     * Triggered by {0} GitLab Merge Request #{1}: {2} => {3}}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by {0} GitLab Merge Request #{1}: {2} => {3}}
     */
    public static Localizable _GitLabWebHookCause_ShortDescription_NoteHook_plain(Object arg0, Object arg1, Object arg2, Object arg3) {
        return new Localizable(holder, "GitLabWebHookCause.ShortDescription.NoteHook_plain", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.PushHook_noUser}:
     * {@code Started by GitLab push}.
     * 
     * @return
     *     {@code Started by GitLab push}
     */
    public static String GitLabWebHookCause_ShortDescription_PushHook_noUser() {
        return holder.format("GitLabWebHookCause.ShortDescription.PushHook_noUser");
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.PushHook_noUser}:
     * {@code Started by GitLab push}.
     * 
     * @return
     *     {@code Started by GitLab push}
     */
    public static Localizable _GitLabWebHookCause_ShortDescription_PushHook_noUser() {
        return new Localizable(holder, "GitLabWebHookCause.ShortDescription.PushHook_noUser");
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.NoteHook_html}: {@code
     * Triggered by {0} <a href="{4}/merge_requests/{1}"
     * target="_blank">GitLab Merge Request #{1}</a>: {2} => {3}}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg4
     *      5th format parameter, {@code {4}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by {0} <a href="{4}/merge_requests/{1}"
     *     target="_blank">GitLab Merge Request #{1}</a>: {2} => {3}}
     */
    public static String GitLabWebHookCause_ShortDescription_NoteHook_html(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4) {
        return holder.format("GitLabWebHookCause.ShortDescription.NoteHook_html", arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.NoteHook_html}: {@code
     * Triggered by {0} <a href="{4}/merge_requests/{1}"
     * target="_blank">GitLab Merge Request #{1}</a>: {2} => {3}}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg4
     *      5th format parameter, {@code {4}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by {0} <a href="{4}/merge_requests/{1}"
     *     target="_blank">GitLab Merge Request #{1}</a>: {2} => {3}}
     */
    public static Localizable _GitLabWebHookCause_ShortDescription_NoteHook_html(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4) {
        return new Localizable(holder, "GitLabWebHookCause.ShortDescription.NoteHook_html", arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Key {@code
     * GitLabWebHookCause.ShortDescription.MergeRequestHook_plain}: {@code
     * Triggered by GitLab Merge Request #{0}: {1} => {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by GitLab Merge Request #{0}: {1} => {2}}
     */
    public static String GitLabWebHookCause_ShortDescription_MergeRequestHook_plain(Object arg0, Object arg1, Object arg2) {
        return holder.format("GitLabWebHookCause.ShortDescription.MergeRequestHook_plain", arg0, arg1, arg2);
    }

    /**
     * Key {@code
     * GitLabWebHookCause.ShortDescription.MergeRequestHook_plain}: {@code
     * Triggered by GitLab Merge Request #{0}: {1} => {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggered by GitLab Merge Request #{0}: {1} => {2}}
     */
    public static Localizable _GitLabWebHookCause_ShortDescription_MergeRequestHook_plain(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "GitLabWebHookCause.ShortDescription.MergeRequestHook_plain", arg0, arg1, arg2);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.PushHook}: {@code
     * Started by GitLab push by {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Started by GitLab push by {0}}
     */
    public static String GitLabWebHookCause_ShortDescription_PushHook(Object arg0) {
        return holder.format("GitLabWebHookCause.ShortDescription.PushHook", arg0);
    }

    /**
     * Key {@code GitLabWebHookCause.ShortDescription.PushHook}: {@code
     * Started by GitLab push by {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Started by GitLab push by {0}}
     */
    public static Localizable _GitLabWebHookCause_ShortDescription_PushHook(Object arg0) {
        return new Localizable(holder, "GitLabWebHookCause.ShortDescription.PushHook", arg0);
    }

}
