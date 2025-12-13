# Call Guard App — GitHub Projects Backlog

Este arquivo contém o backlog completo do projeto, pronto para ser importado manualmente ou usado como base para criação de Issues no GitHub Projects.

---

## EPIC 0 — Produto e Contrato (Fase 0)

### PRD v1 — Contrato do Produto
Labels: epic/product, prio/P0, type/doc

Descrição:
Definir os estados do app (Protegido, Aprendendo, Intervenção), política de zero interação, permissões mínimas e escopo fora do MVP.

Critérios de aceitação:
- Estados documentados com critérios objetivos
- Política de notificações OFF por padrão
- Fora de escopo explícito (feed, login, anúncios)

---

### Fluxos (FigJam) — Ativação, Chamada, Revisão, Reset
Labels: epic/product, prio/P0, type/doc

Critérios de aceitação:
- 4 fluxos desenhados
- Pontos de permissão claros
- Estados do app refletidos nos fluxos

---

### Rules Engine v1 — Sinais, Pesos e Thresholds
Labels: epic/core, prio/P0, type/doc

Critérios de aceitação:
- Tabela de sinais/pesos definida
- Thresholds:
  - >=6 Bloquear
  - 4–5 Silenciar
  - <=3 Permitir
- Cenários de teste documentados

---

## EPIC 1 — Infraestrutura Android

### Setup do Projeto Android
Labels: epic/infra, prio/P0, type/chore

Critérios de aceitação:
- Projeto Kotlin + Compose criado
- Estrutura core/data/ui definida
- App compila e roda

---

### CI — GitHub Actions
Labels: epic/infra, prio/P0, type/chore

Critérios de aceitação:
- Build automático
- Testes e lint rodando
- Falha bloqueia merge

---

## EPIC 2 — Data Layer

### Room DB — Schema Inicial
Labels: epic/data, prio/P0, type/feature

Tabelas:
- CallEvent
- NumberProfile
- RulesConfig
- UserOverrides

Critérios de aceitação:
- Migrações versionadas
- Índices definidos

---

### Retenção e Compactação
Labels: epic/data, prio/P1, type/feature

Critérios de aceitação:
- Limpeza automática 30 dias
- Baixo impacto em bateria

---

## EPIC 3 — Call Guard Core

### Call Screening
Labels: epic/core, prio/P0, type/feature

Critérios de aceitação:
- Evento de chamada interceptado
- Decisão aplicada quando suportado

---

### Pipeline de Decisão
Labels: epic/core, prio/P0, type/feature

Critérios de aceitação:
- Evento → Score → Decisão
- Reason codes registrados

---

## EPIC 4 — Local Intelligence

### Feature Store por Janelas
Labels: epic/intelligence, prio/P0, type/feature

Critérios de aceitação:
- Métricas 5m/10m/24h/7d

---

### Allowlist Automática
Labels: epic/intelligence, prio/P0, type/feature

Critérios de aceitação:
- >=20s atendido → allowlist 30 dias

---

## EPIC 5 — UI Mínima

### Home — Status
Labels: epic/ui, prio/P0, type/feature

### Regras — Toggles
Labels: epic/ui, prio/P0, type/feature

### Revisão — Bloqueios
Labels: epic/ui, prio/P0, type/feature

---

## EPIC 6 — Performance e Silêncio

### Benchmark
Labels: epic/perf, prio/P0, type/test

### Notificações Agregadas
Labels: epic/perf, prio/P1, type/feature

---

## EPIC 7 — Backend Comunitário (Opcional)

### GET Delta Reputação
Labels: epic/backend, prio/P2, type/feature

### POST Vote Reputação
Labels: epic/backend, prio/P2, type/feature
