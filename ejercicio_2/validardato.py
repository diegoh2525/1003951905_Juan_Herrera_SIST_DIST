def validar_texto():
    dato = input("Ingrese un dato: ")
    print("El dato ingresado es:", dato)

def validar_entero():
    while True:
        try:
            dato = int(input("Ingrese un numero entero: "))
            print("El dato ingresado es un numero entero valido:", dato)
            break
        except ValueError:
            print("Por favor, ingrese un numero entero valido.")

def validar_entero_rango():
    while True:
        try:
            rango = int(input("Ingrese el rango máximo permitido de un número entero: "))
            while True:
                try:
                    dato = int(input("Ingrese un número entero: "))
                    if 0 <= dato <= rango:
                        print("El dato ingresado está en el rango permitido:", dato)
                        return
                    else:
                        print(f"Por favor, ingrese un número entero en el rango de 0 a {rango}.")
                except ValueError:
                    print("Por favor, ingrese un número entero válido.")
        except ValueError:
            print("Por favor, ingrese un número entero válido para el rango. Inténtelo de nuevo.")

def validar_entero_positivo():
    while True:
        try:
            dato = int(input("Ingrese un numero entero positivo: "))
            if dato > 0:
                print("El dato ingresado es un numero entero positivo:", dato)
                break
            else:
                print("Por favor, ingrese un numero entero positivo.")
        except ValueError:
            print("Por favor, ingrese un numero entero valido.")

def validar_entero_negativo():
    while True:
        try:
            dato = int(input("Ingrese un número entero negativo: "))
            if dato < 0:
                print("El dato ingresado es un numero entero negativo:", dato)
                break
            else:
                print("Por favor, ingrese un numero entero negativo.")
        except ValueError:
            print("Por favor, ingrese un numero entero valido.")

def validar_decimal():
    while True:
        try:
            dato = float(input("Ingrese un número decimal: "))
            print("El dato ingresado es decimal:", dato)
            break
        except ValueError:
            print("Por favor, ingrese un numero decimal valido.")

def validar_decimal_rango():
    while True:
        try:
            rango = float(input("Ingrese el rango máximo permitido de un número decimal: "))
            while True:
                try:
                    dato = float(input("Ingrese un número decimal: "))
                    if 0 <= dato <= rango:
                        print("El dato ingresado está en el rango permitido:", dato)
                        return
                    else:
                        print(f"Por favor, ingrese un número decimal en el rango de 0 a {rango}.")
                except ValueError:
                    print("Por favor, ingrese un número decimal válido.")
        except ValueError:
            print("Por favor, ingrese un número decimal válido para el rango. Inténtelo de nuevo.")

def validar_decimal_positivo():
    while True:
        try:
            dato = float(input("Ingrese un numero decimal positivo: "))
            if dato > 0:
                print("El dato ingresado es un numero decimal positivo:", dato)
                break
            else:
                print("Por favor, ingrese un numero decimal positivo.")
        except ValueError:
            print("Por favor, ingrese un numero decimal valido.")

def validar_decimal_negativo():
    while True:
        try:
            dato = float(input("Ingrese un numero decimal negativo: "))
            if dato < 0:
                print("El dato ingresado es un numero decimal negativo:", dato)
                break
            else:
                print("Por favor, ingrese un numero decimal negativo.")
        except ValueError:
            print("Por favor, ingrese un numero decimal valido.")


#validar_texto()
#validar_entero()
#validar_entero_rango()
#validar_entero_positivo()
#validar_entero_negativo()
#validar_decimal()
#validar_decimal_rango()
#validar_decimal_positivo()
#validar_decimal_negativo()
