package com.heiler.interfaces.entities;

import java.util.List;

/**
 * @author sbeutel
 *
 */
public interface Band
{
  /**
   * Returns the id of the Album
   * @return
   */
  public int getId();

  /**
   * Returns the name of the band.
   * @return
   */
  public String getName();

  /**
   * Returns the members of the band.
   * @return
   */
  public List< String > getMembers();

  /**
   * Returns the year the band was founded.
   * @return
   */
  public int getFoundingYear();

  /**
   * Returns the year teh band broke up.
   * @return
   */
  public int getBreakupYear();
}
