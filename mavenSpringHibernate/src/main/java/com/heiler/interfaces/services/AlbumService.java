package com.heiler.interfaces.services;

import java.util.List;

import com.heiler.interfaces.entities.Album;

/**
 * @author sbeutel
 *
 */
public interface AlbumService
{
  /**
   * Returns the album with a given id.
   * @param id
   * @return
   */
  public Album getAlbum( int id );

  /**
   * Returns all albums from a band.
   * @param bandId
   * @return
   */
  public List< Album > getAlbumsFromBand( int bandId );

  /**
   * Returns all albums.
   * @return
   */
  public List< Album > getAllAlbums();
}
