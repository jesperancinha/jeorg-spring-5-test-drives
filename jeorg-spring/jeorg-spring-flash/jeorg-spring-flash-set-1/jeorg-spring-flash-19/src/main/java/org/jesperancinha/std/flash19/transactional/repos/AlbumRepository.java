package org.jesperancinha.std.flash19.transactional.repos;

import org.jesperancinha.std.flash19.transactional.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findAlbumByArtistLike(String artist);
}
