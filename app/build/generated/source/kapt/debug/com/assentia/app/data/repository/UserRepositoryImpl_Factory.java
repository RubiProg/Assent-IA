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
public final class UserRepositoryImpl_Factory implements Factory<UserRepositoryImpl> {
  private final Provider<MockDataSource> mockProvider;

  public UserRepositoryImpl_Factory(Provider<MockDataSource> mockProvider) {
    this.mockProvider = mockProvider;
  }

  @Override
  public UserRepositoryImpl get() {
    return newInstance(mockProvider.get());
  }

  public static UserRepositoryImpl_Factory create(Provider<MockDataSource> mockProvider) {
    return new UserRepositoryImpl_Factory(mockProvider);
  }

  public static UserRepositoryImpl newInstance(MockDataSource mock) {
    return new UserRepositoryImpl(mock);
  }
}
