# importamos la libreria para generar numeros al azar
import random

# Solicita al usuario la cantidad de números que desea en la lista
n = int(input("Ingrese la cantidad de números en la lista: "))

# Genera una lista de números al azar, en este caso de 1 hasta 9
numeros = [random.randint(1, 9) for _ in range(n)]

# Muestra la lista antes de ordenarla
print("Lista antes de ordenar:", numeros)

# Ordena la lista
numeros.sort()

# Muestra la lista ya ordenada
print("Lista después de ordenar:", numeros)
