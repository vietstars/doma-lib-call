package domalib.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    
    @Column(name = "email")
    public String email;

    
    @Column(name = "password")
    public String password;


    @Column(name = "gender")
    public String gender;


    @Column(name = "status")
    public Integer status;
    
}
