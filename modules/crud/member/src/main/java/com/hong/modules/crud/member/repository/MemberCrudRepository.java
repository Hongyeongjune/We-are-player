package com.hong.modules.crud.member.repository;

import com.hong.modules.crud.member.entitys.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberCrudRepository extends JpaRepository<Member, String> {
}
