package com.example.cadastro

class Formulario(var nome: String?,
                 var telefone: String?,
                 var email: String?,
                 var sexo: String?,
                 var cidade: String?,
                 var uf: String?) {

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Telefone: $telefone\n" +
                "Email: $email\n" +
                "Sexo: $sexo\n" +
                "Cidade: $cidade\n" +
                "UF: $uf"
    }

}