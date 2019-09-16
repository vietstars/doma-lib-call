package domalib.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.experimental.Sql;
import org.seasar.doma.boot.ConfigAutowireable;

import domalib.entity.AccountEntity;

@Dao
@ConfigAutowireable
public interface AccountDao {
	
    @Sql("select /*%expand*/* from account where id = /* id */1")//and is_deleted = 0
    @Select
	AccountEntity findOne(Long id);

    
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    @Insert
//    int insert(Account entity);
//
//    
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    @Update
//    int update(Account entity);
//
//
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    @Delete
//    int deletePhysically(Account paramAccount);
//
//    
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    default int delete(Account entity) {
//        entity.setIsDeleted(Integer.valueOf(1));
//        return update(entity);
//    }
//
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    @BatchInsert
//    int[] insert(Iterable<Account> paramIterable);
//
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    @BatchUpdate
//    int[] update(Iterable<Account> paramIterable);
//
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    @BatchDelete
//    int[] deletePhysically(Iterable<Account> paramIterable);
//
//    @Sql("select /*%expand*/* from account where id = /* id */1 and is_deleted = 0")
//    default int[] delete(Iterable<Account> entities) {
//        entities.forEach(entity -> entity.setIsDeleted(Integer.valueOf(1)));
//        return update(entities);
//    }
}
