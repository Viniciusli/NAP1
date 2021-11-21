from math import sqrt


class Ponto:

    coordx: float
    coordy: float

    def __init__(self, coordx: float, coordy: float):
        self.coordx = coordx
        self.coordy = coordy

    def get_coordx(self):
        return self.coordx

    def get_coordy(self):
        return self.coordy

    def set_coordx(self, nova_coordx):
        self.coordx = nova_coordx

    def set_coordy(self, nova_coordy):
        self.coordy = nova_coordy

    def imprimir(self):
        print(
            f"As coordenadas de X e Y no ponto A são de: {self.get_coordx()} e {self.get_coordy()}")

    def distancia(self, valor1, valor2=None):
        if valor2 == None:  # ou seja, valor 1 é uma instancia da classe ponto
            return sqrt(pow(self.coordx - valor1.get_coordx(), 2) + pow(self.coordy - valor1.get_coordy(), 2))
        return sqrt(pow(self.coordx - valor1, 2) + pow(self.coordy - valor2, 2))
