package com.aragoj.plugins.imagereader.metadata;

public class MetadataItem {
  private String tag;
  private String value;

  public MetadataItem(String tag, String value) {
    this.tag = tag;
    this.value = value;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
