# 🧮 Calculadora em Java (POO)

Projeto de uma calculadora em **Java puro**, desenvolvida com foco em **Programação Orientada a Objetos**, tratamento de erros e boas práticas básicas.

O programa permite que o usuário digite expressões matemáticas completas, como:

5 * 3
10 / 2
8 + 4


Além disso, mantém um **histórico das operações realizadas** durante a execução.

---

## 🚀 Funcionalidades

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão (com validação de divisão por zero)
- 📜 Histórico das operações
- ⌨️ Entrada de dados no formato: `número operador número`
- ❌ Tratamento de entradas inválidas
- 🔚 Comando para encerrar o programa

---

## 🧠 Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Classes e métodos
- Encapsulamento
- Listas (`List`, `ArrayList`)
- Tratamento de exceções (`try/catch`)
- Manipulação de Strings (`split`)
- Sobrescrita do método `toString()`

---

## 🏗️ Estrutura do Projeto

src/
├── Main.java # Classe principal (interação com o usuário)
├── Operacoes.java # Regras de negócio (cálculos)
└── Conta.java # Representa uma operação realizada (histórico)


---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
javac Main.java
java Main

## 🧪 Exemplo de Uso

Entrada:

5 * 3


Saída:

Resultado: 15.0


Entrada:

historico


Saída:

5.0 * 3.0 = 15.0


## 👨‍💻 Autor

Projeto desenvolvido por Gustavo Gonçalves Baião
Estudante de Sistemas de Informação e desenvolvedor Java em formação.