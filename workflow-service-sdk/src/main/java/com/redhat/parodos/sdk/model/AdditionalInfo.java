/*
 * Parodos Workflow Service API
 * This is the API documentation for the Parodos Workflow Service. It provides operations to execute assessments to determine infrastructure options (tooling + environments). Also executes infrastructure task workflows to call downstream systems to stand-up an infrastructure option.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.sdk.model;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.parodos.sdk.invoker.JSON;

/**
 * AdditionalInfo
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalInfo {

	public static final String SERIALIZED_NAME_KEY = "key";

	@SerializedName(SERIALIZED_NAME_KEY)
	private String key;

	public static final String SERIALIZED_NAME_VALUE = "value";

	@SerializedName(SERIALIZED_NAME_VALUE)
	private String value;

	public AdditionalInfo() {
	}

	public AdditionalInfo key(String key) {

		this.key = key;
		return this;
	}

	/**
	 * Get key
	 * @return key
	 **/
	@jakarta.annotation.Nullable
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public AdditionalInfo value(String value) {

		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * @return value
	 **/
	@jakarta.annotation.Nullable
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdditionalInfo additionalInfo = (AdditionalInfo) o;
		return Objects.equals(this.key, additionalInfo.key) && Objects.equals(this.value, additionalInfo.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdditionalInfo {\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

	public static HashSet<String> openapiFields;

	public static HashSet<String> openapiRequiredFields;

	static {
		// a set of all properties/fields (JSON key names)
		openapiFields = new HashSet<String>();
		openapiFields.add("key");
		openapiFields.add("value");

		// a set of required properties/fields (JSON key names)
		openapiRequiredFields = new HashSet<String>();
	}

	/**
	 * Validates the JSON Object and throws an exception if issues found
	 * @param jsonObj JSON Object
	 * @throws IOException if the JSON Object is invalid with respect to AdditionalInfo
	 */
	public static void validateJsonObject(JsonObject jsonObj) throws IOException {
		if (jsonObj == null) {
			if (!AdditionalInfo.openapiRequiredFields.isEmpty()) { // has required fields
																	// but JSON object is
																	// null
				throw new IllegalArgumentException(String.format(
						"The required field(s) %s in AdditionalInfo is not found in the empty JSON string",
						AdditionalInfo.openapiRequiredFields.toString()));
			}
		}

		Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
		// check to see if the JSON string contains additional fields
		for (Entry<String, JsonElement> entry : entries) {
			if (!AdditionalInfo.openapiFields.contains(entry.getKey())) {
				throw new IllegalArgumentException(String.format(
						"The field `%s` in the JSON string is not defined in the `AdditionalInfo` properties. JSON: %s",
						entry.getKey(), jsonObj.toString()));
			}
		}
		if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("key").toString()));
		}
		if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull())
				&& !jsonObj.get("value").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("value").toString()));
		}
	}

	public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

		@SuppressWarnings("unchecked")
		@Override
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
			if (!AdditionalInfo.class.isAssignableFrom(type.getRawType())) {
				return null; // this class only serializes 'AdditionalInfo' and its
								// subtypes
			}
			final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
			final TypeAdapter<AdditionalInfo> thisAdapter = gson.getDelegateAdapter(this,
					TypeToken.get(AdditionalInfo.class));

			return (TypeAdapter<T>) new TypeAdapter<AdditionalInfo>() {
				@Override
				public void write(JsonWriter out, AdditionalInfo value) throws IOException {
					JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
					elementAdapter.write(out, obj);
				}

				@Override
				public AdditionalInfo read(JsonReader in) throws IOException {
					JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
					validateJsonObject(jsonObj);
					return thisAdapter.fromJsonTree(jsonObj);
				}

			}.nullSafe();
		}

	}

	/**
	 * Create an instance of AdditionalInfo given an JSON string
	 * @param jsonString JSON string
	 * @return An instance of AdditionalInfo
	 * @throws IOException if the JSON string is invalid with respect to AdditionalInfo
	 */
	public static AdditionalInfo fromJson(String jsonString) throws IOException {
		return JSON.getGson().fromJson(jsonString, AdditionalInfo.class);
	}

	/**
	 * Convert an instance of AdditionalInfo to an JSON string
	 * @return JSON string
	 */
	public String toJson() {
		return JSON.getGson().toJson(this);
	}

}
