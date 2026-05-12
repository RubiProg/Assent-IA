package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.assentia.app.R
import kotlin.Int
import kotlin.String

public class FamiliarHomeFragmentDirections private constructor() {
  private data class ActionHomeToChat(
    public val pacienteId: String,
    public val destinatarioId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_home_to_chat

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("pacienteId", this.pacienteId)
        result.putString("destinatarioId", this.destinatarioId)
        return result
      }
  }

  private data class ActionHomeToHistorial(
    public val pacienteId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_home_to_historial

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("pacienteId", this.pacienteId)
        return result
      }
  }

  public companion object {
    public fun actionHomeToChat(pacienteId: String, destinatarioId: String): NavDirections =
        ActionHomeToChat(pacienteId, destinatarioId)

    public fun actionHomeToHistorial(pacienteId: String): NavDirections =
        ActionHomeToHistorial(pacienteId)
  }
}
