//package org.springframework.data.jpa.repository.support;
//
//import org.springframework.data.repository.Repository;
//import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
//import org.springframework.data.repository.core.support.RepositoryFactorySupport;
//
///**
// * @author admin_z by 2019/12/13
// * @ClassName MyJpaRepositoryFactoryBean
// */
//public class MyJpaRepositoryFactoryBean<T extends Repository<S, ID>, S, ID> extends RepositoryFactoryBeanSupport<T, S, ID> {
//
//    protected MyJpaRepositoryFactoryBean(Class<? extends T> repositoryInterface) {
//        super(repositoryInterface);
//    }
//
//    @Override
//    protected RepositoryFactorySupport createRepositoryFactory() {
//        return null;
//    }
//}
