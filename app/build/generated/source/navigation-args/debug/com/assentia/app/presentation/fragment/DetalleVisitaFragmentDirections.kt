package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.assentia.app.R
import kotlin.Int
import kotlin.String

public class DetalleVisitaFragmentDirections private constructor() {
  private data class ActionVisitaToIncidencia(
    public val pacienteId: String,
    public val visitaId: String? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_visita_to_incidencia

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("pacienteId", this.pacienteId)
        result.putString("visitaId", this.visitaId)
        return result
      }
  }

  public companion object {
    public fun actionVisitaToIncidencia(pacienteId: String, visitaId: String? = null): NavDirections
        = ActionVisitaToIncidencia(pacienteId, visitaId)
  }
}
