package com.zcc.spingcloud.domin;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.internal.util.Cloneable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "db_payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends Cloneable implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private Date createDate;
    @Column
    private Date updateDate;
    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="db_payment_attribute", joinColumns=@JoinColumn(name="attr_id"))
    Map<String, String> attributes = new HashMap<String, String>(); // maps from attribute name to value
}
