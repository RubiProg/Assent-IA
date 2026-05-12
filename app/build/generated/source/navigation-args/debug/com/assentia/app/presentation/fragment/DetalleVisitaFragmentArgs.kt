package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetalleVisitaFragmentArgs(
  public val visitaId: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("visitaId", this.visitaId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("visitaId", this.visitaId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetalleVisitaFragmentArgs {
      bundle.setClassLoader(DetalleVisitaFragmentArgs::class.java.classLoader)
      val __visitaId : String?
      if (bundle.containsKey("visitaId")) {
        __visitaId = bundle.getString("visitaId")
        if (__visitaId == null) {
          throw IllegalArgumentException("Argument \"visitaId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"visitaId\" is missing and does not have an android:defaultValue")
      }
      return DetalleVisitaFragmentArgs(__visitaId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetalleVisitaFragmentArgs {
      val __visitaId : String?
      if (savedStateHandle.contains("visitaId")) {
        __visitaId = savedStateHandle["visitaId"]
        if (__visitaId == null) {
          throw IllegalArgumentException("Argument \"visitaId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"visitaId\" is missing and does not have an android:defaultValue")
      }
      return DetalleVisitaFragmentArgs(__visitaId)
    }
  }
}
