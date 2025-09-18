# 🐕🫧 PetShop Manager

Um simples gerenciador de PetShop via console, desenvolvido em Java.

## 📋 Descrição

Este projeto é um sistema de console que simula a gestão das operações de banho em um pet shop. Ele permite ao usuário interagir com uma "máquina de banho" virtual para pets, gerenciando recursos como água e shampoo, e realizando ações como dar banho, adicionar e remover pets.

## ❗ Como Executar

### ⚙️ Pré-requisitos

* JDK (Java Development Kit) instalado. A versão 21 foi utilizada no desenvolvimento.
* Um ambiente de desenvolvimento Java (IDE) como IntelliJ IDEA, Eclipse ou VS Code, ou compilação via linha de comando.

### ⌨️ Execução via Linha de Comando

1.  Navegue até a pasta `src` do projeto.
2.  Compile os arquivos Java:

    ```bash
    javac *.java
    ```
3.  Execute a classe principal:

    ```bash
    java Main
    ```

### 🖱️ Execução via IDE

1.  Importe o projeto na sua IDE.
2.  Localize o arquivo `Main.java` e execute-o.

## 🎯 Funcionalidades

O sistema oferece um menu com as seguintes opções:

-   **1 - Banho no Pet:** Inicia o processo de banho no pet que está na máquina.
-   **2 - Abastecer máquina com água:** Adiciona mais água ao reservatório da máquina.
-   **3 - Abastecer máquina com shampoo:** Adiciona mais shampoo ao reservatório da máquina.
-   **4 - Verificar água da máquina:** Mostra a quantidade atual de água na máquina.
-   **5 - Verificar shampoo da máquina:** Mostra a quantidade atual de shampoo na máquina.
-   **6 - Verificar se há Pet no banho:** Informa se há um pet atualmente na máquina.
-   **7 - Colocar Pet na máquina:** Permite adicionar um pet à máquina, inserindo seu nome.
-   **8 - Retirar Pet da máquina:** Remove o pet da máquina.
-   **9 - Limpar a máquina:** Executa um ciclo de limpeza da própria máquina.
-   **0 - Encerrar sistema:** Finaliza a execução do programa.
