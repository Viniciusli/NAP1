class Figura2:
    coordenadaX = 0.0
    coordenadaY = 0.0

    def __init__(self, x: float, y: float) -> None:
        self.coordenadaX = x
        self.coordenadaY = y

    def desenhar(self):
        print(
            f"Desenho das coordenadas ({self.coordenadaX}, {self.coordenadaY})")

    def pintar(self):
        print(
            f"Pintando os pontos das coordenadas ({self.coordenadaX}, {self.coordenadaY})")

    def imprimi(self):
        print(f"Coordendas: ({self.coordenadaX}, {self.coordenadaY})")
