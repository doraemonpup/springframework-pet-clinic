package net.puppu.springframeworkpetclinic.services;

import net.puppu.springframeworkpetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
