package com.zespolowka.repository;

import com.zespolowka.entity.createTest.Test;
import com.zespolowka.entity.solutionTest.SolutionTest;
import com.zespolowka.entity.user.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


public class SolutionTestRepositoryImpl implements CustomSolutionTestRepository {
    @PersistenceContext
    private EntityManager em;

    public SolutionTestRepositoryImpl() {
    }


    @Override
    public SolutionTest getSolutionWithTheBestResult(Test test, User user) {
        String sql = "select s from SolutionTest s where s.points=(select max(g.points) from SolutionTest g where (g.test=:test and g.user=:user))";
        Query query = em.createQuery(sql).setMaxResults(1);
        query.setParameter("test", test);
        query.setParameter("user", user);
        return (SolutionTest) query.getSingleResult();
    }

    @Override
    public List<SolutionTest> getSolutionsWithTheBestResult(User user) {
        String sql = "select s from SolutionTest s where s.points = " +
                "(select max(g.points) from SolutionTest g where (g.user=:user and g.test=s.test) group by g.test)";
        Query query = em.createQuery(sql);
        query.setParameter("user", user);
        return query.getResultList();
    }
}