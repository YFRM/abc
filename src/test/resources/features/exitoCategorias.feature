Feature: Compra de productos en Tiendas Éxito

  @Agregar1
  Scenario: Agregar productos al carrito desde Tiendas Éxito
    Given Que ingreso a la página de Tiendas Éxito
    When  Elijo una categoría y una subcategoría
    And   Elijo productos al azar y cantidad de producto
    Then  se deben agregar los productos al carrito correctamente
    And el nombre de los productos en el carrito debe ser verificado
    And el total de los precios de los productos en el carrito debe ser verificado
    And las cantidades de los productos en el carrito deben ser verificadas
    And el número de productos agregados al carrito debe ser verificado
