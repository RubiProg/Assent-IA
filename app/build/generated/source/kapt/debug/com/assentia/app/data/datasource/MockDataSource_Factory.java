package com.assentia.app.data.datasource;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class MockDataSource_Factory implements Factory<MockDataSource> {
  @Override
  public MockDataSource get() {
    return newInstance();
  }

  public static MockDataSource_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MockDataSource newInstance() {
    return new MockDataSource();
  }

  private static final class InstanceHolder {
    private static final MockDataSource_Factory INSTANCE = new MockDataSource_Factory();
  }
}
