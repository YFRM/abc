Feature: Registrarse en pagina DemoBlaze
  @GLOBALO1
 Scenario Outline: Registrarse en pagina DemoBlaze
    Given que ingreso a pagina demoBlaze
    When me encuentro en el home doy click a Signup
      | user   | pass   |
      | <user>| <pass> |
    Then doy click a continue
    Examples:
      | user   | pass   |
      | yfrm333| 123456 |



  @GLOBALO2
  Scenario Outline: Logeo en pagina DemoBlaze
    Given que ingreso a pagina demoBlaze
    When me encuentro en el home doy click a Login
      | userL   | passL   |
      | <userL>| <passL> |
    Then doy click a continue
    Examples:
      | userL   | passL   |
      | yfrm333| 123456 |