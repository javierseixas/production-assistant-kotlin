package org.javierseixas.conquerorsassistant.domain.model

import org.javierseixas.conquerorsassistant.domain.model.product.Product
import org.javierseixas.conquerorsassistant.domain.model.settlementtype.SettlementType
import org.javierseixas.conquerorsassistant.domain.model.terrain.Terrain

class Settlement(val terrain: Terrain, var type: SettlementType) {

    fun upgrade() {
        type = type.upgrade()
    }

    fun production() : Product {
        // TODO how to return the Product? Product(quantity)?
        return type.produce()
    }

    fun taxes() {
        type.taxes()
    }
}