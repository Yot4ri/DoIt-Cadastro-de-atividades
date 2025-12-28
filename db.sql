use doIt;

/*criação de cada tabela*/
CREATE TABLE IF NOT EXISTS Acessibilidade (
    Id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    descricao VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Usuario (
    Id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Id_acessibilidade INT,
     FOREIGN KEY (id_acessibilidade) 
		REFERENCES Acessibilidade(Id)
);

CREATE TABLE IF NOT EXISTS Atividade (
    Id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Descricao VARCHAR(255) NOT NULL,
    Data DATE NOT NULL,
    id_usuario INT NOT NULL,
    
    FOREIGN KEY (id_usuario)
        REFERENCES Usuario (Id)
);

/*Cria o index de pesquisa para a relação de atividade-usuário (N-N)*/
create index idx_atividade_usuario_id on Atividade(id_usuario);

/*Cria o index de pesquisa para a relação de acessibilidade-usuário*/
create index idx_acessibilidade_usuario on Usuario(Id_acessibilidade);