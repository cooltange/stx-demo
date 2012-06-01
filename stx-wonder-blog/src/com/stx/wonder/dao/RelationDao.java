package com.stx.wonder.dao;

import java.util.List;
import com.stx.wonder.entity.Relation;

public interface RelationDao {
	public List getRelationList();

	public void addRelation(Relation relation);

	public void delRelation(int id);

	public Relation getRelation(int id );

	public void updateRelation(Relation relation);
}
