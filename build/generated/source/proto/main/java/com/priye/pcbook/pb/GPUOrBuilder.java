// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.priye.pcbook.pb;

public interface GPUOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GPU)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string brand = 1;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 1;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double min_ghz = 3;</code>
   * @return The minGhz.
   */
  double getMinGhz();

  /**
   * <code>double max_ghz = 4;</code>
   * @return The maxGhz.
   */
  double getMaxGhz();

  /**
   * <code>.Memory memory = 5;</code>
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   * <code>.Memory memory = 5;</code>
   * @return The memory.
   */
  com.priye.pcbook.pb.Memory getMemory();
  /**
   * <code>.Memory memory = 5;</code>
   */
  com.priye.pcbook.pb.MemoryOrBuilder getMemoryOrBuilder();
}
