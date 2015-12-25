/**
 * This class is generated by jOOQ
 */
package com.ethercis.dao.jooq.tables;

/**
 * Composition table
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Composition extends org.jooq.impl.TableImpl<com.ethercis.dao.jooq.tables.records.CompositionRecord> {

	private static final long serialVersionUID = -731310216;

	/**
	 * The reference instance of <code>ehr.composition</code>
	 */
	public static final com.ethercis.dao.jooq.tables.Composition COMPOSITION = new com.ethercis.dao.jooq.tables.Composition();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ethercis.dao.jooq.tables.records.CompositionRecord> getRecordType() {
		return com.ethercis.dao.jooq.tables.records.CompositionRecord.class;
	}

	/**
	 * The column <code>ehr.composition.id</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.util.UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ehr.composition.ehr_id</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.util.UUID> EHR_ID = createField("ehr_id", org.jooq.impl.SQLDataType.UUID, this, "");

	/**
	 * The column <code>ehr.composition.in_contribution</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.util.UUID> IN_CONTRIBUTION = createField("in_contribution", org.jooq.impl.SQLDataType.UUID, this, "");

	/**
	 * The column <code>ehr.composition.active</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.lang.Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>ehr.composition.is_persistent</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.lang.Boolean> IS_PERSISTENT = createField("is_persistent", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>ehr.composition.language</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.lang.String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>ehr.composition.territory</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.lang.Integer> TERRITORY = createField("territory", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>ehr.composition.composer</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.util.UUID> COMPOSER = createField("composer", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>ehr.composition.sys_transaction</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.sql.Timestamp> SYS_TRANSACTION = createField("sys_transaction", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>ehr.composition.sys_period</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.CompositionRecord, java.lang.Object> SYS_PERIOD = createField("sys_period", org.jooq.impl.DefaultDataType.getDefaultDataType("tstzrange"), this, "");

	/**
	 * Create a <code>ehr.composition</code> table reference
	 */
	public Composition() {
		this("composition", null);
	}

	/**
	 * Create an aliased <code>ehr.composition</code> table reference
	 */
	public Composition(java.lang.String alias) {
		this(alias, com.ethercis.dao.jooq.tables.Composition.COMPOSITION);
	}

	private Composition(java.lang.String alias, org.jooq.Table<com.ethercis.dao.jooq.tables.records.CompositionRecord> aliased) {
		this(alias, aliased, null);
	}

	private Composition(java.lang.String alias, org.jooq.Table<com.ethercis.dao.jooq.tables.records.CompositionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.ethercis.dao.jooq.Ehr.EHR, aliased, parameters, "Composition table");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ethercis.dao.jooq.tables.records.CompositionRecord> getPrimaryKey() {
		return com.ethercis.dao.jooq.Keys.COMPOSITION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ethercis.dao.jooq.tables.records.CompositionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ethercis.dao.jooq.tables.records.CompositionRecord>>asList(com.ethercis.dao.jooq.Keys.COMPOSITION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.ethercis.dao.jooq.tables.records.CompositionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.ethercis.dao.jooq.tables.records.CompositionRecord, ?>>asList(com.ethercis.dao.jooq.Keys.COMPOSITION__COMPOSITION_EHR_ID_FKEY, com.ethercis.dao.jooq.Keys.COMPOSITION__COMPOSITION_IN_CONTRIBUTION_FKEY, com.ethercis.dao.jooq.Keys.COMPOSITION__COMPOSITION_LANGUAGE_FKEY, com.ethercis.dao.jooq.Keys.COMPOSITION__COMPOSITION_TERRITORY_FKEY, com.ethercis.dao.jooq.Keys.COMPOSITION__COMPOSITION_COMPOSER_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ethercis.dao.jooq.tables.Composition as(java.lang.String alias) {
		return new com.ethercis.dao.jooq.tables.Composition(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.ethercis.dao.jooq.tables.Composition rename(java.lang.String name) {
		return new com.ethercis.dao.jooq.tables.Composition(name, null);
	}
}