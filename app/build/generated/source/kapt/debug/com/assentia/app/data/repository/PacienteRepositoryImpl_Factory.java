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
public final class PacienteRepositoryImpl_Factory implements Factory<PacienteRepositoryImpl> {
  private final Provider<MockDataSource> mockProvider;

  public PacienteRepositoryImpl_Factory(Provider<MockDataSource> mockProvider) {
    this.mockProvider = mockProvider;
  }

  @Override
  public PacienteRepositoryImpl get() {
    return newInstance(mockProvider.get());
  }

  public static PacienteRepositoryImpl_Factory create(Provider<MockDataSource> mockProvider) {
    return new PacienteRepositoryImpl_Factory(mockProvider);
  }

  public static PacienteRepositoryImpl newInstance(MockDataSource mock) {
    return new PacienteRepositoryImpl(mock);
  }
}
