/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wso2.carbon.databridge.commons.thrift.data;


public enum ThriftAttributeType implements org.apache.thrift.TEnum {
  INT(0),
  LONG(1),
  FLOAT(2),
  DOUBLE(3),
  BOOL(4),
  STRING(5);

  private final int value;

  private ThriftAttributeType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftAttributeType findByValue(int value) { 
    switch (value) {
      case 0:
        return INT;
      case 1:
        return LONG;
      case 2:
        return FLOAT;
      case 3:
        return DOUBLE;
      case 4:
        return BOOL;
      case 5:
        return STRING;
      default:
        return null;
    }
  }
}
