package org.jesperancinha.std.mastery2.portuguese.music.api;

import org.jesperancinha.std.mastery2.portuguese.music.model.Artist;

import java.util.List;

public interface ArtistService {
     List<Artist> listArtists();

     Artist getArtistByName(String name);
}
