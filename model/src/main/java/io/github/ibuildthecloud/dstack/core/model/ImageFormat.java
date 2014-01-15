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
@javax.persistence.Table(name = "image_format", schema = "dstack")
public interface ImageFormat extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.image_format.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image_format.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.image_format.template_id</code>. 
	 */
	public void setTemplateId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image_format.template_id</code>. 
	 */
	@javax.persistence.Column(name = "template_id", nullable = false, precision = 19)
	public java.lang.Long getTemplateId();

	/**
	 * Setter for <code>dstack.image_format.format</code>. 
	 */
	public void setFormat(java.lang.String value);

	/**
	 * Getter for <code>dstack.image_format.format</code>. 
	 */
	@javax.persistence.Column(name = "format", nullable = false, length = 128)
	public java.lang.String getFormat();

	/**
	 * Setter for <code>dstack.image_format.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.image_format.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ImageFormat
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.ImageFormat from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ImageFormat
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.ImageFormat> E into(E into);
}
