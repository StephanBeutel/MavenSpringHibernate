package com.heiler.interfaces.entities;

/**
 * @author sbeutel
 *
 */
public interface Album
{
  /**
   * Returns the id of the Album
   * @return
   */
  public int getId();

  /**
   * Returns the id of the band the album belongs to.
   * @return
   */
  public int getBandId();

  /**
   * Return the album name.
   * @return
   */
  public String getName();

  /**
   * Return the album release year.
   * @return
   */
  public String getYear();
}
