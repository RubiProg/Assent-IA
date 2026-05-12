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
public final class AuthRepositoryImpl_Factory implements Factory<AuthRepositoryImpl> {
  private final Provider<MockDataSource> mockProvider;

  public AuthRepositoryImpl_Factory(Provider<MockDataSource> mockProvider) {
    this.mockProvider = mockProvider;
  }

  @Override
  public AuthRepositoryImpl get() {
    return newInstance(mockProvider.get());
  }

  public static AuthRepositoryImpl_Factory create(Provider<MockDataSource> mockProvider) {
    return new AuthRepositoryImpl_Factory(mockProvider);
  }

  public static AuthRepositoryImpl newInstance(MockDataSource mock) {
    return new AuthRepositoryImpl(mock);
  }
}
