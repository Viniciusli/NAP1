class Fazenda:
    nome = ""
    area = 0.0
    proietario = ""

    def __init__(self, nome: str, area: float, propietario: str):
        self.nome = nome
        self.area = area
        self.proietario = propietario
