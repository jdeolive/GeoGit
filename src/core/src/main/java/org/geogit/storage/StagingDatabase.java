/* Copyright (c) 2013 OpenPlans. All rights reserved.
 * This code is licensed under the BSD New License, available at the root
 * application directory.
 */
package org.geogit.storage;

import java.util.List;

import javax.annotation.Nullable;

import org.geogit.api.plumbing.merge.Conflict;

import com.google.common.base.Optional;

/**
 * Provides an interface for GeoGit staging databases.
 * 
 */
public interface StagingDatabase extends ObjectDatabase {

    public Optional<Conflict> getConflict(String st);

    public List<Conflict> getConflicts(@Nullable String pathFilter);

    public void addConflict(Conflict conflict);

    public void removeConflict(String path);

    public void removeConflicts();

}