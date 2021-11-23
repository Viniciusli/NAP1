class Fazenda:
    nome = ""
    area = 0.0
    propietario = ""

    def __init__(self, nome: str, area: float, propietario: str):
        self.nome = nome
        self.area = area
        self.propietario = propietario

    def imprimi(self):
        print("Fazenda:", self.nome)
        print("Área:", self.area, "a")
        print("Propietário:", self.propietario)
