package com.androidstarterkit.injection.file.base;

import com.androidstarterkit.injection.CodeGenerator;
import com.androidstarterkit.injection.model.Config;
import com.androidstarterkit.util.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class InjectionBaseFile<T extends Config> extends File implements CodeGenerator<T> {
  protected List<String> codelines;
  protected List<T> configs;

  public InjectionBaseFile(String fullPathname) {
    super(fullPathname);

    codelines = FileUtils.readFileAsString(this);
    configs = new ArrayList<>();
  }

  public List<String> getCodelines() {
    return codelines;
  }

  public void setCodelines(List<String> codelines) {
    this.codelines = codelines;
  }

  public void setCodeline(int index, String codeline) {
    codelines.set(index, codeline);
  }

  public void addCodeline(int index, String codeline) {
    codelines.add(index, codeline);
  }

  public void addCodelines(int index, List<String> codelines) {
    this.codelines.addAll(index, codelines);
  }

  public void removeCodeline(int index) {
    codelines.remove(index);
  }

  @Override
  public void addConfig(T config) {
    if (configs == null) {
      configs = new ArrayList<>();
    }

    configs.add(config);
  }

  @Override
  public void addConfig(List<T> configs) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }

    this.configs.addAll(configs);
  }

  @Override
  public List<T> getConfigs() {
    return configs;
  }

  @Override
  public void apply() {
    FileUtils.writeFile(this, codelines);
  }

  public void print() {
    codelines.forEach(System.out::println);
  }
}
