# DomaAssist - Wear OS

## Descrição

O DomaAssist é um aplicativo desenvolvido para Wear OS como atividade prática da disciplina **DGT2816 – Interação com Sensores de Smartphones e Wearables**.

O objetivo do projeto é demonstrar a utilização de recursos de áudio e Bluetooth em dispositivos vestíveis (Wear OS), permitindo verificar saídas de áudio disponíveis, acessar as configurações Bluetooth e reproduzir alertas sonoros.

---

## Funcionalidades

### Verificar Áudio

Permite verificar a disponibilidade de dispositivos de saída de áudio no wearable.

O aplicativo identifica:

* Alto-falante interno (Built-in Speaker)
* Estado do Bluetooth

As informações são exibidas diretamente na interface do aplicativo.

---

### Abrir Bluetooth

Abre a tela de configurações Bluetooth do Wear OS.

O usuário pode:

* Ativar Bluetooth
* Desativar Bluetooth
* Gerenciar conexões Bluetooth

Ao retornar para o aplicativo, o status é atualizado automaticamente.

---

### Reproduzir Alerta

Reproduz um arquivo de áudio armazenado localmente no aplicativo.

Esta funcionalidade simula alertas sonoros que podem ser utilizados para:

* Notificações
* Avisos importantes
* Alarmes
* Assistência ao usuário

---

## Tecnologias Utilizadas

* Java
* Android Studio
* Wear OS
* AudioManager
* AudioDeviceInfo
* AudioDeviceCallback
* MediaPlayer

---

## Estrutura do Projeto

### MainActivity

Responsável pela interface principal e pelas interações do usuário.

### AudioHelper

Classe auxiliar responsável por identificar dispositivos de saída de áudio disponíveis.

### activity_main.xml

Layout principal do aplicativo.

### alerta.mp3

Arquivo de áudio utilizado para demonstração da reprodução sonora.

---

## Como Executar

### Pré-requisitos

* Android Studio
* SDK Wear OS
* Emulador Wear OS ou dispositivo físico compatível

### Passos

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Abra o projeto no Android Studio.

3. Aguarde o Gradle sincronizar.

4. Inicie um emulador Wear OS.

5. Execute o projeto clicando em Run.

---

## Como Testar

### Teste 1 - Verificação de Áudio

1. Abra o aplicativo.
2. Clique em "VERIFICAR ÁUDIO".
3. Verifique as informações exibidas na tela.

Resultado esperado:

```text
Alto-falante: true
Bluetooth: true/false
```

---

### Teste 2 - Bluetooth

1. Clique em "ABRIR BLUETOOTH".
2. Ative ou desative o Bluetooth.
3. Retorne ao aplicativo.

Resultado esperado:

O status do Bluetooth deve ser atualizado automaticamente.

---

### Teste 3 - Reprodução de Alerta

1. Clique em "REPRODUZIR ALERTA".

Resultado esperado:

O arquivo de áudio deve ser reproduzido pelo dispositivo.

---

## Objetivo Acadêmico

Este projeto foi desenvolvido como requisito da disciplina:

**DGT2816 – Interação com Sensores de Smartphones e Wearables**

Demonstrando o uso de recursos de áudio, Bluetooth e interação com dispositivos Wear OS.

---

## Autor

Edson Victor
