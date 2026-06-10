# Práctica: Estructuras Dinámicas Lineales

## Datos del Estudiante
- **Nombre:** Christian Villa
- **Curso:** Grupo 3
- **Fecha:** 9/6/2026
---

## 1. Implementación de estructuras dinámicas lineales

**Fecha:** 9/6/2026

**Descripción:**

En la practica realizamos un metodo que nos va a permitir revertir una palabra ya dada por nosotros mismos en este caso "Computacion" lo cual nos ayudamos con ayuda de un for y un while , en esta practica aprendimso como hacer ejercicios de los metodos de colas y pilas.

### Captura de salida en consola
![alt text](<assents/Captura de pantalla 2026-06-09 193756.png>)


### Captura del código de implementación del ejercicio 1

![alt text](<assents/Captura de pantalla 2026-06-09 193543.png>)

![alt text](<assents/Captura de pantalla 2026-06-09 193707.png>)


# Práctica: Estructuras Dinámicas Lineales

## Datos del Estudiante
- **Nombre:** Christian Villa
- **Curso:** Grupo 3 
- **Fecha:** 10/6/2026

---

## 2. Ejercicio Palíndromo

**Fecha:** 9/1972026

**Descripción:**

En esta practica hicimos un metodo en el cual nos ayudara a ver si es palindromo o no a partir de pilas las cuales para esto nos retornara un true o un false y esta practica nos ayudo a ver el uso de las pilas de una mejor forma.

### Captura de salida en consola

![alt text](<assents/Captura de pantalla 2026-06-10 115300.png>)


### Método implementado

````java
public boolean esPalindromo(String texto) {
        Stack<Character> pila=new Stack<>();


        for(int i = 0; i< texto.length(); i++){
            pila.push(texto.charAt(i));
        }
        String invertido = "";

        while(!pila.isEmpty()){
            invertido +=pila.pop();
        }
        if(texto.equals(invertido)){
            return true;
        }else{
            return false;
        }
}