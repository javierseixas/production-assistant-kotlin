package org.javierseixas.conquerorsassistant.domain.model.terrain

import org.javierseixas.conquerorsassistant.domain.model.product.Product

interface Terrain {
    fun produce(quantity : Int): Product
}