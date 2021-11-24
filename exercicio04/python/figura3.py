class Figura3:

    # construtor
    def __init__(self, x, y):
        self.cordX = x
        self.cordY = y

    def desenhar(self):
        print(f"Desenhando cordenadas({self.cordX}, {self.cordY}) ")

    def pintar(self):
        print(f"Pintando f_01 nas cordenadas({self.cordX}, {self.cordY})  ")

    # metodo_mover
    def mover(self):
        self.cordX += 2
        self.cordY += 2
        print("Figura movida\nNovas coordenadas:")
        self.get_coodenadas()

    # metodo_quadrante
    def quadrante(self):
        if self.cordX > 0 and self.cordY > 0:
            print('Figura no Quadrante 1!')
        elif self.cordX < 0 and self.cordY > 0:
            print('Figura no Quadrante 2!')
        elif self.cordX < 0 and self.cordY < 0:
            print('Figura no Quadrante 3!')
        elif self.cordX == 0 and self.cordY == 0:
            print('A Figura esta sobre o Eixo, a origem do Plano Cartesiano !!!')
        else:
            print('Figura no Quadrante 4!')

    def get_coodenadas(self):
        print(f"coordenadas(X, Y): ({self.cordX}, {self.cordY})")
