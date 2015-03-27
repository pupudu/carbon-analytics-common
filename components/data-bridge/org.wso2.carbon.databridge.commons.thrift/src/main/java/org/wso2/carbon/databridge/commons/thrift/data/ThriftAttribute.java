/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wso2.carbon.databridge.commons.thrift.data;

import java.util.*;

public class ThriftAttribute
		implements org.apache.thrift.TBase<ThriftAttribute, ThriftAttribute._Fields>,
		           java.io.Serializable, Cloneable {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
			new org.apache.thrift.protocol.TStruct("ThriftAttribute");

	private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC =
			new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING,
			                                      (short) 1);
	private static final org.apache.thrift.protocol.TField ATTRIBUTE_TYPE_FIELD_DESC =
			new org.apache.thrift.protocol.TField("attributeType",
			                                      org.apache.thrift.protocol.TType.I32, (short) 2);

	public String name; // required
	/**
	 * @see ThriftAttributeType
	 */
	public ThriftAttributeType attributeType; // required

	/**
	 * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		NAME((short) 1, "name"),
		/**
		 * @see ThriftAttributeType
		 */
		ATTRIBUTE_TYPE((short) 2, "attributeType");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
				case 1: // NAME
					return NAME;
				case 2: // ATTRIBUTE_TYPE
					return ATTRIBUTE_TYPE;
				default:
					return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception
		 * if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	// isset id assignments

	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
				new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
		tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name",
		                                                                       org.apache.thrift.TFieldRequirementType.OPTIONAL,
		                                                                       new org.apache.thrift.meta_data.FieldValueMetaData(
				                                                                       org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ATTRIBUTE_TYPE,
		           new org.apache.thrift.meta_data.FieldMetaData("attributeType",
		                                                         org.apache.thrift.TFieldRequirementType.OPTIONAL,
		                                                         new org.apache.thrift.meta_data.EnumMetaData(
				                                                         org.apache.thrift.protocol.TType.ENUM,
				                                                         ThriftAttributeType.class)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData
				.addStructMetaDataMap(ThriftAttribute.class, metaDataMap);
	}

	public ThriftAttribute() {
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ThriftAttribute(ThriftAttribute other) {
		if (other.isSetName()) {
			this.name = other.name;
		}
		if (other.isSetAttributeType()) {
			this.attributeType = other.attributeType;
		}
	}

	public ThriftAttribute deepCopy() {
		return new ThriftAttribute(this);
	}

	@Override public void clear() {
		this.name = null;
		this.attributeType = null;
	}

	public String getName() {
		return this.name;
	}

	public ThriftAttribute setName(String name) {
		this.name = name;
		return this;
	}

	public void unsetName() {
		this.name = null;
	}

	/**
	 * Returns true if field name is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetName() {
		return this.name != null;
	}

	public void setNameIsSet(boolean value) {
		if (!value) {
			this.name = null;
		}
	}

	/**
	 * @see ThriftAttributeType
	 */
	public ThriftAttributeType getAttributeType() {
		return this.attributeType;
	}

	/**
	 * @see ThriftAttributeType
	 */
	public ThriftAttribute setAttributeType(ThriftAttributeType attributeType) {
		this.attributeType = attributeType;
		return this;
	}

	public void unsetAttributeType() {
		this.attributeType = null;
	}

	/**
	 * Returns true if field attributeType is set (has been assigned a value) and false otherwise
	 */
	public boolean isSetAttributeType() {
		return this.attributeType != null;
	}

	public void setAttributeTypeIsSet(boolean value) {
		if (!value) {
			this.attributeType = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
			case NAME:
				if (value == null) {
					unsetName();
				} else {
					setName((String) value);
				}
				break;

			case ATTRIBUTE_TYPE:
				if (value == null) {
					unsetAttributeType();
				} else {
					setAttributeType((ThriftAttributeType) value);
				}
				break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
			case NAME:
				return getName();

			case ATTRIBUTE_TYPE:
				return getAttributeType();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
			case NAME:
				return isSetName();
			case ATTRIBUTE_TYPE:
				return isSetAttributeType();
		}
		throw new IllegalStateException();
	}

	@Override public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof ThriftAttribute)
			return this.equals((ThriftAttribute) that);
		return false;
	}

	public boolean equals(ThriftAttribute that) {
		if (that == null)
			return false;

		boolean this_present_name = true && this.isSetName();
		boolean that_present_name = true && that.isSetName();
		if (this_present_name || that_present_name) {
			if (!(this_present_name && that_present_name))
				return false;
			if (!this.name.equals(that.name))
				return false;
		}

		boolean this_present_attributeType = true && this.isSetAttributeType();
		boolean that_present_attributeType = true && that.isSetAttributeType();
		if (this_present_attributeType || that_present_attributeType) {
			if (!(this_present_attributeType && that_present_attributeType))
				return false;
			if (!this.attributeType.equals(that.attributeType))
				return false;
		}

		return true;
	}

	@Override public int hashCode() {
		return 0;
	}

	public int compareTo(ThriftAttribute other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;
		ThriftAttribute typedOther = (ThriftAttribute) other;

		lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetName()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison =
				Boolean.valueOf(isSetAttributeType()).compareTo(typedOther.isSetAttributeType());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAttributeType()) {
			lastComparison = org.apache.thrift.TBaseHelper
					.compareTo(this.attributeType, typedOther.attributeType);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot)
			throws org.apache.thrift.TException {
		org.apache.thrift.protocol.TField field;
		iprot.readStructBegin();
		while (true) {
			field = iprot.readFieldBegin();
			if (field.type == org.apache.thrift.protocol.TType.STOP) {
				break;
			}
			switch (field.id) {
				case 1: // NAME
					if (field.type == org.apache.thrift.protocol.TType.STRING) {
						this.name = iprot.readString();
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
					}
					break;
				case 2: // ATTRIBUTE_TYPE
					if (field.type == org.apache.thrift.protocol.TType.I32) {
						this.attributeType = ThriftAttributeType.findByValue(iprot.readI32());
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
					}
					break;
				default:
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
			}
			iprot.readFieldEnd();
		}
		iprot.readStructEnd();

		// check for required fields of primitive type, which can't be checked in the validate method
		validate();
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot)
			throws org.apache.thrift.TException {
		validate();

		oprot.writeStructBegin(STRUCT_DESC);
		if (this.name != null) {
			if (isSetName()) {
				oprot.writeFieldBegin(NAME_FIELD_DESC);
				oprot.writeString(this.name);
				oprot.writeFieldEnd();
			}
		}
		if (this.attributeType != null) {
			if (isSetAttributeType()) {
				oprot.writeFieldBegin(ATTRIBUTE_TYPE_FIELD_DESC);
				oprot.writeI32(this.attributeType.getValue());
				oprot.writeFieldEnd();
			}
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder("ThriftAttribute(");
		boolean first = true;

		if (isSetName()) {
			sb.append("name:");
			if (this.name == null) {
				sb.append("null");
			} else {
				sb.append(this.name);
			}
			first = false;
		}
		if (isSetAttributeType()) {
			if (!first)
				sb.append(", ");
			sb.append("attributeType:");
			if (this.attributeType == null) {
				sb.append("null");
			} else {
				sb.append(this.attributeType);
			}
			first = false;
		}
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in)
			throws java.io.IOException, ClassNotFoundException {
		try {
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

}

