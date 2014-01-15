/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord> {

	private static final long serialVersionUID = 255662783;

	/**
	 * The singleton instance of <code>dstack.host</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.HostTable HOST = new io.github.ibuildthecloud.dstack.core.model.tables.HostTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord.class;
	}

	/**
	 * The column <code>dstack.host.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.host.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.host.kind</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.host.state</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.host.created</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>dstack.host.removed</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.host.data</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this);

	/**
	 * The column <code>dstack.host.uuid</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this);

	/**
	 * The column <code>dstack.host.description</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.host.agent_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.Long> AGENT_ID = createField("agent_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>dstack.host</code> table reference
	 */
	public HostTable() {
		super("host", io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.host</code> table reference
	 */
	public HostTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.model.tables.HostTable.HOST);
	}

	private HostTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord> aliased) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_HOST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_HOST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.HostRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.HOST_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.HostTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.HostTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.github.ibuildthecloud.dstack.core.model.tables.HostTable rename(java.lang.String name) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.HostTable(name, null);
	}
}
