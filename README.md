# CP1 - API de Gerenciamento de Biblioteca

## 👥 Integrantes do Grupo

<table>
  <tr>
    <td width="130">
      <img src="https://github.com/moisesBarsoti.png" width="120" style="border-radius: 50%;"/>
    </td>
    <td>
      <b>Moisés Barsoti Andrade de Oliveira</b><br/>
      <b>RM:</b> 565049 &nbsp;&nbsp;|&nbsp;&nbsp;<b>Turma:</b> 2TDSPG - FIAP <br/>
    </td>
  </tr>

  <tr>
    <td width="130">
      <img src="https://github.com/sSofia-s.png" width="120" style="border-radius: 50%;"/>
    </td>
    <td>
      <b>Sofia Siqueira Fontes</b><br/>
      <b>RM:</b> 563829 &nbsp;&nbsp;|&nbsp;&nbsp;<b>Turma:</b> 2TDSPG - FIAP <br/>
    </td>
  </tr>

  <tr>
    <td width="130">
      <img src="https://github.com/lunaguima.png" width="120" style="border-radius: 50%;"/>
    </td>
    <td>
      <b>Luna de Carvalho Guimarães</b><br/>
      <b>RM:</b> 562290 &nbsp;&nbsp;|&nbsp;&nbsp;<b>Turma:</b> 2TDSPG - FIAP <br/>
    </td>
  </tr>
</table>

---

## 📚 Domínio Escolhido

O domínio escolhido para o projeto foi **Biblioteca**.
Uma API com o objetivo de gerenciar uma biblioteca, permitindo o cadastro de livros e autores, além do controle de disponibilidade dos livros.

---

## 🗂️ Entidades Modeladas
As entidades modeladas no sistema foram:

* **📕 Book (Livro):**
  Representa os livros disponíveis na biblioteca.

* **👤 Author (Autor):**
  Responsável por representar o autor das obras cadastradas.

---

## 🔗 Endpoints - Book

| Método | Rota           | Descrição                     |
| ------ | -------------- | ----------------------------- |
| GET    | /books         | Listar livros                 |
| GET    | /books/{id}    | Buscar livro por Id           |
| POST   | /books         | Cadastrar livro               |
| PUT    | /books/{id}    | Atualizar livro               |
| DELETE | /books/{id     | Excluir livro                 |

---

## 🔗 Endpoints - Author

| Método | Rota           | Descrição                     |
| ------ | -------------- | ----------------------------- |
| GET    | /authors       | Listar autores                |
| GET    | /authors/{id}  | Buscar autor por Id           |
| POST   | /authors       | Cadastrar autor               |
| PUT    | /authors/{id}  | Atualizar autor               |
| DELETE | /authors/{id}  | Excluir autor                 |

---

## 🌐 Endpoints - Insomnia
Siga os passos abaixo para abrir o arquivo de Teste dos Endpoints no seu aplicativo Insomnia:

### ✅ Passos para execução

1. **Baixe o arquivo do drive pelo link:**
   <a href="https://drive.google.com/file/d/1Y2G4aUXG9kgjkACH9bXIWuoKIdraN_bY/view?usp=drive_link" target="_blank" rel="noopener noreferrer">Clique aqui para baixar o arquivo de teste.</a>  
<br/>

2. **Abra o arquivo no Insomnia.**  
   2.1 - Após baixar o arquivo abra o Insomnia.
   <br/>
   
   2.2 - Clique em **Import**:
   <br/>
   <img src="https://res.cloudinary.com/dt26mfzpw/image/upload/v1774619071/insomnia-print_gaa1p1.png" width="700" height="800">
   <br/>
   
   2.3 - Adicione o arquivo e depois clique em **Scan**:
   <br/>
   <img src="https://res.cloudinary.com/dt26mfzpw/image/upload/v1774619073/insomnia-print2_nipkyw.png" width="700" height="800">
   <br/>
   
   2.4 - Verifique se o arquivo está correto e clique em **Import**:
   <br/>
   <img src="https://res.cloudinary.com/dt26mfzpw/image/upload/v1774620799/insomnia-print3_rbuwkc.png" width="700" height="800">
   <br/>
<br/>

3. **Faça os testes dos Endpoints.**
   <br/>
   <img src="https://res.cloudinary.com/dt26mfzpw/image/upload/v1774620858/insomnia-print4_eoewpn.png" width="700" height="800"> 
<br/>

---
