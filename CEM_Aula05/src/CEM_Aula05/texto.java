/*Classe ContaBanco
{
Atributo
privado numConta Inteiro
protegido tipo Caractere
privado dono Caractere
privado saldo Real
privado status Logico

Metodos
publico Metodo abrirConta(t:Caractere)
setTipo(t)
setStatus(verdadeiro)
se (t = "CC") entao
setSaldo(50)

senao se (t="CP") entao
setSaldo(150)
FimSe
FimMetodo

publico Metodo fechaConta()
se (saldo >0) entao
    Escreva ("Conta com dinheiro")
senao se (saldo < 0 )entao
    Escreva ("Conta em débito")
senao
    setStatus(Falso)
FimSe
FimMetodo

publico Metodo depositar(v:Real)
se getStatus() entao
    setSaldo(getSaldo() + v)
senao
    Escreva ("Impossível depositar")
FimSe
FimMetodo

publico Metodo sacar(v:Real)
se getStatus() entao
    se (getSaldo() > v) entao
setSaldo() = getSaldo() - v
senao
    Escreva ("Saldo Insuficiente")
FimSe
    Escreva ("Impossivel sacar")
FimMetodo

Publico Metodo pagarMensal()
var v: Real
se (tipo = "CC") entao
    v = 12
senao se (tipo = "CP") entao
    v = 20
FimSe
se (status = verdadeiro) entao
    se (saldo > v) entao
    saldo = saldo - v
    senao
        Escreva("Saldo Insuficiente")
    FimSe
senao
    Escreva("Impossivel pagar")
FimSe
FimMetodo

FimClasse}

//Metodos Especiais

publico Metodo Construtor()
saldo = 0
status = falso
FimMetodo

publico Metodo setNumConta(n:Inteiro)
numConta = n
FimMetodo

publico Metodo getNumConta()
retorne numConta
FimMetodo

publico Metodo setTipo(t:Caracter)
tipo = t
FimMetodo

publico Metodo getTipo()
retorne tipo
FimMetodo

publico Metodo setDono(d:Caractere)
dono = d
FimMetodo

publico Metodo getDono()
retorne dono
FimMetodo

publico Metodo setSaldo(s:Real)
saldo = s
FimMetodo

publico Metodo getSaldo()
retorne saldo
FimMetodo

publico Metodo setStatus(s:Logico)
status = s
FimMetodo

publico Metodo getStatus()
retorne status
FimMetodo
*/
