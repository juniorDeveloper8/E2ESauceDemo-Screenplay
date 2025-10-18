@E2ECompraExitosa
Feature: Flujo de compra exitoso en SauceDemo

  Como usuario autenticado en SauceDemo
  Quiero poder realizar una compra completa
  Para confirmar que el flujo E2E funciona correctamente

  Scenario Outline: Compra exitosa de productos en SauceDemo
    Given el usuario accede al sitio SauceDemo
    And inicia sesión con el usuario "<username>" y contraseña "<password>"
    When agrega los productos "<producto1>" y "<producto2>" al carrito
    And visualiza el contenido del carrito
    And procede al checkout e ingresa los datos: nombre "<firstName>", apellido "<lastName>", código postal "<postalCode>"
    And finaliza la compra
    Then debería ver el mensaje de confirmación "Thank you for your order!"

    Examples:
      | username      | password     | producto1           | producto2                | firstName | lastName | postalCode |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Fleece Jacket | Roberth   | Zambrano | 170518     |
