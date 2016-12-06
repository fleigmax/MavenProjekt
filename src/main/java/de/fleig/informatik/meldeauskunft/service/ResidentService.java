package de.fleig.informatik.meldeauskunft.service;

import java.util.List;

import de.fleig.informatik.meldeauskunft.domain.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentService {

  Resident getUniqueResident(Resident filterResident) throws ResidentServiceException;

  List<Resident> getFilteredResidentsList(Resident filterResident);

}
