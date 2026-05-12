package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetallePacienteFragmentArgs(
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
    public fun fromBundle(bundle: Bundle): DetallePacienteFragmentArgs {
      bundle.setClassLoader(DetallePacienteFragmentArgs::class.java.classLoader)
      val __pacienteId : String?
      if (bundle.containsKey("pacienteId")) {
        __pacienteId = bundle.getString("pacienteId")
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      return DetallePacienteFragmentArgs(__pacienteId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        DetallePacienteFragmentArgs {
      val __pacienteId : String?
      if (savedStateHandle.contains("pacienteId")) {
        __pacienteId = savedStateHandle["pacienteId"]
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      return DetallePacienteFragmentArgs(__pacienteId)
    }
  }
}
