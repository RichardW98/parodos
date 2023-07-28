/*
 * Parodos Notification Service API
 * This is the API documentation for the Parodos Notification Service. It provides operations to send out and check notification. The endpoints are secured with oAuth2/OpenID and cannot be accessed without a valid token.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.notification.sdk.model;

import java.io.IOException;
import java.util.Date;
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
import com.redhat.parodos.notification.sdk.api.JSON;

/**
 * ErrorMessageDTO
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorMessageDTO {

	public static final String SERIALIZED_NAME_DATE = "date";

	@SerializedName(SERIALIZED_NAME_DATE)
	private Date date;

	public static final String SERIALIZED_NAME_DESCRIPTION = "description";

	@SerializedName(SERIALIZED_NAME_DESCRIPTION)
	private String description;

	public static final String SERIALIZED_NAME_MESSAGE = "message";

	@SerializedName(SERIALIZED_NAME_MESSAGE)
	private String message;

	public ErrorMessageDTO() {
	}

	public ErrorMessageDTO date(Date date) {

		this.date = date;
		return this;
	}

	/**
	 * Get date
	 * @return date
	 **/
	@jakarta.annotation.Nullable
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ErrorMessageDTO description(String description) {

		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * @return description
	 **/
	@jakarta.annotation.Nullable
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ErrorMessageDTO message(String message) {

		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * @return message
	 **/
	@jakarta.annotation.Nullable
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ErrorMessageDTO errorMessageDTO = (ErrorMessageDTO) o;
		return Objects.equals(this.date, errorMessageDTO.date)
				&& Objects.equals(this.description, errorMessageDTO.description)
				&& Objects.equals(this.message, errorMessageDTO.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, description, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorMessageDTO {\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
		openapiFields.add("date");
		openapiFields.add("description");
		openapiFields.add("message");

		// a set of required properties/fields (JSON key names)
		openapiRequiredFields = new HashSet<String>();
	}

	/**
	 * Validates the JSON Object and throws an exception if issues found
	 * @param jsonObj JSON Object
	 * @throws IOException if the JSON Object is invalid with respect to ErrorMessageDTO
	 */
	public static void validateJsonObject(JsonObject jsonObj) throws IOException {
		if (jsonObj == null) {
			if (!ErrorMessageDTO.openapiRequiredFields.isEmpty()) { // has required fields
																	// but JSON object is
																	// null
				throw new IllegalArgumentException(String.format(
						"The required field(s) %s in ErrorMessageDTO is not found in the empty JSON string",
						ErrorMessageDTO.openapiRequiredFields.toString()));
			}
		}

		Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
		// check to see if the JSON string contains additional fields
		for (Entry<String, JsonElement> entry : entries) {
			if (!ErrorMessageDTO.openapiFields.contains(entry.getKey())) {
				throw new IllegalArgumentException(String.format(
						"The field `%s` in the JSON string is not defined in the `ErrorMessageDTO` properties. JSON: %s",
						entry.getKey(), jsonObj.toString()));
			}
		}
		if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
				&& !jsonObj.get("description").isJsonPrimitive()) {
			throw new IllegalArgumentException(String.format(
					"Expected the field `description` to be a primitive type in the JSON string but got `%s`",
					jsonObj.get("description").toString()));
		}
		if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
				&& !jsonObj.get("message").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("message").toString()));
		}
	}

	public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

		@SuppressWarnings("unchecked")
		@Override
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
			if (!ErrorMessageDTO.class.isAssignableFrom(type.getRawType())) {
				return null; // this class only serializes 'ErrorMessageDTO' and its
								// subtypes
			}
			final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
			final TypeAdapter<ErrorMessageDTO> thisAdapter = gson.getDelegateAdapter(this,
					TypeToken.get(ErrorMessageDTO.class));

			return (TypeAdapter<T>) new TypeAdapter<ErrorMessageDTO>() {
				@Override
				public void write(JsonWriter out, ErrorMessageDTO value) throws IOException {
					JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
					elementAdapter.write(out, obj);
				}

				@Override
				public ErrorMessageDTO read(JsonReader in) throws IOException {
					JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
					validateJsonObject(jsonObj);
					return thisAdapter.fromJsonTree(jsonObj);
				}

			}.nullSafe();
		}

	}

	/**
	 * Create an instance of ErrorMessageDTO given an JSON string
	 * @param jsonString JSON string
	 * @return An instance of ErrorMessageDTO
	 * @throws IOException if the JSON string is invalid with respect to ErrorMessageDTO
	 */
	public static ErrorMessageDTO fromJson(String jsonString) throws IOException {
		return JSON.getGson().fromJson(jsonString, ErrorMessageDTO.class);
	}

	/**
	 * Convert an instance of ErrorMessageDTO to an JSON string
	 * @return JSON string
	 */
	public String toJson() {
		return JSON.getGson().toJson(this);
	}

}
