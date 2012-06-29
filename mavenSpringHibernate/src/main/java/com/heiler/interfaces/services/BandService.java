package com.heiler.interfaces.services;

import java.util.List;

import com.heiler.interfaces.entities.Band;

/**
 * @author sbeutel
 *
 */
public interface BandService
{
  /**
   * Returns a list of all bands.
   * @return
   */
  public List< Band > getAllBands();

  /**
   * Returns the band with a given id.
   * @param id
   * @return
   */
  public Band getBand( int id );

}
