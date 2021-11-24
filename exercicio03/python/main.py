from fazenda2 import Fazenda2
from figura2 import Figura2


f_01 = Figura2(2, 5)
f_01.desenhar()
f_01.pintar()

print("_"*55)

fazenda = Fazenda2("Haras Manga_Larga", 2000, "Fabio", "batata")
fazenda.imprimi()
fazenda.adubar()
fazenda.plantar()
print("\n")
fazenda.imprimi()
