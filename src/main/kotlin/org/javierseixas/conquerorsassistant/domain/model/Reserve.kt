package org.javierseixas.conquerorsassistant.domain.model

interface Reserve

class CurrentReserve : Reserve {
    // TODO Should be listening all upgrades
}

class EstimatedReserve : Reserve {
    // TODO Should be listening all production and costs estimations
}