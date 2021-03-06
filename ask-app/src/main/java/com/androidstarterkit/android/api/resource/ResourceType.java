package com.androidstarterkit.android.api.resource;


public enum ResourceType {
  LAYOUT("layout")
  , MENU("menu")
  , DRAWABLE("drawable");

  private String name;

  ResourceType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name.toLowerCase();
  }
}