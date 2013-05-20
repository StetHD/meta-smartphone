DESCRIPTION = "Several initscripts to startup daemons from Android compatibility layer"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

PR = "r2"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES = "${PN}-sysvinit ${PN}-upstart"

ALLOW_EMPTY_${PN}-sysvinit = "1"
ALLOW_EMPTY_${PN}-upstart = "1"

FILES_${PN}-sysvinit = "${sysconfdir}/init.d/ ${sysconfdir}/rc*/"
FILES_${PN}-upstart = "${sysconfdir}/event.d/"
