SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9fdc9f97cbb347078905f9cc34cd8a1d"
SRC_URI[sha256sum] = "e02dbf996ed93bdc2813a2a64dcb0ddeb54987dd84bbe787bd890b17d57e4a85"

FILES_${PN} += "${datadir}/kservicetypes5"
