SUMMARY = "A simple system settings module to manage the users of your system"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    libpwquality \
    kdelibs4support \
    kcmutils \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6f0e88b12b566f70eb027f0c3ef9f437"
SRC_URI[sha256sum] = "959af1859aaa8fdcd853ebae78d2b8a15e6700ca340c0ed3bd041315382524f8"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
