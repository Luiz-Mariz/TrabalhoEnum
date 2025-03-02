# Cadastro de Produtos e Simulação de Entrega

Este repositório contém um sistema simples para cadastro e gerenciamento de produtos, além de simular um processo de entrega. O objetivo do código é permitir que os usuários possam cadastrar produtos, verificar sua existência em um arquivo de texto e, em seguida, simular a entrega desses produtos.

## Funcionalidade

O código foi desenvolvido para realizar as seguintes operações:

1. **Cadastro de Produtos:** O sistema permite que o usuário cadastre um produto, inserindo informações como nome, preço e quantidade disponível em estoque.
2. **Verificação de Produto:** O código verifica se um produto já foi cadastrado, procurando pelo nome no arquivo `produtos.txt`. Caso o produto já exista, o sistema informa ao usuário.
3. **Simulação de Entrega:** Após a verificação, o sistema simula o processo de entrega, caso o produto exista no cadastro. Se o produto não for encontrado, o sistema retorna uma mensagem de erro.
4. **Armazenamento em Arquivo:** Como o código não está conectado a um banco de dados, os produtos cadastrados são salvos em um arquivo de texto (`produtos.txt`), permitindo que os dados sejam persistidos entre as execuções do programa.

## Como Funciona

1. **Cadastro dos Produtos:**
   O usuário insere os dados do produto, como o nome, preço e quantidade.
   
2. **Verificação de Existência:**
   O sistema verifica se o produto inserido pelo usuário já foi cadastrado, procurando no arquivo `produtos.txt`. Caso o produto já exista, o status de seu cadastro é retornado ao usuário.

3. **Simulação de Entrega:**
   Após verificar a existência do produto, o sistema simula o processo de entrega. Caso o produto seja encontrado, o sistema confirma que a entrega está sendo processada. Caso contrário, uma mensagem de erro é exibida.

4. **Salvamento dos Produtos:**
   Após o cadastro de um novo produto, ele é salvo no arquivo `produtos.txt` para persistência dos dados. Cada produto é gravado em uma linha do arquivo no formato: `nome, preço, quantidade`.

## Arquivo `produtos.txt`

O arquivo `produtos.txt` é onde os produtos são salvos. Ele já contém dois produtos cadastrados para testes rápidos:

- **Banana** (exemplo de produto)
- **Batata** (exemplo de produto)

Esses itens estão presentes no arquivo desde o início e podem ser usados para testar o código sem a necessidade de cadastrar novos produtos.

## Exemplo de Execução

Quando o código é executado, o usuário será solicitado a inserir os seguintes dados:

1. **Nome do produto**
2. **Preço do produto**
3. **Quantidade do produto**

Após a inserção dessas informações, o sistema realiza as verificações necessárias e salva o novo produto no arquivo `produtos.txt`.

Além disso, o usuário também pode inserir o nome de um produto para simular o processo de entrega. Se o produto estiver no sistema, o processo de entrega é simulado; caso contrário, uma mensagem de erro é retornada.

## Observações

- Este código não utiliza banco de dados. Em vez disso, ele usa um arquivo de texto para armazenar os produtos.
- Os dados são armazenados no arquivo `produtos.txt` de forma simples, no formato CSV, com cada produto representado por uma linha contendo o nome, o preço e a quantidade.

## Como Rodar o Código

1. Clone o repositório:
   ```bash
   git clone https://github.com/Luiz-Mariz/TrabalhoEnum.git
