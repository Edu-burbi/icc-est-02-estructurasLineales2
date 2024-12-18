## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

//*************************************************************************************************************************

# Proyecto: Estructuras Lineales

## Descripción

Este proyecto implementa dos ejercicios principales utilizando estructuras de datos lineales en Java:

1. **Validación de Signos**: Utiliza una pila para verificar si una cadena de signos (como `()`, `{}`, `[]`) está correctamente 
balanceada.
2. **Ordenamiento de una Pila**: Utiliza una pila auxiliar para ordenar los elementos de una pila en orden ascendente.

## Funcionalidades

### **Ejercicio 1: Validación de Signos**

El objetivo de este ejercicio es validar si una cadena de signos está balanceada. El programa permite al usuario ingresar 
una cadena de signos, y el código verifica si los signos de apertura y cierre (`()`, `{}`, `[]`) están correctamente balanceados. 

#### **¿Cómo funciona?**
1. El programa solicita al usuario que ingrese una cadena de signos.
2. La clase `SignValidator` toma la cadena ingresada y utiliza una **pila** para validar si cada símbolo de apertura tiene 
su correspondiente símbolo de cierre en el orden correcto.
3. Si todos los símbolos están balanceados, devuelve `true`; de lo contrario, devuelve `false`.

### **Ejercicio 2: Ordenamiento de una Pila**

En este ejercicio, el programa permite al usuario ingresar una serie de números que se almacenan en una pila. Posteriormente, 
la pila se ordena utilizando una pila auxiliar.

#### **¿Cómo funciona?**
1. El programa solicita al usuario que ingrese varios números.
2. Estos números se agregan a una **pila**.
3. La clase `StackSorter` toma la **pila** y la ordena en orden ascendente utilizando una **pila** auxiliar.
4. Finalmente, la **pila** ordenada se imprime.
