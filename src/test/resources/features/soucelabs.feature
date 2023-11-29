Feature: navegando por saucelabs

  yo como usuario quiero navegar por saucelabs

  @login
  Scenario: Login
    Given Indra ingresa a la apk saucelabs
    When digita las credenciales de acceso "standard_user" y "secret_sauce"
    Then verifica que ingreso correctamente
