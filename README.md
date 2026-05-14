# ☕ Cafetería e infusiones - Patrón Decorator

En una cafetería pueden personalizarse dinámicamente las infusiones agregando distintos ingredientes extra.

El objetivo es modelar el sistema aprovechando las ventajas de la programación con objetos, permitiendo agregar funcionalidades sin modificar las clases existentes ni abusar de la herencia.

---

# 👨‍🏫 Primera Parte - Desarrollo en clase

## 📋 Requerimientos

### ☕ Infusiones

El sistema ofrece inicialmente distintos tipos de bebidas:

* Café
* Té
* Chocolate caliente

De cada bebida se conoce:

* Su nombre
* Su costo base

#### 📌 Ejemplo

| Bebida             | Costo |
| ------------------ | ----- |
| Café               | $3    |
| Té                 | $2    |
| Chocolate caliente | $4    |

---

## 🍯 Ingredientes Extra

Las bebidas pueden personalizarse agregando ingredientes adicionales.

Inicialmente existen:

* Leche
* Crema
* Chocolate extra
* Canela

Cada ingrediente:

* Incrementa el costo de la bebida
* Modifica la descripción final

### 📌 Ejemplo

Un café con leche y canela debería verse conceptualmente así:

```txt
Café + Leche + Canela
```

y su costo sería:

```txt
3 + 1 + 0.5 = 4.5
```

---

## 🧩 Combinación de Ingredientes

Los ingredientes pueden combinarse libremente y en cualquier cantidad.

### 📌 Ejemplo

```txt
Chocolate caliente + Crema + Chocolate extra + Canela
```

El sistema debe permitir:

* Agregar ingredientes dinámicamente
* Encadenar múltiples agregados
* Mantener el cálculo correcto del costo total

---

## ⚙️ Restricciones de Diseño

* No se permite modificar las clases base de las bebidas cada vez que aparece un nuevo ingrediente.
* El sistema debe quedar preparado para incorporar nuevos extras en el futuro sin romper código existente.
* Las responsabilidades deben estar correctamente distribuidas entre objetos.
* Evitar soluciones basadas en condicionales (`if` / `switch`) para distinguir tipos de bebidas o ingredientes.

---

## 💡 Ayuda

Pensar:

* ¿Qué tienen en común las infusiones y los ingredientes agregados?
* ¿Cómo se puede “envolver” una infusión para agregar comportamiento?
* ¿Qué patrón permite extender funcionalidades sin herencia masiva?

---

## 🧪 Test

Plantear tests significativos para verificar:

* El costo base de cada bebida
* El agregado individual de ingredientes
* La combinación de múltiples ingredientes
* Que el orden de los decoradores mantenga el comportamiento esperado
* Que puedan agregarse nuevos ingredientes sin modificar las bebidas existentes

---

# 🏠 Segunda Parte - Tarea

## 🧉 Incorporar nuevas infusiones

Agregar las siguientes nuevas bebidas:

* Mate cocido
* Té de hierbas
* Té de limón

### 🌿 Té de hierbas

El té de hierbas puede prepararse utilizando distintas hierbas.

Inicialmente se soportan:

* Menta
* Boldo

Pensar cómo modelar esta variación evitando duplicación innecesaria de clases.

---

## 🍬 Incorporar nuevos decoradores

Agregar los siguientes ingredientes extra:

* Azúcar
* Vainilla
* Miel

El agregado de estos nuevos ingredientes no debe requerir modificar las clases ya existentes.

---

## 🧪 Test

Incorporar tests para verificar:

* El correcto funcionamiento de las nuevas infusiones
* El agregado de los nuevos decoradores
* La combinación entre decoradores viejos y nuevos
* La extensión del modelo sin modificar clases existentes
* El comportamiento del té de hierbas con distintas hierbas disponibles
