# Conversor de Unidades

Este proyecto es un conversor de unidades desarrollado en Java utilizando JFrames y diversas librerías. Proporciona funcionalidades para convertir entre diferentes unidades de Moneda, Longitud, Temperatura y Peso.

## Funcionalidades

El conversor de unidades ofrece las siguientes funcionalidades:

### Selección de Categoría

El usuario puede seleccionar la categoría de unidades de conversión deseada. Las categorías disponibles son:

- Moneda: Permite convertir entre diferentes tipos de monedas, como Dólares, Euros, Libras Esterlinas, Yen Japonés, Won sul-coreano.
- Longitud: Permite convertir entre diferentes unidades de longitud, como Metros, Pies, Pulgadas.
- Temperatura: Permite convertir entre diferentes unidades de temperatura, como Celsius, Fahrenheit, Kelvin.
- Peso: Permite convertir entre diferentes unidades de peso, como Kilogramos, Libras, Onzas.

### Selección de Unidades de Conversión

Una vez seleccionada la categoría, el usuario puede elegir las unidades de conversión específicas dentro de esa categoría. Por ejemplo, si la categoría seleccionada es "Moneda", el usuario puede elegir convertir de Dólares a Euros, de Euros a Libras Esterlinas, etc.

### Ingreso de Valor a Convertir

El usuario puede ingresar el valor que desea convertir en un campo de texto. El programa valida que solo se ingresen números decimales y permite la entrada de un solo punto decimal.

### Conversión y Resultado

Al presionar el botón de conversión, el programa realiza la conversión del valor ingresado a la unidad seleccionada. Muestra el resultado de la conversión en una etiqueta en el GUI. Además, se proporciona la opción de copiar el resultado al portapapeles.

## Instalación y Uso

1. Clona o descarga el repositorio del proyecto.
2. Abre el proyecto en tu IDE Java (por ejemplo, NetBeans, Eclipse, IntelliJ IDEA).
3. Ejecuta la aplicación.

## Dependencias

Este proyecto utiliza las siguientes clases y paquetes de Java:

- `java.awt.Color`: Utilizado para manejar colores en la interfaz gráfica.
- `java.awt.Toolkit`: Utilizado para acceder a funciones y recursos del sistema.
- `java.awt.datatransfer.Clipboard`: Utilizado para acceder al portapapeles del sistema.
- `java.awt.datatransfer.StringSelection`: Utilizado para crear una selección de texto para copiar al portapapeles.
- `java.awt.event.KeyEvent`: Utilizado para manejar eventos de teclado.
- `java.util.ArrayList`: Utilizado para almacenar elementos en una lista dinámica.
- `java.util.Arrays`: Utilizado para manipular y operar en arrays.
- `java.util.HashMap`: Utilizado para almacenar pares de clave-valor en un mapa.
- `java.util.Map`: Utilizado para manipular y operar en mapas.
- `javax.swing.JOptionPane`: Utilizado para mostrar mensajes y diálogos en la interfaz gráfica.
- `javax.swing.AbstractListModel`: Utilizado para implementar un modelo de lista abstracta.

Estas clases y paquetes son parte de la biblioteca estándar de Java y no requieren dependencias externas adicionales.

## Contribuciones

Las contribuciones a este proyecto son bienvenidas. Si encuentras algún problema o tienes alguna mejora que proponer, no dudes en abrir un problema o enviar una solicitud de extracción.

## Contacto

Si tienes alguna pregunta o consulta relacionada con este proyecto, puedes contactarme a través de mi dirección de correo electrónico: alexalante3@gmail.com.
