package com.clothingfly.catalog;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
    @Modifying
    @Transactional
    @Query(value="update ORDERS i set i.INVENTORY = (i.INVENTORY - :quantity) where i.id = :id", nativeQuery = true)
    void updateInventory(@Param(value = "id") long id, @Param(value = "quantity") long quantity);
}
