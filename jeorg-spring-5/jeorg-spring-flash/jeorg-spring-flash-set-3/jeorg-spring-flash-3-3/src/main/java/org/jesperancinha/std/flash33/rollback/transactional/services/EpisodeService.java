package org.jesperancinha.std.flash33.rollback.transactional.services;

import org.jesperancinha.std.flash33.rollback.transactional.domain.Episode;

import java.util.List;

public interface EpisodeService {

    void createEpisode(final Episode episode);

    void createEpisodeExceptionRollback(final Episode episode);

    void createEpisodeExceptionNoRollback(final Episode episode);

    void createEpisodeMixRollback(final Episode episode);

    void createEpisodeMixNoRollback(final Episode episode);

    Episode getEpisodeById(final Long id);

    List<Episode> getAllEpisodes();
}
