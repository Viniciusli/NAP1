class Fabrica:

    def __init__(self):
        self.quantidade_de_cacau = 0
        self.quantidade_de_graos = 0
        self.chocolate = 0  # em gramas
        print("""Siga as etapas para produzir chocolate
        1) colher()
        2) extrair_graos()
        3) extrair_chocolate()""")

    def colher(self):
        print("O cacau está sendo colhido")
        self.quantidade_de_cacau += 10

    def extrair_graos(self):
        # adimitindo que um cacau possui 20 graos
        if self.quantidade_de_cacau > 0:
            self.quantidade_de_graos = self.quantidade_de_cacau * 20
            print(f"grãos colhidos: {self.quantidade_de_graos}")
        else:
            print("colha cacau para extrair os grãos")

    def extrair_chocolate(self):
        if self.quantidade_de_graos > 0:
            self.chocolate = self.quantidade_de_graos * 5
            print(f"{self.chocolate} gramas de chocolate produzidos")
