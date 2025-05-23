package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.Version;
        import com.fasterxml.jackson.core.Versioned;
        import com.fasterxml.jackson.core.util.VersionUtil;

/**
 * Automatically generated from PackageVersion.java.in during
 * packageVersion-generate execution of maven-replacer-plugin in
 * pom.xml.
 */
public final class PackageVersion implements Versioned {
    public final static Version VERSION = VersionUtil.parseVersion(
            "2.18.1", "com.fasterxml.jackson.module", "jackson-module-kotlin");

    @Override
    public Version version() {
        return VERSION;
    }
}