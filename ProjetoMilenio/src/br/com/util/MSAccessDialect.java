/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.util;

/**
 *
 * @author Elton
 */
import java.sql.Types;

import org.hibernate.cfg.Environment;
import org.hibernate.dialect.Dialect;

public class MSAccessDialect extends Dialect {
    public MSAccessDialect() {
        super();
        registerColumnType(Types.BIT, "BIT");
        registerColumnType(Types.BIGINT, "INTEGER");
        registerColumnType(Types.SMALLINT, "SMALLINT");
        registerColumnType(Types.TINYINT, "BYTE");
        registerColumnType(Types.INTEGER, "INTEGER");
        registerColumnType(Types.CHAR, "VARCHAR(1)");
        registerColumnType(Types.VARCHAR, "VARCHAR($l)");
        registerColumnType(Types.FLOAT, "DOUBLE");
        registerColumnType(Types.DOUBLE, "DOUBLE");
        registerColumnType(Types.DATE, "DATETIME");
        registerColumnType(Types.TIME, "DATETIME");
        registerColumnType(Types.TIMESTAMP, "DATETIME");
        registerColumnType(Types.VARBINARY, "VARBINARY($l)");
        registerColumnType(Types.NUMERIC, "NUMERIC");

        getDefaultProperties().setProperty(Environment.STATEMENT_BATCH_SIZE,
                "0");
    }

    public String getIdentityColumnString() {
        return "AutoNumber NOT NULL";
    }

    public String getIdentitySelectString() {
        return "select @@IDENTITY";
    }

}
