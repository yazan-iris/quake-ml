package org.quakeml_1_2.helpers;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class NamespaceMapper extends NamespacePrefixMapper {
	/** Quakeml BED namespace. */
	public static final String QUAKEML_1_2_BED_NAMESPACE = "http://quakeml.org/xmlns/bed/1.2";
	public static final String QUAKEML_1_2_BED_PREFIX = "";

	/** Quakeml namespace. */
	public static final String QUAKEML_1_2_NAMESPACE = "http://quakeml.org/xmlns/quakeml/1.2";
	public static final String QUAKEML_1_2_PREFIX = "q";
	
	
	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		if (QUAKEML_1_2_NAMESPACE.equals(namespaceUri)) {
			return QUAKEML_1_2_PREFIX;
		} else if (QUAKEML_1_2_BED_NAMESPACE.equals(namespaceUri)) {
			return QUAKEML_1_2_BED_PREFIX;
		} else {
			return suggestion;
		}
	}
}
