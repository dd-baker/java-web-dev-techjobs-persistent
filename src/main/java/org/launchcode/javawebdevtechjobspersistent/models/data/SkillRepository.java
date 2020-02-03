package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.springframework.stereotype.Repository;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}