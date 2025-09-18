# Casos de Teste – Laboratório 6

Nome do aluno:
RA:


Roteiro elaborado com os critérios de **Particionamento de Equivalência** e **Análise de Valor Limite**.

---

## Roteiro 1 – Validação de Idade no Sistema de Gestão de Contratos

> **Regra de Negócio:**  
> A idade dos clientes só pode variar entre **18 e 120 anos**.

### Particionamento de Equivalência

- **Classe equivalente válida:** valores entre 18 e 120 → **idade = 60**  
- **Classe equivalente não válida:** valor < 18 → **idade = 10**  
- **Classe equivalente não válida:** valor > 120 → **idade = 150**

### Análise de Valor Limite

Casos de teste → `{17, 18, 19}`, `{119, 120, 121}`

### Casos de Teste

| Caso | Entrada      | Saída Esperada   | Saída Observada |
|------|-------------|-----------------|----------------|
| **CT01** | Idade = 60  | Idade válida    |                |
| **CT02** | Idade = 10  | Idade inválida  |                |
| **CT03** | Idade = 150 | Idade inválida  |                |
| **CT04** | Idade = 17  | Idade inválida  |                |
| **CT05** | Idade = 18  | Idade válida    |                |
| **CT06** | Idade = 19  | Idade válida    |                |
| **CT07** | Idade = 119 | Idade válida    |                |
| **CT08** | Idade = 120 | Idade válida    |                |
| **CT09** | Idade = 121 | Idade inválida  |                |

---

## Roteiro 2 – Faixa Etária

> **Regras de Negócio:**  
> - 0 a 12 → **Criança**  
> - 13 a 17 → **Adolescente**  
> - 18 a 65 → **Adulto Jovem**  
> - 66 a 120 → **Melhor idade**  
> - Qualquer outro valor → **Idade Inválida**

### Particionamento de Equivalência

- **Classes equivalentes válidas:**
  - 0 a 12 → Idade = 6  
  - 13 a 17 → Idade = 15  
  - 18 a 65 → Idade = 45  
  - 66 a 120 → Idade = 80
- **Classes equivalentes inválidas:**
  - Idade < 0 → Idade = -10  
  - Idade > 120 → Idade = 150

### Análise de Valor Limite

Casos de teste → `{ -1, 0, 1 }`, `{ 11, 12, 13 }`, `{ 17, 18, 19 }`, `{ 64, 65, 66 }`, `{ 119, 120, 121 }`

### Casos de Teste

| Caso | Entrada      | Saída Esperada     | Saída Observada |
|------|-------------|-------------------|----------------|
| **CT01** | Idade = 6    | Criança          |                |
| **CT02** | Idade = 15   | Adolescente      |                |
| **CT03** | Idade = 45   | Adulto Jovem    |                |
| **CT04** | Idade = 80   | Melhor Idade    |                |
| **CT05** | Idade = -10  | Idade inválida  |                |
| **CT06** | Idade = 150  | Idade inválida  |                |
| **CT07** | Idade = -1   | Idade inválida  |                |
| **CT08** | Idade = 0    | Criança         |                |
| **CT09** | Idade = 1    | Criança         |                |
| **CT10** | Idade = 11   | Criança         |                |
| **CT11** | Idade = 12   | Criança         |                |
| **CT12** | Idade = 13   | Adolescente     |                |
| **CT13** | Idade = 17   | Adolescente     |                |
| **CT14** | Idade = 18   | Adulto Jovem    |                |
| **CT15** | Idade = 19   | Adulto Jovem    |                |
| **CT16** | Idade = 64   | Adulto Jovem    |                |
| **CT17** | Idade = 65   | Adulto Jovem    |                |
| **CT18** | Idade = 66   | Melhor Idade    |                |
| **CT19** | Idade = 119  | Melhor Idade    |                |
| **CT20** | Idade = 120  | Melhor Idade    |                |
| **CT21** | Idade = 121  | Idade inválida  |                |
