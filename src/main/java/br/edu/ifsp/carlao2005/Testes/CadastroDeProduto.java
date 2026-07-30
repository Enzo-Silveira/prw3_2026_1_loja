package br.edu.ifsp.carlao2005.Testes;

import br.edu.ifsp.carlao2005.Modelo.Categoria;
import br.edu.ifsp.carlao2005.Modelo.Produto;
import br.edu.ifsp.carlao2005.dao.CategoriaDao;
import br.edu.ifsp.carlao2005.dao.ProdutoDao;
import br.edu.ifsp.carlao2005.util.JPAUtil;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {

        Categoria celulares = new Categoria("CELULARES");

//        // Criando um objeto da Classe Produto:
//        Produto celular1 = new Produto("Samsung S","Muito caro",new BigDecimal("2700"), celulares);
//        celular1.setNome("Samsung S");
//        celular1.setDescricao("Muito caro");
//        celular1.setPreco( new BigDecimal("2700") );
//
//        // Utilizando a classe JPAUtil para recuperar um EntityManager:
//        EntityManager em1 = JPAUtil.getEntityManager();
//
//        // Criando o ProdutoDao:
//        ProdutoDao dao1 = new ProdutoDao(em1);
//
//        // Iniciando uma transação:
//        em1.getTransaction().begin();
//
//        // Gravando o objeto no banco de dados:
//        dao1.cadastrar(celular1);
//
//        // "Comitando" a transação:
//        em1.getTransaction().commit();
//
//        // Fechando este EntityManager, já que não precisaremos mais dele:
//        em1.close();
//
//        // Criando um objeto da Classe Produto:
//        Produto celular2 = new Produto("Motorola XXX", "Tela pequena",
//                new BigDecimal("700"),
//                celulares);
//
//        EntityManager em2 = JPAUtil.getEntityManager();
//        ProdutoDao dao2 = new ProdutoDao(em2);
//        em2.getTransaction().begin();
//        dao2.cadastrar(celular2);
//        em2.getTransaction().commit();
//        em2.close();
//
//
//        Produto celular3 = new Produto("XIAOMI sei la qual", "Xing Ling",
//                new BigDecimal("1250"), celulares);
//        // Gravando o produto:
//        EntityManager em3 = JPAUtil.getEntityManager();
//        ProdutoDao dao3 = new ProdutoDao(em3);
//        em3.getTransaction().begin();
//        dao3.cadastrar(celular3);
//        em3.getTransaction().commit();
//        em3.close();
//---------------------------------------------------------------
        // Criando a Categoria "CELULARES":
        //Categoria celulares = new Categoria("CELULARES");
        // Criando um objeto da Classe Produto, associado a categoria CELULARES:
//        Produto celular = new Produto("XIAOMI sei la qual", "Xing Ling",
//                new BigDecimal("1250"), celulares);
//        // Gravando Categoria e Produto:
//        EntityManager em = JPAUtil.getEntityManager();
//        // Vamos compartilhar o mesmo EntityManager com as várias classes DAO:
//        ProdutoDao produtoDao = new ProdutoDao(em);
//        CategoriaDao categoriaDao = new CategoriaDao(em);
//        em.getTransaction().begin();
//        categoriaDao.cadastrar(celulares);
//        produtoDao.cadastrar(celular);
//        em.getTransaction().commit();
//        em.close();
//------------------------------------------------------------------------
//        // Criando a Categoria "INFORMATICA".
//        Categoria informatica = new Categoria("INFORMATICA");
//// Criando o EntityManager:
//        EntityManager em = JPAUtil.getEntityManager();
//// Criando o CategoriaDAO:
//        CategoriaDao categoriaDao = new CategoriaDao(em);
//// Iniciando a transação:
//        em.getTransaction().begin();
//// Mudando para o estado managed:
//        em.persist(informatica);
//// Trocando o texto no objeto:
//        informatica.setNome("INFORMATICA & COMPUTAÇÃO");
//// Finalizando a transação:
//        em.getTransaction().commit();
//// Fechando o EntityManager
//        em.close();
//----------------------------------------------------------------------------
//        // Criando a Categoria "ELETRO".
//        Categoria informatica = new Categoria("ELETRO");
//        EntityManager em = JPAUtil.getEntityManager();
//        CategoriaDao categoriaDao = new CategoriaDao(em);
//// Iniciando a transação:
//        em.getTransaction().begin();
//// Mudando para o estado managed:
//        em.persist(informatica);
//// Trocando o texto no objeto:
//        informatica.setNome("ELETRO antes commit");
//// Finalizando a transação:
//        em.getTransaction().commit();
//// Fechando o EntityManager
//        em.close();
//// Trocando o texto no objeto:
//        informatica.setNome("ELETRO depois close");

//----------------------------------------------------------------------------

//        // Criando a Categoria "ESPORTE":
//        Categoria esporte = new Categoria("ESPORTE");
//        EntityManager em = JPAUtil.getEntityManager();
//        CategoriaDao categoriaDao = new CategoriaDao(em);
//// Iniciando a transação:
//        em.getTransaction().begin();
//// Mudando para o estado managed:
//        em.persist(esporte);
//// Trocando o texto no objeto:
//        esporte.setNome("ESPORTE atualizado");
//// Não vamos fechar a transação....
//// Vamos atualizar com flush():
//        em.flush();
//// Vamos tornar 'esporte' detached:
//        em.clear();
//// Precisamos agora alterar o nome... Como voltar de detached para managed?
//// Usamos o método merge().
//// Atenção! Não basta usar o método, precisa "renovar" a referência!
//        esporte = em.merge(esporte);
//// Trocando o texto no objeto:
//        esporte.setNome("ESPORTE depois de merge");
//// Finalizando a transação:
//        em.getTransaction().commit();
//// Fechando o EntityManager
//        em.close();

//----------------------------------------------------------------------------

        // Criando a Categoria "ESPORTE2":
        Categoria esporte = new Categoria("ESPORTE2");
        EntityManager em = JPAUtil.getEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(em);
// Iniciando a transação:
        em.getTransaction().begin();
// Mudando para o estado managed:
        em.persist(esporte);
// Trocando o texto no objeto:
        esporte.setNome("ESPORTE2 atualizado");
// Apagando...
        em.remove(esporte);
// Finalizando a transação:
        em.getTransaction().commit();
// Fechando o EntityManager
        em.close();
    }
}
