package com.aragoj.plugins.imagereader.image;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class PixelData<T extends Buffer> {

  private final T buffer;
  private final Format pixelFormat;
  private final int width;
  private final int height;

  private PixelData(T buffer, int width, int height, Format pixelFormat) {
    this.buffer = buffer;
    this.width = width;
    this.height = height;
    this.pixelFormat = pixelFormat;
  }

  public static PixelData<IntBuffer> createIntArgbPre(IntBuffer buffer, int width, int height) {
    return new PixelData<>(buffer, width, height, () -> Type.INT_ARGB_PRE);
  }

  public static PixelData<IntBuffer> createIntArgb(IntBuffer buffer, int width, int height) {
    return new PixelData<>(buffer, width, height, () -> Type.INT_ARGB);
  }

  public static PixelData<ByteBuffer> createByteBgraPre(ByteBuffer buffer, int width, int height) {
    return new PixelData<>(buffer, width, height, () -> Type.BYTE_BGRA_PRE);
  }

  public static PixelData<ByteBuffer> createByteBgra(ByteBuffer buffer, int width, int height) {
    return new PixelData<>(buffer, width, height, () -> Type.BYTE_BGRA);
  }

  public static PixelData<ByteBuffer> createByteRgb(ByteBuffer buffer, int width, int height) {
    return new PixelData<>(buffer, width, height, () -> Type.BYTE_RGB);
  }

  static PixelData<ByteBuffer> createIndexedByteArgb(ByteBuffer buffer, int width, int height,
      final int[] colorList) {
    return new PixelData<>(buffer, width, height, new IndexedFormat() {

      public int[] getColors() {
        return colorList;
      }

      @Override public Type getType() {
        return Type.BYTE_INDEXED_BGRA;
      }
    });
  }

  static PixelData<ByteBuffer> createIndexedByteArgbPre(ByteBuffer buffer, int width, int height,
      final int[] colorList) {
    return new PixelData<>(buffer, width, height, new IndexedFormat() {

      public int[] getColors() {
        return colorList;
      }

      @Override public Type getType() {
        return Type.BYTE_INDEXED_BGRA_PRE;
      }
    });
  }

  public T getBuffer() {
    return buffer;
  }

  public Format getPixelFormat() {
    return pixelFormat;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public interface Format {
    Type getType();
  }

  public interface IndexedFormat extends Format {
    int[] getColors();
  }

  /**
   * Specifies the format of the image array info. Note that these are taken from JavaFX since
   * AragoJ uses it for rendering images. It is specified here for convenience.
   */
  public enum Type {
    /**
     * The pixels are stored in 32-bit integers with the premultiplied components stored in order,
     * from MSb to LSb: alpha, red, green, blue.
     */
    INT_ARGB_PRE,
    /**
     * The pixels are stored in 32-bit integers with the non-premultiplied components stored in
     * order, from MSb to LSb: alpha, red, green, blue.
     */
    INT_ARGB,
    /**
     * The pixels are stored in adjacent bytes with the premultiplied components stored in order of
     * increasing index: blue, green, red, alpha.
     */
    BYTE_BGRA_PRE,
    /**
     * The pixels are stored in adjacent bytes with the non-premultiplied components stored in order
     * of increasing index: blue, green, red, alpha.
     */
    BYTE_BGRA,
    /**
     * The opaque pixels are stored in adjacent bytes with the color components stored in order of
     * increasing index: red, green, blue.
     */
    BYTE_RGB,
    /**
     * The pixel colors are referenced by byte indices stored in the pixel array, with the byte
     * interpreted as an unsigned index into a list of colors (in BGRA format)
     */
    BYTE_INDEXED_BGRA,
    /**
     * The pixel colors are referenced by byte indices stored in the pixel array, with the byte
     * interpreted as an unsigned index into a list of colors (in BGRA pre-multiplied format)
     */
    BYTE_INDEXED_BGRA_PRE,
  }
}
