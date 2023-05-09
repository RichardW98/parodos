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

package com.redhat.parodos.sdk.invoker;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import okio.ByteString;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {

	private static Gson gson;

	private static boolean isLenientOnJson = false;

	private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();

	private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();

	private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

	@SuppressWarnings("unchecked")
	public static GsonBuilder createGson() {
		GsonFireBuilder fireBuilder = new GsonFireBuilder();
		GsonBuilder builder = fireBuilder.createGsonBuilder();
		return builder;
	}

	private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
		JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
		if (null == element) {
			throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
		}
		return element.getAsString();
	}

	/**
	 * Returns the Java class that implements the OpenAPI schema for the specified
	 * discriminator value.
	 * @param classByDiscriminatorValue The map of discriminator values to Java classes.
	 * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
	 * @return The Java class that implements the OpenAPI schema
	 */
	private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
		Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
		if (null == clazz) {
			throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
		}
		return clazz;
	}

	{
		GsonBuilder gsonBuilder = createGson();
		gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
		gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
		gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.ArgumentRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.GetStatusByProjectId200Response.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.ProjectRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.ProjectResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.ProjectUserRoleResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.UpdateParameter200Response.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.UserRoleRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.UserRoleResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkDefinitionResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowCheckerTaskRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowContextResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowDefinitionResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder
				.registerTypeAdapterFactory(new com.redhat.parodos.sdk.model.WorkFlowOption.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowOptionsResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowPropertiesDefinitionDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkFlowStatusResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkParameterValueRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkParameterValueResponseDTO.CustomTypeAdapterFactory());
		gsonBuilder
				.registerTypeAdapterFactory(new com.redhat.parodos.sdk.model.WorkRequestDTO.CustomTypeAdapterFactory());
		gsonBuilder.registerTypeAdapterFactory(
				new com.redhat.parodos.sdk.model.WorkStatusResponseDTO.CustomTypeAdapterFactory());
		gson = gsonBuilder.create();
	}

	/**
	 * Get Gson.
	 * @return Gson
	 */
	public static Gson getGson() {
		return gson;
	}

	/**
	 * Set Gson.
	 * @param gson Gson
	 */
	public static void setGson(Gson gson) {
		JSON.gson = gson;
	}

	public static void setLenientOnJson(boolean lenientOnJson) {
		isLenientOnJson = lenientOnJson;
	}

	/**
	 * Serialize the given Java object into JSON string.
	 * @param obj Object
	 * @return String representation of the JSON
	 */
	public static String serialize(Object obj) {
		return gson.toJson(obj);
	}

	/**
	 * Deserialize the given JSON string to Java object.
	 * @param <T> Type
	 * @param body The JSON string
	 * @param returnType The type to deserialize into
	 * @return The deserialized Java object
	 */
	@SuppressWarnings("unchecked")
	public static <T> T deserialize(String body, Type returnType) {
		try {
			if (isLenientOnJson) {
				JsonReader jsonReader = new JsonReader(new StringReader(body));
				// see
				// https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
				jsonReader.setLenient(true);
				return gson.fromJson(jsonReader, returnType);
			}
			else {
				return gson.fromJson(body, returnType);
			}
		}
		catch (JsonParseException e) {
			// Fallback processing when failed to parse JSON form response body:
			// return the response body string directly for the String return type;
			if (returnType.equals(String.class)) {
				return (T) body;
			}
			else {
				throw (e);
			}
		}
	}

	/**
	 * Gson TypeAdapter for Byte Array type
	 */
	public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

		@Override
		public void write(JsonWriter out, byte[] value) throws IOException {
			if (value == null) {
				out.nullValue();
			}
			else {
				out.value(ByteString.of(value).base64());
			}
		}

		@Override
		public byte[] read(JsonReader in) throws IOException {
			switch (in.peek()) {
				case NULL:
					in.nextNull();
					return null;
				default:
					String bytesAsBase64 = in.nextString();
					ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
					return byteString.toByteArray();
			}
		}

	}

	/**
	 * Gson TypeAdapter for java.sql.Date type If the dateFormat is null, a simple
	 * "yyyy-MM-dd" format will be used (more efficient than SimpleDateFormat).
	 */
	public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

		private DateFormat dateFormat;

		public SqlDateTypeAdapter() {
		}

		public SqlDateTypeAdapter(DateFormat dateFormat) {
			this.dateFormat = dateFormat;
		}

		public void setFormat(DateFormat dateFormat) {
			this.dateFormat = dateFormat;
		}

		@Override
		public void write(JsonWriter out, java.sql.Date date) throws IOException {
			if (date == null) {
				out.nullValue();
			}
			else {
				String value;
				if (dateFormat != null) {
					value = dateFormat.format(date);
				}
				else {
					value = date.toString();
				}
				out.value(value);
			}
		}

		@Override
		public java.sql.Date read(JsonReader in) throws IOException {
			switch (in.peek()) {
				case NULL:
					in.nextNull();
					return null;
				default:
					String date = in.nextString();
					try {
						if (dateFormat != null) {
							return new java.sql.Date(dateFormat.parse(date).getTime());
						}
						return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
					}
					catch (ParseException e) {
						throw new JsonParseException(e);
					}
			}
		}

	}

	/**
	 * Gson TypeAdapter for java.util.Date type If the dateFormat is null, ISO8601Utils
	 * will be used.
	 */
	public static class DateTypeAdapter extends TypeAdapter<Date> {

		private DateFormat dateFormat;

		public DateTypeAdapter() {
		}

		public DateTypeAdapter(DateFormat dateFormat) {
			this.dateFormat = dateFormat;
		}

		public void setFormat(DateFormat dateFormat) {
			this.dateFormat = dateFormat;
		}

		@Override
		public void write(JsonWriter out, Date date) throws IOException {
			if (date == null) {
				out.nullValue();
			}
			else {
				String value;
				if (dateFormat != null) {
					value = dateFormat.format(date);
				}
				else {
					value = ISO8601Utils.format(date, true);
				}
				out.value(value);
			}
		}

		@Override
		public Date read(JsonReader in) throws IOException {
			try {
				switch (in.peek()) {
					case NULL:
						in.nextNull();
						return null;
					default:
						String date = in.nextString();
						try {
							if (dateFormat != null) {
								return dateFormat.parse(date);
							}
							return ISO8601Utils.parse(date, new ParsePosition(0));
						}
						catch (ParseException e) {
							throw new JsonParseException(e);
						}
				}
			}
			catch (IllegalArgumentException e) {
				throw new JsonParseException(e);
			}
		}

	}

	public static void setDateFormat(DateFormat dateFormat) {
		dateTypeAdapter.setFormat(dateFormat);
	}

	public static void setSqlDateFormat(DateFormat dateFormat) {
		sqlDateTypeAdapter.setFormat(dateFormat);
	}

}
