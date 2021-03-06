package org.mozilla.osmdroid.tileprovider.constants;

import java.io.File;

/**
 * This class contains constants used by the tile provider.
 *
 * @author Neil Boyd
 */
public interface OSMConstants {

    public static final boolean DEBUGMODE = false;
    public static final boolean DEBUG_TILE_PROVIDERS = false;

    /**
     * Minimum Zoom Level
     */
    public static final int MINIMUM_ZOOMLEVEL = 0;

    /**
     * Maximum Zoom Level - we use Integers to store zoom levels so overflow happens at 2^32 - 1,
     * but we also have a tile size that is typically 2^8, so (32-1)-8-1 = 22
     */
    public static final int MAXIMUM_ZOOMLEVEL = 22;

    /**
     * Base path for osmdroid files. Zip files are in this folder.
     */
    public static final File OSMDROID_PATH = TileFilePath.getStorageDirectory();

    /**
     * Base path for tiles.
     */
    public static final File TILE_PATH_BASE = new File(OSMDROID_PATH, "tiles");

    /**
     * add an extension to files on sdcard so that gallery doesn't index them
     */
    public static final String TILE_PATH_EXTENSION = ".tile";

    /**
     * Initial tile cache size. The size will be increased as required by calling {@link
     * LRUMapTileCache.ensureCapacity(int)} The tile cache will always be at least 3x3.
     */
    // @TODO vng: this number is too small for most devices and needs
    // to be computed at runtime based on tilesize and screen
    // resolution. It impacts LruMapTileCache which is already bug
    // ridden.
    public static final int CACHE_MAPTILECOUNT_DEFAULT = 9;

    public static final int NUMBER_OF_IO_THREADS = 8;

    public static final int TILE_FILESYSTEM_MAXIMUM_QUEUE_SIZE = 40;
    /**
     * 600 Mb
     */
    public static final long TILE_MAX_CACHE_SIZE_BYTES = 600L * 1024 * 1024;

    /**
     * 500 Mb
     */
    public static final long TILE_TRIM_CACHE_SIZE_BYTES = 500L * 1024 * 1024;

    String MERGED_FILE_EXT = ".merged";
}
