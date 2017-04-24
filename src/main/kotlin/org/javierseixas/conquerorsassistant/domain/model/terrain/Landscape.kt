package org.javierseixas.conquerorsassistant.domain.model.terrain

import org.javierseixas.conquerorsassistant.domain.model.product.Food
import org.javierseixas.conquerorsassistant.domain.model.product.Product

class Landscape : Terrain {
    override fun produce(quantity : Int): Product = Food(quantity)
}