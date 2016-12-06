package de.fleig.informatik.meldeauskunft.repository;

import java.util.List;

import de.fleig.informatik.meldeauskunft.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}
