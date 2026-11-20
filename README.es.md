<div align="center">

# ALRM-TECH

**Una tienda de componentes de PC en consola: arma tu equipo, llena el carrito y paga.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![Console app](https://img.shields.io/badge/Console%20app-555?style=flat-square) [![CI](https://github.com/RobiiAragon/ALRM-TECH_JAVA/actions/workflows/ci.yml/badge.svg)](https://github.com/RobiiAragon/ALRM-TECH_JAVA/actions/workflows/ci.yml) ![License MIT](https://img.shields.io/badge/License%20MIT-2ea44f?style=flat-square)

[English](README.md) · **Español**

</div>

---

Uno de mis primeros programas en Java (UTT, 2024). Una tienda en línea de hardware en modo texto, con un armador pieza por pieza que lleva la cuenta de la compatibilidad y del consumo de energía.

## Funciones

- 🧩 15 categorías: procesadores (Intel / AMD por generación), tarjetas gráficas (NVIDIA / AMD), motherboards, RAM (DDR4 / DDR5), almacenamiento HDD / SSD / NVMe, fuentes, gabinetes, refrigeración, monitores y periféricos.
- ⚡ Suma los watts de tu equipo para sugerirte una fuente de poder.
- 🛒 Carrito con subtotal, IVA y total.
- 💳 Pago con datos de tarjeta y número de recibo. La tarjeta se valida como en un formulario real (algoritmo de Luhn, MM/AA no vencida, CVV de 3 dígitos) y el recibo solo muestra los últimos 4 dígitos. Prueba con `4242 4242 4242 4242`.

## Cómo correrlo

```sh
git clone https://github.com/RobiiAragon/ALRM-TECH_JAVA.git
cd ALRM-TECH_JAVA
javac -encoding UTF-8 -d out src/*.java
java -cp out App
```

Pruebas (sin dependencias):

```sh
javac -encoding UTF-8 -d out src/*.java test/*.java
java -cp out TarjetaTest
```

Necesitas JDK 11 o más reciente. [`src/DB.sql`](src/DB.sql) es un borrador de la tabla de usuarios: la app de consola todavía no usa base de datos.

> El formulario de tarjeta es una simulación: no se cobra ni se guarda nada.

## Licencia

[MIT](LICENSE)

---

Hecho por **[Jesús Aragón](https://github.com/RobiiAragon)** · [Portafolio](https://robiiaragon.github.io/portfolio/)
