package com.aragoj.plugins.imagereader;

/**
 * Defines a format that the image reader is able to read.
 */
public class SupportedFormat {

  public static final SupportedFormat ALL_FILES =
      new SupportedFormat("All Files", new String[] { "*" });

  private String description;
  private String[] extensions;

  /**
   * Creates a supported forrmat of the ImageReaderPlugin.
   * <p>
   * Extensions can either be formatted as '.ext' or simply 'ext', where ext is the extension.
   * Letter case does not matter.
   * <p>
   * If the reader supports a large number of formats, it may be convenient to allow any file to be
   * readable. In this case you can use SupportedFormat.ALL_FILES.
   * <p>
   * Example: new SupportedFormat("JPEG Images", new String[]{".jpeg", ".jpg"})
   *
   * @param description of the format
   * @param extensions  that the format suppports
   */
  public SupportedFormat(String description, String[] extensions) {
    this.description = description;
    this.extensions = extensions;
  }

  public String getDescription() {
    return description;
  }

  /**
   * Defines the description of the format (e.g. JPEG images)
   */
  public void setDescription(String description) {
    this.description = description;
  }

  public String[] getExtensions() {
    return extensions;
  }

  /**
   * Defines the possible extensions of this format (e.g. .jpg, .jpeg...)
   * <p>
   * Note that extensions can either be formatted as '.ext' or simply 'ext', where ext is the
   * extension. Letter case does not matter.
   */
  public void setExtensions(String[] extensions) {
    this.extensions = extensions;
  }
}
