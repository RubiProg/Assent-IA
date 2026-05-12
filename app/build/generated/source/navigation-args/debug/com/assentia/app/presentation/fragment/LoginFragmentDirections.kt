package com.assentia.app.presentation.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.assentia.app.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginToAdmin(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_to_admin)

    public fun actionLoginToCuidador(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_to_cuidador)

    public fun actionLoginToFamiliar(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_to_familiar)
  }
}
