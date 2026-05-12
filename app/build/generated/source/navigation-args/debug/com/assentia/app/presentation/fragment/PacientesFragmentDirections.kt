package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.assentia.app.R
import kotlin.Int
import kotlin.String

public class PacientesFragmentDirections private constructor() {
  private data class ActionPacientesToDetalle(
    public val pacienteId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_pacientes_to_detalle

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("pacienteId", this.pacienteId)
        return result
      }
  }

  public companion object {
    public fun actionPacientesToDetalle(pacienteId: String): NavDirections =
        ActionPacientesToDetalle(pacienteId)

    public fun actionPacientesToNuevo(): NavDirections =
        ActionOnlyNavDirections(R.id.action_pacientes_to_nuevo)
  }
}
