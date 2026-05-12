package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class HistorialFragmentArgs(
  public val pacienteId: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("pacienteId", this.pacienteId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("pacienteId", this.pacienteId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): HistorialFragmentArgs {
      bundle.setClassLoader(HistorialFragmentArgs::class.java.classLoader)
      val __pacienteId : String?
      if (bundle.containsKey("pacienteId")) {
        __pacienteId = bundle.getString("pacienteId")
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      return HistorialFragmentArgs(__pacienteId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): HistorialFragmentArgs {
      val __pacienteId : String?
      if (savedStateHandle.contains("pacienteId")) {
        __pacienteId = savedStateHandle["pacienteId"]
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      return HistorialFragmentArgs(__pacienteId)
    }
  }
}
