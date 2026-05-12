package com.assentia.app.presentation.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.assentia.app.R
import kotlin.Int
import kotlin.String

public class AgendaFragmentDirections private constructor() {
  private data class ActionAgendaToVisita(
    public val visitaId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_agenda_to_visita

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("visitaId", this.visitaId)
        return result
      }
  }

  public companion object {
    public fun actionAgendaToVisita(visitaId: String): NavDirections =
        ActionAgendaToVisita(visitaId)
  }
}
