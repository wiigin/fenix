package com.blinkfox.fenix.entity.ar;

import com.blinkfox.fenix.ar.repo.JpaModel;
import com.blinkfox.fenix.repository.ar.ArJpaRepository;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

/**
 * 用来测试 Active Record 的实体类，本实体类继承自 {@link JpaModel}.
 *
 * @author blinkfox on 2022-03-29.
 * @since 2.7.0
 */
@Getter
@Setter
@Accessors(chain = true)
@Entity
@Proxy(lazy = false)
@Table(name = "t_ar_jpa")
public class ArJpa implements JpaModel<ArJpa, String, ArJpaRepository> {

    /**
     * ID.
     */
    @Id
    @Column(name = "c_id")
    @GeneratedValue(generator = "nanoId")
    @GenericGenerator(name = "nanoId", strategy = "com.blinkfox.fenix.id.NanoIdGenerator")
    private String id;

    /**
     * 名称.
     */
    @Column(name = "c_name")
    private String name;

}
