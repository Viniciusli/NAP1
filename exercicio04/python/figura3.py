class Figura:

#construtor
def__init--(self, x, y):
self.cordX = x
self.cordY = y

def desenhar(self):
print(f"Desenhando cordenadas({self.cordX}, {self.cordY}) ")
print()
def pintar(f"Pintando f_01 nas cordenadas({self.cordX}, {self.cordY})  ")

#metodo_mover

def mover(self):
self.cordX = cordX + 2
self.corY = cordY +2

#metodo_quadrante
def quadrante(self):
  if self.cordX > 0 and self.cordY > 0:
  print('Figura no Quadrante 1 !')
  elif self.cordX < 0 and self.cordY > 0:
  print('Figura no Quadrante 2 !')
  elif self.cordX < 0 and self.cordY < 0:
  print('Figura no Quadrante 3 !')
  elif self.cordx > and self.cordY < 0:
  print('Figura no QWuadrante 4 !')
  elif.self.cordX == 0 and self.cordY == 0:
  print('A Figura esta sobre o Eixo, a origem do Plano Cartesiano !!!')
  print(\n)
  def get_coodenadas(self):
  print(f"coordenadas(X, Y): ({self.cordX}, {self.cordY})' )
