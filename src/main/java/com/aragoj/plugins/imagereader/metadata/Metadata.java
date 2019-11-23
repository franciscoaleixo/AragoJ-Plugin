package com.aragoj.plugins.imagereader.metadata;

import java.util.List;

public class Metadata {

  private List<MetadataItem> data;

  public Metadata(List<MetadataItem> data) {
    this.data = data;
  }

  public List<MetadataItem> getData() {
    return data;
  }

  public void setData(List<MetadataItem> data) {
    this.data = data;
  }
}
