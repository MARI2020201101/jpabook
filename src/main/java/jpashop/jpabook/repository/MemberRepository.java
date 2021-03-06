package jpashop.jpabook.repository;

import jpashop.jpabook.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MemberRepository {

    @Autowired
    private EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findOne(Long id){
        return em.find(Member.class, id);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m",Member.class)
                .getResultList();
    }

    public List<Member> findByName(String name){
       return em.createQuery("select m from Member m where m.name = :name")
                .setParameter("name",name)
                .getResultList();
    }
}
