package net.puppu.springframeworkpetclinic.services;

import net.puppu.springframeworkpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
