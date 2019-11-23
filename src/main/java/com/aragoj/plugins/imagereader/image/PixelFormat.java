package com.aragoj.plugins.imagereader.image;

/**
 * Specifies the format of the image array info. Note that these are taken from JavaFX since AragoJ
 * uses it for rendering images. It is specified here for convenience.
 */
public class PixelFormat {

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
     * interpreted as an unsigned index into a list of colors provided by the {@code PixelFormat}
     * object.
     */
    BYTE_INDEXED,
  }
}
