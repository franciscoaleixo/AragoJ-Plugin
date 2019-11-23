package com.aragoj.plugins.imagereader.image;

import com.aragoj.plugins.imagereader.metadata.Metadata;
import java.nio.Buffer;

public class Image<T extends Buffer> {
  private PixelData<T> pixelData;
  private Metadata metadata;

  public Image(PixelData<T> pixelData, Metadata metadata) {
    this.pixelData = pixelData;
    this.metadata = metadata;
  }

  public PixelData<T> getPixelData() {
    return pixelData;
  }

  public void setPixelData(PixelData<T> pixelData) {
    this.pixelData = pixelData;
  }

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }
}
