/* Copyright (c) 2013 OpenPlans. All rights reserved.
 * This code is licensed under the BSD New License, available at the root
 * application directory.
 */
package org.geogit.storage.sqlite;

import java.io.File;

import org.geogit.di.GeogitModule;
<<<<<<< HEAD
=======
import org.slf4j.Logger;
>>>>>>> sqlite
import org.sqlite.SQLiteDataSource;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

/**
 * Utility class.
 * 
 * @author Justin Deoliveira, Boundless
 *
 */
public class Xerial {

    /**
<<<<<<< HEAD
=======
     * Logs a (prepared) sql statement.
     * 
     * @param sql Base sql to log.
     * @param log The logger object.
     * @param args Optional arguments to the statement.
     * 
     * @return The original statement.
     */
    public static String log(String sql, Logger log, Object... args) {
        if (log.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder(sql);
            if (args.length > 0) {
                sb.append(";");
                for (int i = 0; i < args.length; i++) {
                    sb.append(i).append("=").append(args[i]).append(", ");
                }
                sb.setLength(sb.length()-2);
            }
            log.debug(sb.toString());
        }
        return sql;
    }

    /**
>>>>>>> sqlite
     * Creates the injector to enable xerial sqlite storage.
     */
    public static Injector injector() {
        return Guice.createInjector(
            Modules.override(new GeogitModule()).with(new XerialSQLiteModule()));
    }

    public static SQLiteDataSource newDataSource(File db) {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:" + db.getAbsolutePath());
        return dataSource;
    }
}
