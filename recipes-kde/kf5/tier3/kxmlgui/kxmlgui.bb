SUMMARY = "User configurable main windows"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    kitemviews \
    kconfig \
    kconfig-native \
    kglobalaccel \
    kconfigwidgets \
    ki18n \
    kiconthemes \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    attica \
    kcoreaddons-native \
    kauth-native \
    sonnet-native \
    gettext-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ccf7310c466ba0a43bd1bba307237c87"
SRC_URI[sha256sum] = "a8f9ed354e30ff1f40306e876d96fcd1fa3a26a8e6acfccdeab8f3437d7231bc"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
