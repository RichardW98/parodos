/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.examples.vmmigration.dto.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A VM listed on the plan.
 */
@ApiModel(description = "A VM listed on the plan.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
		date = "2023-05-17T23:50:06.262Z[Etc/UTC]")
public class V1beta1PlanSpecVms {

	public static final String SERIALIZED_NAME_HOOKS = "hooks";

	@SerializedName(SERIALIZED_NAME_HOOKS)
	private List<V1beta1MigrationStatusHooks> hooks = null;

	public static final String SERIALIZED_NAME_ID = "id";

	@SerializedName(SERIALIZED_NAME_ID)
	private String id;

	public static final String SERIALIZED_NAME_NAME = "name";

	@SerializedName(SERIALIZED_NAME_NAME)
	private String name;

	public static final String SERIALIZED_NAME_TYPE = "type";

	@SerializedName(SERIALIZED_NAME_TYPE)
	private String type;

	public V1beta1PlanSpecVms hooks(List<V1beta1MigrationStatusHooks> hooks) {

		this.hooks = hooks;
		return this;
	}

	public V1beta1PlanSpecVms addHooksItem(V1beta1MigrationStatusHooks hooksItem) {
		if (this.hooks == null) {
			this.hooks = new ArrayList<>();
		}
		this.hooks.add(hooksItem);
		return this;
	}

	/**
	 * Enable hooks.
	 * @return hooks
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "Enable hooks.")

	public List<V1beta1MigrationStatusHooks> getHooks() {
		return hooks;
	}

	public void setHooks(List<V1beta1MigrationStatusHooks> hooks) {
		this.hooks = hooks;
	}

	public V1beta1PlanSpecVms id(String id) {

		this.id = id;
		return this;
	}

	/**
	 * The object ID. vsphere: The managed object ID.
	 * @return id
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The object ID. vsphere:   The managed object ID.")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public V1beta1PlanSpecVms name(String name) {

		this.name = name;
		return this;
	}

	/**
	 * An object Name. vsphere: A qualified name.
	 * @return name
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "An object Name. vsphere:   A qualified name.")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public V1beta1PlanSpecVms type(String type) {

		this.type = type;
		return this;
	}

	/**
	 * Type used to qualify the name.
	 * @return type
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "Type used to qualify the name.")

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		V1beta1PlanSpecVms v1beta1PlanSpecVms = (V1beta1PlanSpecVms) o;
		return Objects.equals(this.hooks, v1beta1PlanSpecVms.hooks) && Objects.equals(this.id, v1beta1PlanSpecVms.id)
				&& Objects.equals(this.name, v1beta1PlanSpecVms.name)
				&& Objects.equals(this.type, v1beta1PlanSpecVms.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hooks, id, name, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1beta1PlanSpecVms {\n");
		sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
