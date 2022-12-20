// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_message.proto

package com.priye.pcbook.pb;

public interface LaptopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Laptop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.CPU cpu = 4;</code>
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   * <code>.CPU cpu = 4;</code>
   * @return The cpu.
   */
  com.priye.pcbook.pb.CPU getCpu();
  /**
   * <code>.CPU cpu = 4;</code>
   */
  com.priye.pcbook.pb.CPUOrBuilder getCpuOrBuilder();

  /**
   * <code>.Memory ram = 5;</code>
   * @return Whether the ram field is set.
   */
  boolean hasRam();
  /**
   * <code>.Memory ram = 5;</code>
   * @return The ram.
   */
  com.priye.pcbook.pb.Memory getRam();
  /**
   * <code>.Memory ram = 5;</code>
   */
  com.priye.pcbook.pb.MemoryOrBuilder getRamOrBuilder();

  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .GPU gpus = 6;</code>
   */
  java.util.List<com.priye.pcbook.pb.GPU> 
      getGpusList();
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .GPU gpus = 6;</code>
   */
  com.priye.pcbook.pb.GPU getGpus(int index);
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .GPU gpus = 6;</code>
   */
  int getGpusCount();
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .GPU gpus = 6;</code>
   */
  java.util.List<? extends com.priye.pcbook.pb.GPUOrBuilder> 
      getGpusOrBuilderList();
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .GPU gpus = 6;</code>
   */
  com.priye.pcbook.pb.GPUOrBuilder getGpusOrBuilder(
      int index);

  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .Storage storages = 7;</code>
   */
  java.util.List<com.priye.pcbook.pb.Storage> 
      getStoragesList();
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .Storage storages = 7;</code>
   */
  com.priye.pcbook.pb.Storage getStorages(int index);
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .Storage storages = 7;</code>
   */
  int getStoragesCount();
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .Storage storages = 7;</code>
   */
  java.util.List<? extends com.priye.pcbook.pb.StorageOrBuilder> 
      getStoragesOrBuilderList();
  /**
   * <pre>
   *array
   * </pre>
   *
   * <code>repeated .Storage storages = 7;</code>
   */
  com.priye.pcbook.pb.StorageOrBuilder getStoragesOrBuilder(
      int index);

  /**
   * <code>.Screen screen = 8;</code>
   * @return Whether the screen field is set.
   */
  boolean hasScreen();
  /**
   * <code>.Screen screen = 8;</code>
   * @return The screen.
   */
  com.priye.pcbook.pb.Screen getScreen();
  /**
   * <code>.Screen screen = 8;</code>
   */
  com.priye.pcbook.pb.ScreenOrBuilder getScreenOrBuilder();

  /**
   * <code>.Keyboard keyboard = 9;</code>
   * @return Whether the keyboard field is set.
   */
  boolean hasKeyboard();
  /**
   * <code>.Keyboard keyboard = 9;</code>
   * @return The keyboard.
   */
  com.priye.pcbook.pb.Keyboard getKeyboard();
  /**
   * <code>.Keyboard keyboard = 9;</code>
   */
  com.priye.pcbook.pb.KeyboardOrBuilder getKeyboardOrBuilder();

  /**
   * <code>double weight_kg = 10;</code>
   * @return The weightKg.
   */
  double getWeightKg();

  /**
   * <code>double weight_lb = 11;</code>
   * @return The weightLb.
   */
  double getWeightLb();

  /**
   * <code>double price_usd = 12;</code>
   * @return The priceUsd.
   */
  double getPriceUsd();

  /**
   * <code>uint32 release_year = 13;</code>
   * @return The releaseYear.
   */
  int getReleaseYear();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  public com.priye.pcbook.pb.Laptop.WeightCase getWeightCase();
}
