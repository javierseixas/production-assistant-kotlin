package org.javierseixas.conquerorsassistant.domain.model.settlementtype

import org.javierseixas.conquerorsassistant.domain.model.product.Food
import org.javierseixas.conquerorsassistant.domain.model.product.Product
import org.javierseixas.conquerorsassistant.domain.model.terrain.Forest
import org.javierseixas.conquerorsassistant.domain.model.terrain.Mountain
import org.javierseixas.conquerorsassistant.domain.model.terrain.Terrain

class City(terrain: Terrain) : SettlementType(terrain) {

    override fun produce(): Product {
        when(this.terrain) {
            Forest -> null
            Mountain -> null
            else -> Food(-1)
        }
    }

    override fun taxes(): Int = 2

    override fun upgrade() : SettlementType = Metropolis()
}