package com.aragoj.plugins.imagereader.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetadataGroup extends MetadataItem {

  private List<MetadataItem> data;

  public MetadataGroup(String tag, String value, List<MetadataItem> data) {
    super(tag, value);
    this.data = data;
  }

  public MetadataGroup(String tag, String value) {
    super(tag, value);
    this.data = new ArrayList<>();
  }

  public void addItem(MetadataItem metadataItem){
    data.add(metadataItem);
  }

  public List<MetadataItem> getData() {
    return data;
  }

  public void setData(List<MetadataItem> data) {
    this.data = data;
  }
}
