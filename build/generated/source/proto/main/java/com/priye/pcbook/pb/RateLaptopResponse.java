// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.priye.pcbook.pb;

/**
 * Protobuf type {@code RateLaptopResponse}
 */
public  final class RateLaptopResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RateLaptopResponse)
    RateLaptopResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLaptopResponse.newBuilder() to construct.
  private RateLaptopResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLaptopResponse() {
    laptopId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RateLaptopResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RateLaptopResponse(
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

            laptopId_ = s;
            break;
          }
          case 16: {

            ratedCount_ = input.readUInt32();
            break;
          }
          case 25: {

            averageScore_ = input.readDouble();
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
    return com.priye.pcbook.pb.LaptopServiceOuterClass.internal_static_RateLaptopResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.priye.pcbook.pb.LaptopServiceOuterClass.internal_static_RateLaptopResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.priye.pcbook.pb.RateLaptopResponse.class, com.priye.pcbook.pb.RateLaptopResponse.Builder.class);
  }

  public static final int LAPTOP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object laptopId_;
  /**
   * <code>string laptop_id = 1;</code>
   * @return The laptopId.
   */
  public java.lang.String getLaptopId() {
    java.lang.Object ref = laptopId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      laptopId_ = s;
      return s;
    }
  }
  /**
   * <code>string laptop_id = 1;</code>
   * @return The bytes for laptopId.
   */
  public com.google.protobuf.ByteString
      getLaptopIdBytes() {
    java.lang.Object ref = laptopId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      laptopId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATED_COUNT_FIELD_NUMBER = 2;
  private int ratedCount_;
  /**
   * <pre>
   *the number of times laptop is rated
   * </pre>
   *
   * <code>uint32 rated_count = 2;</code>
   * @return The ratedCount.
   */
  public int getRatedCount() {
    return ratedCount_;
  }

  public static final int AVERAGE_SCORE_FIELD_NUMBER = 3;
  private double averageScore_;
  /**
   * <pre>
   *average rate score
   * </pre>
   *
   * <code>double average_score = 3;</code>
   * @return The averageScore.
   */
  public double getAverageScore() {
    return averageScore_;
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
    if (!getLaptopIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, laptopId_);
    }
    if (ratedCount_ != 0) {
      output.writeUInt32(2, ratedCount_);
    }
    if (averageScore_ != 0D) {
      output.writeDouble(3, averageScore_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLaptopIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, laptopId_);
    }
    if (ratedCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, ratedCount_);
    }
    if (averageScore_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, averageScore_);
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
    if (!(obj instanceof com.priye.pcbook.pb.RateLaptopResponse)) {
      return super.equals(obj);
    }
    com.priye.pcbook.pb.RateLaptopResponse other = (com.priye.pcbook.pb.RateLaptopResponse) obj;

    if (!getLaptopId()
        .equals(other.getLaptopId())) return false;
    if (getRatedCount()
        != other.getRatedCount()) return false;
    if (java.lang.Double.doubleToLongBits(getAverageScore())
        != java.lang.Double.doubleToLongBits(
            other.getAverageScore())) return false;
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
    hash = (37 * hash) + LAPTOP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLaptopId().hashCode();
    hash = (37 * hash) + RATED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRatedCount();
    hash = (37 * hash) + AVERAGE_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAverageScore()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.priye.pcbook.pb.RateLaptopResponse parseFrom(
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
  public static Builder newBuilder(com.priye.pcbook.pb.RateLaptopResponse prototype) {
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
   * Protobuf type {@code RateLaptopResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RateLaptopResponse)
      com.priye.pcbook.pb.RateLaptopResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.priye.pcbook.pb.LaptopServiceOuterClass.internal_static_RateLaptopResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.priye.pcbook.pb.LaptopServiceOuterClass.internal_static_RateLaptopResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.priye.pcbook.pb.RateLaptopResponse.class, com.priye.pcbook.pb.RateLaptopResponse.Builder.class);
    }

    // Construct using com.priye.pcbook.pb.RateLaptopResponse.newBuilder()
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
      laptopId_ = "";

      ratedCount_ = 0;

      averageScore_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.priye.pcbook.pb.LaptopServiceOuterClass.internal_static_RateLaptopResponse_descriptor;
    }

    @java.lang.Override
    public com.priye.pcbook.pb.RateLaptopResponse getDefaultInstanceForType() {
      return com.priye.pcbook.pb.RateLaptopResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.priye.pcbook.pb.RateLaptopResponse build() {
      com.priye.pcbook.pb.RateLaptopResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.priye.pcbook.pb.RateLaptopResponse buildPartial() {
      com.priye.pcbook.pb.RateLaptopResponse result = new com.priye.pcbook.pb.RateLaptopResponse(this);
      result.laptopId_ = laptopId_;
      result.ratedCount_ = ratedCount_;
      result.averageScore_ = averageScore_;
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
      if (other instanceof com.priye.pcbook.pb.RateLaptopResponse) {
        return mergeFrom((com.priye.pcbook.pb.RateLaptopResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.priye.pcbook.pb.RateLaptopResponse other) {
      if (other == com.priye.pcbook.pb.RateLaptopResponse.getDefaultInstance()) return this;
      if (!other.getLaptopId().isEmpty()) {
        laptopId_ = other.laptopId_;
        onChanged();
      }
      if (other.getRatedCount() != 0) {
        setRatedCount(other.getRatedCount());
      }
      if (other.getAverageScore() != 0D) {
        setAverageScore(other.getAverageScore());
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
      com.priye.pcbook.pb.RateLaptopResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.priye.pcbook.pb.RateLaptopResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object laptopId_ = "";
    /**
     * <code>string laptop_id = 1;</code>
     * @return The laptopId.
     */
    public java.lang.String getLaptopId() {
      java.lang.Object ref = laptopId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        laptopId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string laptop_id = 1;</code>
     * @return The bytes for laptopId.
     */
    public com.google.protobuf.ByteString
        getLaptopIdBytes() {
      java.lang.Object ref = laptopId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        laptopId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string laptop_id = 1;</code>
     * @param value The laptopId to set.
     * @return This builder for chaining.
     */
    public Builder setLaptopId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      laptopId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string laptop_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLaptopId() {
      
      laptopId_ = getDefaultInstance().getLaptopId();
      onChanged();
      return this;
    }
    /**
     * <code>string laptop_id = 1;</code>
     * @param value The bytes for laptopId to set.
     * @return This builder for chaining.
     */
    public Builder setLaptopIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      laptopId_ = value;
      onChanged();
      return this;
    }

    private int ratedCount_ ;
    /**
     * <pre>
     *the number of times laptop is rated
     * </pre>
     *
     * <code>uint32 rated_count = 2;</code>
     * @return The ratedCount.
     */
    public int getRatedCount() {
      return ratedCount_;
    }
    /**
     * <pre>
     *the number of times laptop is rated
     * </pre>
     *
     * <code>uint32 rated_count = 2;</code>
     * @param value The ratedCount to set.
     * @return This builder for chaining.
     */
    public Builder setRatedCount(int value) {
      
      ratedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *the number of times laptop is rated
     * </pre>
     *
     * <code>uint32 rated_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRatedCount() {
      
      ratedCount_ = 0;
      onChanged();
      return this;
    }

    private double averageScore_ ;
    /**
     * <pre>
     *average rate score
     * </pre>
     *
     * <code>double average_score = 3;</code>
     * @return The averageScore.
     */
    public double getAverageScore() {
      return averageScore_;
    }
    /**
     * <pre>
     *average rate score
     * </pre>
     *
     * <code>double average_score = 3;</code>
     * @param value The averageScore to set.
     * @return This builder for chaining.
     */
    public Builder setAverageScore(double value) {
      
      averageScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *average rate score
     * </pre>
     *
     * <code>double average_score = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAverageScore() {
      
      averageScore_ = 0D;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:RateLaptopResponse)
  }

  // @@protoc_insertion_point(class_scope:RateLaptopResponse)
  private static final com.priye.pcbook.pb.RateLaptopResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.priye.pcbook.pb.RateLaptopResponse();
  }

  public static com.priye.pcbook.pb.RateLaptopResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLaptopResponse>
      PARSER = new com.google.protobuf.AbstractParser<RateLaptopResponse>() {
    @java.lang.Override
    public RateLaptopResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RateLaptopResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RateLaptopResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLaptopResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.priye.pcbook.pb.RateLaptopResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

