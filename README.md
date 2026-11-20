<div align="center">

# ALRM-TECH

**A console PC-parts store: build your rig, fill the cart and check out.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![Console app](https://img.shields.io/badge/Console%20app-555?style=flat-square) [![CI](https://github.com/RobiiAragon/ALRM-TECH_JAVA/actions/workflows/ci.yml/badge.svg)](https://github.com/RobiiAragon/ALRM-TECH_JAVA/actions/workflows/ci.yml) ![License MIT](https://img.shields.io/badge/License%20MIT-2ea44f?style=flat-square)

**English** · [Español](README.es.md)

</div>

---

One of my first Java programs (UTT, 2024). A text-based online store for computer hardware, with a part-by-part builder that keeps track of compatibility and power draw.

## Features

- 🧩 15 categories: CPUs (Intel / AMD by generation), GPUs (NVIDIA / AMD), motherboards, RAM (DDR4 / DDR5), HDD / SSD / NVMe storage, PSUs, cases, cooling, monitors and peripherals.
- ⚡ Adds up the wattage of your build to suggest a power supply.
- 🛒 Shopping cart with subtotal, tax and total.
- 💳 Checkout with card details and a printed receipt number. The card is validated like a real form (Luhn checksum, MM/YY not expired, 3-digit CVV) and the receipt shows only the last 4 digits. Try `4242 4242 4242 4242`.

## Run it

```sh
git clone https://github.com/RobiiAragon/ALRM-TECH_JAVA.git
cd ALRM-TECH_JAVA
javac -encoding UTF-8 -d out src/*.java
java -cp out App
```

Run the tests (no dependencies):

```sh
javac -encoding UTF-8 -d out src/*.java test/*.java
java -cp out TarjetaTest
```

Requires JDK 11 or newer. [`src/DB.sql`](src/DB.sql) is a draft schema for user accounts — the console app doesn't use a database yet.

> The store's menus are in Spanish. The card form is a simulation — nothing is charged or stored.

## License

[MIT](LICENSE)

---

Made by **[Jesús Aragón](https://github.com/RobiiAragon)** · [Portfolio](https://robiiaragon.github.io/portfolio/)
