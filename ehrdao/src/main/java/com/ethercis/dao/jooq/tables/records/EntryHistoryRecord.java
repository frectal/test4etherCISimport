/**
 * This class is generated by jOOQ
 */
package com.ethercis.dao.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntryHistoryRecord extends org.jooq.impl.TableRecordImpl<com.ethercis.dao.jooq.tables.records.EntryHistoryRecord> implements org.jooq.Record11<java.util.UUID, java.util.UUID, java.lang.Integer, com.ethercis.dao.jooq.enums.EntryType, java.lang.String, java.util.UUID, java.lang.String, java.util.UUID, java.lang.Object, java.sql.Timestamp, java.lang.Object> {

	private static final long serialVersionUID = 1395648248;

	/**
	 * Setter for <code>ehr.entry_history.id</code>.
	 */
	public void setId(java.util.UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.id</code>.
	 */
	public java.util.UUID getId() {
		return (java.util.UUID) getValue(0);
	}

	/**
	 * Setter for <code>ehr.entry_history.composition_id</code>.
	 */
	public void setCompositionId(java.util.UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.composition_id</code>.
	 */
	public java.util.UUID getCompositionId() {
		return (java.util.UUID) getValue(1);
	}

	/**
	 * Setter for <code>ehr.entry_history.sequence</code>.
	 */
	public void setSequence(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.sequence</code>.
	 */
	public java.lang.Integer getSequence() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>ehr.entry_history.item_type</code>.
	 */
	public void setItemType(com.ethercis.dao.jooq.enums.EntryType value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.item_type</code>.
	 */
	public com.ethercis.dao.jooq.enums.EntryType getItemType() {
		return (com.ethercis.dao.jooq.enums.EntryType) getValue(3);
	}

	/**
	 * Setter for <code>ehr.entry_history.template_id</code>.
	 */
	public void setTemplateId(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.template_id</code>.
	 */
	public java.lang.String getTemplateId() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>ehr.entry_history.template_uuid</code>.
	 */
	public void setTemplateUuid(java.util.UUID value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.template_uuid</code>.
	 */
	public java.util.UUID getTemplateUuid() {
		return (java.util.UUID) getValue(5);
	}

	/**
	 * Setter for <code>ehr.entry_history.archetype_id</code>.
	 */
	public void setArchetypeId(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.archetype_id</code>.
	 */
	public java.lang.String getArchetypeId() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>ehr.entry_history.category</code>.
	 */
	public void setCategory(java.util.UUID value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.category</code>.
	 */
	public java.util.UUID getCategory() {
		return (java.util.UUID) getValue(7);
	}

	/**
	 * Setter for <code>ehr.entry_history.entry</code>.
	 */
	public void setEntry(java.lang.Object value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.entry</code>.
	 */
	public java.lang.Object getEntry() {
		return (java.lang.Object) getValue(8);
	}

	/**
	 * Setter for <code>ehr.entry_history.sys_transaction</code>.
	 */
	public void setSysTransaction(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.sys_transaction</code>.
	 */
	public java.sql.Timestamp getSysTransaction() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>ehr.entry_history.sys_period</code>.
	 */
	public void setSysPeriod(java.lang.Object value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>ehr.entry_history.sys_period</code>.
	 */
	public java.lang.Object getSysPeriod() {
		return (java.lang.Object) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.util.UUID, java.util.UUID, java.lang.Integer, com.ethercis.dao.jooq.enums.EntryType, java.lang.String, java.util.UUID, java.lang.String, java.util.UUID, java.lang.Object, java.sql.Timestamp, java.lang.Object> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.util.UUID, java.util.UUID, java.lang.Integer, com.ethercis.dao.jooq.enums.EntryType, java.lang.String, java.util.UUID, java.lang.String, java.util.UUID, java.lang.Object, java.sql.Timestamp, java.lang.Object> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field1() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.COMPOSITION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.ethercis.dao.jooq.enums.EntryType> field4() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.ITEM_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.TEMPLATE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field6() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.TEMPLATE_UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.ARCHETYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field8() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field9() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.ENTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.SYS_TRANSACTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field11() {
		return com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY.SYS_PERIOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value2() {
		return getCompositionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getSequence();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ethercis.dao.jooq.enums.EntryType value4() {
		return getItemType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTemplateId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value6() {
		return getTemplateUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getArchetypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value8() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value9() {
		return getEntry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getSysTransaction();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value11() {
		return getSysPeriod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value1(java.util.UUID value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value2(java.util.UUID value) {
		setCompositionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value3(java.lang.Integer value) {
		setSequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value4(com.ethercis.dao.jooq.enums.EntryType value) {
		setItemType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value5(java.lang.String value) {
		setTemplateId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value6(java.util.UUID value) {
		setTemplateUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value7(java.lang.String value) {
		setArchetypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value8(java.util.UUID value) {
		setCategory(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value9(java.lang.Object value) {
		setEntry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value10(java.sql.Timestamp value) {
		setSysTransaction(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord value11(java.lang.Object value) {
		setSysPeriod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntryHistoryRecord values(java.util.UUID value1, java.util.UUID value2, java.lang.Integer value3, com.ethercis.dao.jooq.enums.EntryType value4, java.lang.String value5, java.util.UUID value6, java.lang.String value7, java.util.UUID value8, java.lang.Object value9, java.sql.Timestamp value10, java.lang.Object value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EntryHistoryRecord
	 */
	public EntryHistoryRecord() {
		super(com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY);
	}

	/**
	 * Create a detached, initialised EntryHistoryRecord
	 */
	public EntryHistoryRecord(java.util.UUID id, java.util.UUID compositionId, java.lang.Integer sequence, com.ethercis.dao.jooq.enums.EntryType itemType, java.lang.String templateId, java.util.UUID templateUuid, java.lang.String archetypeId, java.util.UUID category, java.lang.Object entry, java.sql.Timestamp sysTransaction, java.lang.Object sysPeriod) {
		super(com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY);

		setValue(0, id);
		setValue(1, compositionId);
		setValue(2, sequence);
		setValue(3, itemType);
		setValue(4, templateId);
		setValue(5, templateUuid);
		setValue(6, archetypeId);
		setValue(7, category);
		setValue(8, entry);
		setValue(9, sysTransaction);
		setValue(10, sysPeriod);
	}
}