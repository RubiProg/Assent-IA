package com.assentia.app.presentation.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.assentia.app.R

public class AdminDashboardFragmentDirections private constructor() {
  public companion object {
    public fun actionDashboardToPacientes(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboard_to_pacientes)

    public fun actionDashboardToIncidencias(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboard_to_incidencias)
  }
}
