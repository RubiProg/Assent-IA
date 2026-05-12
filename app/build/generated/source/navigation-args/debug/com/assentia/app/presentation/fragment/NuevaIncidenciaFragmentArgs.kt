package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class NuevaIncidenciaFragmentArgs(
  public val pacienteId: String,
  public val visitaId: String? = null,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("pacienteId", this.pacienteId)
    result.putString("visitaId", this.visitaId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("pacienteId", this.pacienteId)
    result.set("visitaId", this.visitaId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NuevaIncidenciaFragmentArgs {
      bundle.setClassLoader(NuevaIncidenciaFragmentArgs::class.java.classLoader)
      val __pacienteId : String?
      if (bundle.containsKey("pacienteId")) {
        __pacienteId = bundle.getString("pacienteId")
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      val __visitaId : String?
      if (bundle.containsKey("visitaId")) {
        __visitaId = bundle.getString("visitaId")
      } else {
        __visitaId = null
      }
      return NuevaIncidenciaFragmentArgs(__pacienteId, __visitaId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        NuevaIncidenciaFragmentArgs {
      val __pacienteId : String?
      if (savedStateHandle.contains("pacienteId")) {
        __pacienteId = savedStateHandle["pacienteId"]
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      val __visitaId : String?
      if (savedStateHandle.contains("visitaId")) {
        __visitaId = savedStateHandle["visitaId"]
      } else {
        __visitaId = null
      }
      return NuevaIncidenciaFragmentArgs(__pacienteId, __visitaId)
    }
  }
}
