// CHECKSTYLE:OFF

package com.dabsquared.gitlabjenkins.publisher;

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
     * Key {@code name.required}: {@code Build name required.}.
     * 
     * @return
     *     {@code Build name required.}
     */
    public static String name_required() {
        return holder.format("name.required");
    }

    /**
     * Key {@code name.required}: {@code Build name required.}.
     * 
     * @return
     *     {@code Build name required.}
     */
    public static Localizable _name_required() {
        return new Localizable(holder, "name.required");
    }

    /**
     * Key {@code GitLabCommitStatusPublisher.DisplayName}: {@code Publish
     * build status to GitLab commit (GitLab 8.1+ required)}.
     * 
     * @return
     *     {@code Publish build status to GitLab commit (GitLab 8.1+ required)}
     */
    public static String GitLabCommitStatusPublisher_DisplayName() {
        return holder.format("GitLabCommitStatusPublisher.DisplayName");
    }

    /**
     * Key {@code GitLabCommitStatusPublisher.DisplayName}: {@code Publish
     * build status to GitLab commit (GitLab 8.1+ required)}.
     * 
     * @return
     *     {@code Publish build status to GitLab commit (GitLab 8.1+ required)}
     */
    public static Localizable _GitLabCommitStatusPublisher_DisplayName() {
        return new Localizable(holder, "GitLabCommitStatusPublisher.DisplayName");
    }

}
