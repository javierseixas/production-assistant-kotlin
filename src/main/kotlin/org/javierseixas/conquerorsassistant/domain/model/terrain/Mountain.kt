package org.javierseixas.conquerorsassistant.domain.model.terrain

import org.javierseixas.conquerorsassistant.domain.model.product.Product
import org.javierseixas.conquerorsassistant.domain.model.product.Stone

class Mountain : Terrain {
    override fun produce(quantity : Int): Product = Stone(quantity)
}