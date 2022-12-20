// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.priye.pcbook.pb;

/**
 * Protobuf type {@code GPU}
 */
public  final class GPU extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GPU)
    GPUOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GPU.newBuilder() to construct.
  private GPU(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GPU() {
    brand_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GPU();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GPU(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            brand_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 25: {

            minGhz_ = input.readDouble();
            break;
          }
          case 33: {

            maxGhz_ = input.readDouble();
            break;
          }
          case 42: {
            com.priye.pcbook.pb.Memory.Builder subBuilder = null;
            if (memory_ != null) {
              subBuilder = memory_.toBuilder();
            }
            memory_ = input.readMessage(com.priye.pcbook.pb.Memory.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(memory_);
              memory_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.priye.pcbook.pb.ProcessorMessage.internal_static_GPU_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.priye.pcbook.pb.ProcessorMessage.internal_static_GPU_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.priye.pcbook.pb.GPU.class, com.priye.pcbook.pb.GPU.Builder.class);
  }

  public static final int BRAND_FIELD_NUMBER = 1;
  private volatile java.lang.Object brand_;
  /**
   * <code>string brand = 1;</code>
   * @return The brand.
   */
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <code>string brand = 1;</code>
   * @return The bytes for brand.
   */
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIN_GHZ_FIELD_NUMBER = 3;
  private double minGhz_;
  /**
   * <code>double min_ghz = 3;</code>
   * @return The minGhz.
   */
  public double getMinGhz() {
    return minGhz_;
  }

  public static final int MAX_GHZ_FIELD_NUMBER = 4;
  private double maxGhz_;
  /**
   * <code>double max_ghz = 4;</code>
   * @return The maxGhz.
   */
  public double getMaxGhz() {
    return maxGhz_;
  }

  public static final int MEMORY_FIELD_NUMBER = 5;
  private com.priye.pcbook.pb.Memory memory_;
  /**
   * <code>.Memory memory = 5;</code>
   * @return Whether the memory field is set.
   */
  public boolean hasMemory() {
    return memory_ != null;
  }
  /**
   * <code>.Memory memory = 5;</code>
   * @return The memory.
   */
  public com.priye.pcbook.pb.Memory getMemory() {
    return memory_ == null ? com.priye.pcbook.pb.Memory.getDefaultInstance() : memory_;
  }
  /**
   * <code>.Memory memory = 5;</code>
   */
  public com.priye.pcbook.pb.MemoryOrBuilder getMemoryOrBuilder() {
    return getMemory();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getBrandBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, brand_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (minGhz_ != 0D) {
      output.writeDouble(3, minGhz_);
    }
    if (maxGhz_ != 0D) {
      output.writeDouble(4, maxGhz_);
    }
    if (memory_ != null) {
      output.writeMessage(5, getMemory());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBrandBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, brand_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (minGhz_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, minGhz_);
    }
    if (maxGhz_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, maxGhz_);
    }
    if (memory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getMemory());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.priye.pcbook.pb.GPU)) {
      return super.equals(obj);
    }
    com.priye.pcbook.pb.GPU other = (com.priye.pcbook.pb.GPU) obj;

    if (!getBrand()
        .equals(other.getBrand())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (java.lang.Double.doubleToLongBits(getMinGhz())
        != java.lang.Double.doubleToLongBits(
            other.getMinGhz())) return false;
    if (java.lang.Double.doubleToLongBits(getMaxGhz())
        != java.lang.Double.doubleToLongBits(
            other.getMaxGhz())) return false;
    if (hasMemory() != other.hasMemory()) return false;
    if (hasMemory()) {
      if (!getMemory()
          .equals(other.getMemory())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + MIN_GHZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinGhz()));
    hash = (37 * hash) + MAX_GHZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxGhz()));
    if (hasMemory()) {
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + getMemory().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.priye.pcbook.pb.GPU parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.priye.pcbook.pb.GPU parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.priye.pcbook.pb.GPU parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.priye.pcbook.pb.GPU parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.priye.pcbook.pb.GPU prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GPU}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GPU)
      com.priye.pcbook.pb.GPUOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.priye.pcbook.pb.ProcessorMessage.internal_static_GPU_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.priye.pcbook.pb.ProcessorMessage.internal_static_GPU_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.priye.pcbook.pb.GPU.class, com.priye.pcbook.pb.GPU.Builder.class);
    }

    // Construct using com.priye.pcbook.pb.GPU.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      brand_ = "";

      name_ = "";

      minGhz_ = 0D;

      maxGhz_ = 0D;

      if (memoryBuilder_ == null) {
        memory_ = null;
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.priye.pcbook.pb.ProcessorMessage.internal_static_GPU_descriptor;
    }

    @java.lang.Override
    public com.priye.pcbook.pb.GPU getDefaultInstanceForType() {
      return com.priye.pcbook.pb.GPU.getDefaultInstance();
    }

    @java.lang.Override
    public com.priye.pcbook.pb.GPU build() {
      com.priye.pcbook.pb.GPU result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.priye.pcbook.pb.GPU buildPartial() {
      com.priye.pcbook.pb.GPU result = new com.priye.pcbook.pb.GPU(this);
      result.brand_ = brand_;
      result.name_ = name_;
      result.minGhz_ = minGhz_;
      result.maxGhz_ = maxGhz_;
      if (memoryBuilder_ == null) {
        result.memory_ = memory_;
      } else {
        result.memory_ = memoryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.priye.pcbook.pb.GPU) {
        return mergeFrom((com.priye.pcbook.pb.GPU)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.priye.pcbook.pb.GPU other) {
      if (other == com.priye.pcbook.pb.GPU.getDefaultInstance()) return this;
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getMinGhz() != 0D) {
        setMinGhz(other.getMinGhz());
      }
      if (other.getMaxGhz() != 0D) {
        setMaxGhz(other.getMaxGhz());
      }
      if (other.hasMemory()) {
        mergeMemory(other.getMemory());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.priye.pcbook.pb.GPU parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.priye.pcbook.pb.GPU) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>string brand = 1;</code>
     * @return The brand.
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string brand = 1;</code>
     * @return The bytes for brand.
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string brand = 1;</code>
     * @param value The brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 1;</code>
     * @param value The bytes for brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private double minGhz_ ;
    /**
     * <code>double min_ghz = 3;</code>
     * @return The minGhz.
     */
    public double getMinGhz() {
      return minGhz_;
    }
    /**
     * <code>double min_ghz = 3;</code>
     * @param value The minGhz to set.
     * @return This builder for chaining.
     */
    public Builder setMinGhz(double value) {
      
      minGhz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double min_ghz = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinGhz() {
      
      minGhz_ = 0D;
      onChanged();
      return this;
    }

    private double maxGhz_ ;
    /**
     * <code>double max_ghz = 4;</code>
     * @return The maxGhz.
     */
    public double getMaxGhz() {
      return maxGhz_;
    }
    /**
     * <code>double max_ghz = 4;</code>
     * @param value The maxGhz to set.
     * @return This builder for chaining.
     */
    public Builder setMaxGhz(double value) {
      
      maxGhz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double max_ghz = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxGhz() {
      
      maxGhz_ = 0D;
      onChanged();
      return this;
    }

    private com.priye.pcbook.pb.Memory memory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.priye.pcbook.pb.Memory, com.priye.pcbook.pb.Memory.Builder, com.priye.pcbook.pb.MemoryOrBuilder> memoryBuilder_;
    /**
     * <code>.Memory memory = 5;</code>
     * @return Whether the memory field is set.
     */
    public boolean hasMemory() {
      return memoryBuilder_ != null || memory_ != null;
    }
    /**
     * <code>.Memory memory = 5;</code>
     * @return The memory.
     */
    public com.priye.pcbook.pb.Memory getMemory() {
      if (memoryBuilder_ == null) {
        return memory_ == null ? com.priye.pcbook.pb.Memory.getDefaultInstance() : memory_;
      } else {
        return memoryBuilder_.getMessage();
      }
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    public Builder setMemory(com.priye.pcbook.pb.Memory value) {
      if (memoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        memory_ = value;
        onChanged();
      } else {
        memoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    public Builder setMemory(
        com.priye.pcbook.pb.Memory.Builder builderForValue) {
      if (memoryBuilder_ == null) {
        memory_ = builderForValue.build();
        onChanged();
      } else {
        memoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    public Builder mergeMemory(com.priye.pcbook.pb.Memory value) {
      if (memoryBuilder_ == null) {
        if (memory_ != null) {
          memory_ =
            com.priye.pcbook.pb.Memory.newBuilder(memory_).mergeFrom(value).buildPartial();
        } else {
          memory_ = value;
        }
        onChanged();
      } else {
        memoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    public Builder clearMemory() {
      if (memoryBuilder_ == null) {
        memory_ = null;
        onChanged();
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    public com.priye.pcbook.pb.Memory.Builder getMemoryBuilder() {
      
      onChanged();
      return getMemoryFieldBuilder().getBuilder();
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    public com.priye.pcbook.pb.MemoryOrBuilder getMemoryOrBuilder() {
      if (memoryBuilder_ != null) {
        return memoryBuilder_.getMessageOrBuilder();
      } else {
        return memory_ == null ?
            com.priye.pcbook.pb.Memory.getDefaultInstance() : memory_;
      }
    }
    /**
     * <code>.Memory memory = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.priye.pcbook.pb.Memory, com.priye.pcbook.pb.Memory.Builder, com.priye.pcbook.pb.MemoryOrBuilder> 
        getMemoryFieldBuilder() {
      if (memoryBuilder_ == null) {
        memoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.priye.pcbook.pb.Memory, com.priye.pcbook.pb.Memory.Builder, com.priye.pcbook.pb.MemoryOrBuilder>(
                getMemory(),
                getParentForChildren(),
                isClean());
        memory_ = null;
      }
      return memoryBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GPU)
  }

  // @@protoc_insertion_point(class_scope:GPU)
  private static final com.priye.pcbook.pb.GPU DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.priye.pcbook.pb.GPU();
  }

  public static com.priye.pcbook.pb.GPU getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GPU>
      PARSER = new com.google.protobuf.AbstractParser<GPU>() {
    @java.lang.Override
    public GPU parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GPU(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GPU> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GPU> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.priye.pcbook.pb.GPU getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

