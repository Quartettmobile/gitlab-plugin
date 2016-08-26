// CHECKSTYLE:OFF

package com.dabsquared.gitlabjenkins.connection;

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
     * Key {@code name.required}: {@code Gitlab connection name required.}.
     * 
     * @return
     *     {@code Gitlab connection name required.}
     */
    public static String name_required() {
        return holder.format("name.required");
    }

    /**
     * Key {@code name.required}: {@code Gitlab connection name required.}.
     * 
     * @return
     *     {@code Gitlab connection name required.}
     */
    public static Localizable _name_required() {
        return new Localizable(holder, "name.required");
    }

    /**
     * Key {@code connection.error}: {@code Client error: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Client error: {0}}
     */
    public static String connection_error(Object arg0) {
        return holder.format("connection.error", arg0);
    }

    /**
     * Key {@code connection.error}: {@code Client error: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Client error: {0}}
     */
    public static Localizable _connection_error(Object arg0) {
        return new Localizable(holder, "connection.error", arg0);
    }

    /**
     * Key {@code connectionTimeout.required}: {@code Connection timeout is
     * required}.
     * 
     * @return
     *     {@code Connection timeout is required}
     */
    public static String connectionTimeout_required() {
        return holder.format("connectionTimeout.required");
    }

    /**
     * Key {@code connectionTimeout.required}: {@code Connection timeout is
     * required}.
     * 
     * @return
     *     {@code Connection timeout is required}
     */
    public static Localizable _connectionTimeout_required() {
        return new Localizable(holder, "connectionTimeout.required");
    }

    /**
     * Key {@code url.required}: {@code Gitlab host URL required.}.
     * 
     * @return
     *     {@code Gitlab host URL required.}
     */
    public static String url_required() {
        return holder.format("url.required");
    }

    /**
     * Key {@code url.required}: {@code Gitlab host URL required.}.
     * 
     * @return
     *     {@code Gitlab host URL required.}
     */
    public static Localizable _url_required() {
        return new Localizable(holder, "url.required");
    }

    /**
     * Key {@code readTimeout.required}: {@code Read timeout is required}.
     * 
     * @return
     *     {@code Read timeout is required}
     */
    public static String readTimeout_required() {
        return holder.format("readTimeout.required");
    }

    /**
     * Key {@code readTimeout.required}: {@code Read timeout is required}.
     * 
     * @return
     *     {@code Read timeout is required}
     */
    public static Localizable _readTimeout_required() {
        return new Localizable(holder, "readTimeout.required");
    }

    /**
     * Key {@code name.exists}: {@code GitLab connection name "{0}" already
     * exists}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code GitLab connection name "{0}" already exists}
     */
    public static String name_exists(Object arg0) {
        return holder.format("name.exists", arg0);
    }

    /**
     * Key {@code name.exists}: {@code GitLab connection name "{0}" already
     * exists}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code GitLab connection name "{0}" already exists}
     */
    public static Localizable _name_exists(Object arg0) {
        return new Localizable(holder, "name.exists", arg0);
    }

    /**
     * Key {@code apiToken.required}: {@code API Token for Gitlab access
     * required}.
     * 
     * @return
     *     {@code API Token for Gitlab access required}
     */
    public static String apiToken_required() {
        return holder.format("apiToken.required");
    }

    /**
     * Key {@code apiToken.required}: {@code API Token for Gitlab access
     * required}.
     * 
     * @return
     *     {@code API Token for Gitlab access required}
     */
    public static Localizable _apiToken_required() {
        return new Localizable(holder, "apiToken.required");
    }

    /**
     * Key {@code GitLabApiToken.name}: {@code GitLab API token}.
     * 
     * @return
     *     {@code GitLab API token}
     */
    public static String GitLabApiToken_name() {
        return holder.format("GitLabApiToken.name");
    }

    /**
     * Key {@code GitLabApiToken.name}: {@code GitLab API token}.
     * 
     * @return
     *     {@code GitLab API token}
     */
    public static Localizable _GitLabApiToken_name() {
        return new Localizable(holder, "GitLabApiToken.name");
    }

    /**
     * Key {@code connection.success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static String connection_success() {
        return holder.format("connection.success");
    }

    /**
     * Key {@code connection.success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static Localizable _connection_success() {
        return new Localizable(holder, "connection.success");
    }

}
