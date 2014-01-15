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
@javax.persistence.Table(name = "agent", schema = "dstack")
public class AgentRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.AgentRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record11<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.Agent {

	private static final long serialVersionUID = -1399121374;

	/**
	 * Setter for <code>dstack.agent.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.agent.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.agent.name</code>. 
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.agent.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.agent.description</code>. 
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.agent.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.agent.kind</code>. 
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.agent.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.agent.data</code>. 
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.agent.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(4);
	}

	/**
	 * Setter for <code>dstack.agent.agent_group_id</code>. 
	 */
	@Override
	public void setAgentGroupId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.agent.agent_group_id</code>. 
	 */
	@javax.persistence.Column(name = "agent_group_id", precision = 19)
	@Override
	public java.lang.Long getAgentGroupId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>dstack.agent.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.agent.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>dstack.agent.uri</code>. 
	 */
	@Override
	public void setUri(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.agent.uri</code>. 
	 */
	@javax.persistence.Column(name = "uri", length = 255)
	@Override
	public java.lang.String getUri() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.agent.account_id</code>. 
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.agent.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>dstack.agent.created</code>. 
	 */
	@Override
	public void setCreated(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.agent.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>dstack.agent.uuid</code>. 
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dstack.agent.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field5() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.AGENT_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.URI;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT.UUID;
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
		return getKind();
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
	public java.lang.Long value6() {
		return getAgentGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getUri();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value3(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value4(java.lang.String value) {
		setKind(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value5(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value6(java.lang.Long value) {
		setAgentGroupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value7(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value8(java.lang.String value) {
		setUri(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value9(java.lang.Long value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value10(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord value11(java.lang.String value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AgentRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.util.Map<String,Object> value5, java.lang.Long value6, java.lang.String value7, java.lang.String value8, java.lang.Long value9, java.sql.Timestamp value10, java.lang.String value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.Agent from) {
		setId(from.getId());
		setName(from.getName());
		setDescription(from.getDescription());
		setKind(from.getKind());
		setData(from.getData());
		setAgentGroupId(from.getAgentGroupId());
		setState(from.getState());
		setUri(from.getUri());
		setAccountId(from.getAccountId());
		setCreated(from.getCreated());
		setUuid(from.getUuid());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.Agent> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AgentRecord
	 */
	public AgentRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT);
	}

	/**
	 * Create a detached, initialised AgentRecord
	 */
	public AgentRecord(java.lang.Long id, java.lang.String name, java.lang.String description, java.lang.String kind, java.util.Map<String,Object> data, java.lang.Long agentGroupId, java.lang.String state, java.lang.String uri, java.lang.Long accountId, java.sql.Timestamp created, java.lang.String uuid) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.AgentTable.AGENT);

		setValue(0, id);
		setValue(1, name);
		setValue(2, description);
		setValue(3, kind);
		setValue(4, data);
		setValue(5, agentGroupId);
		setValue(6, state);
		setValue(7, uri);
		setValue(8, accountId);
		setValue(9, created);
		setValue(10, uuid);
	}
}
