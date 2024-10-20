package com.github.sergeisolodkov.voipadmin.config.properties;

import com.github.sergeisolodkov.voipadmin.integration.domain.StorageCatalog;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "file.minio")
@Getter
@Setter
public class MinioFileStorageProperties {
    private String url;
    private String accessKey;
    private String secretKey;
    private Map<StorageCatalog, String> buckets;

}
