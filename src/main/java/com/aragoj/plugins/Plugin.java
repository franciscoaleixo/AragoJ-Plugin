package com.aragoj.plugins;

public interface Plugin {

  String getPluginName();

  Type getPluginType();

  public enum Type {
    IMAGE_READER
  }
}
