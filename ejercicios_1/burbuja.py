# importamos la libreria para generar numeros al azar
import random

def ordenamiento_burbuja(lista):
    n = len(lista)
    
    for i in range(n):
        for j in range(0, n-i-1):
            if lista[j] > lista[j+1]:
                # Intercambia elementos si están en el orden incorrecto
                lista[j], lista[j+1] = lista[j+1], lista[j]

# Solicita al usuario la cantidad de números que desea en la lista
n = int(input("Ingrese la cantidad de números en la lista: "))

# Generar una lista de números al azar, en este caso de 1 hasta 9
numeros = [random.randint(1, 9) for _ in range(n)]

# Muestra la lista antes de ordenarla
print("Lista antes de ordenar:", numeros,)

# Aplica el algoritmo de ordenamiento burbuja
ordenamiento_burbuja(numeros)

# Muestra la lista ya ordenada
print("Lista después de ordenar:", numeros)
