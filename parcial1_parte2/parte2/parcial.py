class FiguraGeometrica:
    lado = int(input("Ingrese los lados del cuadrado: "))
    base = int(input("Ingrese la base del triangulo: "))
    altura = int(input("Ingrese la altura del triangulo: "))
    radio = int(input("Ingrese el radio de la circunferencia: "))
    pi = 3.1416

class Cuadrado(FiguraGeometrica):
    def calcular_area(self):
        return self.lado * self.lado
cuadrado = Cuadrado()
class Triangulo(FiguraGeometrica):
    def calcular_area(self):
        return 0.5 * self.base * self.altura
triangulo = Triangulo()
class Circunferencia(FiguraGeometrica):
    def calcular_area(self):
        return self.pi * (self.radio * self.radio)
circunferencia = Circunferencia()

print("Área del cuadrado:", cuadrado.calcular_area())
print("Área del triángulo:", triangulo.calcular_area())
print("Área de la circunferencia:", circunferencia.calcular_area())
