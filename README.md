# ⌚ DomaAssist - Wear OS

<p align="center">
  <img src="https://img.shields.io/badge/Wear%20OS-Android-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Android%20Studio-Development-blue?style=for-the-badge" />
</p>

## 📖 Sobre o Projeto

O **DomaAssist** é um aplicativo desenvolvido para **Wear OS** como atividade prática da disciplina **DGT2816 – Interação com Sensores de Smartphones e Wearables**.

O projeto tem como objetivo demonstrar a utilização de recursos de **áudio**, **Bluetooth** e interação com hardware em dispositivos vestíveis, explorando conceitos fundamentais do desenvolvimento para Wear OS.

---

## 🎯 Objetivo

O aplicativo permite:

✅ Verificar dispositivos de saída de áudio disponíveis

✅ Monitorar o estado do Bluetooth

✅ Abrir diretamente as configurações Bluetooth do sistema

✅ Reproduzir alertas sonoros locais

✅ Detectar alterações em dispositivos de áudio conectados

---

## 🚀 Funcionalidades

### 🔊 Verificar Áudio

Permite identificar dispositivos de saída de áudio disponíveis no wearable.

Informações verificadas:

* Alto-falante interno (Built-in Speaker)
* Estado atual do Bluetooth

Exemplo:

```text
Alto-falante: true
Bluetooth: true
```

---

### 📶 Abrir Bluetooth

Abre diretamente as configurações Bluetooth do Wear OS.

Possibilidades:

* Ativar Bluetooth
* Desativar Bluetooth
* Gerenciar dispositivos conectados
* Parear novos dispositivos

Ao retornar ao aplicativo, o status é atualizado automaticamente.

---

### 🚨 Reproduzir Alerta

Reproduz um arquivo de áudio local (`alerta.mp3`) para demonstrar a utilização de recursos sonoros em dispositivos Wear OS.

Exemplos de aplicação:

* Alarmes
* Notificações
* Avisos importantes
* Assistência ao usuário

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia          | Utilização                    |
| ------------------- | ----------------------------- |
| Java                | Desenvolvimento da aplicação  |
| Android Studio      | Ambiente de desenvolvimento   |
| Wear OS             | Plataforma wearable           |
| AudioManager        | Gerenciamento de áudio        |
| AudioDeviceInfo     | Identificação de dispositivos |
| AudioDeviceCallback | Monitoramento dinâmico        |
| MediaPlayer         | Reprodução de áudio           |

---

## 📂 Estrutura do Projeto

```text
app/
├── java/com.domaassist
│   ├── MainActivity.java
│   └── AudioHelper.java
│
├── res
│   ├── layout
│   │   └── activity_main.xml
│   │
│   ├── raw
│   │   └── alerta.mp3
│   │
│   └── values
│       └── strings.xml
│
└── AndroidManifest.xml
```

### 📌 Componentes

#### MainActivity

Responsável pela interface principal e pelas ações do usuário.

#### AudioHelper

Classe responsável pela detecção de dispositivos de saída de áudio.

#### activity_main.xml

Layout principal do aplicativo.

#### alerta.mp3

Arquivo utilizado para demonstração da reprodução sonora.

---

## ▶️ Como Executar

### Pré-requisitos

* Android Studio
* SDK Wear OS
* Emulador Wear OS ou smartwatch compatível

### Instalação

Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

Abra o projeto no Android Studio:

```text
File → Open
```

Aguarde o Gradle sincronizar.

Execute o aplicativo em:

* Emulador Wear OS
* Dispositivo físico compatível

---

## 🧪 Testes Realizados

### Teste 1 — Verificação de Áudio

1. Abrir o aplicativo
2. Pressionar "VERIFICAR ÁUDIO"

Resultado esperado:

```text
Alto-falante: true
Bluetooth: true/false
```

---

### Teste 2 — Bluetooth

1. Pressionar "ABRIR BLUETOOTH"
2. Alterar o estado do Bluetooth
3. Retornar ao aplicativo

Resultado esperado:

```text
Status atualizado automaticamente
```

---

### Teste 3 — Reprodução de Áudio

1. Pressionar "REPRODUZIR ALERTA"

Resultado esperado:

```text
Reprodução do arquivo alerta.mp3
```

---

## 🎓 Contexto Acadêmico

Este projeto foi desenvolvido como requisito avaliativo da disciplina:

### DGT2816 — Interação com Sensores de Smartphones e Wearables

O trabalho demonstra a utilização prática de APIs do Android voltadas para:

* Áudio
* Bluetooth
* Wearables
* Interação com hardware

---

## 👨‍💻 Autor

**Edson Victor Miranda de Oliveira**

Projeto desenvolvido para fins acadêmicos utilizando Android Studio e Wear OS.
