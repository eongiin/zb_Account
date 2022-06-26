package com.eongiin.account.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountUser extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
