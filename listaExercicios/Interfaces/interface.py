class Relatorio:
    def __init__(self, conteudo):
        self.conteudo = conteudo

    def imprimir(self):
        print(self.conteudo)

class Contrato:
    def __init__(self, partes, clausulas):
        self.partes = partes
        self.clausulas = clausulas

    def imprimir(self):
        print("Contrato entre:", self.partes)
        print("Cláusulas:", self.clausulas)

def imprimir_documentos(documentos):
    for documento in documentos:
        documento.imprimir()

relatorio = Relatorio("Este é um relatório.")
contrato = Contrato(["João", "Maria"], ["Cláusula 1", "Cláusula 2"])

documentos = [relatorio, contrato]
imprimir_documentos(documentos)