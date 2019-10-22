package com.linkedin.mxe;

import com.linkedin.pegasus2avro.mxe.FailedMetadataChangeEvent;
import com.linkedin.pegasus2avro.mxe.MetadataAuditEvent;
import com.linkedin.pegasus2avro.mxe.MetadataChangeEvent;
import com.linkedin.pegasus2avro.mxe.MetadataGraphEvent;
import com.linkedin.pegasus2avro.mxe.MetadataSearchEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.avro.Schema;


public class Configs {

  public static final Map<String, String> FABRIC_SCHEMA_REGISTRY_MAP =
      Collections.unmodifiableMap(new HashMap<String, String>() {
        {
          put("ei", "http://ei4-schemaregistry-vip-1.int.linkedin.com:10252");
          put("corp", "http://lca1-schema-registry-vip-1.corp.linkedin.com:10252");
        }
      });

  public static final Map<String, Schema> TOPIC_SCHEMA_MAP = Collections.unmodifiableMap(new HashMap<String, Schema>() {
    {
      put(Topics.METADATA_AUDIT_EVENT, MetadataAuditEvent.SCHEMA$);
      put(Topics.METADATA_CHANGE_EVENT, MetadataChangeEvent.SCHEMA$);
      put(Topics.FAILED_METADATA_CHANGE_EVENT, FailedMetadataChangeEvent.SCHEMA$);
      put(Topics.METADATA_GRAPH_EVENT, MetadataGraphEvent.SCHEMA$);
      put(Topics.METADATA_SEARCH_EVENT, MetadataSearchEvent.SCHEMA$);

      put(Topics.DEV_METADATA_AUDIT_EVENT, MetadataAuditEvent.SCHEMA$);
      put(Topics.DEV_METADATA_CHANGE_EVENT, MetadataChangeEvent.SCHEMA$);
      put(Topics.DEV_FAILED_METADATA_CHANGE_EVENT, FailedMetadataChangeEvent.SCHEMA$);
    }
  });

  private Configs() {
    // Util class
  }
}