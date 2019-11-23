package com.aragoj.plugins.imagereader;

import com.aragoj.plugins.Plugin;
import com.aragoj.plugins.imagereader.image.Image;
import java.nio.Buffer;

public abstract class ImageReaderPlugin implements Plugin {

  public abstract Image<? extends Buffer> readImage(String filePath) throws FormatNotSupported;

  public abstract SupportedFormat[] getSupportedFormats();

  @Override public Type getPluginType() {
    return Plugin.Type.IMAGE_READER;
  }

  /**
   * Exception to throw in case the file could not be read. Note that the message inside this
   * exception will be shown to the user.
   */
  public static class FormatNotSupported extends Exception {

    public FormatNotSupported(String message, Throwable cause) {
      super(message, cause);
    }

    public FormatNotSupported(String message) {
      super(message);
    }
  }
}
