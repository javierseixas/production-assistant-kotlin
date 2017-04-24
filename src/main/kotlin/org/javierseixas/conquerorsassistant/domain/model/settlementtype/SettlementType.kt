package org.javierseixas.conquerorsassistant.domain.model.settlementtype

import org.javierseixas.conquerorsassistant.domain.model.product.Product
import org.javierseixas.conquerorsassistant.domain.model.terrain.Terrain

// TODO Implements terrain
abstract class SettlementType(val terrain : Terrain) {

    abstract fun produce() : Product

    abstract fun upgrade() : SettlementType

    abstract fun taxes() : Int
}