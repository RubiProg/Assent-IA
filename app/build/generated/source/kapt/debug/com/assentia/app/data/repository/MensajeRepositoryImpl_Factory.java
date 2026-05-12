package com.assentia.app.data.repository;

import com.assentia.app.data.datasource.MockDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MensajeRepositoryImpl_Factory implements Factory<MensajeRepositoryImpl> {
  private final Provider<MockDataSource> mockProvider;

  public MensajeRepositoryImpl_Factory(Provider<MockDataSource> mockProvider) {
    this.mockProvider = mockProvider;
  }

  @Override
  public MensajeRepositoryImpl get() {
    return newInstance(mockProvider.get());
  }

  public static MensajeRepositoryImpl_Factory create(Provider<MockDataSource> mockProvider) {
    return new MensajeRepositoryImpl_Factory(mockProvider);
  }

  public static MensajeRepositoryImpl newInstance(MockDataSource mock) {
    return new MensajeRepositoryImpl(mock);
  }
}
