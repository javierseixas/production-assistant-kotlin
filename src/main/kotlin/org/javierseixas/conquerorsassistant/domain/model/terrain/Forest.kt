package org.javierseixas.conquerorsassistant.domain.model.terrain

import org.javierseixas.conquerorsassistant.domain.model.product.Product
import org.javierseixas.conquerorsassistant.domain.model.product.Wood

class Forest : Terrain {

    override fun produce(quantity: Int): Product = Wood(quantity)
}