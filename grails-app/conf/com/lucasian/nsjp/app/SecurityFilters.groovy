package com.lucasian.nsjp.app

/**
 * Generated by the Shiro plugin. This filters class protects all URLs
 * via access control by convention.
 */
class SecurityFilters {
    def filters = {
        all(uri: "/**") {
            before = {
                // Ignore direct views (e.g. the default main index page).
                if (!controllerName) return true

                // Access control by convention.
                accessControl()
            }
        }
    }
}
