/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "storage_pool", schema = "dstack")
public interface StoragePool extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.storage_pool.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.storage_pool.uuid</code>. 
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>dstack.storage_pool.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 255)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>dstack.storage_pool.name</code>. 
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.storage_pool.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.storage_pool.description</code>. 
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>dstack.storage_pool.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>dstack.storage_pool.kind</code>. 
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>dstack.storage_pool.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>dstack.storage_pool.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.storage_pool.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState();

	/**
	 * Setter for <code>dstack.storage_pool.physical_total_bytes</code>. 
	 */
	public void setPhysicalTotalBytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool.physical_total_bytes</code>. 
	 */
	@javax.persistence.Column(name = "physical_total_bytes", precision = 19)
	public java.lang.Long getPhysicalTotalBytes();

	/**
	 * Setter for <code>dstack.storage_pool.physical_used_bytes</code>. 
	 */
	public void setPhysicalUsedBytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool.physical_used_bytes</code>. 
	 */
	@javax.persistence.Column(name = "physical_used_bytes", precision = 19)
	public java.lang.Long getPhysicalUsedBytes();

	/**
	 * Setter for <code>dstack.storage_pool.virtual_total_bytes</code>. 
	 */
	public void setVirtualTotalBytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool.virtual_total_bytes</code>. 
	 */
	@javax.persistence.Column(name = "virtual_total_bytes", precision = 19)
	public java.lang.Long getVirtualTotalBytes();

	/**
	 * Setter for <code>dstack.storage_pool.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.storage_pool.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated();

	/**
	 * Setter for <code>dstack.storage_pool.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.storage_pool.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved();

	/**
	 * Setter for <code>dstack.storage_pool.agent_id</code>. 
	 */
	public void setAgentId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.storage_pool.agent_id</code>. 
	 */
	@javax.persistence.Column(name = "agent_id", precision = 19)
	public java.lang.Long getAgentId();

	/**
	 * Setter for <code>dstack.storage_pool.external</code>. 
	 */
	public void setExternal(java.lang.Boolean value);

	/**
	 * Getter for <code>dstack.storage_pool.external</code>. 
	 */
	@javax.persistence.Column(name = "external", nullable = false, precision = 1)
	public java.lang.Boolean getExternal();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface StoragePool
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.StoragePool from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface StoragePool
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.StoragePool> E into(E into);
}
