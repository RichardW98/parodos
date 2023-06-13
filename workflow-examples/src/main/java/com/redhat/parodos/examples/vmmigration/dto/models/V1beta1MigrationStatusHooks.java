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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Plan hook.
 */
@ApiModel(description = "Plan hook.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
		date = "2023-05-17T23:50:06.262Z[Etc/UTC]")
public class V1beta1MigrationStatusHooks {

	public static final String SERIALIZED_NAME_HOOK = "hook";

	@SerializedName(SERIALIZED_NAME_HOOK)
	private V1beta1MigrationStatusHook hook;

	public static final String SERIALIZED_NAME_STEP = "step";

	@SerializedName(SERIALIZED_NAME_STEP)
	private String step;

	public V1beta1MigrationStatusHooks hook(V1beta1MigrationStatusHook hook) {

		this.hook = hook;
		return this;
	}

	/**
	 * Get hook
	 * @return hook
	 **/
	@ApiModelProperty(required = true, value = "")

	public V1beta1MigrationStatusHook getHook() {
		return hook;
	}

	public void setHook(V1beta1MigrationStatusHook hook) {
		this.hook = hook;
	}

	public V1beta1MigrationStatusHooks step(String step) {

		this.step = step;
		return this;
	}

	/**
	 * Pipeline step.
	 * @return step
	 **/
	@ApiModelProperty(required = true, value = "Pipeline step.")

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		V1beta1MigrationStatusHooks v1beta1MigrationStatusHooks = (V1beta1MigrationStatusHooks) o;
		return Objects.equals(this.hook, v1beta1MigrationStatusHooks.hook)
				&& Objects.equals(this.step, v1beta1MigrationStatusHooks.step);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hook, step);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1beta1MigrationStatusHooks {\n");
		sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
		sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
