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
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.parodos.sdk.invoker.JSON;

/**
 * UserRoleResponseDTO
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserRoleResponseDTO {

	/**
	 * Gets or Sets roles
	 */
	@JsonAdapter(RolesEnum.Adapter.class)
	public enum RolesEnum {

		OWNER("OWNER"),

		DEVELOPER("DEVELOPER"),

		ADMIN("ADMIN");

		private String value;

		RolesEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static RolesEnum fromValue(String value) {
			for (RolesEnum b : RolesEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		public static class Adapter extends TypeAdapter<RolesEnum> {

			@Override
			public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public RolesEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return RolesEnum.fromValue(value);
			}

		}

	}

	public static final String SERIALIZED_NAME_ROLES = "roles";

	@SerializedName(SERIALIZED_NAME_ROLES)
	private Set<RolesEnum> roles;

	public static final String SERIALIZED_NAME_USERNAME = "username";

	@SerializedName(SERIALIZED_NAME_USERNAME)
	private String username;

	public UserRoleResponseDTO() {
	}

	public UserRoleResponseDTO roles(Set<RolesEnum> roles) {

		this.roles = roles;
		return this;
	}

	public UserRoleResponseDTO addRolesItem(RolesEnum rolesItem) {
		if (this.roles == null) {
			this.roles = new LinkedHashSet<>();
		}
		this.roles.add(rolesItem);
		return this;
	}

	/**
	 * Get roles
	 * @return roles
	 **/
	@jakarta.annotation.Nullable
	public Set<RolesEnum> getRoles() {
		return roles;
	}

	public void setRoles(Set<RolesEnum> roles) {
		this.roles = roles;
	}

	public UserRoleResponseDTO username(String username) {

		this.username = username;
		return this;
	}

	/**
	 * Get username
	 * @return username
	 **/
	@jakarta.annotation.Nullable
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserRoleResponseDTO userRoleResponseDTO = (UserRoleResponseDTO) o;
		return Objects.equals(this.roles, userRoleResponseDTO.roles)
				&& Objects.equals(this.username, userRoleResponseDTO.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(roles, username);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserRoleResponseDTO {\n");
		sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
		openapiFields.add("roles");
		openapiFields.add("username");

		// a set of required properties/fields (JSON key names)
		openapiRequiredFields = new HashSet<String>();
	}

	/**
	 * Validates the JSON Object and throws an exception if issues found
	 * @param jsonObj JSON Object
	 * @throws IOException if the JSON Object is invalid with respect to
	 * UserRoleResponseDTO
	 */
	public static void validateJsonObject(JsonObject jsonObj) throws IOException {
		if (jsonObj == null) {
			if (!UserRoleResponseDTO.openapiRequiredFields.isEmpty()) { // has required
																		// fields but JSON
																		// object is null
				throw new IllegalArgumentException(String.format(
						"The required field(s) %s in UserRoleResponseDTO is not found in the empty JSON string",
						UserRoleResponseDTO.openapiRequiredFields.toString()));
			}
		}

		Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
		// check to see if the JSON string contains additional fields
		for (Entry<String, JsonElement> entry : entries) {
			if (!UserRoleResponseDTO.openapiFields.contains(entry.getKey())) {
				throw new IllegalArgumentException(String.format(
						"The field `%s` in the JSON string is not defined in the `UserRoleResponseDTO` properties. JSON: %s",
						entry.getKey(), jsonObj.toString()));
			}
		}
		// ensure the optional json data is an array if present
		if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `roles` to be an array in the JSON string but got `%s`",
							jsonObj.get("roles").toString()));
		}
		if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull())
				&& !jsonObj.get("username").isJsonPrimitive()) {
			throw new IllegalArgumentException(String.format(
					"Expected the field `username` to be a primitive type in the JSON string but got `%s`",
					jsonObj.get("username").toString()));
		}
	}

	public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

		@SuppressWarnings("unchecked")
		@Override
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
			if (!UserRoleResponseDTO.class.isAssignableFrom(type.getRawType())) {
				return null; // this class only serializes 'UserRoleResponseDTO' and its
								// subtypes
			}
			final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
			final TypeAdapter<UserRoleResponseDTO> thisAdapter = gson.getDelegateAdapter(this,
					TypeToken.get(UserRoleResponseDTO.class));

			return (TypeAdapter<T>) new TypeAdapter<UserRoleResponseDTO>() {
				@Override
				public void write(JsonWriter out, UserRoleResponseDTO value) throws IOException {
					JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
					elementAdapter.write(out, obj);
				}

				@Override
				public UserRoleResponseDTO read(JsonReader in) throws IOException {
					JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
					validateJsonObject(jsonObj);
					return thisAdapter.fromJsonTree(jsonObj);
				}

			}.nullSafe();
		}

	}

	/**
	 * Create an instance of UserRoleResponseDTO given an JSON string
	 * @param jsonString JSON string
	 * @return An instance of UserRoleResponseDTO
	 * @throws IOException if the JSON string is invalid with respect to
	 * UserRoleResponseDTO
	 */
	public static UserRoleResponseDTO fromJson(String jsonString) throws IOException {
		return JSON.getGson().fromJson(jsonString, UserRoleResponseDTO.class);
	}

	/**
	 * Convert an instance of UserRoleResponseDTO to an JSON string
	 * @return JSON string
	 */
	public String toJson() {
		return JSON.getGson().toJson(this);
	}

}
