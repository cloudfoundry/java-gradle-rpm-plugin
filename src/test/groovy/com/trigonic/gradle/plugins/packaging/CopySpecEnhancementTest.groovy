package com.trigonic.gradle.plugins.packaging

import org.gradle.api.internal.file.copy.DefaultCopySpec
import org.junit.Test

import static org.junit.Assert.*

class CopySpecEnhancementTest {

    @Test
    public void addUser() {
        def spec = new DefaultCopySpec(null, null)
        assertNull( spec.metaClass.hasProperty('user'))

        CopySpecEnhancement.user(spec, 'USER')

        assertEquals('USER', spec.user )
    }

    @Test
    public void addAddParentDirs() {
        def spec = new DefaultCopySpec(null, null)
        CopySpecEnhancement.setAddParentDirs(spec, true)

        assertEquals(true, spec.addParentDirs )
    }
}
