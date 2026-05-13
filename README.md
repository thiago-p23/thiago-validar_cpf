# thiago-validar_cpf
#📄 Apresentação do Programa – Validação de CPF
## 💡 Descrição

Este programa foi desenvolvido em Java com o objetivo de validar um CPF digitado pelo usuário, verificando se os dígitos informados são válidos de acordo com o algoritmo oficial de cálculo.

## ⚙️ Funcionamento

O sistema solicita que o usuário digite um CPF contendo 11 números (sem pontos ou traços).
A partir disso, o programa realiza as seguintes etapas:

## Verifica se o CPF possui exatamente 11 dígitos
Calcula o primeiro dígito verificador
Calcula o segundo dígito verificador
Compara os dígitos calculados com os informados
Exibe o resultado final
## 🧮 Lógica Utilizada
###🔹 1º Dígito Verificador
Multiplica os 9 primeiros dígitos por pesos de 10 até 2
Soma todos os resultados
Calcula o resto da divisão por 11
Se o resto < 2 → dígito = 0
Senão → dígito = 11 - resto
###🔹 2º Dígito Verificador
Multiplica os 10 primeiros dígitos por pesos de 11 até 2
Repete o mesmo processo do primeiro dígito
## ✅ Resultado

O programa exibe:

"CPF válido!" → se os dígitos conferirem
"CPF inválido!" → caso contrário
## 🛠️ Tecnologias Utilizadas
Linguagem Java
Estruturas de repetição (for)
Estruturas condicionais (if/else)
Manipulação de String
## 🎯 Objetivo

Este projeto tem como objetivo praticar:

lógica de programação
manipulação de dados
validação de informações
uso de estruturas de controle
## 💬 Observação

O CPF deve ser digitado somente com números, sem formatação (ex: 12345678909).
