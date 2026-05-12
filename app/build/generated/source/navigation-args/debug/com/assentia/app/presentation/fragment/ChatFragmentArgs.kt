package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ChatFragmentArgs(
  public val pacienteId: String,
  public val destinatarioId: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("pacienteId", this.pacienteId)
    result.putString("destinatarioId", this.destinatarioId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("pacienteId", this.pacienteId)
    result.set("destinatarioId", this.destinatarioId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ChatFragmentArgs {
      bundle.setClassLoader(ChatFragmentArgs::class.java.classLoader)
      val __pacienteId : String?
      if (bundle.containsKey("pacienteId")) {
        __pacienteId = bundle.getString("pacienteId")
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      val __destinatarioId : String?
      if (bundle.containsKey("destinatarioId")) {
        __destinatarioId = bundle.getString("destinatarioId")
        if (__destinatarioId == null) {
          throw IllegalArgumentException("Argument \"destinatarioId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"destinatarioId\" is missing and does not have an android:defaultValue")
      }
      return ChatFragmentArgs(__pacienteId, __destinatarioId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ChatFragmentArgs {
      val __pacienteId : String?
      if (savedStateHandle.contains("pacienteId")) {
        __pacienteId = savedStateHandle["pacienteId"]
        if (__pacienteId == null) {
          throw IllegalArgumentException("Argument \"pacienteId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pacienteId\" is missing and does not have an android:defaultValue")
      }
      val __destinatarioId : String?
      if (savedStateHandle.contains("destinatarioId")) {
        __destinatarioId = savedStateHandle["destinatarioId"]
        if (__destinatarioId == null) {
          throw IllegalArgumentException("Argument \"destinatarioId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"destinatarioId\" is missing and does not have an android:defaultValue")
      }
      return ChatFragmentArgs(__pacienteId, __destinatarioId)
    }
  }
}
