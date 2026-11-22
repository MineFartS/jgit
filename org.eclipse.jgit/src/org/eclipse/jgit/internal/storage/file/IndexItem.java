/*
 * Copyright (C) 2026, Phil Hunt <philiphuntiv@gmail.com>
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0 which is available at
 * https://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.eclipse.jgit.internal.storage.file;

import org.eclipse.jgit.lib.ObjectId;

/**
 * Represents a file entry in the repository's HEAD commit tree.
 */
public class IndexItem {

    /**
     * Normalized repository-relative path prefixed with a leading slash (e.g., {@code "/src/Main.java"}).
     */
    public String path;

    /**
     * Git SHA-1/SHA-256 object identifier of the file blob.
     */
    public ObjectId objectId;

    /**
     * Uncompressed size of the file blob in bytes.
     */
    public long size;
}

