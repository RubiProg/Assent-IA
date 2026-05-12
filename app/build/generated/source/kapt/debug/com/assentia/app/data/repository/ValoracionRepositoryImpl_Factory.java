package com.assentia.app.data.repository;

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
public final class ValoracionRepositoryImpl_Factory implements Factory<ValoracionRepositoryImpl> {
  @Override
  public ValoracionRepositoryImpl get() {
    return newInstance();
  }

  public static ValoracionRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ValoracionRepositoryImpl newInstance() {
    return new ValoracionRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final ValoracionRepositoryImpl_Factory INSTANCE = new ValoracionRepositoryImpl_Factory();
  }
}
