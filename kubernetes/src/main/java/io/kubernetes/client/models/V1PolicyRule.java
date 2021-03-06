/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 */
@ApiModel(description = "PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.")

public class V1PolicyRule {
  @SerializedName("apiGroups")
  private List<String> apiGroups = null;

  @SerializedName("nonResourceURLs")
  private List<String> nonResourceURLs = null;

  @SerializedName("resourceNames")
  private List<String> resourceNames = null;

  @SerializedName("resources")
  private List<String> resources = null;

  @SerializedName("verbs")
  private List<String> verbs = new ArrayList<String>();

  public V1PolicyRule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public V1PolicyRule addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<String>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

   /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
   * @return apiGroups
  **/
  @ApiModelProperty(value = "APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public V1PolicyRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1PolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList<String>();
    }
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

   /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \&quot;pods\&quot; or \&quot;secrets\&quot;) or non-resource URL paths (such as \&quot;/api\&quot;),  but not both.
   * @return nonResourceURLs
  **/
  @ApiModelProperty(value = "NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \"pods\" or \"secrets\") or non-resource URL paths (such as \"/api\"),  but not both.")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public V1PolicyRule resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public V1PolicyRule addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<String>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

   /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
   * @return resourceNames
  **/
  @ApiModelProperty(value = "ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.")
  public List<String> getResourceNames() {
    return resourceNames;
  }

  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }

  public V1PolicyRule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public V1PolicyRule addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
   * @return resources
  **/
  @ApiModelProperty(value = "Resources is a list of resources this rule applies to.  ResourceAll represents all resources.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public V1PolicyRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public V1PolicyRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }

   /**
   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
   * @return verbs
  **/
  @ApiModelProperty(required = true, value = "Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PolicyRule v1PolicyRule = (V1PolicyRule) o;
    return Objects.equals(this.apiGroups, v1PolicyRule.apiGroups) &&
        Objects.equals(this.nonResourceURLs, v1PolicyRule.nonResourceURLs) &&
        Objects.equals(this.resourceNames, v1PolicyRule.resourceNames) &&
        Objects.equals(this.resources, v1PolicyRule.resources) &&
        Objects.equals(this.verbs, v1PolicyRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PolicyRule {\n");
    
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

