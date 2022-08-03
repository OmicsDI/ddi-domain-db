package uk.ac.ebi.ddi.ddidomaindb.dataset;

import static uk.ac.ebi.ddi.ddidomaindb.dataset.FieldCategory.DATA;
import static uk.ac.ebi.ddi.ddidomaindb.dataset.FieldType.MANDATORY;
import static uk.ac.ebi.ddi.ddidomaindb.dataset.FieldType.OPTIONAL;

public class DBField {
    public static final Field NAME = new Field("name", MANDATORY, DATA, "Database Name");
    public static final Field DESCRIPTION = new Field("description", MANDATORY, DATA, "Database Description");
    public static final Field RELEASE = new Field("release", OPTIONAL, DATA, "Database release");
    public static final Field RELEASE_DATE = new Field("release_date", OPTIONAL, DATA, "Database Release Date");
    public static final Field ENTRY_COUNT = new Field("entry_count", OPTIONAL, DATA, "Database Entries Count");
    public static final Field KEYWORDS = new Field("keywords", OPTIONAL, DATA, "Database Keywords");
    public static final Field URL = new Field("url", OPTIONAL, DATA, "Database URL");
    public static final Field SEARCH_URL = new Field("search_url", OPTIONAL, DATA, "Database Prefix URL");
}
