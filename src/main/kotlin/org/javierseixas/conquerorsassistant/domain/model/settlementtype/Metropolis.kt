package org.javierseixas.conquerorsassistant.domain.model.settlementtype

import org.javierseixas.conquerorsassistant.domain.model.product.Food
import org.javierseixas.conquerorsassistant.domain.model.product.Product
import org.javierseixas.conquerorsassistant.domain.model.terrain.Forest
import org.javierseixas.conquerorsassistant.domain.model.terrain.Mountain

class Metropolis : SettlementType {

    override fun produce(): Product {
        when(this.terrain) {
            Forest -> null
            Mountain -> null
            else -> Food(-2)
        }
    }

    override fun taxes(): Int = 3

    override fun upgrade(): SettlementType {
        throw RuntimeException("Metropolis cannot be upgraded")
    }
}