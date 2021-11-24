class Fazenda2:
    nome = ""
    area = 0.0
    propietario = ""
    produto = ""
    adubado = False
    milho_plantado = False

    def __init__(self, nome: str, area: float, propietario: str, produto: str):
        self.nome = nome
        self.area = area
        self.propietario = propietario
        self.produto = produto
        self.adubado
        self.milho_plantado

    def is_adubado(self) -> bool:
        return self.adubado

    def set_adubado(self, adubado):
        self.adubado = adubado

    def is_milho_plantado(self):
        return self.milho_plantado

    def set_milho_plantado(self, milho_plantado):
        self.milho_plantado = milho_plantado

    def adubar(self):
        if (self.area > 0):
            print("Área adubada")
            self.set_adubado(True)
        else:
            print("É preciso ter áreas para plantar")

    def plantar(self):
        if self.is_adubado():
            print(f"{self.produto} foi plantado(a)")
            self.set_milho_plantado(True)
        else:
            print("Adube a terra para plantar")

    def imprimi(self):
        print("Fazenda:", self.nome)
        print("Área:", self.area, "a")
        print("Propietário:", self.propietario)
        print("Produto:", self.produto)
        print("Status da terra: ", end="")
        if self.is_adubado() and self.is_milho_plantado():
            print("adubado e plantado")
        else:
            print("não adubado ou nada plantado")
