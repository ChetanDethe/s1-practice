package com.practice.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

/** The boundary rules. They run in every build, so a pull request that breaks one fails CI. */
class BoundaryRulesTest {

    /** Every practice class from every module, without test classes. */
    private static final JavaClasses CLASSES = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.practice");

    /** Other modules use only the api package of hello-core — never its domain. */
    @Test
    void otherModulesUseOnlyTheApi() {
        noClasses().that().resideOutsideOfPackage("com.practice.hello..")
                .should().dependOnClassesThat().resideInAPackage("com.practice.hello.domain..")
                .allowEmptyShould(true)
                .check(CLASSES);
    }

    /** Domain code has no Spring: it stays plain Java. */
    @Test
    void domainCodeHasNoSpring() {
        noClasses().that().resideInAPackage("com.practice..domain..")
                .should().dependOnClassesThat().resideInAPackage("org.springframework..")
                .allowEmptyShould(true)
                .check(CLASSES);
    }
}
