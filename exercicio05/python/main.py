from Ponto import Ponto

p1 = Ponto(10.5, 0)
p1.imprimir()

p2 = Ponto(0, 6)
p2.imprimir()

# com 2 parâmetros
print("A distância do ponto B até o ponto A é de: ",
      p2.distancia(p1.coordx, p1.coordy))

# com apenas 1 parâmetro
print("A distancia do ponto B até o ponto A é de: ", p2.distancia(p1))
