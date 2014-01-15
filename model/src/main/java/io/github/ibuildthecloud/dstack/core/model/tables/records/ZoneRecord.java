/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "zone", schema = "dstack")
public class ZoneRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.ZoneRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.Zone {

	private static final long serialVersionUID = 600550500;

	/**
	 * Setter for <code>dstack.zone.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.zone.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.zone.name</code>. 
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.zone.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 128)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.zone.description</code>. 
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.zone.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.zone.uuid</code>. 
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.zone.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.zone.data</code>. 
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.zone.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(4);
	}

	/**
	 * Setter for <code>dstack.zone.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.zone.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field5() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value5() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord value3(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord value4(java.lang.String value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord value5(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord value6(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.util.Map<String,Object> value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.Zone from) {
		setId(from.getId());
		setName(from.getName());
		setDescription(from.getDescription());
		setUuid(from.getUuid());
		setData(from.getData());
		setState(from.getState());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.Zone> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ZoneRecord
	 */
	public ZoneRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE);
	}

	/**
	 * Create a detached, initialised ZoneRecord
	 */
	public ZoneRecord(java.lang.Long id, java.lang.String name, java.lang.String description, java.lang.String uuid, java.util.Map<String,Object> data, java.lang.String state) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.ZoneTable.ZONE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, description);
		setValue(3, uuid);
		setValue(4, data);
		setValue(5, state);
	}
}
